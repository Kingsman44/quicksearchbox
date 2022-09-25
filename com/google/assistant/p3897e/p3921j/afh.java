package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.afh */
/* compiled from: PG */
public final class afh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final afh f134999c;

    /* renamed from: d */
    private static volatile C63010eb f135000d;

    /* renamed from: a */
    public int f135001a;

    /* renamed from: b */
    public int f135002b;

    static {
        afh afh = new afh();
        f134999c = afh;
        C62942bv.registerDefaultInstance(afh.class, afh);
    }

    private afh() {
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
                return newMessageInfo(f134999c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new afh();
            case 4:
                return new afg();
            case 5:
                return f134999c;
            case 6:
                C63010eb ebVar = f135000d;
                if (ebVar == null) {
                    synchronized (afh.class) {
                        ebVar = f135000d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134999c);
                            f135000d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
