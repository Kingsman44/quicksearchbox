package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ea */
/* compiled from: PG */
public final class C7628ea extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7628ea f26347b;

    /* renamed from: d */
    private static volatile C63010eb f26348d;

    /* renamed from: a */
    public C62971cq f26349a = emptyProtobufList();

    /* renamed from: c */
    private byte f26350c = 2;

    static {
        C7628ea eaVar = new C7628ea();
        f26347b = eaVar;
        C62942bv.registerDefaultInstance(C7628ea.class, eaVar);
    }

    private C7628ea() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26350c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f26350c = b;
                return null;
            case 2:
                return newMessageInfo(f26347b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
            case 3:
                return new C7628ea();
            case 4:
                return new C7626dz();
            case 5:
                return f26347b;
            case 6:
                C63010eb ebVar = f26348d;
                if (ebVar == null) {
                    synchronized (C7628ea.class) {
                        ebVar = f26348d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26347b);
                            f26348d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
