package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ca */
/* compiled from: PG */
public final class C31736ca extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C31736ca f85315e;

    /* renamed from: f */
    private static volatile C63010eb f85316f;

    /* renamed from: a */
    public int f85317a;

    /* renamed from: b */
    public int f85318b = 0;

    /* renamed from: c */
    public Object f85319c;

    /* renamed from: d */
    public String f85320d = BuildConfig.FLAVOR;

    static {
        C31736ca caVar = new C31736ca();
        f85315e = caVar;
        C62942bv.registerDefaultInstance(C31736ca.class, caVar);
    }

    private C31736ca() {
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
                return newMessageInfo(f85315e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003်\u0000\u0004ဳ\u0000\u0005ျ\u0000\u0006ွ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C31736ca();
            case 4:
                return new C31734bz();
            case 5:
                return f85315e;
            case 6:
                C63010eb ebVar = f85316f;
                if (ebVar == null) {
                    synchronized (C31736ca.class) {
                        ebVar = f85316f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85315e);
                            f85316f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
