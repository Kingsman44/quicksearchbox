package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ady */
/* compiled from: PG */
public final class ady extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final ady f134912f;

    /* renamed from: h */
    private static volatile C63010eb f134913h;

    /* renamed from: a */
    public int f134914a;

    /* renamed from: b */
    public String f134915b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f134916c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f134917d;

    /* renamed from: e */
    public boolean f134918e;

    /* renamed from: g */
    private byte f134919g = 2;

    static {
        ady ady = new ady();
        f134912f = ady;
        C62942bv.registerDefaultInstance(ady.class, ady);
    }

    private ady() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134919g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134919g = b;
                return null;
            case 2:
                return newMessageInfo(f134912f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0003\u0007ဂ\u0004\tဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new ady();
            case 4:
                return new adx();
            case 5:
                return f134912f;
            case 6:
                C63010eb ebVar = f134913h;
                if (ebVar == null) {
                    synchronized (ady.class) {
                        ebVar = f134913h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134912f);
                            f134913h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
