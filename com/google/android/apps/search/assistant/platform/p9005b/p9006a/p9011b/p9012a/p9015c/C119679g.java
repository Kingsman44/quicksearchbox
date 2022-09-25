package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.a.c.g */
/* compiled from: PG */
public final class C119679g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119679g f333474b;

    /* renamed from: c */
    private static volatile C63010eb f333475c;

    /* renamed from: a */
    public String f333476a = BuildConfig.FLAVOR;

    static {
        C119679g gVar = new C119679g();
        f333474b = gVar;
        C62942bv.registerDefaultInstance(C119679g.class, gVar);
    }

    private C119679g() {
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
                return newMessageInfo(f333474b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C119679g();
            case 4:
                return new C119678f();
            case 5:
                return f333474b;
            case 6:
                C63010eb ebVar = f333475c;
                if (ebVar == null) {
                    synchronized (C119679g.class) {
                        ebVar = f333475c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333474b);
                            f333475c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
