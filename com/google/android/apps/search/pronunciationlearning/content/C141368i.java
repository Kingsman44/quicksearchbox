package com.google.android.apps.search.pronunciationlearning.content;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.i */
/* compiled from: PG */
public final class C141368i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C141368i f383770b;

    /* renamed from: c */
    private static volatile C63010eb f383771c;

    /* renamed from: a */
    public C62971cq f383772a = emptyProtobufList();

    static {
        C141368i iVar = new C141368i();
        f383770b = iVar;
        C62942bv.registerDefaultInstance(C141368i.class, iVar);
    }

    private C141368i() {
    }

    /* renamed from: a */
    public final void mo116390a() {
        C62971cq cqVar = this.f383772a;
        if (!cqVar.mo58948c()) {
            this.f383772a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f383770b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C141370k.class});
            case 3:
                return new C141368i();
            case 4:
                return new C141367h();
            case 5:
                return f383770b;
            case 6:
                C63010eb ebVar = f383771c;
                if (ebVar == null) {
                    synchronized (C141368i.class) {
                        ebVar = f383771c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383770b);
                            f383771c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
