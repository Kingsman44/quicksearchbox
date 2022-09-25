package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.bp */
/* compiled from: PG */
public final class C57261bp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57261bp f152857a;

    /* renamed from: c */
    private static volatile C63010eb f152858c;

    /* renamed from: b */
    private byte f152859b = 2;

    static {
        C57261bp bpVar = new C57261bp();
        f152857a = bpVar;
        C62942bv.registerDefaultInstance(C57261bp.class, bpVar);
    }

    private C57261bp() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152859b);
            case 1:
                this.f152859b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f152857a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57261bp();
            case 4:
                return new C57260bo();
            case 5:
                return f152857a;
            case 6:
                C63010eb ebVar = f152858c;
                if (ebVar == null) {
                    synchronized (C57261bp.class) {
                        ebVar = f152858c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152857a);
                            f152858c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
