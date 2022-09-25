package com.google.common.p4552o;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fv */
/* compiled from: PG */
public final class C59794fv extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C59794fv f161570i;

    /* renamed from: j */
    private static volatile C63010eb f161571j;

    /* renamed from: a */
    public int f161572a;

    /* renamed from: b */
    public int f161573b = 268;

    /* renamed from: c */
    public int f161574c = 268;

    /* renamed from: d */
    public int f161575d;

    /* renamed from: e */
    public int f161576e;

    /* renamed from: f */
    public long f161577f;

    /* renamed from: g */
    public long f161578g;

    /* renamed from: h */
    public int f161579h;

    static {
        C59794fv fvVar = new C59794fv();
        f161570i = fvVar;
        C62942bv.registerDefaultInstance(C59794fv.class, fvVar);
    }

    private C59794fv() {
        emptyIntList();
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
                return newMessageInfo(f161570i, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\bဌ\u0002\tဃ\u0004\nဃ\u0005\u000bဋ\u0006\u000eင\u0003", new Object[]{"a", "b", C118575h.m196866b(), C45240c.f118157a, C118575h.m196866b(), "d", C118569b.m196860b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "e"});
            case 3:
                return new C59794fv();
            case 4:
                return new C59793fu();
            case 5:
                return f161570i;
            case 6:
                C63010eb ebVar = f161571j;
                if (ebVar == null) {
                    synchronized (C59794fv.class) {
                        ebVar = f161571j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161570i);
                            f161571j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
