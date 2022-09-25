package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bt */
/* compiled from: PG */
public final class C20150bt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C20150bt f56516e;

    /* renamed from: g */
    private static volatile C63010eb f56517g;

    /* renamed from: a */
    public String f56518a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public double f56519b;

    /* renamed from: c */
    public double f56520c;

    /* renamed from: d */
    public double f56521d;

    /* renamed from: f */
    private int f56522f;

    static {
        C20150bt btVar = new C20150bt();
        f56516e = btVar;
        C62942bv.registerDefaultInstance(C20150bt.class, btVar);
    }

    private C20150bt() {
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
                return newMessageInfo(f56516e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C20150bt();
            case 4:
                return new C20149bs();
            case 5:
                return f56516e;
            case 6:
                C63010eb ebVar = f56517g;
                if (ebVar == null) {
                    synchronized (C20150bt.class) {
                        ebVar = f56517g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56516e);
                            f56517g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
