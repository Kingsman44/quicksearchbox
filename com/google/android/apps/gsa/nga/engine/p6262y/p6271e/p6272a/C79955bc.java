package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

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

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bc */
/* compiled from: PG */
public final class C79955bc extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C79955bc f219276i;

    /* renamed from: j */
    private static volatile C63010eb f219277j;

    /* renamed from: a */
    public int f219278a;

    /* renamed from: b */
    public C79965bm f219279b;

    /* renamed from: c */
    public C79965bm f219280c;

    /* renamed from: d */
    public C79946au f219281d;

    /* renamed from: e */
    public C62971cq f219282e = emptyProtobufList();

    /* renamed from: f */
    public C79975bw f219283f;

    /* renamed from: g */
    public C80007da f219284g;

    /* renamed from: h */
    public int f219285h;

    static {
        C79955bc bcVar = new C79955bc();
        f219276i = bcVar;
        C62942bv.registerDefaultInstance(C79955bc.class, bcVar);
    }

    private C79955bc() {
        emptyProtobufList();
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
                return newMessageInfo(f219276i, "\u0001\u0007\u0000\u0001\u000b\u0013\u0007\u0000\u0001\u0000\u000bဉ\u0005\f\u001b\rဉ\b\u000fဉ\n\u0011ဉ\u0006\u0012ဉ\u0007\u0013င\u000b", new Object[]{"a", "b", "e", C79982cc.class, C10662f.f35572a, C30325g.f82003a, C45240c.f118157a, "d", C19618h.f54585a});
            case 3:
                return new C79955bc();
            case 4:
                return new C79954bb();
            case 5:
                return f219276i;
            case 6:
                C63010eb ebVar = f219277j;
                if (ebVar == null) {
                    synchronized (C79955bc.class) {
                        ebVar = f219277j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219276i);
                            f219277j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
