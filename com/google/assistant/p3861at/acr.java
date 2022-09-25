package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.acr */
/* compiled from: PG */
public final class acr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final acr f128869b;

    /* renamed from: c */
    private static volatile C63010eb f128870c;

    /* renamed from: a */
    public C62961ch f128871a = emptyIntList();

    static {
        acr acr = new acr();
        f128869b = acr;
        C62942bv.registerDefaultInstance(acr.class, acr);
    }

    private acr() {
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
                return newMessageInfo(f128869b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C49875cf.m85756b()});
            case 3:
                return new acr();
            case 4:
                return new acq();
            case 5:
                return f128869b;
            case 6:
                C63010eb ebVar = f128870c;
                if (ebVar == null) {
                    synchronized (acr.class) {
                        ebVar = f128870c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128869b);
                            f128870c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
