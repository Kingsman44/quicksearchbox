package p5690r.p5691a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: r.a.d */
/* compiled from: PG */
public final class C72770d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C72770d f193463e;

    /* renamed from: g */
    private static volatile C63010eb f193464g;

    /* renamed from: a */
    public String f193465a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f193466b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f193467c;

    /* renamed from: d */
    public int f193468d;

    /* renamed from: f */
    private int f193469f;

    static {
        C72770d dVar = new C72770d();
        f193463e = dVar;
        C62942bv.registerDefaultInstance(C72770d.class, dVar);
    }

    private C72770d() {
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
                return newMessageInfo(f193463e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C72770d();
            case 4:
                return new C72769c();
            case 5:
                return f193463e;
            case 6:
                C63010eb ebVar = f193464g;
                if (ebVar == null) {
                    synchronized (C72770d.class) {
                        ebVar = f193464g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193463e);
                            f193464g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
