package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ix */
/* compiled from: PG */
public final class C51470ix extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51470ix f134085b;

    /* renamed from: d */
    private static volatile C63010eb f134086d;

    /* renamed from: a */
    public String f134087a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f134088c;

    static {
        C51470ix ixVar = new C51470ix();
        f134085b = ixVar;
        C62942bv.registerDefaultInstance(C51470ix.class, ixVar);
    }

    private C51470ix() {
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
                return newMessageInfo(f134085b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51470ix();
            case 4:
                return new C51469iw();
            case 5:
                return f134085b;
            case 6:
                C63010eb ebVar = f134086d;
                if (ebVar == null) {
                    synchronized (C51470ix.class) {
                        ebVar = f134086d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134085b);
                            f134086d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
