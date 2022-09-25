package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ajc */
/* compiled from: PG */
public final class ajc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ajc f135210c;

    /* renamed from: d */
    private static volatile C63010eb f135211d;

    /* renamed from: a */
    public int f135212a;

    /* renamed from: b */
    public boolean f135213b;

    static {
        ajc ajc = new ajc();
        f135210c = ajc;
        C62942bv.registerDefaultInstance(ajc.class, ajc);
    }

    private ajc() {
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
                return newMessageInfo(f135210c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ajc();
            case 4:
                return new ajb();
            case 5:
                return f135210c;
            case 6:
                C63010eb ebVar = f135211d;
                if (ebVar == null) {
                    synchronized (ajc.class) {
                        ebVar = f135211d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135210c);
                            f135211d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
