package p001a.p007b.p008a.p009a.p010a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.a.a.a.i */
/* compiled from: PG */
public final class C0013i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C0013i f21e;

    /* renamed from: f */
    private static volatile C63010eb f22f;

    /* renamed from: a */
    public int f23a;

    /* renamed from: b */
    public int f24b;

    /* renamed from: c */
    public float f25c;

    /* renamed from: d */
    public int f26d = 2;

    static {
        C0013i iVar = new C0013i();
        f21e = iVar;
        C62942bv.registerDefaultInstance(C0013i.class, iVar);
    }

    private C0013i() {
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
                return newMessageInfo(f21e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"a", "b", C0008d.f13a, C45240c.f118157a, "d"});
            case 3:
                return new C0013i();
            case 4:
                return new C0012h();
            case 5:
                return f21e;
            case 6:
                C63010eb ebVar = f22f;
                if (ebVar == null) {
                    synchronized (C0013i.class) {
                        ebVar = f22f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f21e);
                            f22f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
