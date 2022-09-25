package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.js */
/* compiled from: PG */
public final class C87953js extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C87953js f237872i;

    /* renamed from: j */
    private static volatile C63010eb f237873j;

    /* renamed from: a */
    public int f237874a;

    /* renamed from: b */
    public C87942jh f237875b;

    /* renamed from: c */
    public C87952jr f237876c;

    /* renamed from: d */
    public C87950jp f237877d;

    /* renamed from: e */
    public C87940jf f237878e;

    /* renamed from: f */
    public C87948jn f237879f;

    /* renamed from: g */
    public C87946jl f237880g;

    /* renamed from: h */
    public C87944jj f237881h;

    static {
        C87953js jsVar = new C87953js();
        f237872i = jsVar;
        C62942bv.registerDefaultInstance(C87953js.class, jsVar);
    }

    private C87953js() {
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
                return newMessageInfo(f237872i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C87953js();
            case 4:
                return new C87938jd();
            case 5:
                return f237872i;
            case 6:
                C63010eb ebVar = f237873j;
                if (ebVar == null) {
                    synchronized (C87953js.class) {
                        ebVar = f237873j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237872i);
                            f237873j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
