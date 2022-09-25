package com.google.android.libraries.search.assistant.performer.deviceactions.p2749b.p2750a.p2751a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.b.a.a.b */
/* compiled from: PG */
public final class C35901b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C35901b f94041c;

    /* renamed from: d */
    private static volatile C63010eb f94042d;

    /* renamed from: a */
    public int f94043a;

    /* renamed from: b */
    public String f94044b = BuildConfig.FLAVOR;

    static {
        C35901b bVar = new C35901b();
        f94041c = bVar;
        C62942bv.registerDefaultInstance(C35901b.class, bVar);
    }

    private C35901b() {
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
                return newMessageInfo(f94041c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C35901b();
            case 4:
                return new C35900a();
            case 5:
                return f94041c;
            case 6:
                C63010eb ebVar = f94042d;
                if (ebVar == null) {
                    synchronized (C35901b.class) {
                        ebVar = f94042d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f94041c);
                            f94042d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
