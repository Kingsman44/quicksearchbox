package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ln */
/* compiled from: PG */
public final class C53374ln extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53374ln f140056e;

    /* renamed from: g */
    private static volatile C63010eb f140057g;

    /* renamed from: a */
    public int f140058a;

    /* renamed from: b */
    public C53368lh f140059b;

    /* renamed from: c */
    public C53368lh f140060c;

    /* renamed from: d */
    public C53368lh f140061d;

    /* renamed from: f */
    private byte f140062f = 2;

    static {
        C53374ln lnVar = new C53374ln();
        f140056e = lnVar;
        C62942bv.registerDefaultInstance(C53374ln.class, lnVar);
    }

    private C53374ln() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140062f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140062f = b;
                return null;
            case 2:
                return newMessageInfo(f140056e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53374ln();
            case 4:
                return new C53373lm();
            case 5:
                return f140056e;
            case 6:
                C63010eb ebVar = f140057g;
                if (ebVar == null) {
                    synchronized (C53374ln.class) {
                        ebVar = f140057g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140056e);
                            f140057g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
