package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.al */
/* compiled from: PG */
public final class C83831al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83831al f228455c;

    /* renamed from: d */
    private static volatile C63010eb f228456d;

    /* renamed from: a */
    public int f228457a = 0;

    /* renamed from: b */
    public Object f228458b;

    static {
        C83831al alVar = new C83831al();
        f228455c = alVar;
        C62942bv.registerDefaultInstance(C83831al.class, alVar);
    }

    private C83831al() {
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
                return newMessageInfo(f228455c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C83825af.class, C83827ah.class});
            case 3:
                return new C83831al();
            case 4:
                return new C83829aj();
            case 5:
                return f228455c;
            case 6:
                C63010eb ebVar = f228456d;
                if (ebVar == null) {
                    synchronized (C83831al.class) {
                        ebVar = f228456d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228455c);
                            f228456d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
