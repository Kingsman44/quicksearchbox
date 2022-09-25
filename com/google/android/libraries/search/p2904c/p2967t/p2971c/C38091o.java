package com.google.android.libraries.search.p2904c.p2967t.p2971c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.t.c.o */
/* compiled from: PG */
public final class C38091o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C38091o f100920b;

    /* renamed from: c */
    private static volatile C63010eb f100921c;

    /* renamed from: a */
    public C62971cq f100922a = emptyProtobufList();

    static {
        C38091o oVar = new C38091o();
        f100920b = oVar;
        C62942bv.registerDefaultInstance(C38091o.class, oVar);
    }

    private C38091o() {
    }

    /* renamed from: a */
    public final void mo41253a() {
        C62971cq cqVar = this.f100922a;
        if (!cqVar.mo58948c()) {
            this.f100922a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f100920b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C38080d.class});
            case 3:
                return new C38091o();
            case 4:
                return new C38090n();
            case 5:
                return f100920b;
            case 6:
                C63010eb ebVar = f100921c;
                if (ebVar == null) {
                    synchronized (C38091o.class) {
                        ebVar = f100921c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100920b);
                            f100921c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
