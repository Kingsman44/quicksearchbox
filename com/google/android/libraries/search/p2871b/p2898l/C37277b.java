package com.google.android.libraries.search.p2871b.p2898l;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.b.l.b */
/* compiled from: PG */
public final class C37277b extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C37277b f99049k;

    /* renamed from: l */
    private static volatile C63010eb f99050l;

    /* renamed from: a */
    public int f99051a;

    /* renamed from: b */
    public boolean f99052b;

    /* renamed from: c */
    public int f99053c;

    /* renamed from: d */
    public int f99054d;

    /* renamed from: e */
    public int f99055e;

    /* renamed from: f */
    public C62961ch f99056f = emptyIntList();

    /* renamed from: g */
    public boolean f99057g;

    /* renamed from: h */
    public long f99058h;

    /* renamed from: i */
    public int f99059i;

    /* renamed from: j */
    public C37279d f99060j;

    static {
        C37277b bVar = new C37277b();
        f99049k = bVar;
        C62942bv.registerDefaultInstance(C37277b.class, bVar);
    }

    private C37277b() {
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
                return newMessageInfo(f99049k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u0016\u0006ဇ\u0004\u0007ဂ\u0005\bင\u0006\tဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C37277b();
            case 4:
                return new C37276a();
            case 5:
                return f99049k;
            case 6:
                C63010eb ebVar = f99050l;
                if (ebVar == null) {
                    synchronized (C37277b.class) {
                        ebVar = f99050l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99049k);
                            f99050l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
