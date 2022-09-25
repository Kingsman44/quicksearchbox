package com.google.android.apps.gsa.nga.shared.p6407v;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.im */
/* compiled from: PG */
public final class C83318im extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83318im f227126e;

    /* renamed from: f */
    private static volatile C63010eb f227127f;

    /* renamed from: a */
    public int f227128a;

    /* renamed from: b */
    public int f227129b;

    /* renamed from: c */
    public int f227130c;

    /* renamed from: d */
    public String f227131d = BuildConfig.FLAVOR;

    static {
        C83318im imVar = new C83318im();
        f227126e = imVar;
        C62942bv.registerDefaultInstance(C83318im.class, imVar);
    }

    private C83318im() {
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
                return newMessageInfo(f227126e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C83316ik.f227125a, C45240c.f118157a, e.b(), "d"});
            case 3:
                return new C83318im();
            case 4:
                return new C83315ij();
            case 5:
                return f227126e;
            case 6:
                C63010eb ebVar = f227127f;
                if (ebVar == null) {
                    synchronized (C83318im.class) {
                        ebVar = f227127f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227126e);
                            f227127f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
