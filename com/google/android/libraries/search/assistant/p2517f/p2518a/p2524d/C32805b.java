package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.b */
/* compiled from: PG */
public final class C32805b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32805b f87984c;

    /* renamed from: d */
    private static volatile C63010eb f87985d;

    /* renamed from: a */
    public C63088z f87986a = C63088z.f170246b;

    /* renamed from: b */
    public String f87987b = BuildConfig.FLAVOR;

    static {
        C32805b bVar = new C32805b();
        f87984c = bVar;
        C62942bv.registerDefaultInstance(C32805b.class, bVar);
    }

    private C32805b() {
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
                return newMessageInfo(f87984c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C32805b();
            case 4:
                return new C32778a();
            case 5:
                return f87984c;
            case 6:
                C63010eb ebVar = f87985d;
                if (ebVar == null) {
                    synchronized (C32805b.class) {
                        ebVar = f87985d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87984c);
                            f87985d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
