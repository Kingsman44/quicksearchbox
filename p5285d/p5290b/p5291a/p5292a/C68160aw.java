package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.aw */
/* compiled from: PG */
public final class C68160aw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68160aw f184446b;

    /* renamed from: c */
    private static volatile C63010eb f184447c;

    /* renamed from: a */
    public String f184448a = BuildConfig.FLAVOR;

    static {
        C68160aw awVar = new C68160aw();
        f184446b = awVar;
        C62942bv.registerDefaultInstance(C68160aw.class, awVar);
    }

    private C68160aw() {
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
                return newMessageInfo(f184446b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C68160aw();
            case 4:
                return new C68159av();
            case 5:
                return f184446b;
            case 6:
                C63010eb ebVar = f184447c;
                if (ebVar == null) {
                    synchronized (C68160aw.class) {
                        ebVar = f184447c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184446b);
                            f184447c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
