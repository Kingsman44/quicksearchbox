package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.ap.b.a.o */
/* compiled from: PG */
public final class C63704o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63704o f172232c;

    /* renamed from: d */
    private static volatile C63010eb f172233d;

    /* renamed from: a */
    public int f172234a = 0;

    /* renamed from: b */
    public Object f172235b;

    static {
        C63704o oVar = new C63704o();
        f172232c = oVar;
        C62942bv.registerDefaultInstance(C63704o.class, oVar);
    }

    private C63704o() {
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
                return newMessageInfo(f172232c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C63700k.class, C63042fg.class});
            case 3:
                return new C63704o();
            case 4:
                return new C63703n();
            case 5:
                return f172232c;
            case 6:
                C63010eb ebVar = f172233d;
                if (ebVar == null) {
                    synchronized (C63704o.class) {
                        ebVar = f172233d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172232c);
                            f172233d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
