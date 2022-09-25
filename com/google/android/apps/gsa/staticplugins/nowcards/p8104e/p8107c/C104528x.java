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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.x */
/* compiled from: PG */
public final class C104528x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C104528x f290734a;

    /* renamed from: b */
    public static final C62940bt f290735b = C62942bv.newSingularGeneratedExtension(C91835c.f256110a, C104526v.f290731b, C104526v.f290731b, (C62958ce) null, 252109087, C63066gd.MESSAGE, C104526v.class);

    /* renamed from: c */
    private static volatile C63010eb f290736c;

    static {
        C104528x xVar = new C104528x();
        f290734a = xVar;
        C62942bv.registerDefaultInstance(C104528x.class, xVar);
    }

    private C104528x() {
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
                return newMessageInfo(f290734a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C104528x();
            case 4:
                return new C104527w();
            case 5:
                return f290734a;
            case 6:
                C63010eb ebVar = f290736c;
                if (ebVar == null) {
                    synchronized (C104528x.class) {
                        ebVar = f290736c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290734a);
                            f290736c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
