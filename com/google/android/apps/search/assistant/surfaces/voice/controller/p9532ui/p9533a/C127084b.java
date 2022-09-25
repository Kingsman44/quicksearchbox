package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.b */
/* compiled from: PG */
public final class C127084b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127084b f349934c;

    /* renamed from: e */
    private static volatile C63010eb f349935e;

    /* renamed from: a */
    public int f349936a;

    /* renamed from: b */
    public C127289i f349937b;

    /* renamed from: d */
    private byte f349938d = 2;

    static {
        C127084b bVar = new C127084b();
        f349934c = bVar;
        C62942bv.registerDefaultInstance(C127084b.class, bVar);
    }

    private C127084b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f349938d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f349938d = b;
                return null;
            case 2:
                return newMessageInfo(f349934c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127084b();
            case 4:
                return new C127083a();
            case 5:
                return f349934c;
            case 6:
                C63010eb ebVar = f349935e;
                if (ebVar == null) {
                    synchronized (C127084b.class) {
                        ebVar = f349935e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349934c);
                            f349935e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
