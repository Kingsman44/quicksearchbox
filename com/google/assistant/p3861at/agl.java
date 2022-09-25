package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agl */
/* compiled from: PG */
public final class agl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final agl f129230b;

    /* renamed from: c */
    private static volatile C63010eb f129231c;

    /* renamed from: a */
    public C62971cq f129232a = emptyProtobufList();

    static {
        agl agl = new agl();
        f129230b = agl;
        C62942bv.registerDefaultInstance(agl.class, agl);
    }

    private agl() {
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
                return newMessageInfo(f129230b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", agj.class});
            case 3:
                return new agl();
            case 4:
                return new agk();
            case 5:
                return f129230b;
            case 6:
                C63010eb ebVar = f129231c;
                if (ebVar == null) {
                    synchronized (agl.class) {
                        ebVar = f129231c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129230b);
                            f129231c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
