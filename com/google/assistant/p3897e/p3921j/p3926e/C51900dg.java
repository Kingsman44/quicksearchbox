package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.dg */
/* compiled from: PG */
public final class C51900dg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51900dg f136138e;

    /* renamed from: f */
    private static volatile C63010eb f136139f;

    /* renamed from: a */
    public int f136140a;

    /* renamed from: b */
    public int f136141b;

    /* renamed from: c */
    public String f136142c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f136143d = BuildConfig.FLAVOR;

    static {
        C51900dg dgVar = new C51900dg();
        f136138e = dgVar;
        C62942bv.registerDefaultInstance(C51900dg.class, dgVar);
    }

    private C51900dg() {
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
                return newMessageInfo(f136138e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C51899df.m86410b(), C45240c.f118157a, "d"});
            case 3:
                return new C51900dg();
            case 4:
                return new C51897dd();
            case 5:
                return f136138e;
            case 6:
                C63010eb ebVar = f136139f;
                if (ebVar == null) {
                    synchronized (C51900dg.class) {
                        ebVar = f136139f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136138e);
                            f136139f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
