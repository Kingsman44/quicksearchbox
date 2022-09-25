package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.i */
/* compiled from: PG */
public final class C107483i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C107483i f299071d;

    /* renamed from: e */
    private static volatile C63010eb f299072e;

    /* renamed from: a */
    public int f299073a;

    /* renamed from: b */
    public C51580mz f299074b;

    /* renamed from: c */
    public C63088z f299075c = C63088z.f170246b;

    static {
        C107483i iVar = new C107483i();
        f299071d = iVar;
        C62942bv.registerDefaultInstance(C107483i.class, iVar);
    }

    private C107483i() {
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
                return newMessageInfo(f299071d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C107483i();
            case 4:
                return new C107482h();
            case 5:
                return f299071d;
            case 6:
                C63010eb ebVar = f299072e;
                if (ebVar == null) {
                    synchronized (C107483i.class) {
                        ebVar = f299072e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299071d);
                            f299072e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
