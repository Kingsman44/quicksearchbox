package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.ci */
/* compiled from: PG */
public final class C80242ci extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80242ci f220133c;

    /* renamed from: d */
    private static volatile C63010eb f220134d;

    /* renamed from: a */
    public int f220135a;

    /* renamed from: b */
    public int f220136b;

    static {
        C80242ci ciVar = new C80242ci();
        f220133c = ciVar;
        C62942bv.registerDefaultInstance(C80242ci.class, ciVar);
    }

    private C80242ci() {
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
                return newMessageInfo(f220133c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C80246cm.m128103b()});
            case 3:
                return new C80242ci();
            case 4:
                return new C80241ch();
            case 5:
                return f220133c;
            case 6:
                C63010eb ebVar = f220134d;
                if (ebVar == null) {
                    synchronized (C80242ci.class) {
                        ebVar = f220134d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220133c);
                            f220134d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
