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

/* renamed from: com.google.ai.b.ue */
/* compiled from: PG */
public final class C8064ue extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C8064ue f28375j;

    /* renamed from: k */
    private static volatile C63010eb f28376k;

    /* renamed from: a */
    public int f28377a;

    /* renamed from: b */
    public C62971cq f28378b = emptyProtobufList();

    /* renamed from: c */
    public boolean f28379c;

    /* renamed from: d */
    public C8063ud f28380d;

    /* renamed from: e */
    public int f28381e;

    /* renamed from: f */
    public int f28382f;

    /* renamed from: g */
    public C8063ud f28383g;

    /* renamed from: h */
    public boolean f28384h;

    /* renamed from: i */
    public int f28385i;

    static {
        C8064ue ueVar = new C8064ue();
        f28375j = ueVar;
        C62942bv.registerDefaultInstance(C8064ue.class, ueVar);
    }

    private C8064ue() {
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
                return newMessageInfo(f28375j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဉ\u0001\u0004င\u0002\u0005င\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bင\u0006", new Object[]{"a", "b", C8060ua.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C8064ue();
            case 4:
                return new C8061ub();
            case 5:
                return f28375j;
            case 6:
                C63010eb ebVar = f28376k;
                if (ebVar == null) {
                    synchronized (C8064ue.class) {
                        ebVar = f28376k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28375j);
                            f28376k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
