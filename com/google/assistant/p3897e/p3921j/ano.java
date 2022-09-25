package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ano */
/* compiled from: PG */
public final class ano extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ano f135448b;

    /* renamed from: c */
    private static volatile C63010eb f135449c;

    /* renamed from: a */
    public C62961ch f135450a = emptyIntList();

    static {
        ano ano = new ano();
        f135448b = ano;
        C62942bv.registerDefaultInstance(ano.class, ano);
    }

    private ano() {
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
                return newMessageInfo(f135448b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", anm.f135447a});
            case 3:
                return new ano();
            case 4:
                return new ann();
            case 5:
                return f135448b;
            case 6:
                C63010eb ebVar = f135449c;
                if (ebVar == null) {
                    synchronized (ano.class) {
                        ebVar = f135449c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135448b);
                            f135449c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
