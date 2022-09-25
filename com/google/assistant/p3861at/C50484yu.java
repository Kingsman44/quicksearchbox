package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yu */
/* compiled from: PG */
public final class C50484yu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50484yu f131379a;

    /* renamed from: c */
    private static volatile C63010eb f131380c;

    /* renamed from: b */
    private C62995dn f131381b = C62995dn.f170057a;

    static {
        C50484yu yuVar = new C50484yu();
        f131379a = yuVar;
        C62942bv.registerDefaultInstance(C50484yu.class, yuVar);
    }

    private C50484yu() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f131379a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C50483yt.f131378a});
            case 3:
                return new C50484yu();
            case 4:
                return new C50482ys();
            case 5:
                return f131379a;
            case 6:
                C63010eb ebVar = f131380c;
                if (ebVar == null) {
                    synchronized (C50484yu.class) {
                        ebVar = f131380c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131379a);
                            f131380c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
