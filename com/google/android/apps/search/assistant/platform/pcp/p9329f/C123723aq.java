package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.aq */
/* compiled from: PG */
public final class C123723aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C123723aq f341737d;

    /* renamed from: e */
    private static volatile C63010eb f341738e;

    /* renamed from: a */
    public int f341739a;

    /* renamed from: b */
    public String f341740b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f341741c = BuildConfig.FLAVOR;

    static {
        C123723aq aqVar = new C123723aq();
        f341737d = aqVar;
        C62942bv.registerDefaultInstance(C123723aq.class, aqVar);
    }

    private C123723aq() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f341737d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C123723aq();
            case 4:
                return new C123722ap();
            case 5:
                return f341737d;
            case 6:
                C63010eb ebVar = f341738e;
                if (ebVar == null) {
                    synchronized (C123723aq.class) {
                        ebVar = f341738e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341737d);
                            f341738e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
