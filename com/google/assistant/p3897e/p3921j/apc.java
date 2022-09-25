package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.apc */
/* compiled from: PG */
public final class apc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final apc f135542e;

    /* renamed from: f */
    private static volatile C63010eb f135543f;

    /* renamed from: a */
    public int f135544a;

    /* renamed from: b */
    public String f135545b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135546c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f135547d;

    static {
        apc apc = new apc();
        f135542e = apc;
        C62942bv.registerDefaultInstance(apc.class, apc);
    }

    private apc() {
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
                return newMessageInfo(f135542e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new apc();
            case 4:
                return new apb();
            case 5:
                return f135542e;
            case 6:
                C63010eb ebVar = f135543f;
                if (ebVar == null) {
                    synchronized (apc.class) {
                        ebVar = f135543f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135542e);
                            f135543f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
