package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.be */
/* compiled from: PG */
public final class C49847be extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49847be f129542b;

    /* renamed from: d */
    private static volatile C63010eb f129543d;

    /* renamed from: a */
    public C49267am f129544a;

    /* renamed from: c */
    private int f129545c;

    static {
        C49847be beVar = new C49847be();
        f129542b = beVar;
        C62942bv.registerDefaultInstance(C49847be.class, beVar);
    }

    private C49847be() {
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
                return newMessageInfo(f129542b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49847be();
            case 4:
                return new C49846bd();
            case 5:
                return f129542b;
            case 6:
                C63010eb ebVar = f129543d;
                if (ebVar == null) {
                    synchronized (C49847be.class) {
                        ebVar = f129543d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129542b);
                            f129543d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
