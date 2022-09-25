package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.p2905a.C37323b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.bo */
/* compiled from: PG */
public final class C37410bo extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C37410bo f99330k;

    /* renamed from: l */
    private static volatile C63010eb f99331l;

    /* renamed from: a */
    public int f99332a;

    /* renamed from: b */
    public int f99333b = 0;

    /* renamed from: c */
    public Object f99334c;

    /* renamed from: d */
    public int f99335d = 0;

    /* renamed from: e */
    public Object f99336e;

    /* renamed from: f */
    public C37360ay f99337f;

    /* renamed from: g */
    public boolean f99338g;

    /* renamed from: h */
    public boolean f99339h;

    /* renamed from: i */
    public boolean f99340i;

    /* renamed from: j */
    public boolean f99341j;

    static {
        C37410bo boVar = new C37410bo();
        f99330k = boVar;
        C62942bv.registerDefaultInstance(C37410bo.class, boVar);
    }

    private C37410bo() {
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
                return newMessageInfo(f99330k, "\u0001\u000b\u0002\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0003ြ\u0000\u0004ဇ\u0005\u0005ျ\u0000\u0006ဇ\u0006\n်\u0000\u000bဇ\u0007\fြ\u0001\rြ\u0000\u000eဿ\u0001\u000fဇ\n", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C37655hb.class, C30325g.f82003a, C19618h.f54585a, "i", C37323b.class, C37703if.class, C39226b.m68656b(), "j"});
            case 3:
                return new C37410bo();
            case 4:
                return new C37409bn();
            case 5:
                return f99330k;
            case 6:
                C63010eb ebVar = f99331l;
                if (ebVar == null) {
                    synchronized (C37410bo.class) {
                        ebVar = f99331l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99330k);
                            f99331l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
