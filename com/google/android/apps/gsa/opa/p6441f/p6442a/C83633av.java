package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80506i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.av */
/* compiled from: PG */
public final class C83633av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83633av f227991c;

    /* renamed from: d */
    private static volatile C63010eb f227992d;

    /* renamed from: a */
    public int f227993a;

    /* renamed from: b */
    public C80506i f227994b;

    static {
        C83633av avVar = new C83633av();
        f227991c = avVar;
        C62942bv.registerDefaultInstance(C83633av.class, avVar);
    }

    private C83633av() {
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
                return newMessageInfo(f227991c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83633av();
            case 4:
                return new C83632au();
            case 5:
                return f227991c;
            case 6:
                C63010eb ebVar = f227992d;
                if (ebVar == null) {
                    synchronized (C83633av.class) {
                        ebVar = f227992d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227991c);
                            f227992d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
