package com.google.assistant.p3897e.p3929l.p3930a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.cs */
/* compiled from: PG */
public final class C52740cs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52740cs f138408b;

    /* renamed from: d */
    private static volatile C63010eb f138409d;

    /* renamed from: a */
    public String f138410a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f138411c;

    static {
        C52740cs csVar = new C52740cs();
        f138408b = csVar;
        C62942bv.registerDefaultInstance(C52740cs.class, csVar);
    }

    private C52740cs() {
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
                return newMessageInfo(f138408b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52740cs();
            case 4:
                return new C52739cr();
            case 5:
                return f138408b;
            case 6:
                C63010eb ebVar = f138409d;
                if (ebVar == null) {
                    synchronized (C52740cs.class) {
                        ebVar = f138409d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138408b);
                            f138409d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
