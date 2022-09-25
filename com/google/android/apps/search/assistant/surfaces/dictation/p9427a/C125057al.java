package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.al */
/* compiled from: PG */
public final class C125057al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125057al f345027c;

    /* renamed from: d */
    private static volatile C63010eb f345028d;

    /* renamed from: a */
    public String f345029a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f345030b = BuildConfig.FLAVOR;

    static {
        C125057al alVar = new C125057al();
        f345027c = alVar;
        C62942bv.registerDefaultInstance(C125057al.class, alVar);
    }

    private C125057al() {
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
                return newMessageInfo(f345027c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C125057al();
            case 4:
                return new C125056ak();
            case 5:
                return f345027c;
            case 6:
                C63010eb ebVar = f345028d;
                if (ebVar == null) {
                    synchronized (C125057al.class) {
                        ebVar = f345028d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345027c);
                            f345028d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
