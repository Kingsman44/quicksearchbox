package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.e */
/* compiled from: PG */
public final class C69440e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C69440e f185813b;

    /* renamed from: c */
    private static volatile C63010eb f185814c;

    /* renamed from: a */
    public C62995dn f185815a = C62995dn.f170057a;

    static {
        C69440e eVar = new C69440e();
        f185813b = eVar;
        C62942bv.registerDefaultInstance(C69440e.class, eVar);
    }

    private C69440e() {
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
                return newMessageInfo(f185813b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C69439d.f185812a});
            case 3:
                return new C69440e();
            case 4:
                return new C69432c();
            case 5:
                return f185813b;
            case 6:
                C63010eb ebVar = f185814c;
                if (ebVar == null) {
                    synchronized (C69440e.class) {
                        ebVar = f185814c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185813b);
                            f185814c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
