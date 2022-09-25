package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.id */
/* compiled from: PG */
public final class C52032id extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52032id f136564b;

    /* renamed from: d */
    private static volatile C63010eb f136565d;

    /* renamed from: a */
    public String f136566a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f136567c;

    static {
        C52032id idVar = new C52032id();
        f136564b = idVar;
        C62942bv.registerDefaultInstance(C52032id.class, idVar);
    }

    private C52032id() {
    }

    /* renamed from: a */
    public static C63010eb m86471a() {
        return f136564b.getParserForType();
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
                return newMessageInfo(f136564b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52032id();
            case 4:
                return new C52031ic();
            case 5:
                return f136564b;
            case 6:
                C63010eb ebVar = f136565d;
                if (ebVar == null) {
                    synchronized (C52032id.class) {
                        ebVar = f136565d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136564b);
                            f136565d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
