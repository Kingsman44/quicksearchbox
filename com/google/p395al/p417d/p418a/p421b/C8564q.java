package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.q */
/* compiled from: PG */
public final class C8564q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8564q f29673c;

    /* renamed from: d */
    private static volatile C63010eb f29674d;

    /* renamed from: a */
    public int f29675a = 0;

    /* renamed from: b */
    public Object f29676b;

    static {
        C8564q qVar = new C8564q();
        f29673c = qVar;
        C62942bv.registerDefaultInstance(C8564q.class, qVar);
    }

    private C8564q() {
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
                return newMessageInfo(f29673c, "\u0001\u000b\u0001\u0000\u0002\f\u000b\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000", new Object[]{"b", "a", C8551d.class, C8553f.class, C8557j.class, C8561n.class, C8566s.class, C8568u.class, C8570w.class, C8572y.class, C8549b.class, C8559l.class, C8555h.class});
            case 3:
                return new C8564q();
            case 4:
                return new C8563p();
            case 5:
                return f29673c;
            case 6:
                C63010eb ebVar = f29674d;
                if (ebVar == null) {
                    synchronized (C8564q.class) {
                        ebVar = f29674d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29673c);
                            f29674d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
