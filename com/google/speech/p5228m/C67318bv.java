package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bv */
/* compiled from: PG */
public final class C67318bv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67318bv f182974d;

    /* renamed from: e */
    private static volatile C63010eb f182975e;

    /* renamed from: a */
    public int f182976a;

    /* renamed from: b */
    public String f182977b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f182978c = C62942bv.emptyProtobufList();

    static {
        C67318bv bvVar = new C67318bv();
        f182974d = bvVar;
        C62942bv.registerDefaultInstance(C67318bv.class, bvVar);
    }

    private C67318bv() {
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
                return newMessageInfo(f182974d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67318bv();
            case 4:
                return new C67317bu();
            case 5:
                return f182974d;
            case 6:
                C63010eb ebVar = f182975e;
                if (ebVar == null) {
                    synchronized (C67318bv.class) {
                        ebVar = f182975e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182974d);
                            f182975e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
