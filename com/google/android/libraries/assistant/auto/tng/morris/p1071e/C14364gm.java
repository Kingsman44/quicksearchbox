package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gm */
/* compiled from: PG */
public final class C14364gm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14364gm f43462c;

    /* renamed from: d */
    private static volatile C63010eb f43463d;

    /* renamed from: a */
    public String f43464a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f43465b = BuildConfig.FLAVOR;

    static {
        C14364gm gmVar = new C14364gm();
        f43462c = gmVar;
        C62942bv.registerDefaultInstance(C14364gm.class, gmVar);
    }

    private C14364gm() {
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
                return newMessageInfo(f43462c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C14364gm();
            case 4:
                return new C14363gl();
            case 5:
                return f43462c;
            case 6:
                C63010eb ebVar = f43463d;
                if (ebVar == null) {
                    synchronized (C14364gm.class) {
                        ebVar = f43463d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43462c);
                            f43463d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
