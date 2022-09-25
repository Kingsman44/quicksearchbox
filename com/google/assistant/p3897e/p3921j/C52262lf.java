package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.lf */
/* compiled from: PG */
public final class C52262lf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52262lf f137144f;

    /* renamed from: g */
    private static volatile C63010eb f137145g;

    /* renamed from: a */
    public int f137146a;

    /* renamed from: b */
    public int f137147b;

    /* renamed from: c */
    public boolean f137148c;

    /* renamed from: d */
    public boolean f137149d;

    /* renamed from: e */
    public boolean f137150e;

    static {
        C52262lf lfVar = new C52262lf();
        f137144f = lfVar;
        C62942bv.registerDefaultInstance(C52262lf.class, lfVar);
    }

    private C52262lf() {
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
                return newMessageInfo(f137144f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C51133hp.m86036b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C52262lf();
            case 4:
                return new C52261le();
            case 5:
                return f137144f;
            case 6:
                C63010eb ebVar = f137145g;
                if (ebVar == null) {
                    synchronized (C52262lf.class) {
                        ebVar = f137145g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137144f);
                            f137145g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
