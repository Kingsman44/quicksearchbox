package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bh */
/* compiled from: PG */
public final class C62056bh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62056bh f167644a;

    /* renamed from: c */
    private static volatile C63010eb f167645c;

    /* renamed from: b */
    private byte f167646b = 2;

    static {
        C62056bh bhVar = new C62056bh();
        f167644a = bhVar;
        C62942bv.registerDefaultInstance(C62056bh.class, bhVar);
    }

    private C62056bh() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167646b);
            case 1:
                this.f167646b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167644a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62056bh();
            case 4:
                return new C62055bg();
            case 5:
                return f167644a;
            case 6:
                C63010eb ebVar = f167645c;
                if (ebVar == null) {
                    synchronized (C62056bh.class) {
                        ebVar = f167645c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167644a);
                            f167645c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
