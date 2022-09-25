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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.av */
/* compiled from: PG */
public final class C104505av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C104505av f290660a;

    /* renamed from: b */
    public static final C62940bt f290661b = C62942bv.newSingularGeneratedExtension(C91835c.f256110a, C104503at.f290655d, C104503at.f290655d, (C62958ce) null, 238503121, C63066gd.MESSAGE, C104503at.class);

    /* renamed from: c */
    private static volatile C63010eb f290662c;

    static {
        C104505av avVar = new C104505av();
        f290660a = avVar;
        C62942bv.registerDefaultInstance(C104505av.class, avVar);
    }

    private C104505av() {
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
                return newMessageInfo(f290660a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C104505av();
            case 4:
                return new C104504au();
            case 5:
                return f290660a;
            case 6:
                C63010eb ebVar = f290662c;
                if (ebVar == null) {
                    synchronized (C104505av.class) {
                        ebVar = f290662c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290660a);
                            f290662c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
