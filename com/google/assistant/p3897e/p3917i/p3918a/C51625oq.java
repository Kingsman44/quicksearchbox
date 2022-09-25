package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.oq */
/* compiled from: PG */
public final class C51625oq extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C51625oq f134540a;

    /* renamed from: c */
    private static volatile C63010eb f134541c;

    /* renamed from: b */
    private byte f134542b = 2;

    static {
        C51625oq oqVar = new C51625oq();
        f134540a = oqVar;
        C62942bv.registerDefaultInstance(C51625oq.class, oqVar);
    }

    private C51625oq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134542b);
            case 1:
                this.f134542b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f134540a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51625oq();
            case 4:
                return new C51624op();
            case 5:
                return f134540a;
            case 6:
                C63010eb ebVar = f134541c;
                if (ebVar == null) {
                    synchronized (C51625oq.class) {
                        ebVar = f134541c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134540a);
                            f134541c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
