package com.google.android.apps.gsa.shared.p7124p.p7125a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.p.a.d */
/* compiled from: PG */
public final class C90447d extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C90447d f252671a;

    /* renamed from: c */
    private static volatile C63010eb f252672c;

    /* renamed from: b */
    private byte f252673b = 2;

    static {
        C90447d dVar = new C90447d();
        f252671a = dVar;
        C62942bv.registerDefaultInstance(C90447d.class, dVar);
    }

    private C90447d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f252673b);
            case 1:
                this.f252673b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f252671a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C90447d();
            case 4:
                return new C90446c();
            case 5:
                return f252671a;
            case 6:
                C63010eb ebVar = f252672c;
                if (ebVar == null) {
                    synchronized (C90447d.class) {
                        ebVar = f252672c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252671a);
                            f252672c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
