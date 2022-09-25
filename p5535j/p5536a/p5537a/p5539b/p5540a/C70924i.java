package p5535j.p5536a.p5537a.p5539b.p5540a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.b.a.i */
/* compiled from: PG */
public final class C70924i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70924i f189126c;

    /* renamed from: d */
    private static volatile C63010eb f189127d;

    /* renamed from: a */
    public int f189128a;

    /* renamed from: b */
    public String f189129b = BuildConfig.FLAVOR;

    static {
        C70924i iVar = new C70924i();
        f189126c = iVar;
        C62942bv.registerDefaultInstance(C70924i.class, iVar);
    }

    private C70924i() {
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
                return newMessageInfo(f189126c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C70924i();
            case 4:
                return new C70923h();
            case 5:
                return f189126c;
            case 6:
                C63010eb ebVar = f189127d;
                if (ebVar == null) {
                    synchronized (C70924i.class) {
                        ebVar = f189127d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189126c);
                            f189127d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
