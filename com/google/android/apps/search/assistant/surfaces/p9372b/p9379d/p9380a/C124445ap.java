package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.ap */
/* compiled from: PG */
public final class C124445ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124445ap f343445c;

    /* renamed from: d */
    private static volatile C63010eb f343446d;

    /* renamed from: a */
    public int f343447a;

    /* renamed from: b */
    public C119904w f343448b;

    static {
        C124445ap apVar = new C124445ap();
        f343445c = apVar;
        C62942bv.registerDefaultInstance(C124445ap.class, apVar);
    }

    private C124445ap() {
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
                return newMessageInfo(f343445c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124445ap();
            case 4:
                return new C124444ao();
            case 5:
                return f343445c;
            case 6:
                C63010eb ebVar = f343446d;
                if (ebVar == null) {
                    synchronized (C124445ap.class) {
                        ebVar = f343446d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343445c);
                            f343446d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
