package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.fl */
/* compiled from: PG */
public final class C87838fl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87838fl f237655d;

    /* renamed from: e */
    private static volatile C63010eb f237656e;

    /* renamed from: a */
    public int f237657a;

    /* renamed from: b */
    public C88356yq f237658b;

    /* renamed from: c */
    public String f237659c = BuildConfig.FLAVOR;

    static {
        C87838fl flVar = new C87838fl();
        f237655d = flVar;
        C62942bv.registerDefaultInstance(C87838fl.class, flVar);
    }

    private C87838fl() {
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
                return newMessageInfo(f237655d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87838fl();
            case 4:
                return new C87837fk();
            case 5:
                return f237655d;
            case 6:
                C63010eb ebVar = f237656e;
                if (ebVar == null) {
                    synchronized (C87838fl.class) {
                        ebVar = f237656e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237655d);
                            f237656e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
