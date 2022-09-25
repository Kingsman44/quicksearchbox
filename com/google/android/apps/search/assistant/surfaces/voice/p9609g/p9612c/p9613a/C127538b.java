package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.b */
/* compiled from: PG */
public final class C127538b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127538b f351181b;

    /* renamed from: d */
    private static volatile C63010eb f351182d;

    /* renamed from: a */
    public C127547k f351183a;

    /* renamed from: c */
    private byte f351184c = 2;

    static {
        C127538b bVar = new C127538b();
        f351181b = bVar;
        C62942bv.registerDefaultInstance(C127538b.class, bVar);
    }

    private C127538b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f351184c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f351184c = b;
                return null;
            case 2:
                return newMessageInfo(f351181b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C127538b();
            case 4:
                return new C127537a();
            case 5:
                return f351181b;
            case 6:
                C63010eb ebVar = f351182d;
                if (ebVar == null) {
                    synchronized (C127538b.class) {
                        ebVar = f351182d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351181b);
                            f351182d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
