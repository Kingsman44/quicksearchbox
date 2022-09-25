package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.z */
/* compiled from: PG */
public final class C125177z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125177z f345322b;

    /* renamed from: c */
    private static volatile C63010eb f345323c;

    /* renamed from: a */
    public int f345324a;

    static {
        C125177z zVar = new C125177z();
        f345322b = zVar;
        C62942bv.registerDefaultInstance(C125177z.class, zVar);
    }

    private C125177z() {
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
                return newMessageInfo(f345322b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C125177z();
            case 4:
                return new C125176y();
            case 5:
                return f345322b;
            case 6:
                C63010eb ebVar = f345323c;
                if (ebVar == null) {
                    synchronized (C125177z.class) {
                        ebVar = f345323c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345322b);
                            f345323c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
