package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.e */
/* compiled from: PG */
public final class C107504e extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C107504e f299115c;

    /* renamed from: e */
    private static volatile C63010eb f299116e;

    /* renamed from: a */
    public int f299117a;

    /* renamed from: b */
    public int f299118b;

    /* renamed from: d */
    private byte f299119d = 2;

    static {
        C107504e eVar = new C107504e();
        f299115c = eVar;
        C62942bv.registerDefaultInstance(C107504e.class, eVar);
    }

    private C107504e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f299119d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f299119d = b;
                return null;
            case 2:
                return newMessageInfo(f299115c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C107502c.m178395b()});
            case 3:
                return new C107504e();
            case 4:
                return new C107503d();
            case 5:
                return f299115c;
            case 6:
                C63010eb ebVar = f299116e;
                if (ebVar == null) {
                    synchronized (C107504e.class) {
                        ebVar = f299116e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299115c);
                            f299116e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
