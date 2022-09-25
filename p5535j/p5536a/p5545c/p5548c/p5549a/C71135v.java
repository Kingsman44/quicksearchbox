package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.v */
/* compiled from: PG */
public final class C71135v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71135v f189755d;

    /* renamed from: e */
    private static volatile C63010eb f189756e;

    /* renamed from: a */
    public int f189757a;

    /* renamed from: b */
    public String f189758b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f189759c;

    static {
        C71135v vVar = new C71135v();
        f189755d = vVar;
        C62942bv.registerDefaultInstance(C71135v.class, vVar);
    }

    private C71135v() {
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
                return newMessageInfo(f189755d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C71134u.f189754a});
            case 3:
                return new C71135v();
            case 4:
                return new C71133t();
            case 5:
                return f189755d;
            case 6:
                C63010eb ebVar = f189756e;
                if (ebVar == null) {
                    synchronized (C71135v.class) {
                        ebVar = f189756e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189755d);
                            f189756e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
