package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7891nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.rh */
/* compiled from: PG */
public final class C88158rh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C88158rh f238318f;

    /* renamed from: g */
    private static volatile C63010eb f238319g;

    /* renamed from: a */
    public int f238320a;

    /* renamed from: b */
    public int f238321b;

    /* renamed from: c */
    public boolean f238322c;

    /* renamed from: d */
    public String f238323d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f238324e;

    static {
        C88158rh rhVar = new C88158rh();
        f238318f = rhVar;
        C62942bv.registerDefaultInstance(C88158rh.class, rhVar);
    }

    private C88158rh() {
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
                return newMessageInfo(f238318f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0004ဈ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C7891nu.m22888b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C88158rh();
            case 4:
                return new C88157rg();
            case 5:
                return f238318f;
            case 6:
                C63010eb ebVar = f238319g;
                if (ebVar == null) {
                    synchronized (C88158rh.class) {
                        ebVar = f238319g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238318f);
                            f238319g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
