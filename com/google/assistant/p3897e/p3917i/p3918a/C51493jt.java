package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.jt */
/* compiled from: PG */
public final class C51493jt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51493jt f134164e;

    /* renamed from: f */
    private static volatile C63010eb f134165f;

    /* renamed from: a */
    public int f134166a;

    /* renamed from: b */
    public boolean f134167b;

    /* renamed from: c */
    public boolean f134168c;

    /* renamed from: d */
    public boolean f134169d;

    static {
        C51493jt jtVar = new C51493jt();
        f134164e = jtVar;
        C62942bv.registerDefaultInstance(C51493jt.class, jtVar);
    }

    private C51493jt() {
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
                return newMessageInfo(f134164e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51493jt();
            case 4:
                return new C51492js();
            case 5:
                return f134164e;
            case 6:
                C63010eb ebVar = f134165f;
                if (ebVar == null) {
                    synchronized (C51493jt.class) {
                        ebVar = f134165f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134164e);
                            f134165f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
