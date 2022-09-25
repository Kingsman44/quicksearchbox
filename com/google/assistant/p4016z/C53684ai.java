package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.ai */
/* compiled from: PG */
public final class C53684ai extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53684ai f140911a;

    /* renamed from: b */
    private static volatile C63010eb f140912b;

    static {
        C53684ai aiVar = new C53684ai();
        f140911a = aiVar;
        C62942bv.registerDefaultInstance(C53684ai.class, aiVar);
    }

    private C53684ai() {
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
                return newMessageInfo(f140911a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53684ai();
            case 4:
                return new C53683ah();
            case 5:
                return f140911a;
            case 6:
                C63010eb ebVar = f140912b;
                if (ebVar == null) {
                    synchronized (C53684ai.class) {
                        ebVar = f140912b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140911a);
                            f140912b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
