package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.base.a.bg */
/* compiled from: PG */
public final class C19933bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19933bg f55781c;

    /* renamed from: d */
    public static final C62940bt f55782d;

    /* renamed from: e */
    private static volatile C63010eb f55783e;

    /* renamed from: a */
    public int f55784a;

    /* renamed from: b */
    public C19941bo f55785b;

    static {
        C19933bg bgVar = new C19933bg();
        f55781c = bgVar;
        C62942bv.registerDefaultInstance(C19933bg.class, bgVar);
        f55782d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bgVar, bgVar, (C62958ce) null, 108299469, C63066gd.MESSAGE, C19933bg.class);
    }

    private C19933bg() {
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
                return newMessageInfo(f55781c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C19933bg();
            case 4:
                return new C19932bf();
            case 5:
                return f55781c;
            case 6:
                C63010eb ebVar = f55783e;
                if (ebVar == null) {
                    synchronized (C19933bg.class) {
                        ebVar = f55783e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55781c);
                            f55783e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
