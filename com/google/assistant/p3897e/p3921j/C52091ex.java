package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import java.util.List;

/* renamed from: com.google.assistant.e.j.ex */
/* compiled from: PG */
public final class C52091ex extends C62942bv implements C52092ey {

    /* renamed from: b */
    public static final C52091ex f136710b;

    /* renamed from: c */
    private static volatile C63010eb f136711c;

    /* renamed from: a */
    public C62971cq f136712a = emptyProtobufList();

    static {
        C52091ex exVar = new C52091ex();
        f136710b = exVar;
        C62942bv.registerDefaultInstance(C52091ex.class, exVar);
    }

    private C52091ex() {
    }

    /* renamed from: a */
    public final List mo53788a() {
        return this.f136712a;
    }

    /* renamed from: b */
    public final void mo53796b() {
        C62971cq cqVar = this.f136712a;
        if (!cqVar.mo58948c()) {
            this.f136712a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f136710b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52232kc.class});
            case 3:
                return new C52091ex();
            case 4:
                return new C52090ew();
            case 5:
                return f136710b;
            case 6:
                C63010eb ebVar = f136711c;
                if (ebVar == null) {
                    synchronized (C52091ex.class) {
                        ebVar = f136711c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136710b);
                            f136711c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
