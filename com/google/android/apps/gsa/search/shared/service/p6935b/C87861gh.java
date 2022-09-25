package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.gh */
/* compiled from: PG */
public final class C87861gh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87861gh f237704c;

    /* renamed from: d */
    private static volatile C63010eb f237705d;

    /* renamed from: a */
    public int f237706a;

    /* renamed from: b */
    public int f237707b = 268;

    static {
        C87861gh ghVar = new C87861gh();
        f237704c = ghVar;
        C62942bv.registerDefaultInstance(C87861gh.class, ghVar);
    }

    private C87861gh() {
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
                return newMessageInfo(f237704c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C118575h.m196866b()});
            case 3:
                return new C87861gh();
            case 4:
                return new C87860gg();
            case 5:
                return f237704c;
            case 6:
                C63010eb ebVar = f237705d;
                if (ebVar == null) {
                    synchronized (C87861gh.class) {
                        ebVar = f237705d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237704c);
                            f237705d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
