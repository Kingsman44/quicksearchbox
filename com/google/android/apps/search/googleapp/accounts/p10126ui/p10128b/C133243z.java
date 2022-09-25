package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.z */
/* compiled from: PG */
public final class C133243z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133243z f363163c;

    /* renamed from: d */
    private static volatile C63010eb f363164d;

    /* renamed from: a */
    public int f363165a;

    /* renamed from: b */
    public boolean f363166b;

    static {
        C133243z zVar = new C133243z();
        f363163c = zVar;
        C62942bv.registerDefaultInstance(C133243z.class, zVar);
    }

    private C133243z() {
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
                return newMessageInfo(f363163c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C133243z();
            case 4:
                return new C133242y();
            case 5:
                return f363163c;
            case 6:
                C63010eb ebVar = f363164d;
                if (ebVar == null) {
                    synchronized (C133243z.class) {
                        ebVar = f363164d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363163c);
                            f363164d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
