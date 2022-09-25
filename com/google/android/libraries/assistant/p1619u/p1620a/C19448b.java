package com.google.android.libraries.assistant.p1619u.p1620a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.u.a.b */
/* compiled from: PG */
public final class C19448b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19448b f54378c;

    /* renamed from: d */
    private static volatile C63010eb f54379d;

    /* renamed from: a */
    public int f54380a;

    /* renamed from: b */
    public String f54381b = BuildConfig.FLAVOR;

    static {
        C19448b bVar = new C19448b();
        f54378c = bVar;
        C62942bv.registerDefaultInstance(C19448b.class, bVar);
    }

    private C19448b() {
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
                return newMessageInfo(f54378c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C19448b();
            case 4:
                return new C19447a();
            case 5:
                return f54378c;
            case 6:
                C63010eb ebVar = f54379d;
                if (ebVar == null) {
                    synchronized (C19448b.class) {
                        ebVar = f54379d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54378c);
                            f54379d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
