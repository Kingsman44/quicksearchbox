package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class TransactionContextOuterClass$TransactionContext extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final TransactionContextOuterClass$TransactionContext f179524a;

    /* renamed from: c */
    private static volatile C63010eb f179525c;

    /* renamed from: b */
    private byte f179526b = 2;

    static {
        TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext = new TransactionContextOuterClass$TransactionContext();
        f179524a = transactionContextOuterClass$TransactionContext;
        C62942bv.registerDefaultInstance(TransactionContextOuterClass$TransactionContext.class, transactionContextOuterClass$TransactionContext);
    }

    private TransactionContextOuterClass$TransactionContext() {
    }

    public static TransactionContextOuterClass$TransactionContext getDefaultInstance() {
        return f179524a;
    }

    public static TransactionContextOuterClass$TransactionContext parseFrom(ByteBuffer byteBuffer) {
        return (TransactionContextOuterClass$TransactionContext) C62942bv.parseFrom((C62942bv) f179524a, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179526b);
            case 1:
                this.f179526b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179524a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new TransactionContextOuterClass$TransactionContext();
            case 4:
                return new C66235ev();
            case 5:
                return f179524a;
            case 6:
                C63010eb ebVar = f179525c;
                if (ebVar == null) {
                    synchronized (TransactionContextOuterClass$TransactionContext.class) {
                        ebVar = f179525c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179524a);
                            f179525c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
