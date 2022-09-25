package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.zf */
/* compiled from: PG */
public final class C8200zf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8200zf f28802b;

    /* renamed from: d */
    private static volatile C63010eb f28803d;

    /* renamed from: a */
    public String f28804a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f28805c;

    static {
        C8200zf zfVar = new C8200zf();
        f28802b = zfVar;
        C62942bv.registerDefaultInstance(C8200zf.class, zfVar);
    }

    private C8200zf() {
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
                return newMessageInfo(f28802b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8200zf();
            case 4:
                return new C8199ze();
            case 5:
                return f28802b;
            case 6:
                C63010eb ebVar = f28803d;
                if (ebVar == null) {
                    synchronized (C8200zf.class) {
                        ebVar = f28803d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28802b);
                            f28803d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
