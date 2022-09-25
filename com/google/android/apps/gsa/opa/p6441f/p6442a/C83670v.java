package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.v */
/* compiled from: PG */
public final class C83670v extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C83670v f228073f;

    /* renamed from: g */
    private static volatile C63010eb f228074g;

    /* renamed from: a */
    public int f228075a;

    /* renamed from: b */
    public int f228076b;

    /* renamed from: c */
    public String f228077c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f228078d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f228079e;

    static {
        C83670v vVar = new C83670v();
        f228073f = vVar;
        C62942bv.registerDefaultInstance(C83670v.class, vVar);
    }

    private C83670v() {
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
                return newMessageInfo(f228073f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C83668t.f228072a, C45240c.f118157a, "d", "e", e.b()});
            case 3:
                return new C83670v();
            case 4:
                return new C83667s();
            case 5:
                return f228073f;
            case 6:
                C63010eb ebVar = f228074g;
                if (ebVar == null) {
                    synchronized (C83670v.class) {
                        ebVar = f228074g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228073f);
                            f228074g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
