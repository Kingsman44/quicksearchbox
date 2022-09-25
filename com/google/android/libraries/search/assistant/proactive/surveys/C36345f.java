package com.google.android.libraries.search.assistant.proactive.surveys;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.ajz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.f */
/* compiled from: PG */
public final class C36345f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C36345f f94924f;

    /* renamed from: g */
    private static volatile C63010eb f94925g;

    /* renamed from: a */
    public int f94926a;

    /* renamed from: b */
    public String f94927b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f94928c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f94929d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public ajz f94930e;

    static {
        C36345f fVar = new C36345f();
        f94924f = fVar;
        C62942bv.registerDefaultInstance(C36345f.class, fVar);
    }

    private C36345f() {
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
                return newMessageInfo(f94924f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C36345f();
            case 4:
                return new C36344e();
            case 5:
                return f94924f;
            case 6:
                C63010eb ebVar = f94925g;
                if (ebVar == null) {
                    synchronized (C36345f.class) {
                        ebVar = f94925g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f94924f);
                            f94925g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
