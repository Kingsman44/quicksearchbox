package com.google.android.libraries.lens.view.p2069am;

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

/* renamed from: com.google.android.libraries.lens.view.am.bg */
/* compiled from: PG */
public final class C25326bg extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C25326bg f68902l;

    /* renamed from: m */
    private static volatile C63010eb f68903m;

    /* renamed from: a */
    public int f68904a;

    /* renamed from: b */
    public int f68905b;

    /* renamed from: c */
    public int f68906c;

    /* renamed from: d */
    public int f68907d;

    /* renamed from: e */
    public int f68908e;

    /* renamed from: f */
    public int f68909f;

    /* renamed from: g */
    public int f68910g;

    /* renamed from: h */
    public int f68911h;

    /* renamed from: i */
    public int f68912i;

    /* renamed from: j */
    public int f68913j;

    /* renamed from: k */
    public int f68914k;

    static {
        C25326bg bgVar = new C25326bg();
        f68902l = bgVar;
        C62942bv.registerDefaultInstance(C25326bg.class, bgVar);
    }

    private C25326bg() {
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
                return newMessageInfo(f68902l, "\u0000\u000b\u0000\u0000\u0001\f\u000b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0004\u000b\u0004\f\u0004", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, "i", "j", C19621k.f54601a, C45240c.f118157a, C19618h.f54585a});
            case 3:
                return new C25326bg();
            case 4:
                return new C25325bf();
            case 5:
                return f68902l;
            case 6:
                C63010eb ebVar = f68903m;
                if (ebVar == null) {
                    synchronized (C25326bg.class) {
                        ebVar = f68903m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68902l);
                            f68903m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
