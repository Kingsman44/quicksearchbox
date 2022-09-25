package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.hq */
/* compiled from: PG */
public final class C52165hq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52165hq f136880c;

    /* renamed from: e */
    private static volatile C63010eb f136881e;

    /* renamed from: a */
    public String f136882a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f136883b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f136884d;

    static {
        C52165hq hqVar = new C52165hq();
        f136880c = hqVar;
        C62942bv.registerDefaultInstance(C52165hq.class, hqVar);
    }

    private C52165hq() {
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
                return newMessageInfo(f136880c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C52165hq();
            case 4:
                return new C52164hp();
            case 5:
                return f136880c;
            case 6:
                C63010eb ebVar = f136881e;
                if (ebVar == null) {
                    synchronized (C52165hq.class) {
                        ebVar = f136881e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136880c);
                            f136881e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
