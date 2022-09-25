package com.google.nlp.p4730a.p4734b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.b.p */
/* compiled from: PG */
public final class C62779p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62779p f169531a;

    /* renamed from: c */
    private static volatile C63010eb f169532c;

    /* renamed from: b */
    private byte f169533b = 2;

    static {
        C62779p pVar = new C62779p();
        f169531a = pVar;
        C62942bv.registerDefaultInstance(C62779p.class, pVar);
    }

    private C62779p() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169533b);
            case 1:
                this.f169533b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169531a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62779p();
            case 4:
                return new C62778o();
            case 5:
                return f169531a;
            case 6:
                C63010eb ebVar = f169532c;
                if (ebVar == null) {
                    synchronized (C62779p.class) {
                        ebVar = f169532c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169531a);
                            f169532c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
