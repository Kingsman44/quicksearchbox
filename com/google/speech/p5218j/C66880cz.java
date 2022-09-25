package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.cz */
/* compiled from: PG */
public final class C66880cz extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C66880cz f181819e;

    /* renamed from: g */
    private static volatile C63010eb f181820g;

    /* renamed from: a */
    public int f181821a;

    /* renamed from: b */
    public int f181822b;

    /* renamed from: c */
    public int f181823c;

    /* renamed from: d */
    public String f181824d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f181825f = 2;

    static {
        C66880cz czVar = new C66880cz();
        f181819e = czVar;
        C62942bv.registerDefaultInstance(C66880cz.class, czVar);
    }

    private C66880cz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181825f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181825f = b;
                return null;
            case 2:
                return newMessageInfo(f181819e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", C66877cw.f181817a, C45240c.f118157a, C66879cy.f181818a, "d"});
            case 3:
                return new C66880cz();
            case 4:
                return new C66876cv();
            case 5:
                return f181819e;
            case 6:
                C63010eb ebVar = f181820g;
                if (ebVar == null) {
                    synchronized (C66880cz.class) {
                        ebVar = f181820g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181819e);
                            f181820g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
