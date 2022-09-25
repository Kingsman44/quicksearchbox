package com.google.assistant.p3897e.p3921j.p3924c;

import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c.i */
/* compiled from: PG */
public final class C51738i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51738i f135731c;

    /* renamed from: e */
    private static volatile C63010eb f135732e;

    /* renamed from: a */
    public C52397qf f135733a;

    /* renamed from: b */
    public C52403ql f135734b;

    /* renamed from: d */
    private int f135735d;

    static {
        C51738i iVar = new C51738i();
        f135731c = iVar;
        C62942bv.registerDefaultInstance(C51738i.class, iVar);
    }

    private C51738i() {
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
                return newMessageInfo(f135731c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51738i();
            case 4:
                return new C51737h();
            case 5:
                return f135731c;
            case 6:
                C63010eb ebVar = f135732e;
                if (ebVar == null) {
                    synchronized (C51738i.class) {
                        ebVar = f135732e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135731c);
                            f135732e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
