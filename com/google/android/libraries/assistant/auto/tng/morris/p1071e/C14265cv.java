package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.cv */
/* compiled from: PG */
public final class C14265cv extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14265cv f43149f;

    /* renamed from: g */
    private static volatile C63010eb f43150g;

    /* renamed from: a */
    public int f43151a;

    /* renamed from: b */
    public String f43152b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f43153c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f43154d;

    /* renamed from: e */
    public String f43155e = BuildConfig.FLAVOR;

    static {
        C14265cv cvVar = new C14265cv();
        f43149f = cvVar;
        C62942bv.registerDefaultInstance(C14265cv.class, cvVar);
    }

    private C14265cv() {
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
                return newMessageInfo(f43149f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C14265cv();
            case 4:
                return new C14264cu();
            case 5:
                return f43149f;
            case 6:
                C63010eb ebVar = f43150g;
                if (ebVar == null) {
                    synchronized (C14265cv.class) {
                        ebVar = f43150g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43149f);
                            f43150g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
