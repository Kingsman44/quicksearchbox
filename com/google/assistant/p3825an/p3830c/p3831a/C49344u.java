package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.u */
/* compiled from: PG */
public final class C49344u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49344u f127540d;

    /* renamed from: e */
    private static volatile C63010eb f127541e;

    /* renamed from: a */
    public int f127542a;

    /* renamed from: b */
    public String f127543b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62995dn f127544c = C62995dn.f170057a;

    static {
        C49344u uVar = new C49344u();
        f127540d = uVar;
        C62942bv.registerDefaultInstance(C49344u.class, uVar);
    }

    private C49344u() {
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
                return newMessageInfo(f127540d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဈ\u0000\u00022", new Object[]{"a", "b", C45240c.f118157a, C49343t.f127539a});
            case 3:
                return new C49344u();
            case 4:
                return new C49342s();
            case 5:
                return f127540d;
            case 6:
                C63010eb ebVar = f127541e;
                if (ebVar == null) {
                    synchronized (C49344u.class) {
                        ebVar = f127541e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127540d);
                            f127541e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
