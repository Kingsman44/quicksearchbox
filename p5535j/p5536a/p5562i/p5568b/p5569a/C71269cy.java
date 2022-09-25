package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.cy */
/* compiled from: PG */
public final class C71269cy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71269cy f190288c;

    /* renamed from: d */
    private static volatile C63010eb f190289d;

    /* renamed from: a */
    public int f190290a;

    /* renamed from: b */
    public String f190291b = BuildConfig.FLAVOR;

    static {
        C71269cy cyVar = new C71269cy();
        f190288c = cyVar;
        C62942bv.registerDefaultInstance(C71269cy.class, cyVar);
    }

    private C71269cy() {
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
                return newMessageInfo(f190288c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71269cy();
            case 4:
                return new C71268cx();
            case 5:
                return f190288c;
            case 6:
                C63010eb ebVar = f190289d;
                if (ebVar == null) {
                    synchronized (C71269cy.class) {
                        ebVar = f190289d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190288c);
                            f190289d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
