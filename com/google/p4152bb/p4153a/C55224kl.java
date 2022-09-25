package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.kl */
/* compiled from: PG */
public final class C55224kl extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C55224kl f145394d;

    /* renamed from: f */
    private static volatile C63010eb f145395f;

    /* renamed from: a */
    public int f145396a;

    /* renamed from: b */
    public C55347p f145397b;

    /* renamed from: c */
    public String f145398c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f145399e = 2;

    static {
        C55224kl klVar = new C55224kl();
        f145394d = klVar;
        C62942bv.registerDefaultInstance(C55224kl.class, klVar);
    }

    private C55224kl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145399e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145399e = b;
                return null;
            case 2:
                return newMessageInfo(f145394d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55224kl();
            case 4:
                return new C55223kk();
            case 5:
                return f145394d;
            case 6:
                C63010eb ebVar = f145395f;
                if (ebVar == null) {
                    synchronized (C55224kl.class) {
                        ebVar = f145395f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145394d);
                            f145395f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
