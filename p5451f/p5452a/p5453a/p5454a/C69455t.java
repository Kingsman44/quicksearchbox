package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.t */
/* compiled from: PG */
public final class C69455t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69455t f185861c;

    /* renamed from: d */
    private static volatile C63010eb f185862d;

    /* renamed from: a */
    public int f185863a = 0;

    /* renamed from: b */
    public Object f185864b;

    static {
        C69455t tVar = new C69455t();
        f185861c = tVar;
        C62942bv.registerDefaultInstance(C69455t.class, tVar);
    }

    private C69455t() {
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
                return newMessageInfo(f185861c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C69455t();
            case 4:
                return new C69454s();
            case 5:
                return f185861c;
            case 6:
                C63010eb ebVar = f185862d;
                if (ebVar == null) {
                    synchronized (C69455t.class) {
                        ebVar = f185862d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185861c);
                            f185862d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
