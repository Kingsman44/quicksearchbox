package com.google.assistant.p3860as;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bt */
/* compiled from: PG */
public final class C49784bt extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C49784bt f128552i;

    /* renamed from: j */
    private static volatile C63010eb f128553j;

    /* renamed from: a */
    public int f128554a;

    /* renamed from: b */
    public double f128555b;

    /* renamed from: c */
    public double f128556c;

    /* renamed from: d */
    public double f128557d;

    /* renamed from: e */
    public double f128558e;

    /* renamed from: f */
    public double f128559f;

    /* renamed from: g */
    public double f128560g;

    /* renamed from: h */
    public boolean f128561h;

    static {
        C49784bt btVar = new C49784bt();
        f128552i = btVar;
        C62942bv.registerDefaultInstance(C49784bt.class, btVar);
    }

    private C49784bt() {
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
                return newMessageInfo(f128552i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0005က\u0005\u0006က\u0006\u0007ဇ\u0007\bက\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "e"});
            case 3:
                return new C49784bt();
            case 4:
                return new C49783bs();
            case 5:
                return f128552i;
            case 6:
                C63010eb ebVar = f128553j;
                if (ebVar == null) {
                    synchronized (C49784bt.class) {
                        ebVar = f128553j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128552i);
                            f128553j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
