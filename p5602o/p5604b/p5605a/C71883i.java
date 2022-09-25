package p5602o.p5604b.p5605a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.i */
/* compiled from: PG */
public final class C71883i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71883i f191446c;

    /* renamed from: d */
    private static volatile C63010eb f191447d;

    /* renamed from: a */
    public int f191448a;

    /* renamed from: b */
    public int f191449b;

    static {
        C71883i iVar = new C71883i();
        f191446c = iVar;
        C62942bv.registerDefaultInstance(C71883i.class, iVar);
    }

    private C71883i() {
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
                return newMessageInfo(f191446c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71883i();
            case 4:
                return new C71882h();
            case 5:
                return f191446c;
            case 6:
                C63010eb ebVar = f191447d;
                if (ebVar == null) {
                    synchronized (C71883i.class) {
                        ebVar = f191447d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191446c);
                            f191447d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
