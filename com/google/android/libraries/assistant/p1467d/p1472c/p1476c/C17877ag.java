package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.ag */
/* compiled from: PG */
public final class C17877ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17877ag f51217b;

    /* renamed from: c */
    private static volatile C63010eb f51218c;

    /* renamed from: a */
    public C62971cq f51219a = C62942bv.emptyProtobufList();

    static {
        C17877ag agVar = new C17877ag();
        f51217b = agVar;
        C62942bv.registerDefaultInstance(C17877ag.class, agVar);
    }

    private C17877ag() {
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
                return newMessageInfo(f51217b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C17877ag();
            case 4:
                return new C17876af();
            case 5:
                return f51217b;
            case 6:
                C63010eb ebVar = f51218c;
                if (ebVar == null) {
                    synchronized (C17877ag.class) {
                        ebVar = f51218c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51217b);
                            f51218c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
