package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.h.a.a.a.ai */
/* compiled from: PG */
public final class C119100ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119100ai f332220c;

    /* renamed from: d */
    private static volatile C63010eb f332221d;

    /* renamed from: a */
    public C62971cq f332222a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public int f332223b;

    static {
        C119100ai aiVar = new C119100ai();
        f332220c = aiVar;
        C62942bv.registerDefaultInstance(C119100ai.class, aiVar);
    }

    private C119100ai() {
    }

    /* renamed from: a */
    public final void mo104189a() {
        C62971cq cqVar = this.f332222a;
        if (!cqVar.mo58948c()) {
            this.f332222a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f332220c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C119100ai();
            case 4:
                return new C119099ah();
            case 5:
                return f332220c;
            case 6:
                C63010eb ebVar = f332221d;
                if (ebVar == null) {
                    synchronized (C119100ai.class) {
                        ebVar = f332221d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332220c);
                            f332221d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
