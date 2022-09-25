package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.ap */
/* compiled from: PG */
public final class C67400ap extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C67400ap f183187c;

    /* renamed from: e */
    private static volatile C63010eb f183188e;

    /* renamed from: a */
    public C62971cq f183189a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f183190b = emptyProtobufList();

    /* renamed from: d */
    private byte f183191d = 2;

    static {
        C67400ap apVar = new C67400ap();
        f183187c = apVar;
        C62942bv.registerDefaultInstance(C67400ap.class, apVar);
    }

    private C67400ap() {
    }

    /* renamed from: a */
    public final void mo59847a() {
        C62971cq cqVar = this.f183189a;
        if (!cqVar.mo58948c()) {
            this.f183189a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183191d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183191d = b;
                return null;
            case 2:
                return newMessageInfo(f183187c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", C67398an.class, "b", C67407d.class});
            case 3:
                return new C67400ap();
            case 4:
                return new C67399ao();
            case 5:
                return f183187c;
            case 6:
                C63010eb ebVar = f183188e;
                if (ebVar == null) {
                    synchronized (C67400ap.class) {
                        ebVar = f183188e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183187c);
                            f183188e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
