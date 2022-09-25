package com.google.speech.grammar.pumpkin;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.grammar.pumpkin.d */
/* compiled from: PG */
public final class C66512d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66512d f180896b;

    /* renamed from: d */
    private static volatile C63010eb f180897d;

    /* renamed from: a */
    public C62971cq f180898a = emptyProtobufList();

    /* renamed from: c */
    private byte f180899c = 2;

    static {
        C66512d dVar = new C66512d();
        f180896b = dVar;
        C62942bv.registerDefaultInstance(C66512d.class, dVar);
    }

    private C66512d() {
    }

    /* renamed from: a */
    public final void mo59664a() {
        C62971cq cqVar = this.f180898a;
        if (!cqVar.mo58948c()) {
            this.f180898a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180899c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180899c = b;
                return null;
            case 2:
                return newMessageInfo(f180896b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C66510b.class});
            case 3:
                return new C66512d();
            case 4:
                return new C66511c();
            case 5:
                return f180896b;
            case 6:
                C63010eb ebVar = f180897d;
                if (ebVar == null) {
                    synchronized (C66512d.class) {
                        ebVar = f180897d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180896b);
                            f180897d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
