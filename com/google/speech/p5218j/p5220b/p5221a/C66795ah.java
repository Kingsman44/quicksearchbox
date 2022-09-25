package com.google.speech.p5218j.p5220b.p5221a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.ah */
/* compiled from: PG */
public final class C66795ah extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66795ah f181647e;

    /* renamed from: f */
    private static volatile C63010eb f181648f;

    /* renamed from: a */
    public int f181649a;

    /* renamed from: b */
    public int f181650b;

    /* renamed from: c */
    public double f181651c;

    /* renamed from: d */
    public C62971cq f181652d = emptyProtobufList();

    static {
        C66795ah ahVar = new C66795ah();
        f181647e = ahVar;
        C62942bv.registerDefaultInstance(C66795ah.class, ahVar);
    }

    private C66795ah() {
    }

    /* renamed from: a */
    public final void mo59743a() {
        C62971cq cqVar = this.f181652d;
        if (!cqVar.mo58948c()) {
            this.f181652d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f181647e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002က\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C66794ag.class});
            case 3:
                return new C66795ah();
            case 4:
                return new C66792ae();
            case 5:
                return f181647e;
            case 6:
                C63010eb ebVar = f181648f;
                if (ebVar == null) {
                    synchronized (C66795ah.class) {
                        ebVar = f181648f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181647e);
                            f181648f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
