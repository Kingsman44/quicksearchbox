package p5602o.p5607c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.s */
/* compiled from: PG */
public final class C71948s extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C71948s f191627g;

    /* renamed from: h */
    private static volatile C63010eb f191628h;

    /* renamed from: a */
    public int f191629a;

    /* renamed from: b */
    public int f191630b;

    /* renamed from: c */
    public String f191631c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f191632d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f191633e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f191634f;

    static {
        C71948s sVar = new C71948s();
        f191627g = sVar;
        C62942bv.registerDefaultInstance(C71948s.class, sVar);
    }

    private C71948s() {
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
                return newMessageInfo(f191627g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဂ\u0004\u0005ဌ\u0000", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, "b", C71925ab.f191567a});
            case 3:
                return new C71948s();
            case 4:
                return new C71947r();
            case 5:
                return f191627g;
            case 6:
                C63010eb ebVar = f191628h;
                if (ebVar == null) {
                    synchronized (C71948s.class) {
                        ebVar = f191628h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191627g);
                            f191628h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
