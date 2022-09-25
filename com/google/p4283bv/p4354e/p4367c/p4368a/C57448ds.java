package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ds */
/* compiled from: PG */
public final class C57448ds extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C57448ds f153453f;

    /* renamed from: i */
    private static volatile C63010eb f153454i;

    /* renamed from: a */
    public int f153455a = 0;

    /* renamed from: b */
    public Object f153456b;

    /* renamed from: c */
    public int f153457c;

    /* renamed from: d */
    public int f153458d;

    /* renamed from: e */
    public boolean f153459e;

    /* renamed from: g */
    private int f153460g;

    /* renamed from: h */
    private byte f153461h = 2;

    static {
        C57448ds dsVar = new C57448ds();
        f153453f = dsVar;
        C62942bv.registerDefaultInstance(C57448ds.class, dsVar);
    }

    private C57448ds() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153461h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153461h = b;
                return null;
            case 2:
                return newMessageInfo(f153453f, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0005\u0004ှ\u0000\u0005ှ\u0000\u0006ှ\u0000", new Object[]{"b", "a", C30325g.f82003a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C57448ds();
            case 4:
                return new C57447dr();
            case 5:
                return f153453f;
            case 6:
                C63010eb ebVar = f153454i;
                if (ebVar == null) {
                    synchronized (C57448ds.class) {
                        ebVar = f153454i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153453f);
                            f153454i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
