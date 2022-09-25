package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.nl */
/* compiled from: PG */
public final class C7882nl extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C7882nl f27651i;

    /* renamed from: j */
    private static volatile C63010eb f27652j;

    /* renamed from: a */
    public int f27653a;

    /* renamed from: b */
    public int f27654b = 1;

    /* renamed from: c */
    public C62971cq f27655c = emptyProtobufList();

    /* renamed from: d */
    public int f27656d;

    /* renamed from: e */
    public int f27657e = 1;

    /* renamed from: f */
    public int f27658f;

    /* renamed from: g */
    public C62971cq f27659g = emptyProtobufList();

    /* renamed from: h */
    public int f27660h;

    static {
        C7882nl nlVar = new C7882nl();
        f27651i = nlVar;
        C62942bv.registerDefaultInstance(C7882nl.class, nlVar);
    }

    private C7882nl() {
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
                return newMessageInfo(f27651i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003င\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006\u001b\u0007င\u0004", new Object[]{"a", "b", C7880nj.m22885b(), C45240c.f118157a, C7887nq.class, "d", "e", C7877ng.f27618a, C10662f.f35572a, C7891nu.m22888b(), C30325g.f82003a, C7887nq.class, C19618h.f54585a});
            case 3:
                return new C7882nl();
            case 4:
                return new C7881nk();
            case 5:
                return f27651i;
            case 6:
                C63010eb ebVar = f27652j;
                if (ebVar == null) {
                    synchronized (C7882nl.class) {
                        ebVar = f27652j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27651i);
                            f27652j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
