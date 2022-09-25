package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.je */
/* compiled from: PG */
public final class C7767je extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7767je f27203d;

    /* renamed from: e */
    private static volatile C63010eb f27204e;

    /* renamed from: a */
    public int f27205a;

    /* renamed from: b */
    public String f27206b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f27207c = BuildConfig.FLAVOR;

    static {
        C7767je jeVar = new C7767je();
        f27203d = jeVar;
        C62942bv.registerDefaultInstance(C7767je.class, jeVar);
    }

    private C7767je() {
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
                return newMessageInfo(f27203d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7767je();
            case 4:
                return new C7766jd();
            case 5:
                return f27203d;
            case 6:
                C63010eb ebVar = f27204e;
                if (ebVar == null) {
                    synchronized (C7767je.class) {
                        ebVar = f27204e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27203d);
                            f27204e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
