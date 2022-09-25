package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ak */
/* compiled from: PG */
public final class C62747ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62747ak f169469a;

    /* renamed from: c */
    private static volatile C63010eb f169470c;

    /* renamed from: b */
    private byte f169471b = 2;

    static {
        C62747ak akVar = new C62747ak();
        f169469a = akVar;
        C62942bv.registerDefaultInstance(C62747ak.class, akVar);
    }

    private C62747ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169471b);
            case 1:
                this.f169471b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169469a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62747ak();
            case 4:
                return new C62746aj();
            case 5:
                return f169469a;
            case 6:
                C63010eb ebVar = f169470c;
                if (ebVar == null) {
                    synchronized (C62747ak.class) {
                        ebVar = f169470c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169469a);
                            f169470c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
