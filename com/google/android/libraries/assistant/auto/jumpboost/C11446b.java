package com.google.android.libraries.assistant.auto.jumpboost;

import com.google.common.p4552o.p4553a.C59473ax;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.b */
/* compiled from: PG */
public final class C11446b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C11446b f37230b;

    /* renamed from: c */
    private static volatile C63010eb f37231c;

    /* renamed from: a */
    public C62971cq f37232a = emptyProtobufList();

    static {
        C11446b bVar = new C11446b();
        f37230b = bVar;
        C62942bv.registerDefaultInstance(C11446b.class, bVar);
    }

    private C11446b() {
    }

    /* renamed from: a */
    public final void mo19981a() {
        C62971cq cqVar = this.f37232a;
        if (!cqVar.mo58948c()) {
            this.f37232a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f37230b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C59473ax.class});
            case 3:
                return new C11446b();
            case 4:
                return new C11421a();
            case 5:
                return f37230b;
            case 6:
                C63010eb ebVar = f37231c;
                if (ebVar == null) {
                    synchronized (C11446b.class) {
                        ebVar = f37231c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37230b);
                            f37231c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
