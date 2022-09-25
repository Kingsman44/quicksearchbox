package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.k */
/* compiled from: PG */
public final class C127547k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127547k f351196c;

    /* renamed from: e */
    private static volatile C63010eb f351197e;

    /* renamed from: a */
    public C34053bp f351198a;

    /* renamed from: b */
    public int f351199b;

    /* renamed from: d */
    private byte f351200d = 2;

    static {
        C127547k kVar = new C127547k();
        f351196c = kVar;
        C62942bv.registerDefaultInstance(C127547k.class, kVar);
    }

    private C127547k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f351200d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f351200d = b;
                return null;
            case 2:
                return newMessageInfo(f351196c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C127547k();
            case 4:
                return new C127545i();
            case 5:
                return f351196c;
            case 6:
                C63010eb ebVar = f351197e;
                if (ebVar == null) {
                    synchronized (C127547k.class) {
                        ebVar = f351197e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351196c);
                            f351197e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
