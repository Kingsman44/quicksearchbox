package com.google.lens.p4701g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.ak */
/* compiled from: PG */
public final class C62261ak extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62261ak f168096d;

    /* renamed from: e */
    private static volatile C63010eb f168097e;

    /* renamed from: a */
    public int f168098a;

    /* renamed from: b */
    public String f168099b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f168100c = emptyProtobufList();

    static {
        C62261ak akVar = new C62261ak();
        f168096d = akVar;
        C62942bv.registerDefaultInstance(C62261ak.class, akVar);
    }

    private C62261ak() {
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
                return newMessageInfo(f168096d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C62259ai.class});
            case 3:
                return new C62261ak();
            case 4:
                return new C62260aj();
            case 5:
                return f168096d;
            case 6:
                C63010eb ebVar = f168097e;
                if (ebVar == null) {
                    synchronized (C62261ak.class) {
                        ebVar = f168097e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168096d);
                            f168097e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
