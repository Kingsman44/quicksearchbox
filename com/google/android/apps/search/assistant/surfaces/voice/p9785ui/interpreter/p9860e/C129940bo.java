package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bo */
/* compiled from: PG */
public final class C129940bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129940bo f356407c;

    /* renamed from: d */
    private static volatile C63010eb f356408d;

    /* renamed from: a */
    public int f356409a = 0;

    /* renamed from: b */
    public Object f356410b;

    static {
        C129940bo boVar = new C129940bo();
        f356407c = boVar;
        C62942bv.registerDefaultInstance(C129940bo.class, boVar);
    }

    private C129940bo() {
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
                return newMessageInfo(f356407c, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", C51910dq.class, C119904w.class, C129910as.class, C129932bg.class, C129936bk.class, C129926ba.class, C129938bm.class});
            case 3:
                return new C129940bo();
            case 4:
                return new C129939bn();
            case 5:
                return f356407c;
            case 6:
                C63010eb ebVar = f356408d;
                if (ebVar == null) {
                    synchronized (C129940bo.class) {
                        ebVar = f356408d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356407c);
                            f356408d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
