package com.google.android.apps.gsa.smartspace.p7259c;

import com.google.assistant.p3886c.C50712ax;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.smartspace.c.l */
/* compiled from: PG */
public final class C92096l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C92096l f256787c;

    /* renamed from: d */
    public static final C62940bt f256788d;

    /* renamed from: f */
    private static volatile C63010eb f256789f;

    /* renamed from: a */
    public int f256790a;

    /* renamed from: b */
    public C53287ih f256791b;

    /* renamed from: e */
    private byte f256792e = 2;

    static {
        C92096l lVar = new C92096l();
        f256787c = lVar;
        C62942bv.registerDefaultInstance(C92096l.class, lVar);
        f256788d = C62942bv.newSingularGeneratedExtension(C50712ax.f131969a, lVar, lVar, (C62958ce) null, 101, C63066gd.MESSAGE, C92096l.class);
    }

    private C92096l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f256792e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f256792e = b;
                return null;
            case 2:
                return newMessageInfo(f256787c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C92096l();
            case 4:
                return new C92095k();
            case 5:
                return f256787c;
            case 6:
                C63010eb ebVar = f256789f;
                if (ebVar == null) {
                    synchronized (C92096l.class) {
                        ebVar = f256789f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256787c);
                            f256789f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
