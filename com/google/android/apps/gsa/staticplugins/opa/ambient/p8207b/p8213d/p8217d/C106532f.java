package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.f */
/* compiled from: PG */
public final class C106532f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C106532f f297078g;

    /* renamed from: h */
    private static volatile C63010eb f297079h;

    /* renamed from: a */
    public int f297080a;

    /* renamed from: b */
    public int f297081b;

    /* renamed from: c */
    public int f297082c;

    /* renamed from: d */
    public String f297083d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f297084e;

    /* renamed from: f */
    public String f297085f = BuildConfig.FLAVOR;

    static {
        C106532f fVar = new C106532f();
        f297078g = fVar;
        C62942bv.registerDefaultInstance(C106532f.class, fVar);
    }

    private C106532f() {
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
                return newMessageInfo(f297078g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C106529c.m177305b(), C45240c.f118157a, C106531e.m177307b(), "d", "e", C10662f.f35572a});
            case 3:
                return new C106532f();
            case 4:
                return new C106527a();
            case 5:
                return f297078g;
            case 6:
                C63010eb ebVar = f297079h;
                if (ebVar == null) {
                    synchronized (C106532f.class) {
                        ebVar = f297079h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297078g);
                            f297079h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
