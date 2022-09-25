package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ax */
/* compiled from: PG */
public final class C122405ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122405ax f339349c;

    /* renamed from: d */
    private static volatile C63010eb f339350d;

    /* renamed from: a */
    public String f339351a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f339352b = BuildConfig.FLAVOR;

    static {
        C122405ax axVar = new C122405ax();
        f339349c = axVar;
        C62942bv.registerDefaultInstance(C122405ax.class, axVar);
    }

    private C122405ax() {
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
                return newMessageInfo(f339349c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C122405ax();
            case 4:
                return new C122404aw();
            case 5:
                return f339349c;
            case 6:
                C63010eb ebVar = f339350d;
                if (ebVar == null) {
                    synchronized (C122405ax.class) {
                        ebVar = f339350d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339349c);
                            f339350d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
