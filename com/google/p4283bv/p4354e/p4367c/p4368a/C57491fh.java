package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.fh */
/* compiled from: PG */
public final class C57491fh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57491fh f153566c;

    /* renamed from: d */
    private static volatile C63010eb f153567d;

    /* renamed from: a */
    public int f153568a = 0;

    /* renamed from: b */
    public Object f153569b;

    static {
        C57491fh fhVar = new C57491fh();
        f153566c = fhVar;
        C62942bv.registerDefaultInstance(C57491fh.class, fhVar);
    }

    private C57491fh() {
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
                return newMessageInfo(f153566c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဵ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C57491fh();
            case 4:
                return new C57490fg();
            case 5:
                return f153566c;
            case 6:
                C63010eb ebVar = f153567d;
                if (ebVar == null) {
                    synchronized (C57491fh.class) {
                        ebVar = f153567d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153566c);
                            f153567d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
