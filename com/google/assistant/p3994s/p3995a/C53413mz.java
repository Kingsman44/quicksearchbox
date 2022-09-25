package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mz */
/* compiled from: PG */
public final class C53413mz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53413mz f140153b;

    /* renamed from: d */
    private static volatile C63010eb f140154d;

    /* renamed from: a */
    public C62971cq f140155a = emptyProtobufList();

    /* renamed from: c */
    private byte f140156c = 2;

    static {
        C53413mz mzVar = new C53413mz();
        f140153b = mzVar;
        C62942bv.registerDefaultInstance(C53413mz.class, mzVar);
    }

    private C53413mz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140156c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140156c = b;
                return null;
            case 2:
                return newMessageInfo(f140153b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C53428nn.class});
            case 3:
                return new C53413mz();
            case 4:
                return new C53412my();
            case 5:
                return f140153b;
            case 6:
                C63010eb ebVar = f140154d;
                if (ebVar == null) {
                    synchronized (C53413mz.class) {
                        ebVar = f140154d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140153b);
                            f140154d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
