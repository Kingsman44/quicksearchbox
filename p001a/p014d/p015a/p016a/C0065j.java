package p001a.p014d.p015a.p016a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.j */
/* compiled from: PG */
public final class C0065j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C0065j f172g;

    /* renamed from: h */
    private static volatile C63010eb f173h;

    /* renamed from: a */
    public int f174a;

    /* renamed from: b */
    public String f175b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f176c;

    /* renamed from: d */
    public int f177d;

    /* renamed from: e */
    public String f178e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f179f = BuildConfig.FLAVOR;

    static {
        C0065j jVar = new C0065j();
        f172g = jVar;
        C62942bv.registerDefaultInstance(C0065j.class, jVar);
    }

    private C0065j() {
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
                return newMessageInfo(f172g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C0065j();
            case 4:
                return new C0064i();
            case 5:
                return f172g;
            case 6:
                C63010eb ebVar = f173h;
                if (ebVar == null) {
                    synchronized (C0065j.class) {
                        ebVar = f173h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172g);
                            f173h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
