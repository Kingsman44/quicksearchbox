package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.si */
/* compiled from: PG */
public final class C88186si extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88186si f238392c;

    /* renamed from: e */
    private static volatile C63010eb f238393e;

    /* renamed from: a */
    public int f238394a = 0;

    /* renamed from: b */
    public Object f238395b;

    /* renamed from: d */
    private byte f238396d = 2;

    static {
        C88186si siVar = new C88186si();
        f238392c = siVar;
        C62942bv.registerDefaultInstance(C88186si.class, siVar);
    }

    private C88186si() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238396d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238396d = b;
                return null;
            case 2:
                return newMessageInfo(f238392c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဵ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C88431bb.class});
            case 3:
                return new C88186si();
            case 4:
                return new C88185sh();
            case 5:
                return f238392c;
            case 6:
                C63010eb ebVar = f238393e;
                if (ebVar == null) {
                    synchronized (C88186si.class) {
                        ebVar = f238393e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238392c);
                            f238393e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
