package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.en */
/* compiled from: PG */
public enum C71095en implements C62957cd {
    AUDIO_ROUTE_UNKNOWN(0),
    AUDIO_ROUTE_BLUETOOTH(1),
    AUDIO_ROUTE_BUILTIN(2),
    AUDIO_ROUTE_DSP(3),
    AUDIO_ROUTE_BISTO(4),
    AUDIO_ROUTE_HANDOVER(5),
    AUDIO_ROUTE_SODA(6);
    

    /* renamed from: h */
    public final int f189617h;

    private C71095en(int i) {
        this.f189617h = i;
    }

    /* renamed from: a */
    public static C71095en m103883a(int i) {
        switch (i) {
            case 0:
                return AUDIO_ROUTE_UNKNOWN;
            case 1:
                return AUDIO_ROUTE_BLUETOOTH;
            case 2:
                return AUDIO_ROUTE_BUILTIN;
            case 3:
                return AUDIO_ROUTE_DSP;
            case 4:
                return AUDIO_ROUTE_BISTO;
            case 5:
                return AUDIO_ROUTE_HANDOVER;
            case 6:
                return AUDIO_ROUTE_SODA;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m103884b() {
        return C71094em.f189608a;
    }

    public final int getNumber() {
        return this.f189617h;
    }

    public final String toString() {
        return Integer.toString(this.f189617h);
    }
}
