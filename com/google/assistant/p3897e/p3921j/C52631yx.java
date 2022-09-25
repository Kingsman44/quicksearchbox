package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yx */
/* compiled from: PG */
public final class C52631yx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52631yx f138188c;

    /* renamed from: d */
    private static volatile C63010eb f138189d;

    /* renamed from: a */
    public int f138190a;

    /* renamed from: b */
    public String f138191b = BuildConfig.FLAVOR;

    static {
        C52631yx yxVar = new C52631yx();
        f138188c = yxVar;
        C62942bv.registerDefaultInstance(C52631yx.class, yxVar);
    }

    private C52631yx() {
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
                return newMessageInfo(f138188c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C52631yx();
            case 4:
                return new C52630yw();
            case 5:
                return f138188c;
            case 6:
                C63010eb ebVar = f138189d;
                if (ebVar == null) {
                    synchronized (C52631yx.class) {
                        ebVar = f138189d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138188c);
                            f138189d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
