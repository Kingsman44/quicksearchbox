package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.b.g */
/* compiled from: PG */
public final class C81361g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C81361g f222689b;

    /* renamed from: c */
    private static volatile C63010eb f222690c;

    /* renamed from: a */
    public C62971cq f222691a = emptyProtobufList();

    static {
        C81361g gVar = new C81361g();
        f222689b = gVar;
        C62942bv.registerDefaultInstance(C81361g.class, gVar);
    }

    private C81361g() {
    }

    /* renamed from: a */
    public final void mo75041a() {
        C62971cq cqVar = this.f222691a;
        if (!cqVar.mo58948c()) {
            this.f222691a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f222689b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C81368n.class});
            case 3:
                return new C81361g();
            case 4:
                return new C81360f();
            case 5:
                return f222689b;
            case 6:
                C63010eb ebVar = f222690c;
                if (ebVar == null) {
                    synchronized (C81361g.class) {
                        ebVar = f222690c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222689b);
                            f222690c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
