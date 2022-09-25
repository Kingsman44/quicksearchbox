package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: d.a.a.a.a.h */
/* compiled from: PG */
public final class C68115h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C68115h f184353g;

    /* renamed from: h */
    private static volatile C63010eb f184354h;

    /* renamed from: a */
    public String f184355a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f184356b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63042fg f184357c;

    /* renamed from: d */
    public C62910ar f184358d;

    /* renamed from: e */
    public String f184359e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f184360f = BuildConfig.FLAVOR;

    static {
        C68115h hVar = new C68115h();
        f184353g = hVar;
        C62942bv.registerDefaultInstance(C68115h.class, hVar);
    }

    private C68115h() {
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
                return newMessageInfo(f184353g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0005\t\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C68115h();
            case 4:
                return new C68114g();
            case 5:
                return f184353g;
            case 6:
                C63010eb ebVar = f184354h;
                if (ebVar == null) {
                    synchronized (C68115h.class) {
                        ebVar = f184354h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184353g);
                            f184354h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
