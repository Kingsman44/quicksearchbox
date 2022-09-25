package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.cm */
/* compiled from: PG */
public final class C71257cm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71257cm f190244f;

    /* renamed from: g */
    private static volatile C63010eb f190245g;

    /* renamed from: a */
    public int f190246a;

    /* renamed from: b */
    public String f190247b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f190248c;

    /* renamed from: d */
    public long f190249d;

    /* renamed from: e */
    public long f190250e;

    static {
        C71257cm cmVar = new C71257cm();
        f190244f = cmVar;
        C62942bv.registerDefaultInstance(C71257cm.class, cmVar);
    }

    private C71257cm() {
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
                return newMessageInfo(f190244f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C71257cm();
            case 4:
                return new C71256cl();
            case 5:
                return f190244f;
            case 6:
                C63010eb ebVar = f190245g;
                if (ebVar == null) {
                    synchronized (C71257cm.class) {
                        ebVar = f190245g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190244f);
                            f190245g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
