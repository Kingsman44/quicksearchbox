package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.bl */
/* compiled from: PG */
public final class C49555bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49555bl f127864c;

    /* renamed from: d */
    private static volatile C63010eb f127865d;

    /* renamed from: a */
    public int f127866a = 0;

    /* renamed from: b */
    public Object f127867b;

    static {
        C49555bl blVar = new C49555bl();
        f127864c = blVar;
        C62942bv.registerDefaultInstance(C49555bl.class, blVar);
    }

    private C49555bl() {
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
                return newMessageInfo(f127864c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C49555bl();
            case 4:
                return new C49554bk();
            case 5:
                return f127864c;
            case 6:
                C63010eb ebVar = f127865d;
                if (ebVar == null) {
                    synchronized (C49555bl.class) {
                        ebVar = f127865d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127864c);
                            f127865d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
