package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class SenderStateOuterClass$SenderState extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final SenderStateOuterClass$SenderState f179521a;

    /* renamed from: c */
    private static volatile C63010eb f179522c;

    /* renamed from: b */
    private byte f179523b = 2;

    static {
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = new SenderStateOuterClass$SenderState();
        f179521a = senderStateOuterClass$SenderState;
        C62942bv.registerDefaultInstance(SenderStateOuterClass$SenderState.class, senderStateOuterClass$SenderState);
    }

    private SenderStateOuterClass$SenderState() {
    }

    public static SenderStateOuterClass$SenderState parseFrom(ByteBuffer byteBuffer) {
        return (SenderStateOuterClass$SenderState) C62942bv.parseFrom((C62942bv) f179521a, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179523b);
            case 1:
                this.f179523b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179521a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new SenderStateOuterClass$SenderState();
            case 4:
                return new C66216ec();
            case 5:
                return f179521a;
            case 6:
                C63010eb ebVar = f179522c;
                if (ebVar == null) {
                    synchronized (SenderStateOuterClass$SenderState.class) {
                        ebVar = f179522c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179521a);
                            f179522c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
