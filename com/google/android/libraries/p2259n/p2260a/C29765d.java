package com.google.android.libraries.p2259n.p2260a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62471cu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.n.a.d */
/* compiled from: PG */
public final class C29765d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C29765d f80663i;

    /* renamed from: j */
    private static volatile C63010eb f80664j;

    /* renamed from: a */
    public int f80665a;

    /* renamed from: b */
    public C63088z f80666b = C63088z.f170246b;

    /* renamed from: c */
    public String f80667c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f80668d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62471cu f80669e;

    /* renamed from: f */
    public int f80670f;

    /* renamed from: g */
    public int f80671g;

    /* renamed from: h */
    public boolean f80672h;

    static {
        C29765d dVar = new C29765d();
        f80663i = dVar;
        C62942bv.registerDefaultInstance(C29765d.class, dVar);
    }

    private C29765d() {
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
                return newMessageInfo(f80663i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ည\u0000\u0003ဉ\u0003\u0005ဌ\u0005\u0006င\u0006\u0007ဈ\u0001\bဈ\u0002\tဇ\u0007", new Object[]{"a", "b", "e", C10662f.f35572a, C29763b.m54881b(), C30325g.f82003a, C45240c.f118157a, "d", C19618h.f54585a});
            case 3:
                return new C29765d();
            case 4:
                return new C29764c();
            case 5:
                return f80663i;
            case 6:
                C63010eb ebVar = f80664j;
                if (ebVar == null) {
                    synchronized (C29765d.class) {
                        ebVar = f80664j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80663i);
                            f80664j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
