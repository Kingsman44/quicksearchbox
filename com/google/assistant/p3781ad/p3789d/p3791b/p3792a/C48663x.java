package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.x */
/* compiled from: PG */
public final class C48663x extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C48663x f125761i;

    /* renamed from: j */
    private static volatile C63010eb f125762j;

    /* renamed from: a */
    public long f125763a;

    /* renamed from: b */
    public long f125764b;

    /* renamed from: c */
    public long f125765c;

    /* renamed from: d */
    public long f125766d;

    /* renamed from: e */
    public long f125767e;

    /* renamed from: f */
    public long f125768f;

    /* renamed from: g */
    public long f125769g;

    /* renamed from: h */
    public long f125770h;

    static {
        C48663x xVar = new C48663x();
        f125761i = xVar;
        C62942bv.registerDefaultInstance(C48663x.class, xVar);
    }

    private C48663x() {
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
                return newMessageInfo(f125761i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C48663x();
            case 4:
                return new C48662w();
            case 5:
                return f125761i;
            case 6:
                C63010eb ebVar = f125762j;
                if (ebVar == null) {
                    synchronized (C48663x.class) {
                        ebVar = f125762j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125761i);
                            f125762j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
