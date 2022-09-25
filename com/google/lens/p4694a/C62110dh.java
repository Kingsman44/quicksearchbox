package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dh */
/* compiled from: PG */
public final class C62110dh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62110dh f167728a;

    /* renamed from: c */
    private static volatile C63010eb f167729c;

    /* renamed from: b */
    private byte f167730b = 2;

    static {
        C62110dh dhVar = new C62110dh();
        f167728a = dhVar;
        C62942bv.registerDefaultInstance(C62110dh.class, dhVar);
    }

    private C62110dh() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167730b);
            case 1:
                this.f167730b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167728a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62110dh();
            case 4:
                return new C62109dg();
            case 5:
                return f167728a;
            case 6:
                C63010eb ebVar = f167729c;
                if (ebVar == null) {
                    synchronized (C62110dh.class) {
                        ebVar = f167729c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167728a);
                            f167729c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
