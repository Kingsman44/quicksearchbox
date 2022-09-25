package p5602o.p5604b.p5605a.p5606a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.a.i */
/* compiled from: PG */
public final class C71871i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C71871i f191421a;

    /* renamed from: b */
    private static volatile C63010eb f191422b;

    static {
        C71871i iVar = new C71871i();
        f191421a = iVar;
        C62942bv.registerDefaultInstance(C71871i.class, iVar);
    }

    private C71871i() {
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
                return newMessageInfo(f191421a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C71871i();
            case 4:
                return new C71870h();
            case 5:
                return f191421a;
            case 6:
                C63010eb ebVar = f191422b;
                if (ebVar == null) {
                    synchronized (C71871i.class) {
                        ebVar = f191422b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191421a);
                            f191422b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
