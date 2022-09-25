package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bm */
/* compiled from: PG */
public final class C7559bm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7559bm f26143e;

    /* renamed from: f */
    private static volatile C63010eb f26144f;

    /* renamed from: a */
    public int f26145a;

    /* renamed from: b */
    public String f26146b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f26147c;

    /* renamed from: d */
    public boolean f26148d;

    static {
        C7559bm bmVar = new C7559bm();
        f26143e = bmVar;
        C62942bv.registerDefaultInstance(C7559bm.class, bmVar);
    }

    private C7559bm() {
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
                return newMessageInfo(f26143e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C7559bm();
            case 4:
                return new C7558bl();
            case 5:
                return f26143e;
            case 6:
                C63010eb ebVar = f26144f;
                if (ebVar == null) {
                    synchronized (C7559bm.class) {
                        ebVar = f26144f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26143e);
                            f26144f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
