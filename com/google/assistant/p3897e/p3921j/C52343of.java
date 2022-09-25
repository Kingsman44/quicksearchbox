package com.google.assistant.p3897e.p3921j;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.of */
/* compiled from: PG */
public final class C52343of extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C52343of f137384i;

    /* renamed from: j */
    private static volatile C63010eb f137385j;

    /* renamed from: a */
    public int f137386a;

    /* renamed from: b */
    public C63088z f137387b = C63088z.f170246b;

    /* renamed from: c */
    public int f137388c;

    /* renamed from: d */
    public C62971cq f137389d = emptyProtobufList();

    /* renamed from: e */
    public int f137390e;

    /* renamed from: f */
    public int f137391f;

    /* renamed from: g */
    public int f137392g;

    /* renamed from: h */
    public int f137393h;

    static {
        C52343of ofVar = new C52343of();
        f137384i = ofVar;
        C62942bv.registerDefaultInstance(C52343of.class, ofVar);
    }

    private C52343of() {
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
                return newMessageInfo(f137384i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ည\u0000\u0002ဌ\u0001\u0003\u001b\u0004င\u0002\u0005င\u0003\u0006င\u0004\u0007င\u0005", new Object[]{"a", "b", C45240c.f118157a, C52342oe.f137383a, "d", C52334nx.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C52343of();
            case 4:
                return new C52341od();
            case 5:
                return f137384i;
            case 6:
                C63010eb ebVar = f137385j;
                if (ebVar == null) {
                    synchronized (C52343of.class) {
                        ebVar = f137385j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137384i);
                            f137385j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
