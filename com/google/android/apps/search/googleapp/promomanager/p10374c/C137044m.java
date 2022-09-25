package com.google.android.apps.search.googleapp.promomanager.p10374c;

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
import com.google.protobuf.C63042fg;
import com.google.protos.p4880aq.C63733av;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.c.m */
/* compiled from: PG */
public final class C137044m extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C137044m f372948m;

    /* renamed from: n */
    private static volatile C63010eb f372949n;

    /* renamed from: a */
    public int f372950a;

    /* renamed from: b */
    public int f372951b;

    /* renamed from: c */
    public int f372952c;

    /* renamed from: d */
    public C63042fg f372953d;

    /* renamed from: e */
    public int f372954e;

    /* renamed from: f */
    public C63042fg f372955f;

    /* renamed from: g */
    public int f372956g;

    /* renamed from: h */
    public C63042fg f372957h;

    /* renamed from: i */
    public int f372958i;

    /* renamed from: j */
    public C63042fg f372959j;

    /* renamed from: k */
    public C137035d f372960k;

    /* renamed from: l */
    public C63733av f372961l;

    static {
        C137044m mVar = new C137044m();
        f372948m = mVar;
        C62942bv.registerDefaultInstance(C137044m.class, mVar);
    }

    private C137044m() {
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
                return newMessageInfo(f372948m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004င\u0005\u0005ဉ\u0006\u0006င\u0007\u0007ဉ\b\bဉ\t\tဉ\n\nင\u0003\u000bဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "e", C10662f.f35572a});
            case 3:
                return new C137044m();
            case 4:
                return new C137043l();
            case 5:
                return f372948m;
            case 6:
                C63010eb ebVar = f372949n;
                if (ebVar == null) {
                    synchronized (C137044m.class) {
                        ebVar = f372949n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372948m);
                            f372949n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
