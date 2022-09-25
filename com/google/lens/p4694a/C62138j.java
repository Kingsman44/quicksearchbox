package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.j */
/* compiled from: PG */
public final class C62138j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62138j f167770a;

    /* renamed from: c */
    private static volatile C63010eb f167771c;

    /* renamed from: b */
    private byte f167772b = 2;

    static {
        C62138j jVar = new C62138j();
        f167770a = jVar;
        C62942bv.registerDefaultInstance(C62138j.class, jVar);
    }

    private C62138j() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167772b);
            case 1:
                this.f167772b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167770a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62138j();
            case 4:
                return new C62137i();
            case 5:
                return f167770a;
            case 6:
                C63010eb ebVar = f167771c;
                if (ebVar == null) {
                    synchronized (C62138j.class) {
                        ebVar = f167771c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167770a);
                            f167771c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
