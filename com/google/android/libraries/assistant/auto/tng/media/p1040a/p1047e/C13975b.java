package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.e.b */
/* compiled from: PG */
public final class C13975b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13975b f42550c;

    /* renamed from: d */
    private static volatile C63010eb f42551d;

    /* renamed from: a */
    public int f42552a;

    /* renamed from: b */
    public String f42553b = BuildConfig.FLAVOR;

    static {
        C13975b bVar = new C13975b();
        f42550c = bVar;
        C62942bv.registerDefaultInstance(C13975b.class, bVar);
    }

    private C13975b() {
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
                return newMessageInfo(f42550c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13975b();
            case 4:
                return new C13973a();
            case 5:
                return f42550c;
            case 6:
                C63010eb ebVar = f42551d;
                if (ebVar == null) {
                    synchronized (C13975b.class) {
                        ebVar = f42551d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42550c);
                            f42551d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
