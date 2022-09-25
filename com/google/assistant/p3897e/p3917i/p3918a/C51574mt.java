package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63063ga;

/* renamed from: com.google.assistant.e.i.a.mt */
/* compiled from: PG */
public final class C51574mt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51574mt f134414c;

    /* renamed from: d */
    private static volatile C63010eb f134415d;

    /* renamed from: a */
    public C63063ga f134416a;

    /* renamed from: b */
    public C62971cq f134417b = C62942bv.emptyProtobufList();

    static {
        C51574mt mtVar = new C51574mt();
        f134414c = mtVar;
        C62942bv.registerDefaultInstance(C51574mt.class, mtVar);
    }

    private C51574mt() {
    }

    /* renamed from: a */
    public final void mo53642a() {
        C62971cq cqVar = this.f134417b;
        if (!cqVar.mo58948c()) {
            this.f134417b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f134414c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C51574mt();
            case 4:
                return new C51573ms();
            case 5:
                return f134414c;
            case 6:
                C63010eb ebVar = f134415d;
                if (ebVar == null) {
                    synchronized (C51574mt.class) {
                        ebVar = f134415d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134414c);
                            f134415d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
