package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a.p1289e;

import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.e.b */
/* compiled from: PG */
public final class C16539b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16539b f48527b;

    /* renamed from: c */
    private static volatile C63010eb f48528c;

    /* renamed from: a */
    public C62971cq f48529a = emptyProtobufList();

    static {
        C16539b bVar = new C16539b();
        f48527b = bVar;
        C62942bv.registerDefaultInstance(C16539b.class, bVar);
    }

    private C16539b() {
    }

    /* renamed from: a */
    public final void mo22929a() {
        C62971cq cqVar = this.f48529a;
        if (!cqVar.mo58948c()) {
            this.f48529a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f48527b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51785da.class});
            case 3:
                return new C16539b();
            case 4:
                return new C16538a();
            case 5:
                return f48527b;
            case 6:
                C63010eb ebVar = f48528c;
                if (ebVar == null) {
                    synchronized (C16539b.class) {
                        ebVar = f48528c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48527b);
                            f48528c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
