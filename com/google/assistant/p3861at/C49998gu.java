package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.gu */
/* compiled from: PG */
public final class C49998gu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49998gu f129972c;

    /* renamed from: e */
    private static volatile C63010eb f129973e;

    /* renamed from: a */
    public C49996gs f129974a;

    /* renamed from: b */
    public C49994gq f129975b;

    /* renamed from: d */
    private int f129976d;

    static {
        C49998gu guVar = new C49998gu();
        f129972c = guVar;
        C62942bv.registerDefaultInstance(C49998gu.class, guVar);
    }

    private C49998gu() {
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
                return newMessageInfo(f129972c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49998gu();
            case 4:
                return new C49997gt();
            case 5:
                return f129972c;
            case 6:
                C63010eb ebVar = f129973e;
                if (ebVar == null) {
                    synchronized (C49998gu.class) {
                        ebVar = f129973e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129972c);
                            f129973e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
