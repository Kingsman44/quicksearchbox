package p001a.p007b.p008a.p009a.p010a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.a.a.a.c */
/* compiled from: PG */
public final class C0007c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C0007c f9c;

    /* renamed from: d */
    private static volatile C63010eb f10d;

    /* renamed from: a */
    public int f11a;

    /* renamed from: b */
    public int f12b;

    static {
        C0007c cVar = new C0007c();
        f9c = cVar;
        C62942bv.registerDefaultInstance(C0007c.class, cVar);
    }

    private C0007c() {
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
                return newMessageInfo(f9c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C0006b.f8a});
            case 3:
                return new C0007c();
            case 4:
                return new C0005a();
            case 5:
                return f9c;
            case 6:
                C63010eb ebVar = f10d;
                if (ebVar == null) {
                    synchronized (C0007c.class) {
                        ebVar = f10d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f9c);
                            f10d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
