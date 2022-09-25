package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.ai */
/* compiled from: PG */
public final class C71199ai extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71199ai f190036e;

    /* renamed from: f */
    private static volatile C63010eb f190037f;

    /* renamed from: a */
    public int f190038a;

    /* renamed from: b */
    public C71201ak f190039b;

    /* renamed from: c */
    public C71201ak f190040c;

    /* renamed from: d */
    public float f190041d;

    static {
        C71199ai aiVar = new C71199ai();
        f190036e = aiVar;
        C62942bv.registerDefaultInstance(C71199ai.class, aiVar);
    }

    private C71199ai() {
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
                return newMessageInfo(f190036e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71199ai();
            case 4:
                return new C71198ah();
            case 5:
                return f190036e;
            case 6:
                C63010eb ebVar = f190037f;
                if (ebVar == null) {
                    synchronized (C71199ai.class) {
                        ebVar = f190037f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190036e);
                            f190037f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
