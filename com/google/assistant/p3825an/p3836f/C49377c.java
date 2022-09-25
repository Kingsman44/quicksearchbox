package com.google.assistant.p3825an.p3836f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.f.c */
/* compiled from: PG */
public final class C49377c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49377c f127617e;

    /* renamed from: f */
    private static volatile C63010eb f127618f;

    /* renamed from: a */
    public int f127619a;

    /* renamed from: b */
    public int f127620b;

    /* renamed from: c */
    public String f127621c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f127622d;

    static {
        C49377c cVar = new C49377c();
        f127617e = cVar;
        C62942bv.registerDefaultInstance(C49377c.class, cVar);
    }

    private C49377c() {
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
                return newMessageInfo(f127617e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49377c();
            case 4:
                return new C49376b();
            case 5:
                return f127617e;
            case 6:
                C63010eb ebVar = f127618f;
                if (ebVar == null) {
                    synchronized (C49377c.class) {
                        ebVar = f127618f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127617e);
                            f127618f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
