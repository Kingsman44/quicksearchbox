package p001a.p014d.p015a.p016a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.an */
/* compiled from: PG */
public final class C0051an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C0051an f137b;

    /* renamed from: c */
    private static volatile C63010eb f138c;

    /* renamed from: a */
    public C62995dn f139a = C62995dn.f170057a;

    static {
        C0051an anVar = new C0051an();
        f137b = anVar;
        C62942bv.registerDefaultInstance(C0051an.class, anVar);
    }

    private C0051an() {
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
                return newMessageInfo(f137b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C0050am.f136a});
            case 3:
                return new C0051an();
            case 4:
                return new C0049al();
            case 5:
                return f137b;
            case 6:
                C63010eb ebVar = f138c;
                if (ebVar == null) {
                    synchronized (C0051an.class) {
                        ebVar = f138c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137b);
                            f138c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
