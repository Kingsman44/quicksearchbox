package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ji */
/* compiled from: PG */
public final class C50067ji extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50067ji f130169f;

    /* renamed from: g */
    private static volatile C63010eb f130170g;

    /* renamed from: a */
    public int f130171a;

    /* renamed from: b */
    public String f130172b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130173c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f130174d;

    /* renamed from: e */
    public String f130175e = BuildConfig.FLAVOR;

    static {
        C50067ji jiVar = new C50067ji();
        f130169f = jiVar;
        C62942bv.registerDefaultInstance(C50067ji.class, jiVar);
    }

    private C50067ji() {
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
                return newMessageInfo(f130169f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50067ji();
            case 4:
                return new C50066jh();
            case 5:
                return f130169f;
            case 6:
                C63010eb ebVar = f130170g;
                if (ebVar == null) {
                    synchronized (C50067ji.class) {
                        ebVar = f130170g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130169f);
                            f130170g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
