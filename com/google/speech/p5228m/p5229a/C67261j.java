package com.google.speech.p5228m.p5229a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.a.j */
/* compiled from: PG */
public final class C67261j extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C67261j f182827i;

    /* renamed from: j */
    private static volatile C63010eb f182828j;

    /* renamed from: a */
    public int f182829a;

    /* renamed from: b */
    public boolean f182830b;

    /* renamed from: c */
    public boolean f182831c;

    /* renamed from: d */
    public boolean f182832d;

    /* renamed from: e */
    public boolean f182833e;

    /* renamed from: f */
    public boolean f182834f;

    /* renamed from: g */
    public boolean f182835g;

    /* renamed from: h */
    public boolean f182836h;

    static {
        C67261j jVar = new C67261j();
        f182827i = jVar;
        C62942bv.registerDefaultInstance(C67261j.class, jVar);
    }

    private C67261j() {
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
                return newMessageInfo(f182827i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C67261j();
            case 4:
                return new C67260i();
            case 5:
                return f182827i;
            case 6:
                C63010eb ebVar = f182828j;
                if (ebVar == null) {
                    synchronized (C67261j.class) {
                        ebVar = f182828j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182827i);
                            f182828j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
