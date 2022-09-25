package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bu.a.cv */
/* compiled from: PG */
public final class C56565cv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56565cv f151038c;

    /* renamed from: d */
    private static volatile C63010eb f151039d;

    /* renamed from: a */
    public String f151040a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f151041b = C63088z.f170246b;

    static {
        C56565cv cvVar = new C56565cv();
        f151038c = cvVar;
        C62942bv.registerDefaultInstance(C56565cv.class, cvVar);
    }

    private C56565cv() {
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
                return newMessageInfo(f151038c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new C56565cv();
            case 4:
                return new C56564cu();
            case 5:
                return f151038c;
            case 6:
                C63010eb ebVar = f151039d;
                if (ebVar == null) {
                    synchronized (C56565cv.class) {
                        ebVar = f151039d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151038c);
                            f151039d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
