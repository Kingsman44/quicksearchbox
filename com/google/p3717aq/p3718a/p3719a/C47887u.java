package com.google.p3717aq.p3718a.p3719a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.C48884b;
import com.google.assistant.p3803ag.C49157d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.a.a.u */
/* compiled from: PG */
public final class C47887u extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C47887u f123976l;

    /* renamed from: n */
    private static volatile C63010eb f123977n;

    /* renamed from: a */
    public int f123978a = 0;

    /* renamed from: b */
    public Object f123979b;

    /* renamed from: c */
    public int f123980c = 0;

    /* renamed from: d */
    public Object f123981d;

    /* renamed from: e */
    public int f123982e = 0;

    /* renamed from: f */
    public Object f123983f;

    /* renamed from: g */
    public C47868b f123984g;

    /* renamed from: h */
    public int f123985h;

    /* renamed from: i */
    public C62971cq f123986i;

    /* renamed from: j */
    public int f123987j;

    /* renamed from: k */
    public C47884r f123988k;

    /* renamed from: m */
    private byte f123989m = 2;

    static {
        C47887u uVar = new C47887u();
        f123976l = uVar;
        C62942bv.registerDefaultInstance(C47887u.class, uVar);
    }

    private C47887u() {
        C62942bv.emptyProtobufList();
        this.f123986i = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo51704a() {
        C62971cq cqVar = this.f123986i;
        if (!cqVar.mo58948c()) {
            this.f123986i = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f123989m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f123989m = b;
                return null;
            case 2:
                return newMessageInfo(f123976l, "\u0000\f\u0003\u0000\u0001\u0014\f\u0000\u0001\u0004\u0001Ȼ\u0000\u0006\t\u0007Ȼ\u0001\bȻ\u0002\tЛ\u000b\f\rм\u0000\u000eм\u0001\u000fм\u0002\u0011\f\u0013\t\u0014?\u0002", new Object[]{"b", "a", "d", C45240c.f118157a, C10662f.f35572a, "e", C30325g.f82003a, "i", C47875i.class, "j", C48884b.class, C48884b.class, C49157d.class, C19618h.f54585a, C19621k.f54601a});
            case 3:
                return new C47887u();
            case 4:
                return new C47872f();
            case 5:
                return f123976l;
            case 6:
                C63010eb ebVar = f123977n;
                if (ebVar == null) {
                    synchronized (C47887u.class) {
                        ebVar = f123977n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123976l);
                            f123977n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
