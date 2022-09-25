package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.dw */
/* compiled from: PG */
public final class C51916dw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51916dw f136183b;

    /* renamed from: d */
    private static volatile C63010eb f136184d;

    /* renamed from: a */
    public String f136185a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f136186c;

    static {
        C51916dw dwVar = new C51916dw();
        f136183b = dwVar;
        C62942bv.registerDefaultInstance(C51916dw.class, dwVar);
    }

    private C51916dw() {
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
                return newMessageInfo(f136183b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51916dw();
            case 4:
                return new C51915dv();
            case 5:
                return f136183b;
            case 6:
                C63010eb ebVar = f136184d;
                if (ebVar == null) {
                    synchronized (C51916dw.class) {
                        ebVar = f136184d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136183b);
                            f136184d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
