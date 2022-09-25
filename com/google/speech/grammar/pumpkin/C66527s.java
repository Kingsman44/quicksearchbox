package com.google.speech.grammar.pumpkin;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.grammar.pumpkin.s */
/* compiled from: PG */
public final class C66527s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66527s f180937b;

    /* renamed from: d */
    private static volatile C63010eb f180938d;

    /* renamed from: a */
    public C62971cq f180939a = emptyProtobufList();

    /* renamed from: c */
    private byte f180940c = 2;

    static {
        C66527s sVar = new C66527s();
        f180937b = sVar;
        C62942bv.registerDefaultInstance(C66527s.class, sVar);
    }

    private C66527s() {
    }

    /* renamed from: a */
    public final void mo59672a() {
        C62971cq cqVar = this.f180939a;
        if (!cqVar.mo58948c()) {
            this.f180939a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180940c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180940c = b;
                return null;
            case 2:
                return newMessageInfo(f180937b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C66525q.class});
            case 3:
                return new C66527s();
            case 4:
                return new C66526r();
            case 5:
                return f180937b;
            case 6:
                C63010eb ebVar = f180938d;
                if (ebVar == null) {
                    synchronized (C66527s.class) {
                        ebVar = f180938d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180937b);
                            f180938d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
