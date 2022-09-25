package com.google.android.apps.search.googleapp.saves.p10388b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.aa */
/* compiled from: PG */
public final class C137203aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137203aa f373317c;

    /* renamed from: d */
    private static volatile C63010eb f373318d;

    /* renamed from: a */
    public boolean f373319a;

    /* renamed from: b */
    public String f373320b = BuildConfig.FLAVOR;

    static {
        C137203aa aaVar = new C137203aa();
        f373317c = aaVar;
        C62942bv.registerDefaultInstance(C137203aa.class, aaVar);
    }

    private C137203aa() {
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
                return newMessageInfo(f373317c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C137203aa();
            case 4:
                return new C137231z();
            case 5:
                return f373317c;
            case 6:
                C63010eb ebVar = f373318d;
                if (ebVar == null) {
                    synchronized (C137203aa.class) {
                        ebVar = f373318d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373317c);
                            f373318d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
