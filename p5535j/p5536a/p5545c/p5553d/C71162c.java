package p5535j.p5536a.p5545c.p5553d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.d.c */
/* compiled from: PG */
public final class C71162c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71162c f189843d;

    /* renamed from: e */
    private static volatile C63010eb f189844e;

    /* renamed from: a */
    public int f189845a;

    /* renamed from: b */
    public boolean f189846b;

    /* renamed from: c */
    public String f189847c = BuildConfig.FLAVOR;

    static {
        C71162c cVar = new C71162c();
        f189843d = cVar;
        C62942bv.registerDefaultInstance(C71162c.class, cVar);
    }

    private C71162c() {
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
                return newMessageInfo(f189843d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71162c();
            case 4:
                return new C71161b();
            case 5:
                return f189843d;
            case 6:
                C63010eb ebVar = f189844e;
                if (ebVar == null) {
                    synchronized (C71162c.class) {
                        ebVar = f189844e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189843d);
                            f189844e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
