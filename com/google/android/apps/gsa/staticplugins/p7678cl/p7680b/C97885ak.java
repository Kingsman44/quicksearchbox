package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ak */
/* compiled from: PG */
public final class C97885ak extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C97885ak f273305g;

    /* renamed from: h */
    private static volatile C63010eb f273306h;

    /* renamed from: a */
    public int f273307a;

    /* renamed from: b */
    public String f273308b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f273309c;

    /* renamed from: d */
    public boolean f273310d;

    /* renamed from: e */
    public long f273311e;

    /* renamed from: f */
    public float f273312f;

    static {
        C97885ak akVar = new C97885ak();
        f273305g = akVar;
        C62942bv.registerDefaultInstance(C97885ak.class, akVar);
    }

    private C97885ak() {
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
                return newMessageInfo(f273305g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0005ဂ\u0004\u0006ခ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C97885ak();
            case 4:
                return new C97884aj();
            case 5:
                return f273305g;
            case 6:
                C63010eb ebVar = f273306h;
                if (ebVar == null) {
                    synchronized (C97885ak.class) {
                        ebVar = f273306h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273305g);
                            f273306h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
