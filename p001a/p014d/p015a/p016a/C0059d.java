package p001a.p014d.p015a.p016a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.d */
/* compiled from: PG */
public final class C0059d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C0059d f156b;

    /* renamed from: c */
    private static volatile C63010eb f157c;

    /* renamed from: a */
    public C62971cq f158a = emptyProtobufList();

    static {
        C0059d dVar = new C0059d();
        f156b = dVar;
        C62942bv.registerDefaultInstance(C0059d.class, dVar);
    }

    private C0059d() {
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
                return newMessageInfo(f156b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C0058c.class});
            case 3:
                return new C0059d();
            case 4:
                return new C0037a();
            case 5:
                return f156b;
            case 6:
                C63010eb ebVar = f157c;
                if (ebVar == null) {
                    synchronized (C0059d.class) {
                        ebVar = f157c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f156b);
                            f157c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
