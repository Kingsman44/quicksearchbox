package com.google.android.apps.gsa.search.core.p6519al.p6694dd;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5285d.p5290b.p5291a.p5292a.C68189by;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.q */
/* compiled from: PG */
public final class C85348q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C85348q f231140e;

    /* renamed from: f */
    private static volatile C63010eb f231141f;

    /* renamed from: a */
    public int f231142a;

    /* renamed from: b */
    public String f231143b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C68189by f231144c;

    /* renamed from: d */
    public boolean f231145d;

    static {
        C85348q qVar = new C85348q();
        f231140e = qVar;
        C62942bv.registerDefaultInstance(C85348q.class, qVar);
    }

    private C85348q() {
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
                return newMessageInfo(f231140e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဉ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C85348q();
            case 4:
                return new C85347p();
            case 5:
                return f231140e;
            case 6:
                C63010eb ebVar = f231141f;
                if (ebVar == null) {
                    synchronized (C85348q.class) {
                        ebVar = f231141f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231140e);
                            f231141f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
