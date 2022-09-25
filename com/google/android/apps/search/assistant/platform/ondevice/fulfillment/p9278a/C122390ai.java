package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ai */
/* compiled from: PG */
public final class C122390ai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C122390ai f339304d;

    /* renamed from: e */
    private static volatile C63010eb f339305e;

    /* renamed from: a */
    public String f339306a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f339307b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C122448cm f339308c;

    static {
        C122390ai aiVar = new C122390ai();
        f339304d = aiVar;
        C62942bv.registerDefaultInstance(C122390ai.class, aiVar);
    }

    private C122390ai() {
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
                return newMessageInfo(f339304d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C122390ai();
            case 4:
                return new C122389ah();
            case 5:
                return f339304d;
            case 6:
                C63010eb ebVar = f339305e;
                if (ebVar == null) {
                    synchronized (C122390ai.class) {
                        ebVar = f339305e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339304d);
                            f339305e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
