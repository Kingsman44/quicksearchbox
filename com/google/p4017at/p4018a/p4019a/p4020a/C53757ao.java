package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.ao */
/* compiled from: PG */
public final class C53757ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53757ao f141118c;

    /* renamed from: d */
    private static volatile C63010eb f141119d;

    /* renamed from: a */
    public int f141120a;

    /* renamed from: b */
    public int f141121b;

    static {
        C53757ao aoVar = new C53757ao();
        f141118c = aoVar;
        C62942bv.registerDefaultInstance(C53757ao.class, aoVar);
    }

    private C53757ao() {
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
                return newMessageInfo(f141118c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C53756an.f141117a});
            case 3:
                return new C53757ao();
            case 4:
                return new C53755am();
            case 5:
                return f141118c;
            case 6:
                C63010eb ebVar = f141119d;
                if (ebVar == null) {
                    synchronized (C53757ao.class) {
                        ebVar = f141119d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141118c);
                            f141119d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
