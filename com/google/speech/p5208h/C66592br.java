package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.br */
/* compiled from: PG */
public final class C66592br extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C66592br f181140e;

    /* renamed from: g */
    private static volatile C63010eb f181141g;

    /* renamed from: a */
    public int f181142a;

    /* renamed from: b */
    public boolean f181143b;

    /* renamed from: c */
    public String f181144c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f181145d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f181146f = 2;

    static {
        C66592br brVar = new C66592br();
        f181140e = brVar;
        C62942bv.registerDefaultInstance(C66592br.class, brVar);
    }

    private C66592br() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181146f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181146f = b;
                return null;
            case 2:
                return newMessageInfo(f181140e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0007ဇ\u0001", new Object[]{"a", C45240c.f118157a, "d", "b"});
            case 3:
                return new C66592br();
            case 4:
                return new C66591bq();
            case 5:
                return f181140e;
            case 6:
                C63010eb ebVar = f181141g;
                if (ebVar == null) {
                    synchronized (C66592br.class) {
                        ebVar = f181141g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181140e);
                            f181141g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
