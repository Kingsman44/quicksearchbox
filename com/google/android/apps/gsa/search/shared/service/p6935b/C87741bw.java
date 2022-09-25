package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bw */
/* compiled from: PG */
public final class C87741bw extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C87741bw f237477c;

    /* renamed from: e */
    private static volatile C63010eb f237478e;

    /* renamed from: a */
    public int f237479a;

    /* renamed from: b */
    public int f237480b;

    /* renamed from: d */
    private byte f237481d = 2;

    static {
        C87741bw bwVar = new C87741bw();
        f237477c = bwVar;
        C62942bv.registerDefaultInstance(C87741bw.class, bwVar);
    }

    private C87741bw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237481d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237481d = b;
                return null;
            case 2:
                return newMessageInfo(f237477c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C87739bu.m142762b()});
            case 3:
                return new C87741bw();
            case 4:
                return new C87740bv();
            case 5:
                return f237477c;
            case 6:
                C63010eb ebVar = f237478e;
                if (ebVar == null) {
                    synchronized (C87741bw.class) {
                        ebVar = f237478e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237477c);
                            f237478e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
