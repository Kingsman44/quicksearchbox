package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.g */
/* compiled from: PG */
public final class C57499g extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57499g f153590a;

    /* renamed from: c */
    private static volatile C63010eb f153591c;

    /* renamed from: b */
    private byte f153592b = 2;

    static {
        C57499g gVar = new C57499g();
        f153590a = gVar;
        C62942bv.registerDefaultInstance(C57499g.class, gVar);
    }

    private C57499g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153592b);
            case 1:
                this.f153592b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f153590a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57499g();
            case 4:
                return new C57483f();
            case 5:
                return f153590a;
            case 6:
                C63010eb ebVar = f153591c;
                if (ebVar == null) {
                    synchronized (C57499g.class) {
                        ebVar = f153591c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153590a);
                            f153591c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
