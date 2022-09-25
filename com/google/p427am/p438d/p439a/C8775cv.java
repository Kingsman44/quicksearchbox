package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.am.d.a.cv */
/* compiled from: PG */
public final class C8775cv extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8775cv f30140g;

    /* renamed from: h */
    private static volatile C63010eb f30141h;

    /* renamed from: a */
    public C8748bv f30142a;

    /* renamed from: b */
    public String f30143b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f30144c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f30145d;

    /* renamed from: e */
    public boolean f30146e;

    /* renamed from: f */
    public boolean f30147f;

    static {
        C8775cv cvVar = new C8775cv();
        f30140g = cvVar;
        C62942bv.registerDefaultInstance(C8775cv.class, cvVar);
    }

    private C8775cv() {
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
                return newMessageInfo(f30140g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\n\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8775cv();
            case 4:
                return new C8774cu();
            case 5:
                return f30140g;
            case 6:
                C63010eb ebVar = f30141h;
                if (ebVar == null) {
                    synchronized (C8775cv.class) {
                        ebVar = f30141h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30140g);
                            f30141h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
