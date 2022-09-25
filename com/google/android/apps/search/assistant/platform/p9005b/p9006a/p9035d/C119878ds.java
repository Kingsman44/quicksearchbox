package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2511d.p2512a.C32512e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ds */
/* compiled from: PG */
public final class C119878ds extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119878ds f333851c;

    /* renamed from: d */
    public static final C62940bt f333852d;

    /* renamed from: f */
    private static volatile C63010eb f333853f;

    /* renamed from: a */
    public int f333854a = 0;

    /* renamed from: b */
    public Object f333855b;

    /* renamed from: e */
    private byte f333856e = 2;

    static {
        C119878ds dsVar = new C119878ds();
        f333851c = dsVar;
        C62942bv.registerDefaultInstance(C119878ds.class, dsVar);
        f333852d = C62942bv.newSingularGeneratedExtension(C32512e.f87093e, dsVar, dsVar, (C62958ce) null, 421835928, C63066gd.MESSAGE, C119878ds.class);
    }

    private C119878ds() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333856e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333856e = b;
                return null;
            case 2:
                return newMessageInfo(f333851c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C32801aw.class, C62912at.class});
            case 3:
                return new C119878ds();
            case 4:
                return new C119877dr();
            case 5:
                return f333851c;
            case 6:
                C63010eb ebVar = f333853f;
                if (ebVar == null) {
                    synchronized (C119878ds.class) {
                        ebVar = f333853f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333851c);
                            f333853f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
