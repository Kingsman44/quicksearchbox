package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fa */
/* compiled from: PG */
public final class C14325fa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14325fa f43337c;

    /* renamed from: d */
    private static volatile C63010eb f43338d;

    /* renamed from: a */
    public String f43339a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f43340b = BuildConfig.FLAVOR;

    static {
        C14325fa faVar = new C14325fa();
        f43337c = faVar;
        C62942bv.registerDefaultInstance(C14325fa.class, faVar);
    }

    private C14325fa() {
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
                return newMessageInfo(f43337c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C14325fa();
            case 4:
                return new C14323ez();
            case 5:
                return f43337c;
            case 6:
                C63010eb ebVar = f43338d;
                if (ebVar == null) {
                    synchronized (C14325fa.class) {
                        ebVar = f43338d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43337c);
                            f43338d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
