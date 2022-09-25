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
import com.google.protobuf.C63088z;

/* renamed from: d.a.a.a.a.l */
/* compiled from: PG */
public final class C68119l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C68119l f184364g;

    /* renamed from: h */
    private static volatile C63010eb f184365h;

    /* renamed from: a */
    public String f184366a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C68115h f184367b;

    /* renamed from: c */
    public C68121n f184368c;

    /* renamed from: d */
    public C63088z f184369d;

    /* renamed from: e */
    public C62910ar f184370e;

    /* renamed from: f */
    public boolean f184371f;

    static {
        C68119l lVar = new C68119l();
        f184364g = lVar;
        C62942bv.registerDefaultInstance(C68119l.class, lVar);
    }

    private C68119l() {
        emptyProtobufList();
        this.f184369d = C63088z.f170246b;
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
                return newMessageInfo(f184364g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0005\n\u0006\t\u0007\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C68119l();
            case 4:
                return new C68118k();
            case 5:
                return f184364g;
            case 6:
                C63010eb ebVar = f184365h;
                if (ebVar == null) {
                    synchronized (C68119l.class) {
                        ebVar = f184365h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184364g);
                            f184365h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
