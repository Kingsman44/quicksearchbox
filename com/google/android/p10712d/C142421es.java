package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.es */
/* compiled from: PG */
public final class C142421es extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C142421es f386450h;

    /* renamed from: j */
    private static volatile C63010eb f386451j;

    /* renamed from: a */
    public String f386452a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f386453b;

    /* renamed from: c */
    public C63088z f386454c = C63088z.f170246b;

    /* renamed from: d */
    public C63088z f386455d = C63088z.f170246b;

    /* renamed from: e */
    public int f386456e;

    /* renamed from: f */
    public int f386457f;

    /* renamed from: g */
    public int f386458g;

    /* renamed from: i */
    private int f386459i;

    static {
        C142421es esVar = new C142421es();
        f386450h = esVar;
        C62942bv.registerDefaultInstance(C142421es.class, esVar);
    }

    private C142421es() {
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
                return newMessageInfo(f386450h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"i", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C142421es();
            case 4:
                return new C142420er();
            case 5:
                return f386450h;
            case 6:
                C63010eb ebVar = f386451j;
                if (ebVar == null) {
                    synchronized (C142421es.class) {
                        ebVar = f386451j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386450h);
                            f386451j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
