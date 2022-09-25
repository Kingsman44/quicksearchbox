package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.cj */
/* compiled from: PG */
public final class C122445cj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122445cj f339450b;

    /* renamed from: c */
    private static volatile C63010eb f339451c;

    /* renamed from: a */
    public String f339452a = BuildConfig.FLAVOR;

    static {
        C122445cj cjVar = new C122445cj();
        f339450b = cjVar;
        C62942bv.registerDefaultInstance(C122445cj.class, cjVar);
    }

    private C122445cj() {
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
                return newMessageInfo(f339450b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C122445cj();
            case 4:
                return new C122444ci();
            case 5:
                return f339450b;
            case 6:
                C63010eb ebVar = f339451c;
                if (ebVar == null) {
                    synchronized (C122445cj.class) {
                        ebVar = f339451c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339450b);
                            f339451c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
