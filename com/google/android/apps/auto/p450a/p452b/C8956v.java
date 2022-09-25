package com.google.android.apps.auto.p450a.p452b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.auto.a.b.v */
/* compiled from: PG */
public final class C8956v extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C8956v f31033j;

    /* renamed from: l */
    private static volatile C63010eb f31034l;

    /* renamed from: a */
    public C63042fg f31035a;

    /* renamed from: b */
    public C63042fg f31036b;

    /* renamed from: c */
    public int f31037c;

    /* renamed from: d */
    public int f31038d;

    /* renamed from: e */
    public C8946l f31039e;

    /* renamed from: f */
    public C8948n f31040f;

    /* renamed from: g */
    public int f31041g;

    /* renamed from: h */
    public C63088z f31042h = C63088z.f170246b;

    /* renamed from: i */
    public C62971cq f31043i = emptyProtobufList();

    /* renamed from: k */
    private int f31044k;

    static {
        C8956v vVar = new C8956v();
        f31033j = vVar;
        C62942bv.registerDefaultInstance(C8956v.class, vVar);
    }

    private C8956v() {
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
                return newMessageInfo(f31033j, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007င\u0006\bည\u0007\n\u001b", new Object[]{C19621k.f54601a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C8944j.class});
            case 3:
                return new C8956v();
            case 4:
                return new C8955u();
            case 5:
                return f31033j;
            case 6:
                C63010eb ebVar = f31034l;
                if (ebVar == null) {
                    synchronized (C8956v.class) {
                        ebVar = f31034l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31033j);
                            f31034l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
