package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.j */
/* compiled from: PG */
public final class C45664j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45664j f120126d;

    /* renamed from: g */
    private static volatile C63010eb f120127g;

    /* renamed from: a */
    public int f120128a;

    /* renamed from: b */
    public String f120129b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f120130c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private C45644ax f120131e;

    /* renamed from: f */
    private byte f120132f = 2;

    static {
        C45664j jVar = new C45664j();
        f120126d = jVar;
        C62942bv.registerDefaultInstance(C45664j.class, jVar);
    }

    private C45664j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f120132f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f120132f = b;
                return null;
            case 2:
                return newMessageInfo(f120126d, "\u0001\u0003\u0000\u0001\u0002\u000e\u0003\u0000\u0000\u0001\u0002ဈ\u0001\u0003ဈ\u0003\u000eᐉ\r", new Object[]{"a", "b", C45240c.f118157a, "e"});
            case 3:
                return new C45664j();
            case 4:
                return new C45663i();
            case 5:
                return f120126d;
            case 6:
                C63010eb ebVar = f120127g;
                if (ebVar == null) {
                    synchronized (C45664j.class) {
                        ebVar = f120127g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120126d);
                            f120127g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
