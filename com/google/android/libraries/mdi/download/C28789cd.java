package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.mdi.download.cd */
/* compiled from: PG */
public final class C28789cd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28789cd f78239d;

    /* renamed from: e */
    private static volatile C63010eb f78240e;

    /* renamed from: a */
    public int f78241a;

    /* renamed from: b */
    public String f78242b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f78243c = C63088z.f170246b;

    static {
        C28789cd cdVar = new C28789cd();
        f78239d = cdVar;
        C62942bv.registerDefaultInstance(C28789cd.class, cdVar);
    }

    private C28789cd() {
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
                return newMessageInfo(f78239d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C28789cd();
            case 4:
                return new C28788cc();
            case 5:
                return f78239d;
            case 6:
                C63010eb ebVar = f78240e;
                if (ebVar == null) {
                    synchronized (C28789cd.class) {
                        ebVar = f78240e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78239d);
                            f78240e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
