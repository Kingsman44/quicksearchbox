package com.google.lens.p4699e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.ap */
/* compiled from: PG */
public final class C62203ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62203ap f167949d;

    /* renamed from: e */
    private static volatile C63010eb f167950e;

    /* renamed from: a */
    public int f167951a;

    /* renamed from: b */
    public String f167952b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62202ao f167953c;

    static {
        C62203ap apVar = new C62203ap();
        f167949d = apVar;
        C62942bv.registerDefaultInstance(C62203ap.class, apVar);
    }

    private C62203ap() {
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
                return newMessageInfo(f167949d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62203ap();
            case 4:
                return new C62200am();
            case 5:
                return f167949d;
            case 6:
                C63010eb ebVar = f167950e;
                if (ebVar == null) {
                    synchronized (C62203ap.class) {
                        ebVar = f167950e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167949d);
                            f167950e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
