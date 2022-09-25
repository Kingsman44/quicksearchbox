package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91835c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.ad */
/* compiled from: PG */
public final class C104487ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C104487ad f290592a;

    /* renamed from: b */
    public static final C62940bt f290593b = C62942bv.newSingularGeneratedExtension(C91835c.f256110a, C104485ab.f290588c, C104485ab.f290588c, (C62958ce) null, 342160967, C63066gd.MESSAGE, C104485ab.class);

    /* renamed from: c */
    private static volatile C63010eb f290594c;

    static {
        C104487ad adVar = new C104487ad();
        f290592a = adVar;
        C62942bv.registerDefaultInstance(C104487ad.class, adVar);
    }

    private C104487ad() {
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
                return newMessageInfo(f290592a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C104487ad();
            case 4:
                return new C104486ac();
            case 5:
                return f290592a;
            case 6:
                C63010eb ebVar = f290594c;
                if (ebVar == null) {
                    synchronized (C104487ad.class) {
                        ebVar = f290594c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290592a);
                            f290594c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
