package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.rg */
/* compiled from: PG */
public final class C50281rg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50281rg f130758b;

    /* renamed from: d */
    private static volatile C63010eb f130759d;

    /* renamed from: a */
    public String f130760a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f130761c;

    static {
        C50281rg rgVar = new C50281rg();
        f130758b = rgVar;
        C62942bv.registerDefaultInstance(C50281rg.class, rgVar);
    }

    private C50281rg() {
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
                return newMessageInfo(f130758b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50281rg();
            case 4:
                return new C50280rf();
            case 5:
                return f130758b;
            case 6:
                C63010eb ebVar = f130759d;
                if (ebVar == null) {
                    synchronized (C50281rg.class) {
                        ebVar = f130759d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130758b);
                            f130759d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
