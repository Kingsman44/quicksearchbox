package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.p */
/* compiled from: PG */
public final class C8923p extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8923p f30946f;

    /* renamed from: g */
    private static volatile C63010eb f30947g;

    /* renamed from: a */
    public int f30948a;

    /* renamed from: b */
    public String f30949b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f30950c;

    /* renamed from: d */
    public boolean f30951d;

    /* renamed from: e */
    public long f30952e;

    static {
        C8923p pVar = new C8923p();
        f30946f = pVar;
        C62942bv.registerDefaultInstance(C8923p.class, pVar);
    }

    private C8923p() {
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
                return newMessageInfo(f30946f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, C8898bp.m23512b(), "d", "e"});
            case 3:
                return new C8923p();
            case 4:
                return new C8922o();
            case 5:
                return f30946f;
            case 6:
                C63010eb ebVar = f30947g;
                if (ebVar == null) {
                    synchronized (C8923p.class) {
                        ebVar = f30947g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30946f);
                            f30947g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
