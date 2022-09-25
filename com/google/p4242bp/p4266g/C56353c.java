package com.google.p4242bp.p4266g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.g.c */
/* compiled from: PG */
public final class C56353c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56353c f150291b;

    /* renamed from: d */
    private static volatile C63010eb f150292d;

    /* renamed from: a */
    public String f150293a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f150294c;

    static {
        C56353c cVar = new C56353c();
        f150291b = cVar;
        C62942bv.registerDefaultInstance(C56353c.class, cVar);
    }

    private C56353c() {
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
                return newMessageInfo(f150291b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56353c();
            case 4:
                return new C56352b();
            case 5:
                return f150291b;
            case 6:
                C63010eb ebVar = f150292d;
                if (ebVar == null) {
                    synchronized (C56353c.class) {
                        ebVar = f150292d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150291b);
                            f150292d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
