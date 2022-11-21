package pablobruixolanavarro.ejercicio3examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.ConditionVariable;

import pablobruixolanavarro.ejercicio3examen.databinding.ActivityInfoPersonajeBinding;
import pablobruixolanavarro.ejercicio3examen.databinding.ActivityMainBinding;

public class info_personaje extends AppCompatActivity {

    private ActivityInfoPersonajeBinding binding;

    private String palabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_personaje);

        binding = ActivityInfoPersonajeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = getIntent().getExtras();
        String personajes = bundle.getString(Costantes.personajes);


        switch (personajes) {
            case "tokio":
                binding.ibPersonajeDescripcion.setImageResource(R.drawable.tokio);

                binding.lbInfo.setText("Úrsula Corberó es Tokio \n" +
                        "Úrsula Corberó interpreta a Tokio. Dura, impulsiva, con una aparente falta de empatía \n" +
                        "(aunque esto sólo sea una pose). Su vida siempre fue un balancín. Tokio ingresó en el mundo del \n" +
                        "crimen con 14 años siguiendo los pasos de su novio, de 28. Desde entonces ha alternado periodos \n" +
                        "de normalidad, con su empleo convencional, con otros ligados a todo tipo de atracos. Eso sí, \n" +
                        "cada vez más audaces. En uno de ellos, el asalto a una furgoneta de Prosegur, se vio envuelta \n" +
                        "en un tiroteo con el resultado de tres muertos, uno de ellos su novio. En búsqueda y captura \n" +
                        "desde entonces.\n");
                break;

            case "berl_n":
                binding.ibPersonajeDescripcion.setImageResource(R.drawable.berl_n);
                binding.lbInfo.setText("Pedro Alonso es Berlín \n" +
                        "Pedro Alonso se pondrá en la piel de Berlín, el jefe al mando en el interior de la Fábrica de Moneda. \n" +
                        "Ladrón de guante blanco especializado en el robo de joyas. Ingresó en el mundo del crimen para mantener \n" +
                        "el altísimo nivel de vida al que estaba acostumbrado desde la cuna. Es un hombre que sabe tener \n" +
                        "modales finos, que se cree superior al resto de la banda, a quienes desprecia íntimamente. \n" +
                        "Pero también sabe ser brutal y directo cuando conviene. Su talón de Aquiles son las mujeres, \n" +
                        "y esta será la circunstancia que ponga en riesgo su liderazgo.\n");
                break;

            case "denver":
                binding.ibPersonajeDescripcion.setImageResource(R.drawable.denver);
                binding.lbInfo.setText("Jaime Lorente es Denver \n" +
                        "Jaime Lorente interpreta a Denver, hijo de Moscú. Macarra de extrarradio, un poco corto de miras \n" +
                        "e impulsivo. Alternó su juventud entre los botellones del parking del Caprabo y las barracas de la feria.\n" +
                        "Coqueteó con todas las drogas posibles y quizás por tal abuso, hay una conexión en su cerebro \n" +
                        "que salta a “modo irascible” sin motivo alguno. Genera tensión por donde pasa, y es mejor no tratar \n" +
                        "en exceso con él. Su padre es su único anclaje con la humanidad y los sentimientos. Haría cualquier \n" +
                        "cosa por él.");
                break;

            case "mosc_":
                binding.ibPersonajeDescripcion.setImageResource(R.drawable.mosc_);
                binding.lbInfo.setText("Paco Tous es Moscú \n" +
                        "Paco Tous es Moscú. Minero. La silicosis y el asma lo alejaron de la mina y terminó en una cerrajería. \n" +
                        "Es capaz de hacer cualquier cosa con metal y, por supuesto, abre cualquier cerradura. \n" +
                        "Esa habilidad y una etapa de precariedad económica le llevaron al crimen. En los últimos \n" +
                        "años ha sido condenado por atracos, estafa, robo de varias joyerías y su gran especialidad: \n" +
                        "Agujerear cajas acorazadas. Su debilidad es su hijo (Denver), cabeza loca del que nunca ha hecho carrera, \n" +
                        "y con el que ahora comparte misión y banda en la Fábrica de Moneda.\n");
                break;

            case "r_o":
                binding.ibPersonajeDescripcion.setImageResource(R.drawable.r_o);
                binding.lbInfo.setText("Miguel Herrán es Río \n" +
                        "Miguel Herrán es Río, un chico que ha pasado su infancia programando y hackeando. Una adolescencia \n" +
                        "con la mirada en la Red. Esa capacidad y esos conocimientos le hicieron jefe técnico de una empresa \n" +
                        "de seguridad siendo aún muy joven. En lo personal, todo ese saber no vino acompañado de un grado \n" +
                        "de madurez equiparable. Así, pronto se vio metido en hackeos y roturas de sistemas de seguridad \n" +
                        "que poco tenían de juego. Terminó en búsqueda y captura por la Interpol, situación de la que le \n" +
                        "rescató El Profesor. Es el maestro tecnológico del grupo.\n");
                break;

            case "el_profesor":
                binding.ibPersonajeDescripcion.setImageResource(R.drawable.el_profesor);
                binding.lbInfo.setText("Álvaro Morte es El profesor \n" +
                        "Álvaro Morte interpretará a El profesor. Treintañero. Barba, gafas de pasta… \n" +
                        "El cerebro de la operación. Un hombre que nadie asociaría a priori a ningún plan criminal. \n" +
                        "Dialogante, de fina ironía y autodidacta, es la antítesis de cualquiera de los individuos que \n" +
                        "integran su banda. De inteligencia superior, ha planeado durante años hasta el mínimo detalle \n" +
                        "de la operación. Parece saberlo todo, anticiparse a todo desde su puesto de observación en el exterior. \n" +
                        "No obstante, no contaba con establecer un vínculo tan fuerte con la negociadora policial (Raquel), \n" +
                        "una mujer que le va a marcar.\n");
                break;
        }
    }
}