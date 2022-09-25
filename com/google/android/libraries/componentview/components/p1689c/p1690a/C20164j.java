package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.j */
/* compiled from: PG */
public final class C20164j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20164j f56564c;

    /* renamed from: e */
    private static volatile C63010eb f56565e;

    /* renamed from: a */
    public String f56566a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f56567b;

    /* renamed from: d */
    private int f56568d;

    static {
        C20164j jVar = new C20164j();
        f56564c = jVar;
        C62942bv.registerDefaultInstance(C20164j.class, jVar);
    }

    private C20164j() {
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
                return newMessageInfo(f56564c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C20164j();
            case 4:
                return new C20163i();
            case 5:
                return f56564c;
            case 6:
                C63010eb ebVar = f56565e;
                if (ebVar == null) {
                    synchronized (C20164j.class) {
                        ebVar = f56565e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56564c);
                            f56565e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
