package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ai */
/* compiled from: PG */
public final class C51677ai extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C51677ai f135125a;

    /* renamed from: c */
    private static volatile C63010eb f135126c;

    /* renamed from: b */
    private byte f135127b = 2;

    static {
        C51677ai aiVar = new C51677ai();
        f135125a = aiVar;
        C62942bv.registerDefaultInstance(C51677ai.class, aiVar);
    }

    private C51677ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135127b);
            case 1:
                this.f135127b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f135125a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51677ai();
            case 4:
                return new C51676ah();
            case 5:
                return f135125a;
            case 6:
                C63010eb ebVar = f135126c;
                if (ebVar == null) {
                    synchronized (C51677ai.class) {
                        ebVar = f135126c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135125a);
                            f135126c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
