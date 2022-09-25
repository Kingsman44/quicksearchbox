package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.dy */
/* compiled from: PG */
public final class C51918dy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51918dy f136193c;

    /* renamed from: e */
    private static volatile C63010eb f136194e;

    /* renamed from: a */
    public String f136195a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f136196b = emptyProtobufList();

    /* renamed from: d */
    private int f136197d;

    static {
        C51918dy dyVar = new C51918dy();
        f136193c = dyVar;
        C62942bv.registerDefaultInstance(C51918dy.class, dyVar);
    }

    private C51918dy() {
    }

    /* renamed from: a */
    public static C63010eb m86412a() {
        return f136193c.getParserForType();
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
                return newMessageInfo(f136193c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C51917dx.class});
            case 3:
                return new C51918dy();
            case 4:
                return new C51913dt();
            case 5:
                return f136193c;
            case 6:
                C63010eb ebVar = f136194e;
                if (ebVar == null) {
                    synchronized (C51918dy.class) {
                        ebVar = f136194e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136193c);
                            f136194e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
