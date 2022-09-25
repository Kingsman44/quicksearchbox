package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yp */
/* compiled from: PG */
public final class C52623yp extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52623yp f138162g;

    /* renamed from: h */
    private static volatile C63010eb f138163h;

    /* renamed from: a */
    public int f138164a;

    /* renamed from: b */
    public C52627yt f138165b;

    /* renamed from: c */
    public C62971cq f138166c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f138167d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f138168e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f138169f = emptyProtobufList();

    static {
        C52623yp ypVar = new C52623yp();
        f138162g = ypVar;
        C62942bv.registerDefaultInstance(C52623yp.class, ypVar);
    }

    private C52623yp() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53896a() {
        C62971cq cqVar = this.f138166c;
        if (!cqVar.mo58948c()) {
            this.f138166c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo53897b() {
        C62971cq cqVar = this.f138168e;
        if (!cqVar.mo58948c()) {
            this.f138168e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: c */
    public final void mo53898c() {
        C62971cq cqVar = this.f138169f;
        if (!cqVar.mo58948c()) {
            this.f138169f = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f138162g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, C52621yn.class, "d", C52631yx.class, "e", C52619yl.class, C10662f.f35572a, C52629yv.class});
            case 3:
                return new C52623yp();
            case 4:
                return new C52622yo();
            case 5:
                return f138162g;
            case 6:
                C63010eb ebVar = f138163h;
                if (ebVar == null) {
                    synchronized (C52623yp.class) {
                        ebVar = f138163h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138162g);
                            f138163h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
