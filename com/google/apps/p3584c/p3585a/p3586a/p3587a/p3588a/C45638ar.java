package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.ar */
/* compiled from: PG */
public final class C45638ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45638ar f120061c;

    /* renamed from: d */
    private static volatile C63010eb f120062d;

    /* renamed from: a */
    public C62964ck f120063a = emptyLongList();

    /* renamed from: b */
    public C62971cq f120064b;

    static {
        C45638ar arVar = new C45638ar();
        f120061c = arVar;
        C62942bv.registerDefaultInstance(C45638ar.class, arVar);
    }

    private C45638ar() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        this.f120064b = emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyLongList();
        emptyLongList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
    }

    /* renamed from: a */
    public final void mo49729a() {
        C62971cq cqVar = this.f120064b;
        if (!cqVar.mo58948c()) {
            this.f120064b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f120061c, "\u0001\u0002\u0000\u0000\u0006\u001c\u0002\u0000\u0002\u0000\u0006\u0014\u001c\u001b", new Object[]{"a", "b", C45678x.class});
            case 3:
                return new C45638ar();
            case 4:
                return new C45635ao();
            case 5:
                return f120061c;
            case 6:
                C63010eb ebVar = f120062d;
                if (ebVar == null) {
                    synchronized (C45638ar.class) {
                        ebVar = f120062d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120061c);
                            f120062d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
