package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.au */
/* compiled from: PG */
public final class C124450au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124450au f343453c;

    /* renamed from: e */
    private static volatile C63010eb f343454e;

    /* renamed from: a */
    public int f343455a;

    /* renamed from: b */
    public C119844cl f343456b;

    /* renamed from: d */
    private byte f343457d = 2;

    static {
        C124450au auVar = new C124450au();
        f343453c = auVar;
        C62942bv.registerDefaultInstance(C124450au.class, auVar);
    }

    private C124450au() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f343457d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f343457d = b;
                return null;
            case 2:
                return newMessageInfo(f343453c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124450au();
            case 4:
                return new C124449at();
            case 5:
                return f343453c;
            case 6:
                C63010eb ebVar = f343454e;
                if (ebVar == null) {
                    synchronized (C124450au.class) {
                        ebVar = f343454e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343453c);
                            f343454e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
