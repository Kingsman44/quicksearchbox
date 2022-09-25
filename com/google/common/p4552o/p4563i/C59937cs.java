package com.google.common.p4552o.p4563i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.cs */
/* compiled from: PG */
public final class C59937cs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59937cs f161988d;

    /* renamed from: e */
    private static volatile C63010eb f161989e;

    /* renamed from: a */
    public int f161990a;

    /* renamed from: b */
    public String f161991b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f161992c = BuildConfig.FLAVOR;

    static {
        C59937cs csVar = new C59937cs();
        f161988d = csVar;
        C62942bv.registerDefaultInstance(C59937cs.class, csVar);
    }

    private C59937cs() {
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
                return newMessageInfo(f161988d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59937cs();
            case 4:
                return new C59936cr();
            case 5:
                return f161988d;
            case 6:
                C63010eb ebVar = f161989e;
                if (ebVar == null) {
                    synchronized (C59937cs.class) {
                        ebVar = f161989e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161988d);
                            f161989e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
