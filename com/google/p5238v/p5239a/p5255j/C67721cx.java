package com.google.p5238v.p5239a.p5255j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.cx */
/* compiled from: PG */
public final class C67721cx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67721cx f183740d;

    /* renamed from: e */
    private static volatile C63010eb f183741e;

    /* renamed from: a */
    public String f183742a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f183743b = C63088z.f170246b;

    /* renamed from: c */
    public int f183744c;

    static {
        C67721cx cxVar = new C67721cx();
        f183740d = cxVar;
        C62942bv.registerDefaultInstance(C67721cx.class, cxVar);
    }

    private C67721cx() {
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
                return newMessageInfo(f183740d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67721cx();
            case 4:
                return new C67719cv();
            case 5:
                return f183740d;
            case 6:
                C63010eb ebVar = f183741e;
                if (ebVar == null) {
                    synchronized (C67721cx.class) {
                        ebVar = f183741e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183740d);
                            f183741e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
