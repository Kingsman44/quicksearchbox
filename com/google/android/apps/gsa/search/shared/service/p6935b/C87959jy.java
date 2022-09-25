package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jy */
/* compiled from: PG */
public final class C87959jy extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C87959jy f237900a;

    /* renamed from: c */
    private static volatile C63010eb f237901c;

    /* renamed from: b */
    private byte f237902b = 2;

    static {
        C87959jy jyVar = new C87959jy();
        f237900a = jyVar;
        C62942bv.registerDefaultInstance(C87959jy.class, jyVar);
    }

    private C87959jy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237902b);
            case 1:
                this.f237902b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f237900a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87959jy();
            case 4:
                return new C87958jx();
            case 5:
                return f237900a;
            case 6:
                C63010eb ebVar = f237901c;
                if (ebVar == null) {
                    synchronized (C87959jy.class) {
                        ebVar = f237901c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237900a);
                            f237901c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
