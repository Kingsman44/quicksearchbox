package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lj */
/* compiled from: PG */
public final class C53370lj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53370lj f140047c;

    /* renamed from: e */
    private static volatile C63010eb f140048e;

    /* renamed from: a */
    public C62971cq f140049a;

    /* renamed from: b */
    public C62971cq f140050b;

    /* renamed from: d */
    private byte f140051d = 2;

    static {
        C53370lj ljVar = new C53370lj();
        f140047c = ljVar;
        C62942bv.registerDefaultInstance(C53370lj.class, ljVar);
    }

    private C53370lj() {
        emptyProtobufList();
        this.f140049a = emptyProtobufList();
        this.f140050b = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53980a() {
        C62971cq cqVar = this.f140050b;
        if (!cqVar.mo58948c()) {
            this.f140050b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140051d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140051d = b;
                return null;
            case 2:
                return newMessageInfo(f140047c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0001\u0002\u001b\u0003Л", new Object[]{"a", C53368lh.class, "b", C53366lf.class});
            case 3:
                return new C53370lj();
            case 4:
                return new C53369li();
            case 5:
                return f140047c;
            case 6:
                C63010eb ebVar = f140048e;
                if (ebVar == null) {
                    synchronized (C53370lj.class) {
                        ebVar = f140048e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140047c);
                            f140048e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
