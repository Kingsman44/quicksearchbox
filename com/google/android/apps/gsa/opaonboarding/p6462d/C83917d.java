package com.google.android.apps.gsa.opaonboarding.p6462d;

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

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.d */
/* compiled from: PG */
public final class C83917d extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C83917d f228552j;

    /* renamed from: k */
    private static volatile C63010eb f228553k;

    /* renamed from: a */
    public int f228554a;

    /* renamed from: b */
    public String f228555b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f228556c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f228557d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f228558e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f228559f;

    /* renamed from: g */
    public boolean f228560g;

    /* renamed from: h */
    public boolean f228561h;

    /* renamed from: i */
    public int f228562i;

    static {
        C83917d dVar = new C83917d();
        f228552j = dVar;
        C62942bv.registerDefaultInstance(C83917d.class, dVar);
    }

    private C83917d() {
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
                return newMessageInfo(f228552j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C83917d();
            case 4:
                return new C83916c();
            case 5:
                return f228552j;
            case 6:
                C63010eb ebVar = f228553k;
                if (ebVar == null) {
                    synchronized (C83917d.class) {
                        ebVar = f228553k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228552j);
                            f228553k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
