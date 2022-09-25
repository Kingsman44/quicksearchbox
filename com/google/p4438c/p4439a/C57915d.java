package com.google.p4438c.p4439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.c.a.d */
/* compiled from: PG */
public final class C57915d extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57915d f154905a;

    /* renamed from: c */
    private static volatile C63010eb f154906c;

    /* renamed from: b */
    private byte f154907b = 2;

    static {
        C57915d dVar = new C57915d();
        f154905a = dVar;
        C62942bv.registerDefaultInstance(C57915d.class, dVar);
    }

    private C57915d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154907b);
            case 1:
                this.f154907b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f154905a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57915d();
            case 4:
                return new C57914c();
            case 5:
                return f154905a;
            case 6:
                C63010eb ebVar = f154906c;
                if (ebVar == null) {
                    synchronized (C57915d.class) {
                        ebVar = f154906c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154905a);
                            f154906c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
