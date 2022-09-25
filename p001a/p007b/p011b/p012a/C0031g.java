package p001a.p007b.p011b.p012a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.b.a.g */
/* compiled from: PG */
public final class C0031g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0031g f92d;

    /* renamed from: e */
    private static volatile C63010eb f93e;

    /* renamed from: a */
    public int f94a;

    /* renamed from: b */
    public int f95b;

    /* renamed from: c */
    public String f96c = BuildConfig.FLAVOR;

    static {
        C0031g gVar = new C0031g();
        f92d = gVar;
        C62942bv.registerDefaultInstance(C0031g.class, gVar);
    }

    private C0031g() {
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
                return newMessageInfo(f92d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C0031g();
            case 4:
                return new C0030f();
            case 5:
                return f92d;
            case 6:
                C63010eb ebVar = f93e;
                if (ebVar == null) {
                    synchronized (C0031g.class) {
                        ebVar = f93e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92d);
                            f93e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
