package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.al */
/* compiled from: PG */
public final class C121558al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121558al f337306c;

    /* renamed from: d */
    private static volatile C63010eb f337307d;

    /* renamed from: a */
    public String f337308a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f337309b;

    static {
        C121558al alVar = new C121558al();
        f337306c = alVar;
        C62942bv.registerDefaultInstance(C121558al.class, alVar);
    }

    private C121558al() {
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
                return newMessageInfo(f337306c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C121558al();
            case 4:
                return new C121557ak();
            case 5:
                return f337306c;
            case 6:
                C63010eb ebVar = f337307d;
                if (ebVar == null) {
                    synchronized (C121558al.class) {
                        ebVar = f337307d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337306c);
                            f337307d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
