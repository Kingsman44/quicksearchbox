package com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.a.a.i */
/* compiled from: PG */
public final class C126878i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C126878i f349355a;

    /* renamed from: b */
    private static volatile C63010eb f349356b;

    static {
        C126878i iVar = new C126878i();
        f349355a = iVar;
        C62942bv.registerDefaultInstance(C126878i.class, iVar);
    }

    private C126878i() {
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
                return newMessageInfo(f349355a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C126878i();
            case 4:
                return new C126877h();
            case 5:
                return f349355a;
            case 6:
                C63010eb ebVar = f349356b;
                if (ebVar == null) {
                    synchronized (C126878i.class) {
                        ebVar = f349356b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349355a);
                            f349356b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
