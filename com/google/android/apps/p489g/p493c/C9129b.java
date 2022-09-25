package com.google.android.apps.p489g.p493c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7805kp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.c.b */
/* compiled from: PG */
public final class C9129b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9129b f31416f;

    /* renamed from: h */
    private static volatile C63010eb f31417h;

    /* renamed from: a */
    public int f31418a;

    /* renamed from: b */
    public C62971cq f31419b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f31420c = emptyProtobufList();

    /* renamed from: d */
    public long f31421d;

    /* renamed from: e */
    public C7805kp f31422e;

    /* renamed from: g */
    private byte f31423g = 2;

    static {
        C9129b bVar = new C9129b();
        f31416f = bVar;
        C62942bv.registerDefaultInstance(C9129b.class, bVar);
    }

    private C9129b() {
    }

    /* renamed from: a */
    public final void mo17434a() {
        C62971cq cqVar = this.f31419b;
        if (!cqVar.mo58948c()) {
            this.f31419b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo17435b() {
        C62971cq cqVar = this.f31420c;
        if (!cqVar.mo58948c()) {
            this.f31420c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31423g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31423g = b;
                return null;
            case 2:
                return newMessageInfo(f31416f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဂ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", C9133f.class, C45240c.f118157a, C9135h.class, "d", "e"});
            case 3:
                return new C9129b();
            case 4:
                return new C9128a();
            case 5:
                return f31416f;
            case 6:
                C63010eb ebVar = f31417h;
                if (ebVar == null) {
                    synchronized (C9129b.class) {
                        ebVar = f31417h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31416f);
                            f31417h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
