package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.ct */
/* compiled from: PG */
public final class C71264ct extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71264ct f190277f;

    /* renamed from: g */
    private static volatile C63010eb f190278g;

    /* renamed from: a */
    public int f190279a;

    /* renamed from: b */
    public long f190280b;

    /* renamed from: c */
    public boolean f190281c;

    /* renamed from: d */
    public int f190282d;

    /* renamed from: e */
    public String f190283e = BuildConfig.FLAVOR;

    static {
        C71264ct ctVar = new C71264ct();
        f190277f = ctVar;
        C62942bv.registerDefaultInstance(C71264ct.class, ctVar);
    }

    private C71264ct() {
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
                return newMessageInfo(f190277f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C71264ct();
            case 4:
                return new C71263cs();
            case 5:
                return f190277f;
            case 6:
                C63010eb ebVar = f190278g;
                if (ebVar == null) {
                    synchronized (C71264ct.class) {
                        ebVar = f190278g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190277f);
                            f190278g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
