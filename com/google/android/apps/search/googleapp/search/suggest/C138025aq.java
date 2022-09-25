package com.google.android.apps.search.googleapp.search.suggest;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.aq */
/* compiled from: PG */
public final class C138025aq extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C138025aq f375512e;

    /* renamed from: g */
    private static volatile C63010eb f375513g;

    /* renamed from: a */
    public int f375514a;

    /* renamed from: b */
    public boolean f375515b;

    /* renamed from: c */
    public C138022an f375516c;

    /* renamed from: d */
    public C138024ap f375517d;

    /* renamed from: f */
    private byte f375518f = 2;

    static {
        C138025aq aqVar = new C138025aq();
        f375512e = aqVar;
        C62942bv.registerDefaultInstance(C138025aq.class, aqVar);
    }

    private C138025aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f375518f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f375518f = b;
                return null;
            case 2:
                return newMessageInfo(f375512e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C138025aq();
            case 4:
                return new C138020al();
            case 5:
                return f375512e;
            case 6:
                C63010eb ebVar = f375513g;
                if (ebVar == null) {
                    synchronized (C138025aq.class) {
                        ebVar = f375513g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375512e);
                            f375513g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
