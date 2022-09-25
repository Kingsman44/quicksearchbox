package com.google.android.libraries.lens.view.p2067ak;

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

/* renamed from: com.google.android.libraries.lens.view.ak.m */
/* compiled from: PG */
public final class C25274m extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C25274m f68751i;

    /* renamed from: j */
    private static volatile C63010eb f68752j;

    /* renamed from: a */
    public boolean f68753a;

    /* renamed from: b */
    public int f68754b;

    /* renamed from: c */
    public int f68755c;

    /* renamed from: d */
    public int f68756d;

    /* renamed from: e */
    public boolean f68757e;

    /* renamed from: f */
    public boolean f68758f;

    /* renamed from: g */
    public int f68759g;

    /* renamed from: h */
    public C62995dn f68760h = C62995dn.f170057a;

    static {
        C25274m mVar = new C25274m();
        f68751i = mVar;
        C62942bv.registerDefaultInstance(C25274m.class, mVar);
    }

    private C25274m() {
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
                return newMessageInfo(f68751i, "\u0000\b\u0000\u0000\u0004\u000e\b\u0001\u0000\u0000\u0004\u0007\u0005\u0004\t\u0004\n\u0004\u000b\u0007\f\u0007\r\u0004\u000e2", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C25273l.f68750a});
            case 3:
                return new C25274m();
            case 4:
                return new C25272k();
            case 5:
                return f68751i;
            case 6:
                C63010eb ebVar = f68752j;
                if (ebVar == null) {
                    synchronized (C25274m.class) {
                        ebVar = f68752j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68751i);
                            f68752j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
