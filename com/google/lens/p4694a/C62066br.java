package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.br */
/* compiled from: PG */
public final class C62066br extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62066br f167664a;

    /* renamed from: c */
    private static volatile C63010eb f167665c;

    /* renamed from: b */
    private byte f167666b = 2;

    static {
        C62066br brVar = new C62066br();
        f167664a = brVar;
        C62942bv.registerDefaultInstance(C62066br.class, brVar);
    }

    private C62066br() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167666b);
            case 1:
                this.f167666b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167664a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62066br();
            case 4:
                return new C62065bq();
            case 5:
                return f167664a;
            case 6:
                C63010eb ebVar = f167665c;
                if (ebVar == null) {
                    synchronized (C62066br.class) {
                        ebVar = f167665c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167664a);
                            f167665c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
