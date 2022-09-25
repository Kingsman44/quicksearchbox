package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.al */
/* compiled from: PG */
public final class C8867al extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8867al f30797e;

    /* renamed from: f */
    private static volatile C63010eb f30798f;

    /* renamed from: a */
    public int f30799a;

    /* renamed from: b */
    public String f30800b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C8865aj f30801c;

    /* renamed from: d */
    public C8933z f30802d;

    static {
        C8867al alVar = new C8867al();
        f30797e = alVar;
        C62942bv.registerDefaultInstance(C8867al.class, alVar);
    }

    private C8867al() {
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
                return newMessageInfo(f30797e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8867al();
            case 4:
                return new C8866ak();
            case 5:
                return f30797e;
            case 6:
                C63010eb ebVar = f30798f;
                if (ebVar == null) {
                    synchronized (C8867al.class) {
                        ebVar = f30798f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30797e);
                            f30798f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
