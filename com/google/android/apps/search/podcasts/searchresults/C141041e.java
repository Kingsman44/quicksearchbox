package com.google.android.apps.search.podcasts.searchresults;

import com.evernote.android.state.BuildConfig;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.searchresults.e */
/* compiled from: PG */
public final class C141041e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141041e f382899c;

    /* renamed from: d */
    private static volatile C63010eb f382900d;

    /* renamed from: a */
    public String f382901a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C54297aa f382902b;

    static {
        C141041e eVar = new C141041e();
        f382899c = eVar;
        C62942bv.registerDefaultInstance(C141041e.class, eVar);
    }

    private C141041e() {
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
                return newMessageInfo(f382899c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C141041e();
            case 4:
                return new C141040d();
            case 5:
                return f382899c;
            case 6:
                C63010eb ebVar = f382900d;
                if (ebVar == null) {
                    synchronized (C141041e.class) {
                        ebVar = f382900d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382899c);
                            f382900d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
