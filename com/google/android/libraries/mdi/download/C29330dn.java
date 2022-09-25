package com.google.android.libraries.mdi.download;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.dn */
/* compiled from: PG */
public final class C29330dn extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C29330dn f79488g;

    /* renamed from: h */
    private static volatile C63010eb f79489h;

    /* renamed from: a */
    public int f79490a;

    /* renamed from: b */
    public long f79491b;

    /* renamed from: c */
    public long f79492c;

    /* renamed from: d */
    public long f79493d;

    /* renamed from: e */
    public long f79494e;

    /* renamed from: f */
    public int f79495f;

    static {
        C29330dn dnVar = new C29330dn();
        f79488g = dnVar;
        C62942bv.registerDefaultInstance(C29330dn.class, dnVar);
    }

    private C29330dn() {
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
                return newMessageInfo(f79488g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C29330dn();
            case 4:
                return new C29329dm();
            case 5:
                return f79488g;
            case 6:
                C63010eb ebVar = f79489h;
                if (ebVar == null) {
                    synchronized (C29330dn.class) {
                        ebVar = f79489h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79488g);
                            f79489h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
