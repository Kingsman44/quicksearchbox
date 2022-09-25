package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.c */
/* compiled from: PG */
public final class C103874c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C103874c f289153f;

    /* renamed from: g */
    private static volatile C63010eb f289154g;

    /* renamed from: a */
    public int f289155a;

    /* renamed from: b */
    public String f289156b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62964ck f289157c = emptyLongList();

    /* renamed from: d */
    public long f289158d;

    /* renamed from: e */
    public long f289159e;

    static {
        C103874c cVar = new C103874c();
        f289153f = cVar;
        C62942bv.registerDefaultInstance(C103874c.class, cVar);
    }

    private C103874c() {
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
                return newMessageInfo(f289153f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0014\u0003ဂ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C103874c();
            case 4:
                return new C103847b();
            case 5:
                return f289153f;
            case 6:
                C63010eb ebVar = f289154g;
                if (ebVar == null) {
                    synchronized (C103874c.class) {
                        ebVar = f289154g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f289153f);
                            f289154g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
