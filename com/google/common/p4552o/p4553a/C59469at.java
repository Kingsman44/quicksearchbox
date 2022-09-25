package com.google.common.p4552o.p4553a;

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

/* renamed from: com.google.common.o.a.at */
/* compiled from: PG */
public final class C59469at extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C59469at f157763k;

    /* renamed from: l */
    private static volatile C63010eb f157764l;

    /* renamed from: a */
    public int f157765a;

    /* renamed from: b */
    public long f157766b;

    /* renamed from: c */
    public long f157767c;

    /* renamed from: d */
    public int f157768d;

    /* renamed from: e */
    public int f157769e;

    /* renamed from: f */
    public int f157770f;

    /* renamed from: g */
    public C59463an f157771g;

    /* renamed from: h */
    public C63088z f157772h = C63088z.f170246b;

    /* renamed from: i */
    public C59461al f157773i;

    /* renamed from: j */
    public C62971cq f157774j = emptyProtobufList();

    static {
        C59469at atVar = new C59469at();
        f157763k = atVar;
        C62942bv.registerDefaultInstance(C59469at.class, atVar);
    }

    private C59469at() {
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
                return newMessageInfo(f157763k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ည\u0006\bဉ\u0007\t\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C59459aj.class});
            case 3:
                return new C59469at();
            case 4:
                return new C59468as();
            case 5:
                return f157763k;
            case 6:
                C63010eb ebVar = f157764l;
                if (ebVar == null) {
                    synchronized (C59469at.class) {
                        ebVar = f157764l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157763k);
                            f157764l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
