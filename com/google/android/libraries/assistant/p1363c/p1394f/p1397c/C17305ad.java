package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.f.c.ad */
/* compiled from: PG */
public final class C17305ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17305ad f50125b;

    /* renamed from: c */
    private static volatile C63010eb f50126c;

    /* renamed from: a */
    public C62971cq f50127a = emptyProtobufList();

    static {
        C17305ad adVar = new C17305ad();
        f50125b = adVar;
        C62942bv.registerDefaultInstance(C17305ad.class, adVar);
    }

    private C17305ad() {
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
                return newMessageInfo(f50125b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51785da.class});
            case 3:
                return new C17305ad();
            case 4:
                return new C17304ac();
            case 5:
                return f50125b;
            case 6:
                C63010eb ebVar = f50126c;
                if (ebVar == null) {
                    synchronized (C17305ad.class) {
                        ebVar = f50126c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50125b);
                            f50126c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
