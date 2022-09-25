package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dx */
/* compiled from: PG */
public final class C14294dx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14294dx f43252e;

    /* renamed from: f */
    private static volatile C63010eb f43253f;

    /* renamed from: a */
    public String f43254a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f43255b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f43256c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f43257d = BuildConfig.FLAVOR;

    static {
        C14294dx dxVar = new C14294dx();
        f43252e = dxVar;
        C62942bv.registerDefaultInstance(C14294dx.class, dxVar);
    }

    private C14294dx() {
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
                return newMessageInfo(f43252e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", C45240c.f118157a, "b", "d"});
            case 3:
                return new C14294dx();
            case 4:
                return new C14293dw();
            case 5:
                return f43252e;
            case 6:
                C63010eb ebVar = f43253f;
                if (ebVar == null) {
                    synchronized (C14294dx.class) {
                        ebVar = f43253f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43252e);
                            f43253f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
