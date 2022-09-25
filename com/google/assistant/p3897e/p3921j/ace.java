package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ace */
/* compiled from: PG */
public final class ace extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ace f134800b;

    /* renamed from: d */
    private static volatile C63010eb f134801d;

    /* renamed from: a */
    public boolean f134802a;

    /* renamed from: c */
    private int f134803c;

    static {
        ace ace = new ace();
        f134800b = ace;
        C62942bv.registerDefaultInstance(ace.class, ace);
    }

    private ace() {
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
                return newMessageInfo(f134800b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new ace();
            case 4:
                return new acd();
            case 5:
                return f134800b;
            case 6:
                C63010eb ebVar = f134801d;
                if (ebVar == null) {
                    synchronized (ace.class) {
                        ebVar = f134801d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134800b);
                            f134801d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
