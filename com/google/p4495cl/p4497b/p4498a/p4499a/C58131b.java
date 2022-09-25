package com.google.p4495cl.p4497b.p4498a.p4499a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.cl.b.a.a.b */
/* compiled from: PG */
public final class C58131b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C58131b f155403h;

    /* renamed from: i */
    private static volatile C63010eb f155404i;

    /* renamed from: a */
    public int f155405a;

    /* renamed from: b */
    public C63088z f155406b = C63088z.f170246b;

    /* renamed from: c */
    public C62961ch f155407c = emptyIntList();

    /* renamed from: d */
    public long f155408d;

    /* renamed from: e */
    public C62961ch f155409e = emptyIntList();

    /* renamed from: f */
    public C62971cq f155410f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public C58135f f155411g;

    static {
        C58131b bVar = new C58131b();
        f155403h = bVar;
        C62942bv.registerDefaultInstance(C58131b.class, bVar);
    }

    private C58131b() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo54675a() {
        C62961ch chVar = this.f155409e;
        if (!chVar.mo58948c()) {
            this.f155409e = C62942bv.mutableCopy(chVar);
        }
    }

    /* renamed from: b */
    public final void mo54676b() {
        C62971cq cqVar = this.f155410f;
        if (!cqVar.mo58948c()) {
            this.f155410f = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f155403h, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0003\u0000\u0001'\u0002ဂ\u0001\u0003'\tဉ\u0004\n\u001a\rည\u0000", new Object[]{"a", C45240c.f118157a, "d", "e", C30325g.f82003a, C10662f.f35572a, "b"});
            case 3:
                return new C58131b();
            case 4:
                return new C58130a();
            case 5:
                return f155403h;
            case 6:
                C63010eb ebVar = f155404i;
                if (ebVar == null) {
                    synchronized (C58131b.class) {
                        ebVar = f155404i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155403h);
                            f155404i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
