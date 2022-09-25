package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hr */
/* compiled from: PG */
public final class C49133hr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49133hr f127058c;

    /* renamed from: d */
    private static volatile C63010eb f127059d;

    /* renamed from: a */
    public int f127060a;

    /* renamed from: b */
    public String f127061b = BuildConfig.FLAVOR;

    static {
        C49133hr hrVar = new C49133hr();
        f127058c = hrVar;
        C62942bv.registerDefaultInstance(C49133hr.class, hrVar);
    }

    private C49133hr() {
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
                return newMessageInfo(f127058c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49133hr();
            case 4:
                return new C49132hq();
            case 5:
                return f127058c;
            case 6:
                C63010eb ebVar = f127059d;
                if (ebVar == null) {
                    synchronized (C49133hr.class) {
                        ebVar = f127059d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127058c);
                            f127059d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
