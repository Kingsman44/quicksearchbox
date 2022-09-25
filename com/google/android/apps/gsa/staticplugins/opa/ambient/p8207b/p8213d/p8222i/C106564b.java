package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.i.b */
/* compiled from: PG */
public final class C106564b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C106564b f297140f;

    /* renamed from: g */
    private static volatile C63010eb f297141g;

    /* renamed from: a */
    public int f297142a;

    /* renamed from: b */
    public String f297143b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f297144c;

    /* renamed from: d */
    public boolean f297145d;

    /* renamed from: e */
    public long f297146e;

    static {
        C106564b bVar = new C106564b();
        f297140f = bVar;
        C62942bv.registerDefaultInstance(C106564b.class, bVar);
    }

    private C106564b() {
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
                return newMessageInfo(f297140f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C106564b();
            case 4:
                return new C106563a();
            case 5:
                return f297140f;
            case 6:
                C63010eb ebVar = f297141g;
                if (ebVar == null) {
                    synchronized (C106564b.class) {
                        ebVar = f297141g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297140f);
                            f297141g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
