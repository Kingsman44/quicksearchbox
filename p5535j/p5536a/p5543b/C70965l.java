package p5535j.p5536a.p5543b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52557wd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.b.l */
/* compiled from: PG */
public final class C70965l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C70965l f189217f;

    /* renamed from: g */
    private static volatile C63010eb f189218g;

    /* renamed from: a */
    public int f189219a;

    /* renamed from: b */
    public String f189220b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f189221c;

    /* renamed from: d */
    public int f189222d;

    /* renamed from: e */
    public String f189223e = BuildConfig.FLAVOR;

    static {
        C70965l lVar = new C70965l();
        f189217f = lVar;
        C62942bv.registerDefaultInstance(C70965l.class, lVar);
    }

    private C70965l() {
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
                return newMessageInfo(f189217f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C70964k.f189216a, "d", C52557wd.f137942a, "e"});
            case 3:
                return new C70965l();
            case 4:
                return new C70963j();
            case 5:
                return f189217f;
            case 6:
                C63010eb ebVar = f189218g;
                if (ebVar == null) {
                    synchronized (C70965l.class) {
                        ebVar = f189218g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189217f);
                            f189218g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
