package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.e */
/* compiled from: PG */
public final class C129954e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129954e f356419c;

    /* renamed from: d */
    private static volatile C63010eb f356420d;

    /* renamed from: a */
    public String f356421a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f356422b = BuildConfig.FLAVOR;

    static {
        C129954e eVar = new C129954e();
        f356419c = eVar;
        C62942bv.registerDefaultInstance(C129954e.class, eVar);
    }

    private C129954e() {
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
                return newMessageInfo(f356419c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C129954e();
            case 4:
                return new C129953d();
            case 5:
                return f356419c;
            case 6:
                C63010eb ebVar = f356420d;
                if (ebVar == null) {
                    synchronized (C129954e.class) {
                        ebVar = f356420d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356419c);
                            f356420d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
