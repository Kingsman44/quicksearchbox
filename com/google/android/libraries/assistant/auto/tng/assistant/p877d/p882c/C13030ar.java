package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.ar */
/* compiled from: PG */
public final class C13030ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13030ar f40453c;

    /* renamed from: d */
    private static volatile C63010eb f40454d;

    /* renamed from: a */
    public int f40455a;

    /* renamed from: b */
    public String f40456b = BuildConfig.FLAVOR;

    static {
        C13030ar arVar = new C13030ar();
        f40453c = arVar;
        C62942bv.registerDefaultInstance(C13030ar.class, arVar);
    }

    private C13030ar() {
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
                return newMessageInfo(f40453c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13030ar();
            case 4:
                return new C13029aq();
            case 5:
                return f40453c;
            case 6:
                C63010eb ebVar = f40454d;
                if (ebVar == null) {
                    synchronized (C13030ar.class) {
                        ebVar = f40454d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40453c);
                            f40454d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
