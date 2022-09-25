package com.google.android.apps.gsa.staticplugins.p7686co;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4189b.C55893j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.n */
/* compiled from: PG */
public final class C98474n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C98474n f274967f;

    /* renamed from: g */
    private static volatile C63010eb f274968g;

    /* renamed from: a */
    public int f274969a;

    /* renamed from: b */
    public C55893j f274970b;

    /* renamed from: c */
    public int f274971c;

    /* renamed from: d */
    public int f274972d;

    /* renamed from: e */
    public String f274973e = BuildConfig.FLAVOR;

    static {
        C98474n nVar = new C98474n();
        f274967f = nVar;
        C62942bv.registerDefaultInstance(C98474n.class, nVar);
    }

    private C98474n() {
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
                return newMessageInfo(f274967f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C98472l.f274966a, "e"});
            case 3:
                return new C98474n();
            case 4:
                return new C98463k();
            case 5:
                return f274967f;
            case 6:
                C63010eb ebVar = f274968g;
                if (ebVar == null) {
                    synchronized (C98474n.class) {
                        ebVar = f274968g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274967f);
                            f274968g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
