package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.jd */
/* compiled from: PG */
public final class C51477jd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51477jd f134130a;

    /* renamed from: c */
    private static volatile C63010eb f134131c;

    /* renamed from: b */
    private byte f134132b = 2;

    static {
        C51477jd jdVar = new C51477jd();
        f134130a = jdVar;
        C62942bv.registerDefaultInstance(C51477jd.class, jdVar);
    }

    private C51477jd() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134132b);
            case 1:
                this.f134132b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f134130a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51477jd();
            case 4:
                return new C51476jc();
            case 5:
                return f134130a;
            case 6:
                C63010eb ebVar = f134131c;
                if (ebVar == null) {
                    synchronized (C51477jd.class) {
                        ebVar = f134131c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134130a);
                            f134131c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
