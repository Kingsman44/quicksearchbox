package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.u */
/* compiled from: PG */
public final class C52499u extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C52499u f137817b;

    /* renamed from: e */
    private static volatile C63010eb f137818e;

    /* renamed from: a */
    public C51669ac f137819a;

    /* renamed from: c */
    private int f137820c;

    /* renamed from: d */
    private byte f137821d = 2;

    static {
        C52499u uVar = new C52499u();
        f137817b = uVar;
        C62942bv.registerDefaultInstance(C52499u.class, uVar);
    }

    private C52499u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f137821d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f137821d = b;
                return null;
            case 2:
                return newMessageInfo(f137817b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52499u();
            case 4:
                return new C52472t();
            case 5:
                return f137817b;
            case 6:
                C63010eb ebVar = f137818e;
                if (ebVar == null) {
                    synchronized (C52499u.class) {
                        ebVar = f137818e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137817b);
                            f137818e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
