package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4828e.C63244b;

/* renamed from: com.google.at.j.a.ag */
/* compiled from: PG */
public final class C54303ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54303ag f142662b;

    /* renamed from: e */
    private static volatile C63010eb f142663e;

    /* renamed from: a */
    public C62971cq f142664a = emptyProtobufList();

    /* renamed from: c */
    private C63244b f142665c;

    /* renamed from: d */
    private byte f142666d = 2;

    static {
        C54303ag agVar = new C54303ag();
        f142662b = agVar;
        C62942bv.registerDefaultInstance(C54303ag.class, agVar);
    }

    private C54303ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142666d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142666d = b;
                return null;
            case 2:
                return newMessageInfo(f142662b, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0001\u0001\u001b\u0003Љ", new Object[]{"a", C54447l.class, C45240c.f118157a});
            case 3:
                return new C54303ag();
            case 4:
                return new C54302af();
            case 5:
                return f142662b;
            case 6:
                C63010eb ebVar = f142663e;
                if (ebVar == null) {
                    synchronized (C54303ag.class) {
                        ebVar = f142663e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142662b);
                            f142663e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
