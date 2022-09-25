package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.cn */
/* compiled from: PG */
public final class C51880cn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51880cn f136067c;

    /* renamed from: e */
    private static volatile C63010eb f136068e;

    /* renamed from: a */
    public String f136069a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f136070b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f136071d;

    static {
        C51880cn cnVar = new C51880cn();
        f136067c = cnVar;
        C62942bv.registerDefaultInstance(C51880cn.class, cnVar);
    }

    private C51880cn() {
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
                return newMessageInfo(f136067c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51880cn();
            case 4:
                return new C51879cm();
            case 5:
                return f136067c;
            case 6:
                C63010eb ebVar = f136068e;
                if (ebVar == null) {
                    synchronized (C51880cn.class) {
                        ebVar = f136068e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136067c);
                            f136068e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
