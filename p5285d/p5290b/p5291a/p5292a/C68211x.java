package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.x */
/* compiled from: PG */
public final class C68211x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C68211x f184566e;

    /* renamed from: f */
    private static volatile C63010eb f184567f;

    /* renamed from: a */
    public String f184568a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C68139ab f184569b;

    /* renamed from: c */
    public C68195h f184570c;

    /* renamed from: d */
    public boolean f184571d;

    static {
        C68211x xVar = new C68211x();
        f184566e = xVar;
        C62942bv.registerDefaultInstance(C68211x.class, xVar);
    }

    private C68211x() {
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
                return newMessageInfo(f184566e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0004\u0007\u0006Ȉ", new Object[]{"b", C45240c.f118157a, "d", "a"});
            case 3:
                return new C68211x();
            case 4:
                return new C68210w();
            case 5:
                return f184566e;
            case 6:
                C63010eb ebVar = f184567f;
                if (ebVar == null) {
                    synchronized (C68211x.class) {
                        ebVar = f184567f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184566e);
                            f184567f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
