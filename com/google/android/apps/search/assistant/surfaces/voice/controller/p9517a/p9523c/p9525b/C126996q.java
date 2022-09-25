package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.q */
/* compiled from: PG */
public final class C126996q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C126996q f349705c;

    /* renamed from: d */
    private static volatile C63010eb f349706d;

    /* renamed from: a */
    public int f349707a;

    /* renamed from: b */
    public String f349708b = BuildConfig.FLAVOR;

    static {
        C126996q qVar = new C126996q();
        f349705c = qVar;
        C62942bv.registerDefaultInstance(C126996q.class, qVar);
    }

    private C126996q() {
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
                return newMessageInfo(f349705c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C126996q();
            case 4:
                return new C126995p();
            case 5:
                return f349705c;
            case 6:
                C63010eb ebVar = f349706d;
                if (ebVar == null) {
                    synchronized (C126996q.class) {
                        ebVar = f349706d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349705c);
                            f349706d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
