package p5602o.p5607c.p5608a.p5609a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.a.a.i */
/* compiled from: PG */
public final class C71910i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71910i f191517d;

    /* renamed from: e */
    private static volatile C63010eb f191518e;

    /* renamed from: a */
    public int f191519a;

    /* renamed from: b */
    public int f191520b;

    /* renamed from: c */
    public long f191521c = 1;

    static {
        C71910i iVar = new C71910i();
        f191517d = iVar;
        C62942bv.registerDefaultInstance(C71910i.class, iVar);
    }

    private C71910i() {
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
                return newMessageInfo(f191517d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C71911j.f191522a, C45240c.f118157a});
            case 3:
                return new C71910i();
            case 4:
                return new C71909h();
            case 5:
                return f191517d;
            case 6:
                C63010eb ebVar = f191518e;
                if (ebVar == null) {
                    synchronized (C71910i.class) {
                        ebVar = f191518e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191517d);
                            f191518e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
