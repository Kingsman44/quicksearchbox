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

/* renamed from: com.google.ai.b.ua */
/* compiled from: PG */
public final class C8060ua extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C8060ua f28360i;

    /* renamed from: j */
    private static volatile C63010eb f28361j;

    /* renamed from: a */
    public int f28362a;

    /* renamed from: b */
    public C8150xj f28363b;

    /* renamed from: c */
    public C62971cq f28364c = emptyProtobufList();

    /* renamed from: d */
    public int f28365d;

    /* renamed from: e */
    public C62971cq f28366e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f28367f = emptyProtobufList();

    /* renamed from: g */
    public C7893nw f28368g;

    /* renamed from: h */
    public boolean f28369h;

    static {
        C8060ua uaVar = new C8060ua();
        f28360i = uaVar;
        C62942bv.registerDefaultInstance(C8060ua.class, uaVar);
    }

    private C8060ua() {
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
                return newMessageInfo(f28360i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004\u001b\u0005\u001b\u0006ဉ\u0002\u0007ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, C8150xj.class, "d", "e", C7818lb.class, C10662f.f35572a, C7818lb.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C8060ua();
            case 4:
                return new C8058tz();
            case 5:
                return f28360i;
            case 6:
                C63010eb ebVar = f28361j;
                if (ebVar == null) {
                    synchronized (C8060ua.class) {
                        ebVar = f28361j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28360i);
                            f28361j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
