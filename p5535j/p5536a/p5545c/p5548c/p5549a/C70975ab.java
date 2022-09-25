package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.ab */
/* compiled from: PG */
public final class C70975ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70975ab f189262c;

    /* renamed from: d */
    private static volatile C63010eb f189263d;

    /* renamed from: a */
    public int f189264a;

    /* renamed from: b */
    public String f189265b = BuildConfig.FLAVOR;

    static {
        C70975ab abVar = new C70975ab();
        f189262c = abVar;
        C62942bv.registerDefaultInstance(C70975ab.class, abVar);
    }

    private C70975ab() {
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
                return newMessageInfo(f189262c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C70975ab();
            case 4:
                return new C70974aa();
            case 5:
                return f189262c;
            case 6:
                C63010eb ebVar = f189263d;
                if (ebVar == null) {
                    synchronized (C70975ab.class) {
                        ebVar = f189263d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189262c);
                            f189263d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
