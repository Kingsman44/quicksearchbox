package com.google.protos.p4953bc.p4955b.p4956a.p4957a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.b.a.a.t */
/* compiled from: PG */
public final class C64429t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64429t f174759d;

    /* renamed from: i */
    private static volatile C63010eb f174760i;

    /* renamed from: a */
    public int f174761a;

    /* renamed from: b */
    public C64423n f174762b;

    /* renamed from: c */
    public C64417h f174763c;

    /* renamed from: e */
    private C62995dn f174764e = C62995dn.f170057a;

    /* renamed from: f */
    private C62995dn f174765f;

    /* renamed from: g */
    private C62995dn f174766g;

    /* renamed from: h */
    private C62995dn f174767h;

    static {
        C64429t tVar = new C64429t();
        f174759d = tVar;
        C62942bv.registerDefaultInstance(C64429t.class, tVar);
    }

    private C64429t() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f174765f = dnVar;
        this.f174766g = dnVar;
        this.f174767h = dnVar;
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
                return newMessageInfo(f174759d, "\u0001\u0006\u0000\u0001\u0001\u0013\u0006\u0004\u0000\u0000\u0001ဉ\u0000\b2\tဉ\r\n2\u00122\u00132", new Object[]{"a", "b", "e", C64425p.f174756a, C45240c.f118157a, C30325g.f82003a, C64426q.f174757a, C10662f.f35572a, C64424o.f174755a, C19618h.f54585a, C64427r.f174758a});
            case 3:
                return new C64429t();
            case 4:
                return new C64428s();
            case 5:
                return f174759d;
            case 6:
                C63010eb ebVar = f174760i;
                if (ebVar == null) {
                    synchronized (C64429t.class) {
                        ebVar = f174760i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174759d);
                            f174760i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
