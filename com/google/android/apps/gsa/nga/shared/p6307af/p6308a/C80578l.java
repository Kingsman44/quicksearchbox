package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.l */
/* compiled from: PG */
public final class C80578l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C80578l f221173g;

    /* renamed from: i */
    private static volatile C63010eb f221174i;

    /* renamed from: a */
    public int f221175a = 0;

    /* renamed from: b */
    public Object f221176b;

    /* renamed from: c */
    public boolean f221177c;

    /* renamed from: d */
    public C63088z f221178d = C63088z.f170246b;

    /* renamed from: e */
    public C63088z f221179e = C63088z.f170246b;

    /* renamed from: f */
    public boolean f221180f;

    /* renamed from: h */
    private byte f221181h = 2;

    static {
        C80578l lVar = new C80578l();
        f221173g = lVar;
        C62942bv.registerDefaultInstance(C80578l.class, lVar);
    }

    private C80578l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221181h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221181h = b;
                return null;
            case 2:
                return newMessageInfo(f221173g, "\u0000\u0007\u0001\u0000\u0002\b\u0007\u0000\u0000\u0001\u0002Ȼ\u0000\u0003<\u0000\u0004\u0007\u0005\n\u0006\n\u0007\u0007\bм\u0000", new Object[]{"b", "a", C80576j.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C80401n.class});
            case 3:
                return new C80578l();
            case 4:
                return new C80577k();
            case 5:
                return f221173g;
            case 6:
                C63010eb ebVar = f221174i;
                if (ebVar == null) {
                    synchronized (C80578l.class) {
                        ebVar = f221174i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221173g);
                            f221174i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
