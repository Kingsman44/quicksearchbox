package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aow */
/* compiled from: PG */
public final class aow extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aow f135529e;

    /* renamed from: f */
    private static volatile C63010eb f135530f;

    /* renamed from: a */
    public int f135531a;

    /* renamed from: b */
    public int f135532b = 0;

    /* renamed from: c */
    public Object f135533c;

    /* renamed from: d */
    public String f135534d = BuildConfig.FLAVOR;

    static {
        aow aow = new aow();
        f135529e = aow;
        C62942bv.registerDefaultInstance(aow.class, aow);
    }

    private aow() {
    }

    /* renamed from: a */
    public static C63010eb m86356a() {
        return f135529e.getParserForType();
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
                return newMessageInfo(f135529e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C52230ka.class});
            case 3:
                return new aow();
            case 4:
                return new aov();
            case 5:
                return f135529e;
            case 6:
                C63010eb ebVar = f135530f;
                if (ebVar == null) {
                    synchronized (aow.class) {
                        ebVar = f135530f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135529e);
                            f135530f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
