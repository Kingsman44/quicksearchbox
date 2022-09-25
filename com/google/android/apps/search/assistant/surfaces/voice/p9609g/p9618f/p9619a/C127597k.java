package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.a.k */
/* compiled from: PG */
public final class C127597k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127597k f351297b;

    /* renamed from: c */
    private static volatile C63010eb f351298c;

    /* renamed from: a */
    public C127593g f351299a;

    static {
        C127597k kVar = new C127597k();
        f351297b = kVar;
        C62942bv.registerDefaultInstance(C127597k.class, kVar);
    }

    private C127597k() {
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
                return newMessageInfo(f351297b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C127597k();
            case 4:
                return new C127596j();
            case 5:
                return f351297b;
            case 6:
                C63010eb ebVar = f351298c;
                if (ebVar == null) {
                    synchronized (C127597k.class) {
                        ebVar = f351298c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351297b);
                            f351298c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
