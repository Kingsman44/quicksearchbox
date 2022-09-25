package com.google.android.apps.gsa.opa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.v */
/* compiled from: PG */
public final class C83813v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83813v f228423e;

    /* renamed from: f */
    private static volatile C63010eb f228424f;

    /* renamed from: a */
    public String f228425a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f228426b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f228427c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f228428d = BuildConfig.FLAVOR;

    static {
        C83813v vVar = new C83813v();
        f228423e = vVar;
        C62942bv.registerDefaultInstance(C83813v.class, vVar);
    }

    private C83813v() {
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
                return newMessageInfo(f228423e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C83813v();
            case 4:
                return new C83812u();
            case 5:
                return f228423e;
            case 6:
                C63010eb ebVar = f228424f;
                if (ebVar == null) {
                    synchronized (C83813v.class) {
                        ebVar = f228424f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228423e);
                            f228424f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
