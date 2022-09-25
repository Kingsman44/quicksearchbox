package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class CommandOuterClass$GestureAccessibilityInfo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final CommandOuterClass$GestureAccessibilityInfo f179513a;

    /* renamed from: b */
    private static volatile C63010eb f179514b;

    static {
        CommandOuterClass$GestureAccessibilityInfo commandOuterClass$GestureAccessibilityInfo = new CommandOuterClass$GestureAccessibilityInfo();
        f179513a = commandOuterClass$GestureAccessibilityInfo;
        C62942bv.registerDefaultInstance(CommandOuterClass$GestureAccessibilityInfo.class, commandOuterClass$GestureAccessibilityInfo);
    }

    private CommandOuterClass$GestureAccessibilityInfo() {
    }

    public static CommandOuterClass$GestureAccessibilityInfo parseFrom(ByteBuffer byteBuffer) {
        return (CommandOuterClass$GestureAccessibilityInfo) C62942bv.parseFrom((C62942bv) f179513a, byteBuffer);
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
                return newMessageInfo(f179513a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new CommandOuterClass$GestureAccessibilityInfo();
            case 4:
                return new C66040ab();
            case 5:
                return f179513a;
            case 6:
                C63010eb ebVar = f179514b;
                if (ebVar == null) {
                    synchronized (CommandOuterClass$GestureAccessibilityInfo.class) {
                        ebVar = f179514b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179513a);
                            f179514b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
