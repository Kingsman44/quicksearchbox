package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.y */
/* compiled from: PG */
public final class C54126y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54126y f142034a;

    /* renamed from: c */
    private static volatile C63010eb f142035c;

    /* renamed from: b */
    private byte f142036b = 2;

    static {
        C54126y yVar = new C54126y();
        f142034a = yVar;
        C62942bv.registerDefaultInstance(C54126y.class, yVar);
    }

    private C54126y() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142036b);
            case 1:
                this.f142036b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f142034a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54126y();
            case 4:
                return new C54125x();
            case 5:
                return f142034a;
            case 6:
                C63010eb ebVar = f142035c;
                if (ebVar == null) {
                    synchronized (C54126y.class) {
                        ebVar = f142035c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142034a);
                            f142035c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
