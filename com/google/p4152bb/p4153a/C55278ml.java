package com.google.p4152bb.p4153a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ml */
/* compiled from: PG */
public final class C55278ml extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C55278ml f145593i;

    /* renamed from: j */
    public static final C62940bt f145594j;

    /* renamed from: k */
    private static volatile C63010eb f145595k;

    /* renamed from: a */
    public int f145596a;

    /* renamed from: b */
    public int f145597b;

    /* renamed from: c */
    public int f145598c;

    /* renamed from: d */
    public int f145599d;

    /* renamed from: e */
    public int f145600e;

    /* renamed from: f */
    public int f145601f;

    /* renamed from: g */
    public int f145602g;

    /* renamed from: h */
    public int f145603h;

    static {
        C55278ml mlVar = new C55278ml();
        f145593i = mlVar;
        C62942bv.registerDefaultInstance(C55278ml.class, mlVar);
        f145594j = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, mlVar, mlVar, (C62958ce) null, 80138035, C63066gd.MESSAGE, C55278ml.class);
    }

    private C55278ml() {
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
                return newMessageInfo(f145593i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0007င\u0006\bဌ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C55276mj.f145592a});
            case 3:
                return new C55278ml();
            case 4:
                return new C55275mi();
            case 5:
                return f145593i;
            case 6:
                C63010eb ebVar = f145595k;
                if (ebVar == null) {
                    synchronized (C55278ml.class) {
                        ebVar = f145595k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145593i);
                            f145595k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
