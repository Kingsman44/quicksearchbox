package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.l */
/* compiled from: PG */
public final class C53801l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53801l f141209g;

    /* renamed from: h */
    private static volatile C63010eb f141210h;

    /* renamed from: a */
    public int f141211a;

    /* renamed from: b */
    public C62971cq f141212b = emptyProtobufList();

    /* renamed from: c */
    public C53743aa f141213c;

    /* renamed from: d */
    public C53743aa f141214d;

    /* renamed from: e */
    public C53747ae f141215e;

    /* renamed from: f */
    public C53791bv f141216f;

    static {
        C53801l lVar = new C53801l();
        f141209g = lVar;
        C62942bv.registerDefaultInstance(C53801l.class, lVar);
    }

    private C53801l() {
    }

    /* renamed from: a */
    public final void mo54017a() {
        C62971cq cqVar = this.f141212b;
        if (!cqVar.mo58948c()) {
            this.f141212b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f141209g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", C53745ac.class, "e", C10662f.f35572a, C45240c.f118157a, "d"});
            case 3:
                return new C53801l();
            case 4:
                return new C53800k();
            case 5:
                return f141209g;
            case 6:
                C63010eb ebVar = f141210h;
                if (ebVar == null) {
                    synchronized (C53801l.class) {
                        ebVar = f141210h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141209g);
                            f141210h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
