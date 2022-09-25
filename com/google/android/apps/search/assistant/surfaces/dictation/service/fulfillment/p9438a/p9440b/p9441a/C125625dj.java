package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125649ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125666as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125687t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126323bd;
import java.util.Locale;
import java.util.Map;
import p5462h.C69613f;
import p5462h.C69685i;
import p5462h.C69747m;
import p5462h.p5463a.C69505av;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dj */
/* compiled from: PG */
public final class C125625dj implements C125687t {

    /* renamed from: a */
    public static final C125618dc f346266a = new C125618dc();

    /* renamed from: b */
    public static final C69613f f346267b = new C69747m(C125616da.f346264a);

    /* renamed from: c */
    public static final C69613f f346268c = new C69747m(C125614cz.f346262a);

    /* renamed from: d */
    public static final C69613f f346269d = new C69747m(C125617db.f346265a);

    /* renamed from: e */
    public static final C69613f f346270e = new C69747m(C125612cx.f346260a);

    /* renamed from: f */
    public static final C69613f f346271f = new C69747m(C125610cv.f346258a);

    /* renamed from: g */
    public static final Map f346272g = C69505av.m100867i(new C69685i("primero", 0), new C69685i("primera", 0), new C69685i("segundo", 1), new C69685i("segunda", 1), new C69685i("tercero", 2), new C69685i("tercera", 2), new C69685i("cuarto", 3), new C69685i("cuarta", 3), new C69685i("quinto", 4), new C69685i("quinta", 4), new C69685i("sexto", 5), new C69685i("sexta", 5));

    /* renamed from: h */
    public static final Map f346273h;

    /* renamed from: i */
    public static final C69613f f346274i = new C69747m(C125609cu.f346257a);

    /* renamed from: j */
    public static final C69762k f346275j = new C69762k("( y|,)( el| la| los| las| un| una| unos| unas)? ");

    /* renamed from: k */
    public static final Map f346276k;

    /* renamed from: l */
    public static final C69613f f346277l = new C69747m(C125611cw.f346259a);

    /* renamed from: m */
    public static final C69613f f346278m = new C69747m(C125613cy.f346261a);

    /* renamed from: n */
    private static final C126323bd f346279n = new C126323bd(new Locale("es"));

    static {
        C125666as asVar = C125666as.RECIPIENT;
        C125666as asVar2 = C125666as.CC;
        C125666as asVar3 = C125666as.BCC;
        C125666as asVar4 = C125666as.SUBJECT;
        C125666as asVar5 = C125666as.BODY;
        f346273h = C69505av.m100867i(new C69685i("destinatario", C125666as.RECIPIENT), new C69685i("destinataria", asVar), new C69685i("receptor", asVar), new C69685i("receptora", asVar), new C69685i("a", asVar), new C69685i("copia", asVar2), new C69685i("cc", asVar2), new C69685i("copia carbón", asVar2), new C69685i("copia de carbón", asVar2), new C69685i("copia oculta", asVar3), new C69685i("copia carbón oculta", asVar3), new C69685i("copia de carbón oculta", asVar3), new C69685i("bcc", asVar3), new C69685i("cco", asVar3), new C69685i("asunto", asVar4), new C69685i("cuerpo", asVar5), new C69685i("mensaje", asVar5), new C69685i("título", asVar4));
        C125649ab abVar = C125649ab.BULLETED;
        C125649ab abVar2 = C125649ab.NUMBERED;
        f346276k = C69505av.m100867i(new C69685i("punto", C125649ab.BULLETED), new C69685i("punta", abVar), new C69685i("apuntar", abVar), new C69685i("viñetas", abVar), new C69685i("numerada", abVar2), new C69685i("números", abVar2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0204, code lost:
        if (r4.equals("borra todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020e, code lost:
        if (r4.equals("borre última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0218, code lost:
        if (r4.equals("borrar última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0222, code lost:
        if (r4.equals("enviá eso") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022c, code lost:
        if (r4.equals("enviá esa") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0236, code lost:
        if (r4.equals("manda mensaje") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0240, code lost:
        if (r4.equals("rematar") != false) goto L_0x0975;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x024a, code lost:
        if (r4.equals("suprimir el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0254, code lost:
        if (r4.equals("pará dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x025e, code lost:
        if (r4.equals("borra el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r4.equals("campo anterior") != false) goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0268, code lost:
        if (r4.equals("borrar el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0272, code lost:
        if (r4.equals("deshazlo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027c, code lost:
        if (r4.equals("deshacer") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0286, code lost:
        if (r4.equals("pará de dictar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0290, code lost:
        if (r4.equals("búsquelo") != false) goto L_0x092b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029a, code lost:
        if (r4.equals("suprime todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a4, code lost:
        if (r4.equals("elimine última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ae, code lost:
        if (r4.equals("detén el dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        if (r4.equals("suprimí el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c2, code lost:
        if (r4.equals("borrá la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r4.equals("eliminá última palabra") != false) goto L_0x0af8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02cc, code lost:
        if (r4.equals("mandalo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d6, code lost:
        if (r4.equals("mandale") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e0, code lost:
        if (r4.equals("elimine todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ea, code lost:
        if (r4.equals("suprima todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02f4, code lost:
        if (r4.equals("suprime la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02fe, code lost:
        if (r4.equals("borra todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0308, code lost:
        if (r4.equals("borre última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0312, code lost:
        if (r4.equals("enviá esto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x031c, code lost:
        if (r4.equals("enviá esta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0326, code lost:
        if (r4.equals("mande esto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r4.equals("terminado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0330, code lost:
        if (r4.equals("mande esta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x033a, code lost:
        if (r4.equals("elimina todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0344, code lost:
        if (r4.equals("mandar eso") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x034e, code lost:
        if (r4.equals("mandar esa") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0358, code lost:
        if (r4.equals("elimina texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0362, code lost:
        if (r4.equals("suprimí la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036c, code lost:
        if (r4.equals("para de escuchar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0376, code lost:
        if (r4.equals("suprimí todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0380, code lost:
        if (r4.equals("manda esto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x038a, code lost:
        if (r4.equals("manda esta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r4.equals("enviar esto") != false) goto L_0x0b0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0394, code lost:
        if (r4.equals("detenga dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x039e, code lost:
        if (r4.equals("borrá todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a8, code lost:
        if (r4.equals("insertar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b2, code lost:
        if (r4.equals("suprimí todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03bc, code lost:
        if (r4.equals("elimine última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03c6, code lost:
        if (r4.equals("borrar última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03d0, code lost:
        if (r4.equals("para dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03da, code lost:
        if (r4.equals("borrá la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03e4, code lost:
        if (r4.equals("envíe eso") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03ee, code lost:
        if (r4.equals("envíe esa") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r4.equals("enviar esta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03f8, code lost:
        if (r4.equals("envía eso") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0402, code lost:
        if (r4.equals("envía esa") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x040c, code lost:
        if (r4.equals("detenga el dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0416, code lost:
        if (r4.equals("borrá todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0420, code lost:
        if (r4.equals("pare de dictar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x042a, code lost:
        if (r4.equals("suprimir todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0434, code lost:
        if (r4.equals("detén dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x043e, code lost:
        if (r4.equals("guardar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0448, code lost:
        if (r4.equals("finalizar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0452, code lost:
        if (r4.equals("detener dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r4.equals("borrar texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x045c, code lost:
        if (r4.equals("parar de dictar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0466, code lost:
        if (r4.equals("borre el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0470, code lost:
        if (r4.equals("suprimí la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x047a, code lost:
        if (r4.equals("elimine la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0484, code lost:
        if (r4.equals("mandar esto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x048e, code lost:
        if (r4.equals("mandar esta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0498, code lost:
        if (r4.equals("pare el dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04a2, code lost:
        if (r4.equals("suprime última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04ac, code lost:
        if (r4.equals("borre la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04b6, code lost:
        if (r4.equals("suprimí la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r4.equals("borra la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04c0, code lost:
        if (r4.equals("elimina la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04ca, code lost:
        if (r4.equals("parar de escuchar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04d4, code lost:
        if (r4.equals("mandarlo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04de, code lost:
        if (r4.equals("suprimir última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04e8, code lost:
        if (r4.equals("parar el dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04f2, code lost:
        if (r4.equals("parar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04fc, code lost:
        if (r4.equals("eliminar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0506, code lost:
        if (r4.equals("mandá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0510, code lost:
        if (r4.equals("mande") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x051a, code lost:
        if (r4.equals("manda") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        if (r4.equals("borrar la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0524, code lost:
        if (r4.equals("listo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x052e, code lost:
        if (r4.equals("hecho") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0538, code lost:
        if (r4.equals("añadí") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0542, code lost:
        if (r4.equals("añade") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x054c, code lost:
        if (r4.equals("añada") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0556, code lost:
        if (r4.equals("envíe") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0560, code lost:
        if (r4.equals("envía") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x056a, code lost:
        if (r4.equals("enviá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0574, code lost:
        if (r4.equals("detén") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x057e, code lost:
        if (r4.equals("buscá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (r4.equals("insertá") != false) goto L_0x08ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0588, code lost:
        if (r4.equals("busca") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0592, code lost:
        if (r4.equals("borrá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x059c, code lost:
        if (r4.equals("borre") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05a6, code lost:
        if (r4.equals("borra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05b0, code lost:
        if (r4.equals("acabá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05ba, code lost:
        if (r4.equals("acabe") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05c4, code lost:
        if (r4.equals("acaba") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05ce, code lost:
        if (r4.equals("eliminá todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x05d8, code lost:
        if (r4.equals("suprime última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x05e2, code lost:
        if (r4.equals("borrar todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r4.equals("inserte") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x05ec, code lost:
        if (r4.equals("suprima todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x05f6, code lost:
        if (r4.equals("eliminá el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0600, code lost:
        if (r4.equals("suprimí última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x060a, code lost:
        if (r4.equals("enviar mensaje") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0614, code lost:
        if (r4.equals("elimine todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x061e, code lost:
        if (r4.equals("pará") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0628, code lost:
        if (r4.equals("pare") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0632, code lost:
        if (r4.equals("para") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x063c, code lost:
        if (r4.equals("mandá esto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0646, code lost:
        if (r4.equals("mandá esta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        if (r4.equals("inserta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0650, code lost:
        if (r4.equals("elimina última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x065a, code lost:
        if (r4.equals("elimine texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0664, code lost:
        if (r4.equals("elimine la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x066e, code lost:
        if (r4.equals("borre última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0678, code lost:
        if (r4.equals("suprime última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0682, code lost:
        if (r4.equals("búscalo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x068c, code lost:
        if (r4.equals("borrar la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0696, code lost:
        if (r4.equals("borrá texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06a0, code lost:
        if (r4.equals("mandá eso") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06aa, code lost:
        if (r4.equals("mandá esa") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        if (r4.equals("borrá última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06b4, code lost:
        if (r4.equals("para el dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06be, code lost:
        if (r4.equals("suprimir última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06c8, code lost:
        if (r4.equals("suprima la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06d2, code lost:
        if (r4.equals("eliminá última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06dc, code lost:
        if (r4.equals("suprima texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06e6, code lost:
        if (r4.equals("mande eso") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06f0, code lost:
        if (r4.equals("mande esa") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06fa, code lost:
        if (r4.equals("manda eso") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0704, code lost:
        if (r4.equals("manda esa") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x070e, code lost:
        if (r4.equals("suprime la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if (r4.equals("eliminar la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0718, code lost:
        if (r4.equals("envíe mensaje") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0722, code lost:
        if (r4.equals("eliminar la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x072c, code lost:
        if (r4.equals("anterior") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0736, code lost:
        if (r4.equals("pare de escuchar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0740, code lost:
        if (r4.equals("suprimí última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x074a, code lost:
        if (r4.equals("rematado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0754, code lost:
        if (r4.equals("suprimir texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x075e, code lost:
        if (r4.equals("elimina el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0768, code lost:
        if (r4.equals("elimina la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0772, code lost:
        if (r4.equals("detené dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (r4.equals("pare dictado") != false) goto L_0x0aec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x077c, code lost:
        if (r4.equals("finalizá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0786, code lost:
        if (r4.equals("finaliza") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0790, code lost:
        if (r4.equals("finalice") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x079a, code lost:
        if (r4.equals("suprimí texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07a4, code lost:
        if (r4.equals("siguiente campo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07ae, code lost:
        if (r4.equals("mandar mensaje") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x07b8, code lost:
        if (r4.equals("suprime la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07c2, code lost:
        if (r4.equals("detén la escucha") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07cc, code lost:
        if (r4.equals("suprimí última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07d6, code lost:
        if (r4.equals("borra la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ce, code lost:
        if (r4.equals("suprime el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r4.equals("guárdelo") != false) goto L_0x0a85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x07e0, code lost:
        if (r4.equals("rematá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07ea, code lost:
        if (r4.equals("remate") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x07f4, code lost:
        if (r4.equals("remata") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x07fe, code lost:
        if (r4.equals("pará el dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0808, code lost:
        if (r4.equals("para de dictar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0812, code lost:
        if (r4.equals("detener el dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x081c, code lost:
        if (r4.equals("suprimir última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0826, code lost:
        if (r4.equals("enviá mensaje") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0830, code lost:
        if (r4.equals("elimina la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x083a, code lost:
        if (r4.equals("mandar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        if (r4.equals("suprima última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0844, code lost:
        if (r4.equals("borra última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x084e, code lost:
        if (r4.equals("deshacerlo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0858, code lost:
        if (r4.equals("suprime texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0862, code lost:
        if (r4.equals("buscarlo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x086c, code lost:
        if (r4.equals("detené el dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0876, code lost:
        if (r4.equals("anterior campo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0884, code lost:
        if (r4.equals("terminar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x088e, code lost:
        if (r4.equals("guardá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0898, code lost:
        if (r4.equals("guarde") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r4.equals("borra última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x08a2, code lost:
        if (r4.equals("guarda") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x08ac, code lost:
        if (r4.equals("suprimir la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x08b6, code lost:
        if (r4.equals("añadir") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08c9, code lost:
        if (r4.equals("enviar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x08d3, code lost:
        if (r4.equals("detenga la escucha") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x08dd, code lost:
        if (r4.equals("elimina última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x08e7, code lost:
        if (r4.equals("detené") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x08f1, code lost:
        if (r4.equals("deshaz") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x08ff, code lost:
        if (r4.equals("eliminar todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        if (r4.equals("eliminar el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0909, code lost:
        if (r4.equals("suprima la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0913, code lost:
        if (r4.equals("elimine el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x091d, code lost:
        if (r4.equals("busque") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0927, code lost:
        if (r4.equals("buscar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0935, code lost:
        if (r4.equals("borrar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x093f, code lost:
        if (r4.equals("eliminá la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0949, code lost:
        if (r4.equals("borre la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0953, code lost:
        if (r4.equals("acabar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x095d, code lost:
        if (r4.equals("terminá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0967, code lost:
        if (r4.equals("termine") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        if (r4.equals("suprime todo el texto") != false) goto L_0x0adf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0971, code lost:
        if (r4.equals("termina") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x097f, code lost:
        if (r4.equals("borra última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0989, code lost:
        if (r4.equals("campo siguiente") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0997, code lost:
        if (r4.equals("envíalo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x09a1, code lost:
        if (r4.equals("envíale") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x09ab, code lost:
        if (r4.equals("envíe esto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x09b5, code lost:
        if (r4.equals("envíe esta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x09bf, code lost:
        if (r4.equals("eliminar última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x09c9, code lost:
        if (r4.equals("suprimir la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0100, code lost:
        if (r4.equals("suprimir todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x09d3, code lost:
        if (r4.equals("eliminá") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x09dd, code lost:
        if (r4.equals("elimine") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x09e7, code lost:
        if (r4.equals("elimina") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x09f1, code lost:
        if (r4.equals("suprimir") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x09fb, code lost:
        if (r4.equals("suprima el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0a05, code lost:
        if (r4.equals("eliminá texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0a13, code lost:
        if (r4.equals("elimina todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0a1d, code lost:
        if (r4.equals("envía esto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0a27, code lost:
        if (r4.equals("envía esta") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010a, code lost:
        if (r4.equals("pará de escuchar") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0a31, code lost:
        if (r4.equals("elimina última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0a3b, code lost:
        if (r4.equals("suprima la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0a45, code lost:
        if (r4.equals("borrar todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0a4f, code lost:
        if (r4.equals("borre todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0a59, code lost:
        if (r4.equals("eliminá la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0a63, code lost:
        if (r4.equals("borre la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0a6d, code lost:
        if (r4.equals("envía mensaje") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0a77, code lost:
        if (r4.equals("mande mensaje") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0a81, code lost:
        if (r4.equals("finalizado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0a8f, code lost:
        if (r4.equals("suprimí") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        if (r4.equals("deshágalo") != false) goto L_0x08f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0a99, code lost:
        if (r4.equals("suprime") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0aa3, code lost:
        if (r4.equals("suprima") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0aad, code lost:
        if (r4.equals("borrar la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0ab7, code lost:
        if (r4.equals("suprimir la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0ac1, code lost:
        if (r4.equals("eliminar última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0aca, code lost:
        if (r4.equals("eliminar todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0ad3, code lost:
        if (r4.equals("borrá última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0adc, code lost:
        if (r4.equals("eliminá todo el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0ae9, code lost:
        if (r4.equals("parar dictado") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011e, code lost:
        if (r4.equals("guárdarlo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0af5, code lost:
        if (r4.equals("suprima última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0b01, code lost:
        if (r4.equals("eliminar última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0b0a, code lost:
        if (r4.equals("enviarlo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0b16, code lost:
        if (r4.equals("elimine última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0b1c, code lost:
        r1 = f346266a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125692y.m205677a(r4, new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125619dd(r1), new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125620de(r1), new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125621df(r1), new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125622dg(r1), new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125623dh(r1), new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125624di(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125652ae.f346322a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:?, code lost:
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125533a(p5462h.p5463a.C69496am.f185918a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125667at.f346343a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125659al.f346329a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125676i.f346354a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125651ad.f346321a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125669b.f346346a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0128, code lost:
        if (r4.equals("mandá mensaje") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125658ak.f346328a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125672e.f346350a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125663ap.f346334a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125657aj.f346327a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125661an.f346331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125656ai.f346326a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0132, code lost:
        if (r4.equals("borrá el texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r4.equals("guárdalo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013c, code lost:
        if (r4.equals("eliminá última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0146, code lost:
        if (r4.equals("eliminá la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0150, code lost:
        if (r4.equals("borra la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015a, code lost:
        if (r4.equals("borrar última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0164, code lost:
        if (r4.equals("detenga") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016e, code lost:
        if (r4.equals("detener") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        if (r4.equals("deshacé") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0182, code lost:
        if (r4.equals("deshaga") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018c, code lost:
        if (r4.equals("borrá última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0196, code lost:
        if (r4.equals("eliminar texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r4.equals("suprima última frase") != false) goto L_0x0b19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (r4.equals("detener la escucha") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01aa, code lost:
        if (r4.equals("eliminar la última oración") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b4, code lost:
        if (r4.equals("enviar eso") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01be, code lost:
        if (r4.equals("enviar esa") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c8, code lost:
        if (r4.equals("detené la escucha") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d2, code lost:
        if (r4.equals("borre texto") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dc, code lost:
        if (r4.equals("elimine la última frase") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e6, code lost:
        if (r4.equals("borre todo") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f0, code lost:
        if (r4.equals("siguiente") != false) goto L_0x098d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fa, code lost:
        if (r4.equals("borrá la última palabra") == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r4.equals("borra texto") != false) goto L_0x0a09;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107043a(java.lang.String r4, p5462h.p5466c.C69577g r5) {
        /*
            r3 = this;
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.bd r5 = f346279n
            java.lang.String r4 = r5.mo107533a(r4)
            java.lang.String r5 = "normalizedText"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            int r5 = r4.hashCode()
            switch(r5) {
                case -2068113267: goto L_0x0b10;
                case -2045413232: goto L_0x0b04;
                case -2041179815: goto L_0x0afb;
                case -2040122323: goto L_0x0aef;
                case -2035135576: goto L_0x0ae3;
                case -2033175212: goto L_0x0ad6;
                case -2014083854: goto L_0x0acd;
                case -2013001852: goto L_0x0ac4;
                case -1994790559: goto L_0x0abb;
                case -1972036578: goto L_0x0ab1;
                case -1921985233: goto L_0x0aa7;
                case -1854713511: goto L_0x0a9d;
                case -1854713507: goto L_0x0a93;
                case -1854713371: goto L_0x0a89;
                case -1851897307: goto L_0x0a7b;
                case -1831313638: goto L_0x0a71;
                case -1809386368: goto L_0x0a67;
                case -1805866851: goto L_0x0a5d;
                case -1795003882: goto L_0x0a53;
                case -1784361125: goto L_0x0a49;
                case -1771428255: goto L_0x0a3f;
                case -1764113154: goto L_0x0a35;
                case -1742688759: goto L_0x0a2b;
                case -1731622502: goto L_0x0a21;
                case -1731622488: goto L_0x0a17;
                case -1726278444: goto L_0x0a0d;
                case -1676662669: goto L_0x09ff;
                case -1661785328: goto L_0x09f5;
                case -1661543631: goto L_0x09eb;
                case -1659139087: goto L_0x09e1;
                case -1659139083: goto L_0x09d7;
                case -1659138959: goto L_0x09cd;
                case -1649440554: goto L_0x09c3;
                case -1630283291: goto L_0x09b9;
                case -1617105898: goto L_0x09af;
                case -1617105884: goto L_0x09a5;
                case -1586069510: goto L_0x099b;
                case -1586069500: goto L_0x0991;
                case -1525246483: goto L_0x0983;
                case -1501115162: goto L_0x0979;
                case -1423578128: goto L_0x096b;
                case -1423578124: goto L_0x0961;
                case -1423578000: goto L_0x0957;
                case -1423524044: goto L_0x094d;
                case -1394970327: goto L_0x0943;
                case -1384107358: goto L_0x0939;
                case -1383290818: goto L_0x092f;
                case -1377734316: goto L_0x0921;
                case -1377720255: goto L_0x0917;
                case -1364385804: goto L_0x090d;
                case -1353216630: goto L_0x0903;
                case -1337531803: goto L_0x08f9;
                case -1335247537: goto L_0x08eb;
                case -1335220115: goto L_0x08e1;
                case -1331792235: goto L_0x08d7;
                case -1302299685: goto L_0x08cd;
                case -1298216371: goto L_0x08c3;
                case -1292381892: goto L_0x08b0;
                case -1238544030: goto L_0x08a6;
                case -1235110308: goto L_0x089c;
                case -1235110304: goto L_0x0892;
                case -1235110180: goto L_0x0888;
                case -1181248894: goto L_0x087e;
                case -1170583898: goto L_0x0870;
                case -1154878384: goto L_0x0866;
                case -1152747049: goto L_0x085c;
                case -1128035233: goto L_0x0852;
                case -1098382296: goto L_0x0848;
                case -1090218638: goto L_0x083e;
                case -1081432069: goto L_0x0834;
                case -1076786794: goto L_0x082a;
                case -1065344764: goto L_0x0820;
                case -1041012015: goto L_0x0816;
                case -1021449836: goto L_0x080c;
                case -980178266: goto L_0x0802;
                case -941829507: goto L_0x07f8;
                case -934624332: goto L_0x07ee;
                case -934624328: goto L_0x07e4;
                case -934624204: goto L_0x07da;
                case -922875487: goto L_0x07d0;
                case -911359595: goto L_0x07c6;
                case -888987527: goto L_0x07bc;
                case -847033342: goto L_0x07b2;
                case -841571398: goto L_0x07a8;
                case -776412115: goto L_0x079e;
                case -686618905: goto L_0x0794;
                case -681256619: goto L_0x078a;
                case -681255910: goto L_0x0780;
                case -681255782: goto L_0x0776;
                case -674213757: goto L_0x076c;
                case -665890270: goto L_0x0762;
                case -578331784: goto L_0x0758;
                case -563779789: goto L_0x074e;
                case -525814977: goto L_0x0744;
                case -500463071: goto L_0x073a;
                case -498198663: goto L_0x0730;
                case -487174472: goto L_0x0726;
                case -485010546: goto L_0x071c;
                case -449269628: goto L_0x0712;
                case -436136818: goto L_0x0708;
                case -395422422: goto L_0x06fe;
                case -395422408: goto L_0x06f4;
                case -391728338: goto L_0x06ea;
                case -391728324: goto L_0x06e0;
                case -383082661: goto L_0x06d6;
                case -332873327: goto L_0x06cc;
                case -305118650: goto L_0x06c2;
                case -288033079: goto L_0x06b8;
                case -284548355: goto L_0x06ae;
                case -277211734: goto L_0x06a4;
                case -277211720: goto L_0x069a;
                case -273978122: goto L_0x0690;
                case -261017813: goto L_0x0686;
                case -247381124: goto L_0x067c;
                case -198188259: goto L_0x0672;
                case -186299734: goto L_0x0668;
                case -159706982: goto L_0x065e;
                case -57969417: goto L_0x0654;
                case -45878767: goto L_0x064a;
                case -3628476: goto L_0x0640;
                case -3628462: goto L_0x0636;
                case 3433440: goto L_0x062c;
                case 3433444: goto L_0x0622;
                case 3433568: goto L_0x0618;
                case 8961496: goto L_0x060e;
                case 26498060: goto L_0x0604;
                case 30963869: goto L_0x05fa;
                case 37743352: goto L_0x05f0;
                case 51987516: goto L_0x05e6;
                case 65152744: goto L_0x05dc;
                case 67460133: goto L_0x05d2;
                case 84470421: goto L_0x05c8;
                case 92627198: goto L_0x05be;
                case 92627202: goto L_0x05b4;
                case 92627326: goto L_0x05aa;
                case 93925044: goto L_0x05a0;
                case 93925048: goto L_0x0596;
                case 93925172: goto L_0x058c;
                case 94104286: goto L_0x0582;
                case 94104414: goto L_0x0578;
                case 95479800: goto L_0x056e;
                case 96669509: goto L_0x0564;
                case 96673473: goto L_0x055a;
                case 96673477: goto L_0x0550;
                case 96857582: goto L_0x0546;
                case 96857586: goto L_0x053c;
                case 96857722: goto L_0x0532;
                case 99153549: goto L_0x0528;
                case 102982545: goto L_0x051e;
                case 103662423: goto L_0x0514;
                case 103662427: goto L_0x050a;
                case 103662551: goto L_0x0500;
                case 106295969: goto L_0x04f6;
                case 106436754: goto L_0x04ec;
                case 114486027: goto L_0x04e2;
                case 122863445: goto L_0x04d8;
                case 125870782: goto L_0x04ce;
                case 160577319: goto L_0x04c4;
                case 178277598: goto L_0x04ba;
                case 179677906: goto L_0x04b0;
                case 195396005: goto L_0x04a6;
                case 212708265: goto L_0x049c;
                case 231782521: goto L_0x0492;
                case 239645856: goto L_0x0488;
                case 239645870: goto L_0x047e;
                case 251189542: goto L_0x0474;
                case 268909194: goto L_0x046a;
                case 274131089: goto L_0x0460;
                case 279619800: goto L_0x0456;
                case 323879359: goto L_0x044c;
                case 355903384: goto L_0x0442;
                case 366286230: goto L_0x0438;
                case 386946318: goto L_0x042e;
                case 397464533: goto L_0x0424;
                case 421950890: goto L_0x041a;
                case 468469463: goto L_0x0410;
                case 492305223: goto L_0x0406;
                case 498330516: goto L_0x03fc;
                case 498330530: goto L_0x03f2;
                case 502024600: goto L_0x03e8;
                case 502024614: goto L_0x03de;
                case 502073889: goto L_0x03d4;
                case 502098166: goto L_0x03ca;
                case 506854116: goto L_0x03c0;
                case 510141829: goto L_0x03b6;
                case 532049313: goto L_0x03ac;
                case 541787306: goto L_0x03a2;
                case 545360306: goto L_0x0398;
                case 592807148: goto L_0x038e;
                case 626807492: goto L_0x0384;
                case 626807506: goto L_0x037a;
                case 655843272: goto L_0x0370;
                case 675413365: goto L_0x0366;
                case 679805718: goto L_0x035c;
                case 686983155: goto L_0x0352;
                case 700467150: goto L_0x0348;
                case 700467164: goto L_0x033e;
                case 714906389: goto L_0x0334;
                case 741324096: goto L_0x032a;
                case 741324110: goto L_0x0320;
                case 746539926: goto L_0x0316;
                case 746539940: goto L_0x030c;
                case 751715426: goto L_0x0302;
                case 775366231: goto L_0x02f8;
                case 813152842: goto L_0x02ee;
                case 818935469: goto L_0x02e4;
                case 829422993: goto L_0x02da;
                case 835344144: goto L_0x02d0;
                case 835344154: goto L_0x02c6;
                case 853803545: goto L_0x02bc;
                case 891095044: goto L_0x02b2;
                case 905617381: goto L_0x02a8;
                case 921038353: goto L_0x029e;
                case 933452073: goto L_0x0294;
                case 934638153: goto L_0x028a;
                case 938281766: goto L_0x0280;
                case 1022319589: goto L_0x0276;
                case 1022341906: goto L_0x026c;
                case 1051510219: goto L_0x0262;
                case 1060185109: goto L_0x0258;
                case 1076160886: goto L_0x024e;
                case 1079063608: goto L_0x0244;
                case 1091416894: goto L_0x023a;
                case 1103536918: goto L_0x0230;
                case 1132460568: goto L_0x0226;
                case 1132460582: goto L_0x021c;
                case 1152634396: goto L_0x0212;
                case 1162611950: goto L_0x0208;
                case 1175796274: goto L_0x01fe;
                case 1264700069: goto L_0x01f4;
                case 1280923007: goto L_0x01ea;
                case 1290312878: goto L_0x01e0;
                case 1296549090: goto L_0x01d6;
                case 1344715130: goto L_0x01cc;
                case 1345484004: goto L_0x01c2;
                case 1450635552: goto L_0x01b8;
                case 1450635566: goto L_0x01ae;
                case 1453433926: goto L_0x01a4;
                case 1478912552: goto L_0x019a;
                case 1485908643: goto L_0x0190;
                case 1548940206: goto L_0x0186;
                case 1556998821: goto L_0x017c;
                case 1556998833: goto L_0x0172;
                case 1557845417: goto L_0x0168;
                case 1557845462: goto L_0x015e;
                case 1563530920: goto L_0x0154;
                case 1572020633: goto L_0x014a;
                case 1603226974: goto L_0x0140;
                case 1628413321: goto L_0x0136;
                case 1676260245: goto L_0x012c;
                case 1677599638: goto L_0x0122;
                case 1745073689: goto L_0x0118;
                case 1745462120: goto L_0x010e;
                case 1774534133: goto L_0x0104;
                case 1784329236: goto L_0x00fa;
                case 1787227456: goto L_0x00f0;
                case 1797094088: goto L_0x00e6;
                case 1835934766: goto L_0x00dc;
                case 1843948449: goto L_0x00d2;
                case 1847127948: goto L_0x00c8;
                case 1862214906: goto L_0x00be;
                case 1864330450: goto L_0x00b4;
                case 1869986918: goto L_0x00aa;
                case 1957139656: goto L_0x00a0;
                case 1957139660: goto L_0x0096;
                case 1957139784: goto L_0x008c;
                case 1962085539: goto L_0x0082;
                case 1982917157: goto L_0x0078;
                case 2019456640: goto L_0x006e;
                case 2020029838: goto L_0x0064;
                case 2020029852: goto L_0x005a;
                case 2035989627: goto L_0x0050;
                case 2039309845: goto L_0x0046;
                case 2054703242: goto L_0x003c;
                case 2089667702: goto L_0x0032;
                case 2089694633: goto L_0x0028;
                case 2134502495: goto L_0x001e;
                case 2134506339: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0b1c
        L_0x0014:
            java.lang.String r5 = "guárdelo"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x0a85
        L_0x001e:
            java.lang.String r5 = "guárdalo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x0028:
            java.lang.String r5 = "suprima última frase"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x0b19
        L_0x0032:
            java.lang.String r5 = "borra texto"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x0a09
        L_0x003c:
            java.lang.String r5 = "campo anterior"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x087a
        L_0x0046:
            java.lang.String r5 = "eliminá última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x0af8
        L_0x0050:
            java.lang.String r5 = "terminado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x005a:
            java.lang.String r5 = "enviar esto"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x0b0d
        L_0x0064:
            java.lang.String r5 = "enviar esta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x006e:
            java.lang.String r5 = "borrar texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0078:
            java.lang.String r5 = "borra la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0082:
            java.lang.String r5 = "borrar la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x008c:
            java.lang.String r5 = "insertá"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x08ba
        L_0x0096:
            java.lang.String r5 = "inserte"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08ba
            goto L_0x0b1c
        L_0x00a0:
            java.lang.String r5 = "inserta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08ba
            goto L_0x0b1c
        L_0x00aa:
            java.lang.String r5 = "borrá última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x00b4:
            java.lang.String r5 = "eliminar la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x00be:
            java.lang.String r5 = "pare dictado"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x0aec
        L_0x00c8:
            java.lang.String r5 = "suprime el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x00d2:
            java.lang.String r5 = "suprima última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x00dc:
            java.lang.String r5 = "borra última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x00e6:
            java.lang.String r5 = "eliminar el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x00f0:
            java.lang.String r5 = "suprime todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x0adf
        L_0x00fa:
            java.lang.String r5 = "suprimir todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0104:
            java.lang.String r5 = "pará de escuchar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x010e:
            java.lang.String r5 = "deshágalo"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x08f5
        L_0x0118:
            java.lang.String r5 = "guárdarlo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x0122:
            java.lang.String r5 = "mandá mensaje"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x012c:
            java.lang.String r5 = "borrá el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0136:
            java.lang.String r5 = "eliminá última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0140:
            java.lang.String r5 = "eliminá la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x014a:
            java.lang.String r5 = "borra la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0154:
            java.lang.String r5 = "borrar última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x015e:
            java.lang.String r5 = "detenga"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0168:
            java.lang.String r5 = "detener"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0172:
            java.lang.String r5 = "deshacé"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08f5
            goto L_0x0b1c
        L_0x017c:
            java.lang.String r5 = "deshaga"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08f5
            goto L_0x0b1c
        L_0x0186:
            java.lang.String r5 = "borrá última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0190:
            java.lang.String r5 = "eliminar texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x019a:
            java.lang.String r5 = "detener la escucha"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x01a4:
            java.lang.String r5 = "eliminar la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x01ae:
            java.lang.String r5 = "enviar eso"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x01b8:
            java.lang.String r5 = "enviar esa"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x01c2:
            java.lang.String r5 = "detené la escucha"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x01cc:
            java.lang.String r5 = "borre texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x01d6:
            java.lang.String r5 = "elimine la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x01e0:
            java.lang.String r5 = "borre todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x01ea:
            java.lang.String r5 = "siguiente"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x098d
        L_0x01f4:
            java.lang.String r5 = "borrá la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x01fe:
            java.lang.String r5 = "borra todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0208:
            java.lang.String r5 = "borre última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0212:
            java.lang.String r5 = "borrar última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x021c:
            java.lang.String r5 = "enviá eso"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0226:
            java.lang.String r5 = "enviá esa"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0230:
            java.lang.String r5 = "manda mensaje"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x023a:
            java.lang.String r5 = "rematar"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x0975
        L_0x0244:
            java.lang.String r5 = "suprimir el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x024e:
            java.lang.String r5 = "pará dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0258:
            java.lang.String r5 = "borra el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0262:
            java.lang.String r5 = "borrar el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x026c:
            java.lang.String r5 = "deshazlo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08f5
            goto L_0x0b1c
        L_0x0276:
            java.lang.String r5 = "deshacer"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08f5
            goto L_0x0b1c
        L_0x0280:
            java.lang.String r5 = "pará de dictar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x028a:
            java.lang.String r5 = "búsquelo"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0b1c
            goto L_0x092b
        L_0x0294:
            java.lang.String r5 = "suprime todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x029e:
            java.lang.String r5 = "elimine última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x02a8:
            java.lang.String r5 = "detén el dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x02b2:
            java.lang.String r5 = "suprimí el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x02bc:
            java.lang.String r5 = "borrá la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x02c6:
            java.lang.String r5 = "mandalo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x02d0:
            java.lang.String r5 = "mandale"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x02da:
            java.lang.String r5 = "elimine todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x02e4:
            java.lang.String r5 = "suprima todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x02ee:
            java.lang.String r5 = "suprime la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x02f8:
            java.lang.String r5 = "borra todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0302:
            java.lang.String r5 = "borre última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x030c:
            java.lang.String r5 = "enviá esto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0316:
            java.lang.String r5 = "enviá esta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0320:
            java.lang.String r5 = "mande esto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x032a:
            java.lang.String r5 = "mande esta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0334:
            java.lang.String r5 = "elimina todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x033e:
            java.lang.String r5 = "mandar eso"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0348:
            java.lang.String r5 = "mandar esa"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0352:
            java.lang.String r5 = "elimina texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x035c:
            java.lang.String r5 = "suprimí la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0366:
            java.lang.String r5 = "para de escuchar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0370:
            java.lang.String r5 = "suprimí todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x037a:
            java.lang.String r5 = "manda esto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0384:
            java.lang.String r5 = "manda esta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x038e:
            java.lang.String r5 = "detenga dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0398:
            java.lang.String r5 = "borrá todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x03a2:
            java.lang.String r5 = "insertar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08ba
            goto L_0x0b1c
        L_0x03ac:
            java.lang.String r5 = "suprimí todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x03b6:
            java.lang.String r5 = "elimine última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x03c0:
            java.lang.String r5 = "borrar última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x03ca:
            java.lang.String r5 = "para dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x03d4:
            java.lang.String r5 = "borrá la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x03de:
            java.lang.String r5 = "envíe eso"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x03e8:
            java.lang.String r5 = "envíe esa"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x03f2:
            java.lang.String r5 = "envía eso"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x03fc:
            java.lang.String r5 = "envía esa"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0406:
            java.lang.String r5 = "detenga el dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0410:
            java.lang.String r5 = "borrá todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x041a:
            java.lang.String r5 = "pare de dictar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0424:
            java.lang.String r5 = "suprimir todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x042e:
            java.lang.String r5 = "detén dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0438:
            java.lang.String r5 = "guardar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x0442:
            java.lang.String r5 = "finalizar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x044c:
            java.lang.String r5 = "detener dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0456:
            java.lang.String r5 = "parar de dictar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0460:
            java.lang.String r5 = "borre el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x046a:
            java.lang.String r5 = "suprimí la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0474:
            java.lang.String r5 = "elimine la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x047e:
            java.lang.String r5 = "mandar esto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0488:
            java.lang.String r5 = "mandar esta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0492:
            java.lang.String r5 = "pare el dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x049c:
            java.lang.String r5 = "suprime última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x04a6:
            java.lang.String r5 = "borre la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x04b0:
            java.lang.String r5 = "suprimí la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x04ba:
            java.lang.String r5 = "elimina la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x04c4:
            java.lang.String r5 = "parar de escuchar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x04ce:
            java.lang.String r5 = "mandarlo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x04d8:
            java.lang.String r5 = "suprimir última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x04e2:
            java.lang.String r5 = "parar el dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x04ec:
            java.lang.String r5 = "parar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x04f6:
            java.lang.String r5 = "eliminar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0500:
            java.lang.String r5 = "mandá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x050a:
            java.lang.String r5 = "mande"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0514:
            java.lang.String r5 = "manda"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x051e:
            java.lang.String r5 = "listo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x0528:
            java.lang.String r5 = "hecho"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x0532:
            java.lang.String r5 = "añadí"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08ba
            goto L_0x0b1c
        L_0x053c:
            java.lang.String r5 = "añade"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08ba
            goto L_0x0b1c
        L_0x0546:
            java.lang.String r5 = "añada"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08ba
            goto L_0x0b1c
        L_0x0550:
            java.lang.String r5 = "envíe"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x055a:
            java.lang.String r5 = "envía"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0564:
            java.lang.String r5 = "enviá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x056e:
            java.lang.String r5 = "detén"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0578:
            java.lang.String r5 = "buscá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x092b
            goto L_0x0b1c
        L_0x0582:
            java.lang.String r5 = "busca"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x092b
            goto L_0x0b1c
        L_0x058c:
            java.lang.String r5 = "borrá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0596:
            java.lang.String r5 = "borre"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x05a0:
            java.lang.String r5 = "borra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x05aa:
            java.lang.String r5 = "acabá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x05b4:
            java.lang.String r5 = "acabe"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x05be:
            java.lang.String r5 = "acaba"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x05c8:
            java.lang.String r5 = "eliminá todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x05d2:
            java.lang.String r5 = "suprime última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x05dc:
            java.lang.String r5 = "borrar todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x05e6:
            java.lang.String r5 = "suprima todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x05f0:
            java.lang.String r5 = "eliminá el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x05fa:
            java.lang.String r5 = "suprimí última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0604:
            java.lang.String r5 = "enviar mensaje"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x060e:
            java.lang.String r5 = "elimine todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0618:
            java.lang.String r5 = "pará"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0622:
            java.lang.String r5 = "pare"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x062c:
            java.lang.String r5 = "para"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0636:
            java.lang.String r5 = "mandá esto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0640:
            java.lang.String r5 = "mandá esta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x064a:
            java.lang.String r5 = "elimina última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0654:
            java.lang.String r5 = "elimine texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x065e:
            java.lang.String r5 = "elimine la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0668:
            java.lang.String r5 = "borre última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0672:
            java.lang.String r5 = "suprime última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x067c:
            java.lang.String r5 = "búscalo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x092b
            goto L_0x0b1c
        L_0x0686:
            java.lang.String r5 = "borrar la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0690:
            java.lang.String r5 = "borrá texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x069a:
            java.lang.String r5 = "mandá eso"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x06a4:
            java.lang.String r5 = "mandá esa"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x06ae:
            java.lang.String r5 = "para el dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x06b8:
            java.lang.String r5 = "suprimir última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x06c2:
            java.lang.String r5 = "suprima la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x06cc:
            java.lang.String r5 = "eliminá última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x06d6:
            java.lang.String r5 = "suprima texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x06e0:
            java.lang.String r5 = "mande eso"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x06ea:
            java.lang.String r5 = "mande esa"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x06f4:
            java.lang.String r5 = "manda eso"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x06fe:
            java.lang.String r5 = "manda esa"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0708:
            java.lang.String r5 = "suprime la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0712:
            java.lang.String r5 = "envíe mensaje"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x071c:
            java.lang.String r5 = "eliminar la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0726:
            java.lang.String r5 = "anterior"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x087a
            goto L_0x0b1c
        L_0x0730:
            java.lang.String r5 = "pare de escuchar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x073a:
            java.lang.String r5 = "suprimí última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0744:
            java.lang.String r5 = "rematado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x074e:
            java.lang.String r5 = "suprimir texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0758:
            java.lang.String r5 = "elimina el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0762:
            java.lang.String r5 = "elimina la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x076c:
            java.lang.String r5 = "detené dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0776:
            java.lang.String r5 = "finalizá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x0780:
            java.lang.String r5 = "finaliza"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x078a:
            java.lang.String r5 = "finalice"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x0794:
            java.lang.String r5 = "suprimí texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x079e:
            java.lang.String r5 = "siguiente campo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x098d
            goto L_0x0b1c
        L_0x07a8:
            java.lang.String r5 = "mandar mensaje"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x07b2:
            java.lang.String r5 = "suprime la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x07bc:
            java.lang.String r5 = "detén la escucha"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x07c6:
            java.lang.String r5 = "suprimí última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x07d0:
            java.lang.String r5 = "borra la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x07da:
            java.lang.String r5 = "rematá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x07e4:
            java.lang.String r5 = "remate"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x07ee:
            java.lang.String r5 = "remata"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x07f8:
            java.lang.String r5 = "pará el dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0802:
            java.lang.String r5 = "para de dictar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x080c:
            java.lang.String r5 = "detener el dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0816:
            java.lang.String r5 = "suprimir última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0820:
            java.lang.String r5 = "enviá mensaje"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x082a:
            java.lang.String r5 = "elimina la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0834:
            java.lang.String r5 = "mandar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x083e:
            java.lang.String r5 = "borra última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0848:
            java.lang.String r5 = "deshacerlo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08f5
            goto L_0x0b1c
        L_0x0852:
            java.lang.String r5 = "suprime texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x085c:
            java.lang.String r5 = "buscarlo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x092b
            goto L_0x0b1c
        L_0x0866:
            java.lang.String r5 = "detené el dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0870:
            java.lang.String r5 = "anterior campo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x087a
            goto L_0x0b1c
        L_0x087a:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ae r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125652ae.f346322a
            goto L_0x0b55
        L_0x087e:
            java.lang.String r5 = "terminar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x0888:
            java.lang.String r5 = "guardá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x0892:
            java.lang.String r5 = "guarde"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x089c:
            java.lang.String r5 = "guarda"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x08a6:
            java.lang.String r5 = "suprimir la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x08b0:
            java.lang.String r5 = "añadir"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08ba
            goto L_0x0b1c
        L_0x08ba:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a r4 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a
            h.a.am r5 = p5462h.p5463a.C69496am.f185918a
            r4.<init>(r5)
            goto L_0x0b55
        L_0x08c3:
            java.lang.String r5 = "enviar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x08cd:
            java.lang.String r5 = "detenga la escucha"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x08d7:
            java.lang.String r5 = "elimina última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x08e1:
            java.lang.String r5 = "detené"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x08eb:
            java.lang.String r5 = "deshaz"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x08f5
            goto L_0x0b1c
        L_0x08f5:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.at r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125667at.f346343a
            goto L_0x0b55
        L_0x08f9:
            java.lang.String r5 = "eliminar todo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0903:
            java.lang.String r5 = "suprima la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x090d:
            java.lang.String r5 = "elimine el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0917:
            java.lang.String r5 = "busque"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x092b
            goto L_0x0b1c
        L_0x0921:
            java.lang.String r5 = "buscar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x092b
            goto L_0x0b1c
        L_0x092b:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.al r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125659al.f346329a
            goto L_0x0b55
        L_0x092f:
            java.lang.String r5 = "borrar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0939:
            java.lang.String r5 = "eliminá la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0943:
            java.lang.String r5 = "borre la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x094d:
            java.lang.String r5 = "acabar"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x0957:
            java.lang.String r5 = "terminá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x0961:
            java.lang.String r5 = "termine"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x096b:
            java.lang.String r5 = "termina"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0975
            goto L_0x0b1c
        L_0x0975:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.i r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125676i.f346354a
            goto L_0x0b55
        L_0x0979:
            java.lang.String r5 = "borra última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0983:
            java.lang.String r5 = "campo siguiente"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x098d
            goto L_0x0b1c
        L_0x098d:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ad r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125651ad.f346321a
            goto L_0x0b55
        L_0x0991:
            java.lang.String r5 = "envíalo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x099b:
            java.lang.String r5 = "envíale"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x09a5:
            java.lang.String r5 = "envíe esto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x09af:
            java.lang.String r5 = "envíe esta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x09b9:
            java.lang.String r5 = "eliminar última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x09c3:
            java.lang.String r5 = "suprimir la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x09cd:
            java.lang.String r5 = "eliminá"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x09d7:
            java.lang.String r5 = "elimine"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x09e1:
            java.lang.String r5 = "elimina"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x09eb:
            java.lang.String r5 = "suprimir"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x09f5:
            java.lang.String r5 = "suprima el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x09ff:
            java.lang.String r5 = "eliminá texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a09
            goto L_0x0b1c
        L_0x0a09:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.b r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125669b.f346346a
            goto L_0x0b55
        L_0x0a0d:
            java.lang.String r5 = "elimina todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0a17:
            java.lang.String r5 = "envía esto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0a21:
            java.lang.String r5 = "envía esta"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0a2b:
            java.lang.String r5 = "elimina última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0a35:
            java.lang.String r5 = "suprima la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0a3f:
            java.lang.String r5 = "borrar todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0a49:
            java.lang.String r5 = "borre todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0a53:
            java.lang.String r5 = "eliminá la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0a5d:
            java.lang.String r5 = "borre la última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0a67:
            java.lang.String r5 = "envía mensaje"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0a71:
            java.lang.String r5 = "mande mensaje"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0a7b:
            java.lang.String r5 = "finalizado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0a85
            goto L_0x0b1c
        L_0x0a85:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ak r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125658ak.f346328a
            goto L_0x0b55
        L_0x0a89:
            java.lang.String r5 = "suprimí"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0a93:
            java.lang.String r5 = "suprime"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0a9d:
            java.lang.String r5 = "suprima"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0aa7:
            java.lang.String r5 = "borrar la última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0ab1:
            java.lang.String r5 = "suprimir la última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0abb:
            java.lang.String r5 = "eliminar última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0ac4:
            java.lang.String r5 = "eliminar todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0acd:
            java.lang.String r5 = "borrá última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0ad6:
            java.lang.String r5 = "eliminá todo el texto"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0adf
            goto L_0x0b1c
        L_0x0adf:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.e r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125672e.f346350a
            goto L_0x0b55
        L_0x0ae3:
            java.lang.String r5 = "parar dictado"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0aec
            goto L_0x0b1c
        L_0x0aec:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ap r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125663ap.f346334a
            goto L_0x0b55
        L_0x0aef:
            java.lang.String r5 = "suprima última palabra"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0af8
            goto L_0x0b1c
        L_0x0af8:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.aj r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125657aj.f346327a
            goto L_0x0b55
        L_0x0afb:
            java.lang.String r5 = "eliminar última oración"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0b04:
            java.lang.String r5 = "enviarlo"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b0d
            goto L_0x0b1c
        L_0x0b0d:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.an r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125661an.f346331a
            goto L_0x0b55
        L_0x0b10:
            java.lang.String r5 = "elimine última frase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0b19
            goto L_0x0b1c
        L_0x0b19:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ai r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125656ai.f346326a
            goto L_0x0b55
        L_0x0b1c:
            r5 = 6
            h.f.a.l[] r5 = new p5462h.p5473f.p5474a.C69626l[r5]
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dd r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dd
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dc r1 = f346266a
            r0.<init>(r1)
            r2 = 0
            r5[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.de r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.de
            r0.<init>(r1)
            r2 = 1
            r5[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.df r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.df
            r0.<init>(r1)
            r2 = 2
            r5[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dg r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dg
            r0.<init>(r1)
            r2 = 3
            r5[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dh r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dh
            r0.<init>(r1)
            r2 = 4
            r5[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.di r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.di
            r0.<init>(r1)
            r1 = 5
            r5[r1] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.z r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125692y.m205677a(r4, r5)
        L_0x0b55:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125625dj.mo107043a(java.lang.String, h.c.g):java.lang.Object");
    }
}
