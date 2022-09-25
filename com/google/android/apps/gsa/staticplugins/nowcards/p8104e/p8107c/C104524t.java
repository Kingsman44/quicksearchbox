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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.t */
/* compiled from: PG */
public final class C104524t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C104524t f290728a;

    /* renamed from: b */
    public static final C62940bt f290729b = C62942bv.newSingularGeneratedExtension(C91835c.f256110a, C104522r.f290723d, C104522r.f290723d, (C62958ce) null, 208545314, C63066gd.MESSAGE, C104522r.class);

    /* renamed from: c */
    private static volatile C63010eb f290730c;

    static {
        C104524t tVar = new C104524t();
        f290728a = tVar;
        C62942bv.registerDefaultInstance(C104524t.class, tVar);
    }

    private C104524t() {
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
                return newMessageInfo(f290728a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C104524t();
            case 4:
                return new C104523s();
            case 5:
                return f290728a;
            case 6:
                C63010eb ebVar = f290730c;
                if (ebVar == null) {
                    synchronized (C104524t.class) {
                        ebVar = f290730c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290728a);
                            f290730c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
