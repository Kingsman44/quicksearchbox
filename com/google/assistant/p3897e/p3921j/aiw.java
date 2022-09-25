package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aiw */
/* compiled from: PG */
public final class aiw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aiw f135198e;

    /* renamed from: f */
    private static volatile C63010eb f135199f;

    /* renamed from: a */
    public int f135200a;

    /* renamed from: b */
    public aie f135201b;

    /* renamed from: c */
    public aic f135202c;

    /* renamed from: d */
    public ajk f135203d;

    static {
        aiw aiw = new aiw();
        f135198e = aiw;
        C62942bv.registerDefaultInstance(aiw.class, aiw);
    }

    private aiw() {
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
                return newMessageInfo(f135198e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new aiw();
            case 4:
                return new aiv();
            case 5:
                return f135198e;
            case 6:
                C63010eb ebVar = f135199f;
                if (ebVar == null) {
                    synchronized (aiw.class) {
                        ebVar = f135199f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135198e);
                            f135199f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
