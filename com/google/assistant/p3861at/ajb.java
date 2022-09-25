package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ajb */
/* compiled from: PG */
public final class ajb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ajb f129457c;

    /* renamed from: e */
    private static volatile C63010eb f129458e;

    /* renamed from: a */
    public boolean f129459a;

    /* renamed from: b */
    public boolean f129460b;

    /* renamed from: d */
    private int f129461d;

    static {
        ajb ajb = new ajb();
        f129457c = ajb;
        C62942bv.registerDefaultInstance(ajb.class, ajb);
    }

    private ajb() {
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
                return newMessageInfo(f129457c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new ajb();
            case 4:
                return new aja();
            case 5:
                return f129457c;
            case 6:
                C63010eb ebVar = f129458e;
                if (ebVar == null) {
                    synchronized (ajb.class) {
                        ebVar = f129458e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129457c);
                            f129458e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
