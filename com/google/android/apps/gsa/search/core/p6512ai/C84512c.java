package com.google.android.apps.gsa.search.core.p6512ai;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60494rz;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.ai.c */
/* compiled from: PG */
public final class C84512c extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C84512c f230001h;

    /* renamed from: i */
    private static volatile C63010eb f230002i;

    /* renamed from: a */
    public int f230003a;

    /* renamed from: b */
    public int f230004b;

    /* renamed from: c */
    public boolean f230005c;

    /* renamed from: d */
    public boolean f230006d;

    /* renamed from: e */
    public C57566aj f230007e;

    /* renamed from: f */
    public boolean f230008f;

    /* renamed from: g */
    public boolean f230009g;

    static {
        C84512c cVar = new C84512c();
        f230001h = cVar;
        C62942bv.registerDefaultInstance(C84512c.class, cVar);
    }

    private C84512c() {
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
                return newMessageInfo(f230001h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C60494rz.m92599b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C84512c();
            case 4:
                return new C84511b();
            case 5:
                return f230001h;
            case 6:
                C63010eb ebVar = f230002i;
                if (ebVar == null) {
                    synchronized (C84512c.class) {
                        ebVar = f230002i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f230001h);
                            f230002i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
