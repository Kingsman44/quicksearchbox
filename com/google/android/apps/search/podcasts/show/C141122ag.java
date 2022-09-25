package com.google.android.apps.search.podcasts.show;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.show.ag */
/* compiled from: PG */
public final class C141122ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141122ag f383149c;

    /* renamed from: d */
    private static volatile C63010eb f383150d;

    /* renamed from: a */
    public String f383151a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f383152b;

    static {
        C141122ag agVar = new C141122ag();
        f383149c = agVar;
        C62942bv.registerDefaultInstance(C141122ag.class, agVar);
    }

    private C141122ag() {
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
                return newMessageInfo(f383149c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C141122ag();
            case 4:
                return new C141121af();
            case 5:
                return f383149c;
            case 6:
                C63010eb ebVar = f383150d;
                if (ebVar == null) {
                    synchronized (C141122ag.class) {
                        ebVar = f383150d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383149c);
                            f383150d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
