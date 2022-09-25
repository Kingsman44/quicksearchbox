package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vk */
/* compiled from: PG */
public final class C52537vk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52537vk f137903c;

    /* renamed from: d */
    private static volatile C63010eb f137904d;

    /* renamed from: a */
    public int f137905a;

    /* renamed from: b */
    public String f137906b = BuildConfig.FLAVOR;

    static {
        C52537vk vkVar = new C52537vk();
        f137903c = vkVar;
        C62942bv.registerDefaultInstance(C52537vk.class, vkVar);
    }

    private C52537vk() {
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
                return newMessageInfo(f137903c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52537vk();
            case 4:
                return new C52536vj();
            case 5:
                return f137903c;
            case 6:
                C63010eb ebVar = f137904d;
                if (ebVar == null) {
                    synchronized (C52537vk.class) {
                        ebVar = f137904d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137903c);
                            f137904d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
