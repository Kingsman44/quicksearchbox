package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.adl */
/* compiled from: PG */
public final class adl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final adl f129046c;

    /* renamed from: d */
    private static volatile C63010eb f129047d;

    /* renamed from: a */
    public C62971cq f129048a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f129049b = C62942bv.emptyProtobufList();

    static {
        adl adl = new adl();
        f129046c = adl;
        C62942bv.registerDefaultInstance(adl.class, adl);
    }

    private adl() {
    }

    /* renamed from: a */
    public final void mo53355a() {
        C62971cq cqVar = this.f129048a;
        if (!cqVar.mo58948c()) {
            this.f129048a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f129046c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[]{"a", adf.class, "b"});
            case 3:
                return new adl();
            case 4:
                return new adk();
            case 5:
                return f129046c;
            case 6:
                C63010eb ebVar = f129047d;
                if (ebVar == null) {
                    synchronized (adl.class) {
                        ebVar = f129047d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129046c);
                            f129047d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
