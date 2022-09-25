package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.lf */
/* compiled from: PG */
public final class C7822lf extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C7822lf f27432k;

    /* renamed from: l */
    private static volatile C63010eb f27433l;

    /* renamed from: a */
    public int f27434a;

    /* renamed from: b */
    public int f27435b;

    /* renamed from: c */
    public int f27436c;

    /* renamed from: d */
    public int f27437d;

    /* renamed from: e */
    public int f27438e;

    /* renamed from: f */
    public int f27439f;

    /* renamed from: g */
    public int f27440g;

    /* renamed from: h */
    public int f27441h;

    /* renamed from: i */
    public int f27442i;

    /* renamed from: j */
    public int f27443j;

    static {
        C7822lf lfVar = new C7822lf();
        f27432k = lfVar;
        C62942bv.registerDefaultInstance(C7822lf.class, lfVar);
    }

    private C7822lf() {
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
                return newMessageInfo(f27432k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0006\u0007င\u0007\bင\b\tင\u0002", new Object[]{"a", "b", C7820ld.f27431a, C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", "d"});
            case 3:
                return new C7822lf();
            case 4:
                return new C7819lc();
            case 5:
                return f27432k;
            case 6:
                C63010eb ebVar = f27433l;
                if (ebVar == null) {
                    synchronized (C7822lf.class) {
                        ebVar = f27433l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27432k);
                            f27433l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
