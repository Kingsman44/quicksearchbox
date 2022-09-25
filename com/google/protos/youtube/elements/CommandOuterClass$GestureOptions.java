package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class CommandOuterClass$GestureOptions extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final CommandOuterClass$GestureOptions f179515a;

    /* renamed from: b */
    private static volatile C63010eb f179516b;

    static {
        CommandOuterClass$GestureOptions commandOuterClass$GestureOptions = new CommandOuterClass$GestureOptions();
        f179515a = commandOuterClass$GestureOptions;
        C62942bv.registerDefaultInstance(CommandOuterClass$GestureOptions.class, commandOuterClass$GestureOptions);
    }

    private CommandOuterClass$GestureOptions() {
    }

    public static CommandOuterClass$GestureOptions parseFrom(ByteBuffer byteBuffer) {
        return (CommandOuterClass$GestureOptions) C62942bv.parseFrom((C62942bv) f179515a, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f179515a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new CommandOuterClass$GestureOptions();
            case 4:
                return new C66041ac();
            case 5:
                return f179515a;
            case 6:
                C63010eb ebVar = f179516b;
                if (ebVar == null) {
                    synchronized (CommandOuterClass$GestureOptions.class) {
                        ebVar = f179516b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179515a);
                            f179516b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
