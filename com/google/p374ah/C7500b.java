package com.google.p374ah;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ah.b */
/* compiled from: PG */
public final class C7500b extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C7500b f24711d;

    /* renamed from: f */
    private static volatile C63010eb f24712f;

    /* renamed from: a */
    public int f24713a;

    /* renamed from: b */
    public String f24714b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f24715c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f24716e = 2;

    static {
        C7500b bVar = new C7500b();
        f24711d = bVar;
        C62942bv.registerDefaultInstance(C7500b.class, bVar);
    }

    private C7500b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f24716e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f24716e = b;
                return null;
            case 2:
                return newMessageInfo(f24711d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7500b();
            case 4:
                return new C7499a();
            case 5:
                return f24711d;
            case 6:
                C63010eb ebVar = f24712f;
                if (ebVar == null) {
                    synchronized (C7500b.class) {
                        ebVar = f24712f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f24711d);
                            f24712f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
