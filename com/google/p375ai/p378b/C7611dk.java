package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.dk */
/* compiled from: PG */
public final class C7611dk extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C7611dk f26301f;

    /* renamed from: g */
    private static volatile C63010eb f26302g;

    /* renamed from: a */
    public int f26303a;

    /* renamed from: b */
    public String f26304b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26305c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f26306d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f26307e = emptyProtobufList();

    static {
        C7611dk dkVar = new C7611dk();
        f26301f = dkVar;
        C62942bv.registerDefaultInstance(C7611dk.class, dkVar);
    }

    private C7611dk() {
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo16930a() {
        return (this.f26303a & 1) != 0;
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
                return newMessageInfo(f26301f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C7609di.class});
            case 3:
                return new C7611dk();
            case 4:
                return new C7610dj();
            case 5:
                return f26301f;
            case 6:
                C63010eb ebVar = f26302g;
                if (ebVar == null) {
                    synchronized (C7611dk.class) {
                        ebVar = f26302g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26301f);
                            f26302g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
