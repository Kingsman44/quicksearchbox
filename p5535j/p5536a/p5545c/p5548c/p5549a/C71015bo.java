package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.bo */
/* compiled from: PG */
public final class C71015bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71015bo f189387c;

    /* renamed from: d */
    private static volatile C63010eb f189388d;

    /* renamed from: a */
    public int f189389a = 0;

    /* renamed from: b */
    public Object f189390b;

    static {
        C71015bo boVar = new C71015bo();
        f189387c = boVar;
        C62942bv.registerDefaultInstance(C71015bo.class, boVar);
    }

    private C71015bo() {
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
                return newMessageInfo(f189387c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C71011bk.class, C71014bn.class});
            case 3:
                return new C71015bo();
            case 4:
                return new C71009bi();
            case 5:
                return f189387c;
            case 6:
                C63010eb ebVar = f189388d;
                if (ebVar == null) {
                    synchronized (C71015bo.class) {
                        ebVar = f189388d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189387c);
                            f189388d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
