package com.google.lens.p4699e;

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

/* renamed from: com.google.lens.e.aw */
/* compiled from: PG */
public final class C62210aw extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C62210aw f167963i;

    /* renamed from: j */
    private static volatile C63010eb f167964j;

    /* renamed from: a */
    public int f167965a;

    /* renamed from: b */
    public int f167966b;

    /* renamed from: c */
    public int f167967c;

    /* renamed from: d */
    public C62971cq f167968d = emptyProtobufList();

    /* renamed from: e */
    public C62218bd f167969e;

    /* renamed from: f */
    public C63088z f167970f = C63088z.f170246b;

    /* renamed from: g */
    public int f167971g;

    /* renamed from: h */
    public int f167972h;

    static {
        C62210aw awVar = new C62210aw();
        f167963i = awVar;
        C62942bv.registerDefaultInstance(C62210aw.class, awVar);
    }

    private C62210aw() {
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
                return newMessageInfo(f167963i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0005\u001b\u0006ည\u0004\u0007င\u0005\bင\u0006", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C62209av.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C62210aw();
            case 4:
                return new C62207at();
            case 5:
                return f167963i;
            case 6:
                C63010eb ebVar = f167964j;
                if (ebVar == null) {
                    synchronized (C62210aw.class) {
                        ebVar = f167964j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167963i);
                            f167964j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
