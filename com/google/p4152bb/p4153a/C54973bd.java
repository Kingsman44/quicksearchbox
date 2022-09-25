package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.bd */
/* compiled from: PG */
public final class C54973bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54973bd f144627c;

    /* renamed from: e */
    private static volatile C63010eb f144628e;

    /* renamed from: a */
    public C54997ca f144629a;

    /* renamed from: b */
    public C62971cq f144630b = emptyProtobufList();

    /* renamed from: d */
    private int f144631d;

    static {
        C54973bd bdVar = new C54973bd();
        f144627c = bdVar;
        C62942bv.registerDefaultInstance(C54973bd.class, bdVar);
    }

    private C54973bd() {
        emptyProtobufList();
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
                return newMessageInfo(f144627c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C54972bc.class});
            case 3:
                return new C54973bd();
            case 4:
                return new C54962at();
            case 5:
                return f144627c;
            case 6:
                C63010eb ebVar = f144628e;
                if (ebVar == null) {
                    synchronized (C54973bd.class) {
                        ebVar = f144628e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144627c);
                            f144628e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
