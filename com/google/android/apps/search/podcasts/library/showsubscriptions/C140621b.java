package com.google.android.apps.search.podcasts.library.showsubscriptions;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.b */
/* compiled from: PG */
public final class C140621b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140621b f381913c;

    /* renamed from: d */
    private static volatile C63010eb f381914d;

    /* renamed from: a */
    public String f381915a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f381916b;

    static {
        C140621b bVar = new C140621b();
        f381913c = bVar;
        C62942bv.registerDefaultInstance(C140621b.class, bVar);
    }

    private C140621b() {
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
                return newMessageInfo(f381913c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C140621b();
            case 4:
                return new C140616a();
            case 5:
                return f381913c;
            case 6:
                C63010eb ebVar = f381914d;
                if (ebVar == null) {
                    synchronized (C140621b.class) {
                        ebVar = f381914d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381913c);
                            f381914d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
