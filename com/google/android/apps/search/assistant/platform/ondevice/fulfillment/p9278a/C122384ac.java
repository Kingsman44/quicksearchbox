package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ac */
/* compiled from: PG */
public final class C122384ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122384ac f339296c;

    /* renamed from: d */
    private static volatile C63010eb f339297d;

    /* renamed from: a */
    public C122106o f339298a;

    /* renamed from: b */
    public String f339299b = BuildConfig.FLAVOR;

    static {
        C122384ac acVar = new C122384ac();
        f339296c = acVar;
        C62942bv.registerDefaultInstance(C122384ac.class, acVar);
    }

    private C122384ac() {
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
                return newMessageInfo(f339296c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C122384ac();
            case 4:
                return new C122383ab();
            case 5:
                return f339296c;
            case 6:
                C63010eb ebVar = f339297d;
                if (ebVar == null) {
                    synchronized (C122384ac.class) {
                        ebVar = f339297d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339296c);
                            f339297d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
