package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.gp */
/* compiled from: PG */
public final class C51408gp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51408gp f133909c;

    /* renamed from: d */
    private static volatile C63010eb f133910d;

    /* renamed from: a */
    public int f133911a;

    /* renamed from: b */
    public int f133912b;

    static {
        C51408gp gpVar = new C51408gp();
        f133909c = gpVar;
        C62942bv.registerDefaultInstance(C51408gp.class, gpVar);
    }

    private C51408gp() {
        emptyIntList();
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
                return newMessageInfo(f133909c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C51410gr.f133913a});
            case 3:
                return new C51408gp();
            case 4:
                return new C51407go();
            case 5:
                return f133909c;
            case 6:
                C63010eb ebVar = f133910d;
                if (ebVar == null) {
                    synchronized (C51408gp.class) {
                        ebVar = f133910d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133909c);
                            f133910d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
