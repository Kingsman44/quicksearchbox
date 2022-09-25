package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yo */
/* compiled from: PG */
public final class C50478yo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50478yo f131370c;

    /* renamed from: d */
    private static volatile C63010eb f131371d;

    /* renamed from: a */
    public int f131372a;

    /* renamed from: b */
    public boolean f131373b;

    static {
        C50478yo yoVar = new C50478yo();
        f131370c = yoVar;
        C62942bv.registerDefaultInstance(C50478yo.class, yoVar);
    }

    private C50478yo() {
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
                return newMessageInfo(f131370c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50478yo();
            case 4:
                return new C50477yn();
            case 5:
                return f131370c;
            case 6:
                C63010eb ebVar = f131371d;
                if (ebVar == null) {
                    synchronized (C50478yo.class) {
                        ebVar = f131371d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131370c);
                            f131371d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
