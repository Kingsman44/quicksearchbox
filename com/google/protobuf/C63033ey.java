package com.google.protobuf;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.protobuf.ey */
/* compiled from: PG */
public final class C63033ey extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63033ey f170139b;

    /* renamed from: c */
    private static volatile C63010eb f170140c;

    /* renamed from: a */
    public String f170141a = BuildConfig.FLAVOR;

    static {
        C63033ey eyVar = new C63033ey();
        f170139b = eyVar;
        C62942bv.registerDefaultInstance(C63033ey.class, eyVar);
    }

    private C63033ey() {
    }

    /* renamed from: a */
    public static C63033ey m95859a(String str) {
        C63032ex exVar = (C63032ex) f170139b.createBuilder();
        exVar.copyOnWrite();
        str.getClass();
        ((C63033ey) exVar.instance).f170141a = str;
        return (C63033ey) exVar.build();
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
                return newMessageInfo(f170139b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C63033ey();
            case 4:
                return new C63032ex();
            case 5:
                return f170139b;
            case 6:
                C63010eb ebVar = f170140c;
                if (ebVar == null) {
                    synchronized (C63033ey.class) {
                        ebVar = f170140c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170139b);
                            f170140c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
