package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.ba */
/* compiled from: PG */
public final class C48509ba extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48509ba f125318b;

    /* renamed from: d */
    private static volatile C63010eb f125319d;

    /* renamed from: a */
    public long f125320a;

    /* renamed from: c */
    private int f125321c;

    static {
        C48509ba baVar = new C48509ba();
        f125318b = baVar;
        C62942bv.registerDefaultInstance(C48509ba.class, baVar);
    }

    private C48509ba() {
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
                return newMessageInfo(f125318b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C48509ba();
            case 4:
                return new C48507az();
            case 5:
                return f125318b;
            case 6:
                C63010eb ebVar = f125319d;
                if (ebVar == null) {
                    synchronized (C48509ba.class) {
                        ebVar = f125319d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125318b);
                            f125319d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
