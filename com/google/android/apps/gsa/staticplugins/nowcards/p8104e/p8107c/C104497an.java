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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.an */
/* compiled from: PG */
public final class C104497an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C104497an f290642a;

    /* renamed from: b */
    public static final C62940bt f290643b = C62942bv.newSingularGeneratedExtension(C91835c.f256110a, C104495al.f290638b, C104495al.f290638b, (C62958ce) null, 217394716, C63066gd.MESSAGE, C104495al.class);

    /* renamed from: c */
    private static volatile C63010eb f290644c;

    static {
        C104497an anVar = new C104497an();
        f290642a = anVar;
        C62942bv.registerDefaultInstance(C104497an.class, anVar);
    }

    private C104497an() {
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
                return newMessageInfo(f290642a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C104497an();
            case 4:
                return new C104496am();
            case 5:
                return f290642a;
            case 6:
                C63010eb ebVar = f290644c;
                if (ebVar == null) {
                    synchronized (C104497an.class) {
                        ebVar = f290644c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290642a);
                            f290644c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
