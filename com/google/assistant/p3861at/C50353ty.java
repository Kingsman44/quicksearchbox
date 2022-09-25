package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ty */
/* compiled from: PG */
public final class C50353ty extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50353ty f131046c;

    /* renamed from: e */
    private static volatile C63010eb f131047e;

    /* renamed from: a */
    public String f131048a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f131049b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f131050d;

    static {
        C50353ty tyVar = new C50353ty();
        f131046c = tyVar;
        C62942bv.registerDefaultInstance(C50353ty.class, tyVar);
    }

    private C50353ty() {
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
                return newMessageInfo(f131046c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C50353ty();
            case 4:
                return new C50352tx();
            case 5:
                return f131046c;
            case 6:
                C63010eb ebVar = f131047e;
                if (ebVar == null) {
                    synchronized (C50353ty.class) {
                        ebVar = f131047e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131046c);
                            f131047e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
