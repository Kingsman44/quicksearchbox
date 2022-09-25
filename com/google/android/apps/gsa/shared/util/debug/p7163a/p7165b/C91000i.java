package com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.b.i */
/* compiled from: PG */
public final class C91000i extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C91000i f254200e;

    /* renamed from: g */
    private static volatile C63010eb f254201g;

    /* renamed from: a */
    public int f254202a;

    /* renamed from: b */
    public long f254203b;

    /* renamed from: c */
    public String f254204c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f254205d;

    /* renamed from: f */
    private byte f254206f = 2;

    static {
        C91000i iVar = new C91000i();
        f254200e = iVar;
        C62942bv.registerDefaultInstance(C91000i.class, iVar);
    }

    private C91000i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f254206f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f254206f = b;
                return null;
            case 2:
                return newMessageInfo(f254200e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C91000i();
            case 4:
                return new C90999h();
            case 5:
                return f254200e;
            case 6:
                C63010eb ebVar = f254201g;
                if (ebVar == null) {
                    synchronized (C91000i.class) {
                        ebVar = f254201g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f254200e);
                            f254201g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
