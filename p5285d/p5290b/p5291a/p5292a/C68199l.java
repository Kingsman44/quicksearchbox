package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.l */
/* compiled from: PG */
public final class C68199l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C68199l f184537d;

    /* renamed from: e */
    private static volatile C63010eb f184538e;

    /* renamed from: a */
    public int f184539a = 0;

    /* renamed from: b */
    public Object f184540b;

    /* renamed from: c */
    public String f184541c = BuildConfig.FLAVOR;

    static {
        C68199l lVar = new C68199l();
        f184537d = lVar;
        C62942bv.registerDefaultInstance(C68199l.class, lVar);
    }

    private C68199l() {
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
                return newMessageInfo(f184537d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002=\u0000\u0003Ȉ", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C68199l();
            case 4:
                return new C68198k();
            case 5:
                return f184537d;
            case 6:
                C63010eb ebVar = f184538e;
                if (ebVar == null) {
                    synchronized (C68199l.class) {
                        ebVar = f184538e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184537d);
                            f184538e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
