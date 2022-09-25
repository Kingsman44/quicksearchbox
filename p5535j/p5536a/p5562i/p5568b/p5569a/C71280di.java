package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.di */
/* compiled from: PG */
public final class C71280di extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71280di f190319d;

    /* renamed from: e */
    private static volatile C63010eb f190320e;

    /* renamed from: a */
    public C62964ck f190321a = emptyLongList();

    /* renamed from: b */
    public C62964ck f190322b = emptyLongList();

    /* renamed from: c */
    public C62961ch f190323c = emptyIntList();

    static {
        C71280di diVar = new C71280di();
        f190319d = diVar;
        C62942bv.registerDefaultInstance(C71280di.class, diVar);
    }

    private C71280di() {
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
                return newMessageInfo(f190319d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001%\u0002%\u0003'", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71280di();
            case 4:
                return new C71279dh();
            case 5:
                return f190319d;
            case 6:
                C63010eb ebVar = f190320e;
                if (ebVar == null) {
                    synchronized (C71280di.class) {
                        ebVar = f190320e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190319d);
                            f190320e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
