package p001a.p013c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.c.c */
/* compiled from: PG */
public final class C0034c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C0034c f98b;

    /* renamed from: c */
    private static volatile C63010eb f99c;

    /* renamed from: a */
    public C62995dn f100a = C62995dn.f170057a;

    static {
        C0034c cVar = new C0034c();
        f98b = cVar;
        C62942bv.registerDefaultInstance(C0034c.class, cVar);
    }

    private C0034c() {
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
                return newMessageInfo(f98b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C0033b.f97a});
            case 3:
                return new C0034c();
            case 4:
                return new C0032a();
            case 5:
                return f98b;
            case 6:
                C63010eb ebVar = f99c;
                if (ebVar == null) {
                    synchronized (C0034c.class) {
                        ebVar = f99c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f98b);
                            f99c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
