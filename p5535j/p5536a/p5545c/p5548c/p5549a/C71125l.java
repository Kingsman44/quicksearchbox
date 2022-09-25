package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.l */
/* compiled from: PG */
public final class C71125l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71125l f189735c;

    /* renamed from: d */
    private static volatile C63010eb f189736d;

    /* renamed from: a */
    public int f189737a;

    /* renamed from: b */
    public int f189738b;

    static {
        C71125l lVar = new C71125l();
        f189735c = lVar;
        C62942bv.registerDefaultInstance(C71125l.class, lVar);
    }

    private C71125l() {
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
                return newMessageInfo(f189735c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C71124k.f189734a});
            case 3:
                return new C71125l();
            case 4:
                return new C71123j();
            case 5:
                return f189735c;
            case 6:
                C63010eb ebVar = f189736d;
                if (ebVar == null) {
                    synchronized (C71125l.class) {
                        ebVar = f189736d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189735c);
                            f189736d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
