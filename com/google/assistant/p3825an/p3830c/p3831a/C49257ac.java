package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.ac */
/* compiled from: PG */
public final class C49257ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49257ac f127326d;

    /* renamed from: e */
    private static volatile C63010eb f127327e;

    /* renamed from: a */
    public int f127328a;

    /* renamed from: b */
    public String f127329b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f127330c;

    static {
        C49257ac acVar = new C49257ac();
        f127326d = acVar;
        C62942bv.registerDefaultInstance(C49257ac.class, acVar);
    }

    private C49257ac() {
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
                return newMessageInfo(f127326d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49257ac();
            case 4:
                return new C49256ab();
            case 5:
                return f127326d;
            case 6:
                C63010eb ebVar = f127327e;
                if (ebVar == null) {
                    synchronized (C49257ac.class) {
                        ebVar = f127327e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127326d);
                            f127327e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
