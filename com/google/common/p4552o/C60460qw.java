package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qw */
/* compiled from: PG */
public final class C60460qw extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C60460qw f163615i;

    /* renamed from: j */
    private static volatile C63010eb f163616j;

    /* renamed from: a */
    public int f163617a;

    /* renamed from: b */
    public int f163618b = 1;

    /* renamed from: c */
    public int f163619c = 1;

    /* renamed from: d */
    public String f163620d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f163621e;

    /* renamed from: f */
    public int f163622f;

    /* renamed from: g */
    public long f163623g;

    /* renamed from: h */
    public int f163624h;

    static {
        C60460qw qwVar = new C60460qw();
        f163615i = qwVar;
        C62942bv.registerDefaultInstance(C60460qw.class, qwVar);
    }

    private C60460qw() {
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
                return newMessageInfo(f163615i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0006ဌ\u0005\u0007ဂ\u0006\bင\u0007", new Object[]{"a", "b", C60457qt.f163613a, C45240c.f118157a, C60462qy.m92591b(), "d", "e", C10662f.f35572a, C60458qu.f163614a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C60460qw();
            case 4:
                return new C60459qv();
            case 5:
                return f163615i;
            case 6:
                C63010eb ebVar = f163616j;
                if (ebVar == null) {
                    synchronized (C60460qw.class) {
                        ebVar = f163616j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163615i);
                            f163616j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
