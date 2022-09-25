package com.google.android.apps.gsa.staticplugins.p7686co;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.t */
/* compiled from: PG */
public final class C98480t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C98480t f275000e;

    /* renamed from: f */
    private static volatile C63010eb f275001f;

    /* renamed from: a */
    public int f275002a;

    /* renamed from: b */
    public C62971cq f275003b = emptyProtobufList();

    /* renamed from: c */
    public String f275004c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f275005d;

    static {
        C98480t tVar = new C98480t();
        f275000e = tVar;
        C62942bv.registerDefaultInstance(C98480t.class, tVar);
    }

    private C98480t() {
    }

    /* renamed from: a */
    public final void mo91131a() {
        C62971cq cqVar = this.f275003b;
        if (!cqVar.mo58948c()) {
            this.f275003b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f275000e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\u001b\u0004ဈ\u0000\u0005င\u0001", new Object[]{"a", "b", C98474n.class, C45240c.f118157a, "d"});
            case 3:
                return new C98480t();
            case 4:
                return new C98479s();
            case 5:
                return f275000e;
            case 6:
                C63010eb ebVar = f275001f;
                if (ebVar == null) {
                    synchronized (C98480t.class) {
                        ebVar = f275001f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f275000e);
                            f275001f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
