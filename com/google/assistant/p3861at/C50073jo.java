package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jo */
/* compiled from: PG */
public final class C50073jo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50073jo f130188c;

    /* renamed from: e */
    private static volatile C63010eb f130189e;

    /* renamed from: a */
    public boolean f130190a;

    /* renamed from: b */
    public String f130191b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f130192d;

    static {
        C50073jo joVar = new C50073jo();
        f130188c = joVar;
        C62942bv.registerDefaultInstance(C50073jo.class, joVar);
    }

    private C50073jo() {
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
                return newMessageInfo(f130188c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C50073jo();
            case 4:
                return new C50072jn();
            case 5:
                return f130188c;
            case 6:
                C63010eb ebVar = f130189e;
                if (ebVar == null) {
                    synchronized (C50073jo.class) {
                        ebVar = f130189e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130188c);
                            f130189e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
