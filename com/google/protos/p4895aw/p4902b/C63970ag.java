package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ag */
/* compiled from: PG */
public final class C63970ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63970ag f172999c;

    /* renamed from: d */
    private static volatile C63010eb f173000d;

    /* renamed from: a */
    public int f173001a = 0;

    /* renamed from: b */
    public Object f173002b;

    static {
        C63970ag agVar = new C63970ag();
        f172999c = agVar;
        C62942bv.registerDefaultInstance(C63970ag.class, agVar);
    }

    private C63970ag() {
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
                return newMessageInfo(f172999c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C63966ac.class, C63969af.class, C62912at.class});
            case 3:
                return new C63970ag();
            case 4:
                return new C63967ad();
            case 5:
                return f172999c;
            case 6:
                C63010eb ebVar = f173000d;
                if (ebVar == null) {
                    synchronized (C63970ag.class) {
                        ebVar = f173000d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172999c);
                            f173000d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
