package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class CommandOuterClass$Command extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final CommandOuterClass$Command f179510a;

    /* renamed from: c */
    private static volatile C63010eb f179511c;

    /* renamed from: b */
    private byte f179512b = 2;

    static {
        CommandOuterClass$Command commandOuterClass$Command = new CommandOuterClass$Command();
        f179510a = commandOuterClass$Command;
        C62942bv.registerDefaultInstance(CommandOuterClass$Command.class, commandOuterClass$Command);
    }

    private CommandOuterClass$Command() {
    }

    public static CommandOuterClass$Command parseFrom(ByteBuffer byteBuffer) {
        return (CommandOuterClass$Command) C62942bv.parseFrom((C62942bv) f179510a, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179512b);
            case 1:
                this.f179512b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179510a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new CommandOuterClass$Command();
            case 4:
                return new C66039aa();
            case 5:
                return f179510a;
            case 6:
                C63010eb ebVar = f179511c;
                if (ebVar == null) {
                    synchronized (CommandOuterClass$Command.class) {
                        ebVar = f179511c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179510a);
                            f179511c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
