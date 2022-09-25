package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.bs */
/* compiled from: PG */
public final class C51858bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51858bs f136029b;

    /* renamed from: d */
    private static volatile C63010eb f136030d;

    /* renamed from: a */
    public String f136031a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f136032c;

    static {
        C51858bs bsVar = new C51858bs();
        f136029b = bsVar;
        C62942bv.registerDefaultInstance(C51858bs.class, bsVar);
    }

    private C51858bs() {
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
                return newMessageInfo(f136029b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51858bs();
            case 4:
                return new C51857br();
            case 5:
                return f136029b;
            case 6:
                C63010eb ebVar = f136030d;
                if (ebVar == null) {
                    synchronized (C51858bs.class) {
                        ebVar = f136030d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136029b);
                            f136030d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
