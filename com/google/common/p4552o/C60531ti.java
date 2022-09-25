package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.ti */
/* compiled from: PG */
public final class C60531ti extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C60531ti f163912l;

    /* renamed from: m */
    private static volatile C63010eb f163913m;

    /* renamed from: a */
    public int f163914a;

    /* renamed from: b */
    public int f163915b;

    /* renamed from: c */
    public C62971cq f163916c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f163917d = emptyProtobufList();

    /* renamed from: e */
    public C60329om f163918e;

    /* renamed from: f */
    public long f163919f;

    /* renamed from: g */
    public C60557uh f163920g;

    /* renamed from: h */
    public int f163921h;

    /* renamed from: i */
    public boolean f163922i;

    /* renamed from: j */
    public boolean f163923j;

    /* renamed from: k */
    public C60325oi f163924k;

    static {
        C60531ti tiVar = new C60531ti();
        f163912l = tiVar;
        C62942bv.registerDefaultInstance(C60531ti.class, tiVar);
    }

    private C60531ti() {
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
                return newMessageInfo(f163912l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005ဃ\u0002\u0006ဉ\u0003\u0007င\u0004\bဇ\u0005\tဇ\u0006\nဉ\u0007", new Object[]{"a", "b", C60537to.m92608b(), C45240c.f118157a, C60535tm.class, "d", C60529tg.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C60531ti();
            case 4:
                return new C60530th();
            case 5:
                return f163912l;
            case 6:
                C63010eb ebVar = f163913m;
                if (ebVar == null) {
                    synchronized (C60531ti.class) {
                        ebVar = f163913m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163912l);
                            f163913m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
