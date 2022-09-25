package com.google.p4283bv.p4345d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57053a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b */
/* compiled from: PG */
public final class C56964b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C56964b f152019j;

    /* renamed from: k */
    private static volatile C63010eb f152020k;

    /* renamed from: a */
    public int f152021a;

    /* renamed from: b */
    public String f152022b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f152023c;

    /* renamed from: d */
    public String f152024d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f152025e;

    /* renamed from: f */
    public int f152026f;

    /* renamed from: g */
    public String f152027g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f152028h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f152029i;

    static {
        C56964b bVar = new C56964b();
        f152019j = bVar;
        C62942bv.registerDefaultInstance(C56964b.class, bVar);
    }

    private C56964b() {
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
                return newMessageInfo(f152019j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဈ\u0006\bဈ\u0007\u000bင\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C57053a.f152308a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C56964b();
            case 4:
                return new C56950a();
            case 5:
                return f152019j;
            case 6:
                C63010eb ebVar = f152020k;
                if (ebVar == null) {
                    synchronized (C56964b.class) {
                        ebVar = f152020k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152019j);
                            f152020k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
