package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ago */
/* compiled from: PG */
public final class ago extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ago f135066b;

    /* renamed from: c */
    private static volatile C63010eb f135067c;

    /* renamed from: a */
    public C62961ch f135068a = emptyIntList();

    static {
        ago ago = new ago();
        f135066b = ago;
        C62942bv.registerDefaultInstance(ago.class, ago);
    }

    private ago() {
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
                return newMessageInfo(f135066b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a", agn.f135065a});
            case 3:
                return new ago();
            case 4:
                return new agm();
            case 5:
                return f135066b;
            case 6:
                C63010eb ebVar = f135067c;
                if (ebVar == null) {
                    synchronized (ago.class) {
                        ebVar = f135067c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135066b);
                            f135067c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
