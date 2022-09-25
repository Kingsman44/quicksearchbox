package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.gm */
/* compiled from: PG */
public final class C51405gm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51405gm f133882d;

    /* renamed from: e */
    private static volatile C63010eb f133883e;

    /* renamed from: a */
    public int f133884a;

    /* renamed from: b */
    public String f133885b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51805du f133886c;

    static {
        C51405gm gmVar = new C51405gm();
        f133882d = gmVar;
        C62942bv.registerDefaultInstance(C51405gm.class, gmVar);
    }

    private C51405gm() {
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
                return newMessageInfo(f133882d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51405gm();
            case 4:
                return new C51404gl();
            case 5:
                return f133882d;
            case 6:
                C63010eb ebVar = f133883e;
                if (ebVar == null) {
                    synchronized (C51405gm.class) {
                        ebVar = f133883e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133882d);
                            f133883e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
