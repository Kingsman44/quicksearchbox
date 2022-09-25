package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.fy */
/* compiled from: PG */
public final class C52119fy extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52119fy f136769e;

    /* renamed from: f */
    private static volatile C63010eb f136770f;

    /* renamed from: a */
    public int f136771a;

    /* renamed from: b */
    public String f136772b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f136773c;

    /* renamed from: d */
    public String f136774d = BuildConfig.FLAVOR;

    static {
        C52119fy fyVar = new C52119fy();
        f136769e = fyVar;
        C62942bv.registerDefaultInstance(C52119fy.class, fyVar);
    }

    private C52119fy() {
    }

    /* renamed from: a */
    public static C63010eb m86511a() {
        return f136769e.getParserForType();
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
                return newMessageInfo(f136769e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C52117fw.f136768a, "d"});
            case 3:
                return new C52119fy();
            case 4:
                return new C52116fv();
            case 5:
                return f136769e;
            case 6:
                C63010eb ebVar = f136770f;
                if (ebVar == null) {
                    synchronized (C52119fy.class) {
                        ebVar = f136770f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136769e);
                            f136770f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
