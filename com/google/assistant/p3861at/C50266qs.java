package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qs */
/* compiled from: PG */
public final class C50266qs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50266qs f130716c;

    /* renamed from: d */
    private static volatile C63010eb f130717d;

    /* renamed from: a */
    public int f130718a = 0;

    /* renamed from: b */
    public Object f130719b;

    static {
        C50266qs qsVar = new C50266qs();
        f130716c = qsVar;
        C62942bv.registerDefaultInstance(C50266qs.class, qsVar);
    }

    private C50266qs() {
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
                return newMessageInfo(f130716c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C50286rl.m85799b(), C50256qi.class, C50262qo.class, C50279re.class, C50258qk.class, C50281rg.class, C50268qu.class});
            case 3:
                return new C50266qs();
            case 4:
                return new C50265qr();
            case 5:
                return f130716c;
            case 6:
                C63010eb ebVar = f130717d;
                if (ebVar == null) {
                    synchronized (C50266qs.class) {
                        ebVar = f130717d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130716c);
                            f130717d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
