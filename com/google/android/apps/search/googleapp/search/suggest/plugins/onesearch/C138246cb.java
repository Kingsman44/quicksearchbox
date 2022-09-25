package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cb */
/* compiled from: PG */
public final class C138246cb extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C138246cb f376127h;

    /* renamed from: i */
    private static volatile C63010eb f376128i;

    /* renamed from: a */
    public int f376129a;

    /* renamed from: b */
    public C62971cq f376130b = emptyProtobufList();

    /* renamed from: c */
    public long f376131c;

    /* renamed from: d */
    public long f376132d;

    /* renamed from: e */
    public C62964ck f376133e = emptyLongList();

    /* renamed from: f */
    public C62964ck f376134f = emptyLongList();

    /* renamed from: g */
    public int f376135g;

    static {
        C138246cb cbVar = new C138246cb();
        f376127h = cbVar;
        C62942bv.registerDefaultInstance(C138246cb.class, cbVar);
    }

    private C138246cb() {
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
                return newMessageInfo(f376127h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u001b\u0002ဃ\u0000\u0003ဃ\u0001\u0004&\u0005&\u0006ဌ\u0002", new Object[]{"a", "b", C138208bp.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C138171af.m224537b()});
            case 3:
                return new C138246cb();
            case 4:
                return new C138220ca();
            case 5:
                return f376127h;
            case 6:
                C63010eb ebVar = f376128i;
                if (ebVar == null) {
                    synchronized (C138246cb.class) {
                        ebVar = f376128i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376127h);
                            f376128i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
