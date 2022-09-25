package com.google.android.libraries.gsa.p1868g.p1869a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.g.a.b */
/* compiled from: PG */
public final class C22816b extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C22816b f62819k;

    /* renamed from: l */
    private static volatile C63010eb f62820l;

    /* renamed from: a */
    public int f62821a;

    /* renamed from: b */
    public boolean f62822b;

    /* renamed from: c */
    public boolean f62823c;

    /* renamed from: d */
    public boolean f62824d;

    /* renamed from: e */
    public boolean f62825e;

    /* renamed from: f */
    public boolean f62826f;

    /* renamed from: g */
    public boolean f62827g;

    /* renamed from: h */
    public boolean f62828h;

    /* renamed from: i */
    public boolean f62829i;

    /* renamed from: j */
    public boolean f62830j;

    static {
        C22816b bVar = new C22816b();
        f62819k = bVar;
        C62942bv.registerDefaultInstance(C22816b.class, bVar);
    }

    private C22816b() {
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
                return newMessageInfo(f62819k, "\u0001\t\u0000\u0001\u0004\u000e\t\u0000\u0000\u0000\u0004ဇ\u0000\u0005ဇ\u0001\bဇ\u0002\tဇ\u0003\nဇ\u0004\u000bဇ\u0005\fဇ\u0006\rဇ\u0007\u000eဇ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C22816b();
            case 4:
                return new C22815a();
            case 5:
                return f62819k;
            case 6:
                C63010eb ebVar = f62820l;
                if (ebVar == null) {
                    synchronized (C22816b.class) {
                        ebVar = f62820l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62819k);
                            f62820l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
