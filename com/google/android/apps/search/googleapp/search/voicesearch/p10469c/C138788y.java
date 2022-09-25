package com.google.android.apps.search.googleapp.search.voicesearch.p10469c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.y */
/* compiled from: PG */
public final class C138788y extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C138788y f377531g;

    /* renamed from: h */
    private static volatile C63010eb f377532h;

    /* renamed from: a */
    public int f377533a;

    /* renamed from: b */
    public int f377534b;

    /* renamed from: c */
    public String f377535c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f377536d;

    /* renamed from: e */
    public boolean f377537e;

    /* renamed from: f */
    public String f377538f = BuildConfig.FLAVOR;

    static {
        C138788y yVar = new C138788y();
        f377531g = yVar;
        C62942bv.registerDefaultInstance(C138788y.class, yVar);
    }

    private C138788y() {
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
                return newMessageInfo(f377531g, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0002\u0004\u0007\u0005ለ\u0000", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C138788y();
            case 4:
                return new C138786w();
            case 5:
                return f377531g;
            case 6:
                C63010eb ebVar = f377532h;
                if (ebVar == null) {
                    synchronized (C138788y.class) {
                        ebVar = f377532h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f377531g);
                            f377532h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
