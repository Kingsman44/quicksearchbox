package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.akc */
/* compiled from: PG */
public final class akc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final akc f135255b;

    /* renamed from: c */
    private static volatile C63010eb f135256c;

    /* renamed from: a */
    public C62961ch f135257a = emptyIntList();

    static {
        akc akc = new akc();
        f135255b = akc;
        C62942bv.registerDefaultInstance(akc.class, akc);
    }

    private akc() {
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
                return newMessageInfo(f135255b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001e", new Object[]{"a", akb.f135254a});
            case 3:
                return new akc();
            case 4:
                return new aka();
            case 5:
                return f135255b;
            case 6:
                C63010eb ebVar = f135256c;
                if (ebVar == null) {
                    synchronized (akc.class) {
                        ebVar = f135256c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135255b);
                            f135256c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
