package com.google.lens.p4694a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.al */
/* compiled from: PG */
public final class C62033al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62033al f167607b;

    /* renamed from: d */
    private static volatile C63010eb f167608d;

    /* renamed from: a */
    public String f167609a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f167610c;

    static {
        C62033al alVar = new C62033al();
        f167607b = alVar;
        C62942bv.registerDefaultInstance(C62033al.class, alVar);
    }

    private C62033al() {
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
                return newMessageInfo(f167607b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62033al();
            case 4:
                return new C62032ak();
            case 5:
                return f167607b;
            case 6:
                C63010eb ebVar = f167608d;
                if (ebVar == null) {
                    synchronized (C62033al.class) {
                        ebVar = f167608d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167607b);
                            f167608d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
