package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.cb */
/* compiled from: PG */
public final class C119834cb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119834cb f333765b;

    /* renamed from: c */
    private static volatile C63010eb f333766c;

    /* renamed from: a */
    public String f333767a = BuildConfig.FLAVOR;

    static {
        C119834cb cbVar = new C119834cb();
        f333765b = cbVar;
        C62942bv.registerDefaultInstance(C119834cb.class, cbVar);
    }

    private C119834cb() {
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
                return newMessageInfo(f333765b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C119834cb();
            case 4:
                return new C119833ca();
            case 5:
                return f333765b;
            case 6:
                C63010eb ebVar = f333766c;
                if (ebVar == null) {
                    synchronized (C119834cb.class) {
                        ebVar = f333766c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333765b);
                            f333766c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
