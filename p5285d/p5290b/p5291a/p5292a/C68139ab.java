package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.ab */
/* compiled from: PG */
public final class C68139ab extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C68139ab f184417e;

    /* renamed from: f */
    private static volatile C63010eb f184418f;

    /* renamed from: a */
    public String f184419a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f184420b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f184421c;

    /* renamed from: d */
    public String f184422d = BuildConfig.FLAVOR;

    static {
        C68139ab abVar = new C68139ab();
        f184417e = abVar;
        C62942bv.registerDefaultInstance(C68139ab.class, abVar);
    }

    private C68139ab() {
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
                return newMessageInfo(f184417e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C68139ab();
            case 4:
                return new C68138aa();
            case 5:
                return f184417e;
            case 6:
                C63010eb ebVar = f184418f;
                if (ebVar == null) {
                    synchronized (C68139ab.class) {
                        ebVar = f184418f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184417e);
                            f184418f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
