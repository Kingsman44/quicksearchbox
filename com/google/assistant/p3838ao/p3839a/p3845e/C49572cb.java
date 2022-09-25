package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.cb */
/* compiled from: PG */
public final class C49572cb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49572cb f127907d;

    /* renamed from: e */
    private static volatile C63010eb f127908e;

    /* renamed from: a */
    public int f127909a;

    /* renamed from: b */
    public String f127910b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f127911c;

    static {
        C49572cb cbVar = new C49572cb();
        f127907d = cbVar;
        C62942bv.registerDefaultInstance(C49572cb.class, cbVar);
    }

    private C49572cb() {
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
                return newMessageInfo(f127907d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49572cb();
            case 4:
                return new C49571ca();
            case 5:
                return f127907d;
            case 6:
                C63010eb ebVar = f127908e;
                if (ebVar == null) {
                    synchronized (C49572cb.class) {
                        ebVar = f127908e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127907d);
                            f127908e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
