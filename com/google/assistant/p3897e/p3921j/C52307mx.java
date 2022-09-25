package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.mx */
/* compiled from: PG */
public final class C52307mx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52307mx f137308c;

    /* renamed from: d */
    private static volatile C63010eb f137309d;

    /* renamed from: a */
    public int f137310a;

    /* renamed from: b */
    public C52522uw f137311b;

    static {
        C52307mx mxVar = new C52307mx();
        f137308c = mxVar;
        C62942bv.registerDefaultInstance(C52307mx.class, mxVar);
    }

    private C52307mx() {
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
                return newMessageInfo(f137308c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C52307mx();
            case 4:
                return new C52306mw();
            case 5:
                return f137308c;
            case 6:
                C63010eb ebVar = f137309d;
                if (ebVar == null) {
                    synchronized (C52307mx.class) {
                        ebVar = f137309d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137308c);
                            f137309d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
