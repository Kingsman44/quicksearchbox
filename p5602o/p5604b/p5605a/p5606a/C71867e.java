package p5602o.p5604b.p5605a.p5606a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.a.e */
/* compiled from: PG */
public final class C71867e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C71867e f191415a;

    /* renamed from: b */
    private static volatile C63010eb f191416b;

    static {
        C71867e eVar = new C71867e();
        f191415a = eVar;
        C62942bv.registerDefaultInstance(C71867e.class, eVar);
    }

    private C71867e() {
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
                return newMessageInfo(f191415a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C71867e();
            case 4:
                return new C71866d();
            case 5:
                return f191415a;
            case 6:
                C63010eb ebVar = f191416b;
                if (ebVar == null) {
                    synchronized (C71867e.class) {
                        ebVar = f191416b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191415a);
                            f191416b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
