package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.au */
/* compiled from: PG */
public final class C121838au extends C62942bv implements C121839av {

    /* renamed from: b */
    public static final C121838au f338075b;

    /* renamed from: d */
    private static volatile C63010eb f338076d;

    /* renamed from: a */
    public C34053bp f338077a;

    /* renamed from: c */
    private byte f338078c = 2;

    static {
        C121838au auVar = new C121838au();
        f338075b = auVar;
        C62942bv.registerDefaultInstance(C121838au.class, auVar);
    }

    private C121838au() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f338078c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f338078c = b;
                return null;
            case 2:
                return newMessageInfo(f338075b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C121838au();
            case 4:
                return new C121837at();
            case 5:
                return f338075b;
            case 6:
                C63010eb ebVar = f338076d;
                if (ebVar == null) {
                    synchronized (C121838au.class) {
                        ebVar = f338076d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338075b);
                            f338076d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
