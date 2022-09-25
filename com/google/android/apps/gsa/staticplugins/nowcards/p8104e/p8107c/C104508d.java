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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.d */
/* compiled from: PG */
public final class C104508d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C104508d f290667a;

    /* renamed from: b */
    public static final C62940bt f290668b = C62942bv.newSingularGeneratedExtension(C91835c.f256110a, C104506b.f290663c, C104506b.f290663c, (C62958ce) null, 220849891, C63066gd.MESSAGE, C104506b.class);

    /* renamed from: c */
    private static volatile C63010eb f290669c;

    static {
        C104508d dVar = new C104508d();
        f290667a = dVar;
        C62942bv.registerDefaultInstance(C104508d.class, dVar);
    }

    private C104508d() {
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
                return newMessageInfo(f290667a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C104508d();
            case 4:
                return new C104507c();
            case 5:
                return f290667a;
            case 6:
                C63010eb ebVar = f290669c;
                if (ebVar == null) {
                    synchronized (C104508d.class) {
                        ebVar = f290669c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290667a);
                            f290669c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
