package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.kd */
/* compiled from: PG */
public final class C53337kd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53337kd f139959c;

    /* renamed from: e */
    private static volatile C63010eb f139960e;

    /* renamed from: a */
    public String f139961a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f139962b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f139963d;

    static {
        C53337kd kdVar = new C53337kd();
        f139959c = kdVar;
        C62942bv.registerDefaultInstance(C53337kd.class, kdVar);
    }

    private C53337kd() {
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
                return newMessageInfo(f139959c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C53337kd();
            case 4:
                return new C53336kc();
            case 5:
                return f139959c;
            case 6:
                C63010eb ebVar = f139960e;
                if (ebVar == null) {
                    synchronized (C53337kd.class) {
                        ebVar = f139960e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139959c);
                            f139960e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
