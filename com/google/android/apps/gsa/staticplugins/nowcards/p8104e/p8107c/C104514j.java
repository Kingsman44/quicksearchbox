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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.j */
/* compiled from: PG */
public final class C104514j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C104514j f290689a;

    /* renamed from: b */
    public static final C62940bt f290690b = C62942bv.newSingularGeneratedExtension(C91835c.f256110a, C104512h.f290683e, C104512h.f290683e, (C62958ce) null, 232346673, C63066gd.MESSAGE, C104512h.class);

    /* renamed from: c */
    private static volatile C63010eb f290691c;

    static {
        C104514j jVar = new C104514j();
        f290689a = jVar;
        C62942bv.registerDefaultInstance(C104514j.class, jVar);
    }

    private C104514j() {
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
                return newMessageInfo(f290689a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C104514j();
            case 4:
                return new C104513i();
            case 5:
                return f290689a;
            case 6:
                C63010eb ebVar = f290691c;
                if (ebVar == null) {
                    synchronized (C104514j.class) {
                        ebVar = f290691c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290689a);
                            f290691c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
