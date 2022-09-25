package com.google.android.apps.gsa.opaonboarding.p6462d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C50206om;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.v */
/* compiled from: PG */
public final class C83935v extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C83935v f228590f;

    /* renamed from: g */
    private static volatile C63010eb f228591g;

    /* renamed from: a */
    public int f228592a;

    /* renamed from: b */
    public boolean f228593b;

    /* renamed from: c */
    public String f228594c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f228595d;

    /* renamed from: e */
    public String f228596e = BuildConfig.FLAVOR;

    static {
        C83935v vVar = new C83935v();
        f228590f = vVar;
        C62942bv.registerDefaultInstance(C83935v.class, vVar);
    }

    private C83935v() {
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
                return newMessageInfo(f228590f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C50206om.f130512a, "e"});
            case 3:
                return new C83935v();
            case 4:
                return new C83934u();
            case 5:
                return f228590f;
            case 6:
                C63010eb ebVar = f228591g;
                if (ebVar == null) {
                    synchronized (C83935v.class) {
                        ebVar = f228591g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228590f);
                            f228591g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
