package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mx */
/* compiled from: PG */
public final class C50163mx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50163mx f130405e;

    /* renamed from: f */
    private static volatile C63010eb f130406f;

    /* renamed from: a */
    public int f130407a;

    /* renamed from: b */
    public boolean f130408b;

    /* renamed from: c */
    public boolean f130409c;

    /* renamed from: d */
    public boolean f130410d;

    static {
        C50163mx mxVar = new C50163mx();
        f130405e = mxVar;
        C62942bv.registerDefaultInstance(C50163mx.class, mxVar);
    }

    private C50163mx() {
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
                return newMessageInfo(f130405e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50163mx();
            case 4:
                return new C50162mw();
            case 5:
                return f130405e;
            case 6:
                C63010eb ebVar = f130406f;
                if (ebVar == null) {
                    synchronized (C50163mx.class) {
                        ebVar = f130406f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130405e);
                            f130406f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
