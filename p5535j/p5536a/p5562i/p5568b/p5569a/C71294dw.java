package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.dw */
/* compiled from: PG */
public final class C71294dw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71294dw f190376c;

    /* renamed from: d */
    private static volatile C63010eb f190377d;

    /* renamed from: a */
    public C62961ch f190378a = emptyIntList();

    /* renamed from: b */
    public C62961ch f190379b = emptyIntList();

    static {
        C71294dw dwVar = new C71294dw();
        f190376c = dwVar;
        C62942bv.registerDefaultInstance(C71294dw.class, dwVar);
    }

    private C71294dw() {
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
                return newMessageInfo(f190376c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"a", "b"});
            case 3:
                return new C71294dw();
            case 4:
                return new C71293dv();
            case 5:
                return f190376c;
            case 6:
                C63010eb ebVar = f190377d;
                if (ebVar == null) {
                    synchronized (C71294dw.class) {
                        ebVar = f190377d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190376c);
                            f190377d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
