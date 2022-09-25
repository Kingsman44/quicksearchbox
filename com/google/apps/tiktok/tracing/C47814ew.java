package com.google.apps.tiktok.tracing;

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

/* renamed from: com.google.apps.tiktok.tracing.ew */
/* compiled from: PG */
public final class C47814ew extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C47814ew f123830i;

    /* renamed from: j */
    private static volatile C63010eb f123831j;

    /* renamed from: a */
    public int f123832a;

    /* renamed from: b */
    public long f123833b;

    /* renamed from: c */
    public long f123834c;

    /* renamed from: d */
    public C62971cq f123835d = emptyProtobufList();

    /* renamed from: e */
    public long f123836e;

    /* renamed from: f */
    public long f123837f;

    /* renamed from: g */
    public C47860t f123838g;

    /* renamed from: h */
    public int f123839h;

    static {
        C47814ew ewVar = new C47814ew();
        f123830i = ewVar;
        C62942bv.registerDefaultInstance(C47814ew.class, ewVar);
    }

    private C47814ew() {
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
                return newMessageInfo(f123830i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\nဉ\u0004\u000bဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C47556bg.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C47813ev.m84987b()});
            case 3:
                return new C47814ew();
            case 4:
                return new C47811et();
            case 5:
                return f123830i;
            case 6:
                C63010eb ebVar = f123831j;
                if (ebVar == null) {
                    synchronized (C47814ew.class) {
                        ebVar = f123831j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123830i);
                            f123831j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
