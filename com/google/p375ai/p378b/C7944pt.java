package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.pt */
/* compiled from: PG */
public final class C7944pt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7944pt f27891b;

    /* renamed from: d */
    private static volatile C63010eb f27892d;

    /* renamed from: a */
    public String f27893a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f27894c;

    static {
        C7944pt ptVar = new C7944pt();
        f27891b = ptVar;
        C62942bv.registerDefaultInstance(C7944pt.class, ptVar);
    }

    private C7944pt() {
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
                return newMessageInfo(f27891b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C7944pt();
            case 4:
                return new C7943ps();
            case 5:
                return f27891b;
            case 6:
                C63010eb ebVar = f27892d;
                if (ebVar == null) {
                    synchronized (C7944pt.class) {
                        ebVar = f27892d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27891b);
                            f27892d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
