package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.ab */
/* compiled from: PG */
public final class C19141ab extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f53613f = new C19198z();

    /* renamed from: i */
    public static final C19141ab f53614i;

    /* renamed from: j */
    private static volatile C63010eb f53615j;

    /* renamed from: a */
    public int f53616a;

    /* renamed from: b */
    public boolean f53617b;

    /* renamed from: c */
    public C19157ar f53618c;

    /* renamed from: d */
    public C19149aj f53619d;

    /* renamed from: e */
    public C62961ch f53620e = emptyIntList();

    /* renamed from: g */
    public C19153an f53621g;

    /* renamed from: h */
    public C19153an f53622h;

    static {
        C19141ab abVar = new C19141ab();
        f53614i = abVar;
        C62942bv.registerDefaultInstance(C19141ab.class, abVar);
    }

    private C19141ab() {
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
                return newMessageInfo(f53614i, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005\u001e\u0007ဉ\u0003\bဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C48667ab.m85254c(), C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C19141ab();
            case 4:
                return new C19140aa();
            case 5:
                return f53614i;
            case 6:
                C63010eb ebVar = f53615j;
                if (ebVar == null) {
                    synchronized (C19141ab.class) {
                        ebVar = f53615j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53614i);
                            f53615j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
