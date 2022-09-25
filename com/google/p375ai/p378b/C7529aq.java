package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.aq */
/* compiled from: PG */
public final class C7529aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7529aq f26062d;

    /* renamed from: g */
    private static volatile C63010eb f26063g;

    /* renamed from: a */
    public String f26064a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f26065b;

    /* renamed from: c */
    public C8178yk f26066c;

    /* renamed from: e */
    private int f26067e;

    /* renamed from: f */
    private byte f26068f = 2;

    static {
        C7529aq aqVar = new C7529aq();
        f26062d = aqVar;
        C62942bv.registerDefaultInstance(C7529aq.class, aqVar);
    }

    private C7529aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26068f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26068f = b;
                return null;
            case 2:
                return newMessageInfo(f26062d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C7529aq();
            case 4:
                return new C7528ap();
            case 5:
                return f26062d;
            case 6:
                C63010eb ebVar = f26063g;
                if (ebVar == null) {
                    synchronized (C7529aq.class) {
                        ebVar = f26063g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26062d);
                            f26063g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
