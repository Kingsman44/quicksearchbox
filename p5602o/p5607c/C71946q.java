package p5602o.p5607c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.q */
/* compiled from: PG */
public final class C71946q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71946q f191621e;

    /* renamed from: f */
    private static volatile C63010eb f191622f;

    /* renamed from: a */
    public int f191623a;

    /* renamed from: b */
    public String f191624b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C71948s f191625c;

    /* renamed from: d */
    public C71950u f191626d;

    static {
        C71946q qVar = new C71946q();
        f191621e = qVar;
        C62942bv.registerDefaultInstance(C71946q.class, qVar);
    }

    private C71946q() {
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
                return newMessageInfo(f191621e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C71946q();
            case 4:
                return new C71945p();
            case 5:
                return f191621e;
            case 6:
                C63010eb ebVar = f191622f;
                if (ebVar == null) {
                    synchronized (C71946q.class) {
                        ebVar = f191622f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191621e);
                            f191622f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
