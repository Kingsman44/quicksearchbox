package com.google.assistant.p3863av.p3875f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.f.k */
/* compiled from: PG */
public final class C50578k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50578k f131618b;

    /* renamed from: d */
    private static volatile C63010eb f131619d;

    /* renamed from: a */
    public String f131620a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131621c;

    static {
        C50578k kVar = new C50578k();
        f131618b = kVar;
        C62942bv.registerDefaultInstance(C50578k.class, kVar);
    }

    private C50578k() {
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
                return newMessageInfo(f131618b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50578k();
            case 4:
                return new C50577j();
            case 5:
                return f131618b;
            case 6:
                C63010eb ebVar = f131619d;
                if (ebVar == null) {
                    synchronized (C50578k.class) {
                        ebVar = f131619d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131618b);
                            f131619d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
