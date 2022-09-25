package p5535j.p5536a.p5562i.p5563a.p5566b.p5567a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.a.b.a.e */
/* compiled from: PG */
public final class C71188e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71188e f189929d;

    /* renamed from: e */
    private static volatile C63010eb f189930e;

    /* renamed from: a */
    public int f189931a;

    /* renamed from: b */
    public int f189932b;

    /* renamed from: c */
    public int f189933c;

    static {
        C71188e eVar = new C71188e();
        f189929d = eVar;
        C62942bv.registerDefaultInstance(C71188e.class, eVar);
    }

    private C71188e() {
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
                return newMessageInfo(f189929d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C66419b.m97203b()});
            case 3:
                return new C71188e();
            case 4:
                return new C71187d();
            case 5:
                return f189929d;
            case 6:
                C63010eb ebVar = f189930e;
                if (ebVar == null) {
                    synchronized (C71188e.class) {
                        ebVar = f189930e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189929d);
                            f189930e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
