package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.b.q */
/* compiled from: PG */
public final class C96917q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C96917q f270902c;

    /* renamed from: d */
    public static final C62940bt f270903d;

    /* renamed from: f */
    private static volatile C63010eb f270904f;

    /* renamed from: a */
    public int f270905a;

    /* renamed from: b */
    public C88474x f270906b;

    /* renamed from: e */
    private byte f270907e = 2;

    static {
        C96917q qVar = new C96917q();
        f270902c = qVar;
        C62942bv.registerDefaultInstance(C96917q.class, qVar);
        f270903d = C62942bv.newSingularGeneratedExtension(C118476ak.f328838a, qVar, qVar, (C62958ce) null, 228289081, C63066gd.MESSAGE, C96917q.class);
    }

    private C96917q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f270907e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f270907e = b;
                return null;
            case 2:
                return newMessageInfo(f270902c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C96917q();
            case 4:
                return new C96916p();
            case 5:
                return f270902c;
            case 6:
                C63010eb ebVar = f270904f;
                if (ebVar == null) {
                    synchronized (C96917q.class) {
                        ebVar = f270904f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f270902c);
                            f270904f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
