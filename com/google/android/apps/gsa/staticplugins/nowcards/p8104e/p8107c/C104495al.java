package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.p375ai.p378b.C7851mh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.al */
/* compiled from: PG */
public final class C104495al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C104495al f290638b;

    /* renamed from: d */
    private static volatile C63010eb f290639d;

    /* renamed from: a */
    public C62971cq f290640a = emptyProtobufList();

    /* renamed from: c */
    private byte f290641c = 2;

    static {
        C104495al alVar = new C104495al();
        f290638b = alVar;
        C62942bv.registerDefaultInstance(C104495al.class, alVar);
    }

    private C104495al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290641c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290641c = b;
                return null;
            case 2:
                return newMessageInfo(f290638b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C7851mh.class});
            case 3:
                return new C104495al();
            case 4:
                return new C104494ak();
            case 5:
                return f290638b;
            case 6:
                C63010eb ebVar = f290639d;
                if (ebVar == null) {
                    synchronized (C104495al.class) {
                        ebVar = f290639d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290638b);
                            f290639d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
