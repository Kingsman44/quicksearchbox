package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.s.a.iv */
/* compiled from: PG */
public final class C53301iv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53301iv f139734d;

    /* renamed from: e */
    private static volatile C63010eb f139735e;

    /* renamed from: a */
    public int f139736a;

    /* renamed from: b */
    public String f139737b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63042fg f139738c;

    static {
        C53301iv ivVar = new C53301iv();
        f139734d = ivVar;
        C62942bv.registerDefaultInstance(C53301iv.class, ivVar);
    }

    private C53301iv() {
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
                return newMessageInfo(f139734d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53301iv();
            case 4:
                return new C53300iu();
            case 5:
                return f139734d;
            case 6:
                C63010eb ebVar = f139735e;
                if (ebVar == null) {
                    synchronized (C53301iv.class) {
                        ebVar = f139735e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139734d);
                            f139735e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
