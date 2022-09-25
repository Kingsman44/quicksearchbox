package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.me */
/* compiled from: PG */
public final class C52288me extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52288me f137255b;

    /* renamed from: c */
    private static volatile C63010eb f137256c;

    /* renamed from: a */
    public String f137257a = BuildConfig.FLAVOR;

    static {
        C52288me meVar = new C52288me();
        f137255b = meVar;
        C62942bv.registerDefaultInstance(C52288me.class, meVar);
    }

    private C52288me() {
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
                return newMessageInfo(f137255b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C52288me();
            case 4:
                return new C52287md();
            case 5:
                return f137255b;
            case 6:
                C63010eb ebVar = f137256c;
                if (ebVar == null) {
                    synchronized (C52288me.class) {
                        ebVar = f137256c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137255b);
                            f137256c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
