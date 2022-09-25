package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.g */
/* compiled from: PG */
public final class C129956g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129956g f356423c;

    /* renamed from: d */
    private static volatile C63010eb f356424d;

    /* renamed from: a */
    public String f356425a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f356426b = BuildConfig.FLAVOR;

    static {
        C129956g gVar = new C129956g();
        f356423c = gVar;
        C62942bv.registerDefaultInstance(C129956g.class, gVar);
    }

    private C129956g() {
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
                return newMessageInfo(f356423c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C129956g();
            case 4:
                return new C129955f();
            case 5:
                return f356423c;
            case 6:
                C63010eb ebVar = f356424d;
                if (ebVar == null) {
                    synchronized (C129956g.class) {
                        ebVar = f356424d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356423c);
                            f356424d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
