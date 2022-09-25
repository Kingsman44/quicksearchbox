package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bk */
/* compiled from: PG */
public final class C129936bk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C129936bk f356397d;

    /* renamed from: e */
    private static volatile C63010eb f356398e;

    /* renamed from: a */
    public int f356399a;

    /* renamed from: b */
    public boolean f356400b;

    /* renamed from: c */
    public String f356401c = BuildConfig.FLAVOR;

    static {
        C129936bk bkVar = new C129936bk();
        f356397d = bkVar;
        C62942bv.registerDefaultInstance(C129936bk.class, bkVar);
    }

    private C129936bk() {
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
                return newMessageInfo(f356397d, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003ለ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C129936bk();
            case 4:
                return new C129935bj();
            case 5:
                return f356397d;
            case 6:
                C63010eb ebVar = f356398e;
                if (ebVar == null) {
                    synchronized (C129936bk.class) {
                        ebVar = f356398e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356397d);
                            f356398e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
