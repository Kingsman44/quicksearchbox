package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.bw */
/* compiled from: PG */
public final class C51725bw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51725bw f135701e;

    /* renamed from: f */
    private static volatile C63010eb f135702f;

    /* renamed from: a */
    public int f135703a;

    /* renamed from: b */
    public String f135704b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135705c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f135706d = BuildConfig.FLAVOR;

    static {
        C51725bw bwVar = new C51725bw();
        f135701e = bwVar;
        C62942bv.registerDefaultInstance(C51725bw.class, bwVar);
    }

    private C51725bw() {
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
                return newMessageInfo(f135701e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51725bw();
            case 4:
                return new C51724bv();
            case 5:
                return f135701e;
            case 6:
                C63010eb ebVar = f135702f;
                if (ebVar == null) {
                    synchronized (C51725bw.class) {
                        ebVar = f135702f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135701e);
                            f135702f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
