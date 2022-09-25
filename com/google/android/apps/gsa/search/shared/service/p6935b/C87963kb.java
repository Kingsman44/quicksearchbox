package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.kb */
/* compiled from: PG */
public final class C87963kb extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C87963kb f237905a;

    /* renamed from: c */
    private static volatile C63010eb f237906c;

    /* renamed from: b */
    private byte f237907b = 2;

    static {
        C87963kb kbVar = new C87963kb();
        f237905a = kbVar;
        C62942bv.registerDefaultInstance(C87963kb.class, kbVar);
    }

    private C87963kb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237907b);
            case 1:
                this.f237907b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f237905a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87963kb();
            case 4:
                return new C87962ka();
            case 5:
                return f237905a;
            case 6:
                C63010eb ebVar = f237906c;
                if (ebVar == null) {
                    synchronized (C87963kb.class) {
                        ebVar = f237906c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237905a);
                            f237906c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
