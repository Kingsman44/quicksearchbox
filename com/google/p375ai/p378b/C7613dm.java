package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.dm */
/* compiled from: PG */
public final class C7613dm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7613dm f26308b;

    /* renamed from: d */
    private static volatile C63010eb f26309d;

    /* renamed from: a */
    public String f26310a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f26311c;

    static {
        C7613dm dmVar = new C7613dm();
        f26308b = dmVar;
        C62942bv.registerDefaultInstance(C7613dm.class, dmVar);
    }

    private C7613dm() {
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
                return newMessageInfo(f26308b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C7613dm();
            case 4:
                return new C7612dl();
            case 5:
                return f26308b;
            case 6:
                C63010eb ebVar = f26309d;
                if (ebVar == null) {
                    synchronized (C7613dm.class) {
                        ebVar = f26309d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26308b);
                            f26309d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
