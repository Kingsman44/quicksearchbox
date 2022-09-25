package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125068aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.ay */
/* compiled from: PG */
public final class C70998ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70998ay f189349c;

    /* renamed from: d */
    private static volatile C63010eb f189350d;

    /* renamed from: a */
    public int f189351a;

    /* renamed from: b */
    public int f189352b;

    static {
        C70998ay ayVar = new C70998ay();
        f189349c = ayVar;
        C62942bv.registerDefaultInstance(C70998ay.class, ayVar);
    }

    private C70998ay() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f189349c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C125068aw.f345046a});
            case 3:
                return new C70998ay();
            case 4:
                return new C70997ax();
            case 5:
                return f189349c;
            case 6:
                C63010eb ebVar = f189350d;
                if (ebVar == null) {
                    synchronized (C70998ay.class) {
                        ebVar = f189350d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189349c);
                            f189350d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
