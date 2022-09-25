package com.google.android.libraries.assistant.p1533o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.h */
/* compiled from: PG */
public final class C18490h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18490h f52429c;

    /* renamed from: d */
    private static volatile C63010eb f52430d;

    /* renamed from: a */
    public String f52431a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f52432b = BuildConfig.FLAVOR;

    static {
        C18490h hVar = new C18490h();
        f52429c = hVar;
        C62942bv.registerDefaultInstance(C18490h.class, hVar);
    }

    private C18490h() {
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
                return newMessageInfo(f52429c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C18490h();
            case 4:
                return new C18489g();
            case 5:
                return f52429c;
            case 6:
                C63010eb ebVar = f52430d;
                if (ebVar == null) {
                    synchronized (C18490h.class) {
                        ebVar = f52430d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52429c);
                            f52430d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
