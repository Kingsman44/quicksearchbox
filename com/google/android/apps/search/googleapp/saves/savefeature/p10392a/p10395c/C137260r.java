package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.r */
/* compiled from: PG */
public final class C137260r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C137260r f373427b;

    /* renamed from: d */
    private static volatile C63010eb f373428d;

    /* renamed from: a */
    public C57569am f373429a;

    /* renamed from: c */
    private byte f373430c = 2;

    static {
        C137260r rVar = new C137260r();
        f373427b = rVar;
        C62942bv.registerDefaultInstance(C137260r.class, rVar);
    }

    private C137260r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373430c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f373430c = b;
                return null;
            case 2:
                return newMessageInfo(f373427b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C137260r();
            case 4:
                return new C137259q();
            case 5:
                return f373427b;
            case 6:
                C63010eb ebVar = f373428d;
                if (ebVar == null) {
                    synchronized (C137260r.class) {
                        ebVar = f373428d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373427b);
                            f373428d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
