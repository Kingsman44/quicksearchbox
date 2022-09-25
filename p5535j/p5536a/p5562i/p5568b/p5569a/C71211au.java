package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.au */
/* compiled from: PG */
public final class C71211au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71211au f190089c;

    /* renamed from: d */
    private static volatile C63010eb f190090d;

    /* renamed from: a */
    public int f190091a;

    /* renamed from: b */
    public String f190092b = BuildConfig.FLAVOR;

    static {
        C71211au auVar = new C71211au();
        f190089c = auVar;
        C62942bv.registerDefaultInstance(C71211au.class, auVar);
    }

    private C71211au() {
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
                return newMessageInfo(f190089c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71211au();
            case 4:
                return new C71210at();
            case 5:
                return f190089c;
            case 6:
                C63010eb ebVar = f190090d;
                if (ebVar == null) {
                    synchronized (C71211au.class) {
                        ebVar = f190090d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190089c);
                            f190090d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
