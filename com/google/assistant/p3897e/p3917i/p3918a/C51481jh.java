package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.jh */
/* compiled from: PG */
public final class C51481jh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51481jh f134137e;

    /* renamed from: f */
    private static volatile C63010eb f134138f;

    /* renamed from: a */
    public int f134139a;

    /* renamed from: b */
    public boolean f134140b;

    /* renamed from: c */
    public boolean f134141c;

    /* renamed from: d */
    public boolean f134142d;

    static {
        C51481jh jhVar = new C51481jh();
        f134137e = jhVar;
        C62942bv.registerDefaultInstance(C51481jh.class, jhVar);
    }

    private C51481jh() {
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
                return newMessageInfo(f134137e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51481jh();
            case 4:
                return new C51480jg();
            case 5:
                return f134137e;
            case 6:
                C63010eb ebVar = f134138f;
                if (ebVar == null) {
                    synchronized (C51481jh.class) {
                        ebVar = f134138f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134137e);
                            f134138f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
