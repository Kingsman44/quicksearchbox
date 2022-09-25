package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.s */
/* compiled from: PG */
public final class C71324s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71324s f190488d;

    /* renamed from: e */
    private static volatile C63010eb f190489e;

    /* renamed from: a */
    public int f190490a;

    /* renamed from: b */
    public long f190491b;

    /* renamed from: c */
    public String f190492c = BuildConfig.FLAVOR;

    static {
        C71324s sVar = new C71324s();
        f190488d = sVar;
        C62942bv.registerDefaultInstance(C71324s.class, sVar);
    }

    private C71324s() {
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
                return newMessageInfo(f190488d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71324s();
            case 4:
                return new C71323r();
            case 5:
                return f190488d;
            case 6:
                C63010eb ebVar = f190489e;
                if (ebVar == null) {
                    synchronized (C71324s.class) {
                        ebVar = f190489e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190488d);
                            f190489e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
