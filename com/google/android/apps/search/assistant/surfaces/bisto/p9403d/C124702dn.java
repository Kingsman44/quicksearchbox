package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.dn */
/* compiled from: PG */
public final class C124702dn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124702dn f344024d;

    /* renamed from: e */
    private static volatile C63010eb f344025e;

    /* renamed from: a */
    public int f344026a;

    /* renamed from: b */
    public String f344027b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f344028c = BuildConfig.FLAVOR;

    static {
        C124702dn dnVar = new C124702dn();
        f344024d = dnVar;
        C62942bv.registerDefaultInstance(C124702dn.class, dnVar);
    }

    private C124702dn() {
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
                return newMessageInfo(f344024d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C124702dn();
            case 4:
                return new C124701dm();
            case 5:
                return f344024d;
            case 6:
                C63010eb ebVar = f344025e;
                if (ebVar == null) {
                    synchronized (C124702dn.class) {
                        ebVar = f344025e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344024d);
                            f344025e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
