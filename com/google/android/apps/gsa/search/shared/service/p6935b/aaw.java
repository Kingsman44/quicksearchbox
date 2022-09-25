package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6995aq.C89267j;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aaw */
/* compiled from: PG */
public final class aaw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aaw f237108d;

    /* renamed from: e */
    private static volatile C63010eb f237109e;

    /* renamed from: a */
    public int f237110a;

    /* renamed from: b */
    public String f237111b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C89267j f237112c;

    static {
        aaw aaw = new aaw();
        f237108d = aaw;
        C62942bv.registerDefaultInstance(aaw.class, aaw);
    }

    private aaw() {
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
                return newMessageInfo(f237108d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aaw();
            case 4:
                return new aav();
            case 5:
                return f237108d;
            case 6:
                C63010eb ebVar = f237109e;
                if (ebVar == null) {
                    synchronized (aaw.class) {
                        ebVar = f237109e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237108d);
                            f237109e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
