package com.google.p4273bs.p4277b.p4278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.u */
/* compiled from: PG */
public final class C56481u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56481u f150864e;

    /* renamed from: g */
    private static volatile C63010eb f150865g;

    /* renamed from: a */
    public String f150866a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f150867b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f150868c;

    /* renamed from: d */
    public long f150869d;

    /* renamed from: f */
    private int f150870f;

    static {
        C56481u uVar = new C56481u();
        f150864e = uVar;
        C62942bv.registerDefaultInstance(C56481u.class, uVar);
    }

    private C56481u() {
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
                return newMessageInfo(f150864e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56481u();
            case 4:
                return new C56480t();
            case 5:
                return f150864e;
            case 6:
                C63010eb ebVar = f150865g;
                if (ebVar == null) {
                    synchronized (C56481u.class) {
                        ebVar = f150865g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150864e);
                            f150865g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
