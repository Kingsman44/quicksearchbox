package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.anf */
/* compiled from: PG */
public final class anf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final anf f135424d;

    /* renamed from: e */
    private static volatile C63010eb f135425e;

    /* renamed from: a */
    public int f135426a;

    /* renamed from: b */
    public String f135427b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f135428c = C63088z.f170246b;

    static {
        anf anf = new anf();
        f135424d = anf;
        C62942bv.registerDefaultInstance(anf.class, anf);
    }

    private anf() {
    }

    /* renamed from: a */
    public static C63010eb m86345a() {
        return f135424d.getParserForType();
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
                return newMessageInfo(f135424d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new anf();
            case 4:
                return new ane();
            case 5:
                return f135424d;
            case 6:
                C63010eb ebVar = f135425e;
                if (ebVar == null) {
                    synchronized (anf.class) {
                        ebVar = f135425e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135424d);
                            f135425e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
