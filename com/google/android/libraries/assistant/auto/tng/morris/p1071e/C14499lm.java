package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lm */
/* compiled from: PG */
public final class C14499lm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14499lm f43848e;

    /* renamed from: g */
    private static volatile C63010eb f43849g;

    /* renamed from: a */
    public int f43850a = 0;

    /* renamed from: b */
    public Object f43851b;

    /* renamed from: c */
    public C14262cs f43852c;

    /* renamed from: d */
    public C14567o f43853d;

    /* renamed from: f */
    private byte f43854f = 2;

    static {
        C14499lm lmVar = new C14499lm();
        f43848e = lmVar;
        C62942bv.registerDefaultInstance(C14499lm.class, lmVar);
    }

    private C14499lm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43854f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43854f = b;
                return null;
            case 2:
                return newMessageInfo(f43848e, "\u0000\u0006\u0001\u0000\u0001\b\u0006\u0000\u0000\u0004\u0001м\u0000\u0003м\u0000\u0004\t\u0006м\u0000\u0007м\u0000\b\t", new Object[]{"b", "a", C14359gh.class, C14278dh.class, C45240c.f118157a, C14234br.class, C14355gd.class, "d"});
            case 3:
                return new C14499lm();
            case 4:
                return new C14497lk();
            case 5:
                return f43848e;
            case 6:
                C63010eb ebVar = f43849g;
                if (ebVar == null) {
                    synchronized (C14499lm.class) {
                        ebVar = f43849g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43848e);
                            f43849g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
