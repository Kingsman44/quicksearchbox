package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dq */
/* compiled from: PG */
public final class C9235dq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9235dq f31914g;

    /* renamed from: h */
    private static volatile C63010eb f31915h;

    /* renamed from: a */
    public int f31916a;

    /* renamed from: b */
    public String f31917b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31918c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f31919d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f31920e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f31921f;

    static {
        C9235dq dqVar = new C9235dq();
        f31914g = dqVar;
        C62942bv.registerDefaultInstance(C9235dq.class, dqVar);
    }

    private C9235dq() {
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
                return newMessageInfo(f31914g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C9235dq();
            case 4:
                return new C9234dp();
            case 5:
                return f31914g;
            case 6:
                C63010eb ebVar = f31915h;
                if (ebVar == null) {
                    synchronized (C9235dq.class) {
                        ebVar = f31915h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31914g);
                            f31915h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
