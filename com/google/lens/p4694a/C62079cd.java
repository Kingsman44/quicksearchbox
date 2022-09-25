package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cd */
/* compiled from: PG */
public final class C62079cd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62079cd f167681a;

    /* renamed from: c */
    private static volatile C63010eb f167682c;

    /* renamed from: b */
    private byte f167683b = 2;

    static {
        C62079cd cdVar = new C62079cd();
        f167681a = cdVar;
        C62942bv.registerDefaultInstance(C62079cd.class, cdVar);
    }

    private C62079cd() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167683b);
            case 1:
                this.f167683b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167681a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62079cd();
            case 4:
                return new C62078cc();
            case 5:
                return f167681a;
            case 6:
                C63010eb ebVar = f167682c;
                if (ebVar == null) {
                    synchronized (C62079cd.class) {
                        ebVar = f167682c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167681a);
                            f167682c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
