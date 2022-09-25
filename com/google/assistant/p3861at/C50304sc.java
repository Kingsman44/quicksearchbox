package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sc */
/* compiled from: PG */
public final class C50304sc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50304sc f130912e;

    /* renamed from: f */
    private static volatile C63010eb f130913f;

    /* renamed from: a */
    public int f130914a;

    /* renamed from: b */
    public boolean f130915b;

    /* renamed from: c */
    public String f130916c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f130917d;

    static {
        C50304sc scVar = new C50304sc();
        f130912e = scVar;
        C62942bv.registerDefaultInstance(C50304sc.class, scVar);
    }

    private C50304sc() {
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
                return newMessageInfo(f130912e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50304sc();
            case 4:
                return new C50303sb();
            case 5:
                return f130912e;
            case 6:
                C63010eb ebVar = f130913f;
                if (ebVar == null) {
                    synchronized (C50304sc.class) {
                        ebVar = f130913f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130912e);
                            f130913f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
