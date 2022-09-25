package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.io */
/* compiled from: PG */
public final class C59991io extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C59991io f162127m;

    /* renamed from: n */
    private static volatile C63010eb f162128n;

    /* renamed from: a */
    public int f162129a;

    /* renamed from: b */
    public long f162130b;

    /* renamed from: c */
    public long f162131c;

    /* renamed from: d */
    public long f162132d;

    /* renamed from: e */
    public long f162133e;

    /* renamed from: f */
    public long f162134f;

    /* renamed from: g */
    public String f162135g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f162136h;

    /* renamed from: i */
    public String f162137i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public long f162138j;

    /* renamed from: k */
    public long f162139k;

    /* renamed from: l */
    public long f162140l;

    static {
        C59991io ioVar = new C59991io();
        f162127m = ioVar;
        C62942bv.registerDefaultInstance(C59991io.class, ioVar);
    }

    private C59991io() {
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
                return newMessageInfo(f162127m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဈ\u0005\tဌ\b\nဈ\t\u000bဃ\n\fဃ\u000b\rဃ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C59990in.f162126a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C59991io();
            case 4:
                return new C59989im();
            case 5:
                return f162127m;
            case 6:
                C63010eb ebVar = f162128n;
                if (ebVar == null) {
                    synchronized (C59991io.class) {
                        ebVar = f162128n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162127m);
                            f162128n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
