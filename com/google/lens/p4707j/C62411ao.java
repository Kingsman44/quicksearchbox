package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ao */
/* compiled from: PG */
public final class C62411ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62411ao f168467c;

    /* renamed from: e */
    private static volatile C63010eb f168468e;

    /* renamed from: a */
    public C62415as f168469a;

    /* renamed from: b */
    public C62413aq f168470b;

    /* renamed from: d */
    private int f168471d;

    static {
        C62411ao aoVar = new C62411ao();
        f168467c = aoVar;
        C62942bv.registerDefaultInstance(C62411ao.class, aoVar);
    }

    private C62411ao() {
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
                return newMessageInfo(f168467c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C62411ao();
            case 4:
                return new C62410an();
            case 5:
                return f168467c;
            case 6:
                C63010eb ebVar = f168468e;
                if (ebVar == null) {
                    synchronized (C62411ao.class) {
                        ebVar = f168468e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168467c);
                            f168468e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
