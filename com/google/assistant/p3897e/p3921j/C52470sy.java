package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.sy */
/* compiled from: PG */
public final class C52470sy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52470sy f137736c;

    /* renamed from: d */
    private static volatile C63010eb f137737d;

    /* renamed from: a */
    public int f137738a;

    /* renamed from: b */
    public String f137739b = BuildConfig.FLAVOR;

    static {
        C52470sy syVar = new C52470sy();
        f137736c = syVar;
        C62942bv.registerDefaultInstance(C52470sy.class, syVar);
    }

    private C52470sy() {
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
                return newMessageInfo(f137736c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52470sy();
            case 4:
                return new C52469sx();
            case 5:
                return f137736c;
            case 6:
                C63010eb ebVar = f137737d;
                if (ebVar == null) {
                    synchronized (C52470sy.class) {
                        ebVar = f137737d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137736c);
                            f137737d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
