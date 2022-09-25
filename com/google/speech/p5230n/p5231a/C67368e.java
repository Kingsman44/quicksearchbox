package com.google.speech.p5230n.p5231a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.e */
/* compiled from: PG */
public final class C67368e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67368e f183119d;

    /* renamed from: e */
    private static volatile C63010eb f183120e;

    /* renamed from: a */
    public int f183121a;

    /* renamed from: b */
    public C62971cq f183122b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f183123c;

    static {
        C67368e eVar = new C67368e();
        f183119d = eVar;
        C62942bv.registerDefaultInstance(C67368e.class, eVar);
    }

    private C67368e() {
    }

    /* renamed from: a */
    public final void mo59842a() {
        C62971cq cqVar = this.f183122b;
        if (!cqVar.mo58948c()) {
            this.f183122b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f183119d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001a\u0003ဌ\u0000", new Object[]{"a", "b", C45240c.f118157a, C67367d.f183118a});
            case 3:
                return new C67368e();
            case 4:
                return new C67366c();
            case 5:
                return f183119d;
            case 6:
                C63010eb ebVar = f183120e;
                if (ebVar == null) {
                    synchronized (C67368e.class) {
                        ebVar = f183120e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183119d);
                            f183120e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
