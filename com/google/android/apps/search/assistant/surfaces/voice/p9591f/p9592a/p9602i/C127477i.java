package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.i.i */
/* compiled from: PG */
public final class C127477i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127477i f350991c;

    /* renamed from: d */
    private static volatile C63010eb f350992d;

    /* renamed from: a */
    public C119834cb f350993a;

    /* renamed from: b */
    public C127465c f350994b;

    static {
        C127477i iVar = new C127477i();
        f350991c = iVar;
        C62942bv.registerDefaultInstance(C127477i.class, iVar);
    }

    private C127477i() {
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
                return newMessageInfo(f350991c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C127477i();
            case 4:
                return new C127476h();
            case 5:
                return f350991c;
            case 6:
                C63010eb ebVar = f350992d;
                if (ebVar == null) {
                    synchronized (C127477i.class) {
                        ebVar = f350992d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350991c);
                            f350992d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
