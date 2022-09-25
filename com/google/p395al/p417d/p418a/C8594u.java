package com.google.p395al.p417d.p418a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.al.d.a.u */
/* compiled from: PG */
public final class C8594u extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8594u f29735f;

    /* renamed from: g */
    public static final C62940bt f29736g;

    /* renamed from: i */
    private static volatile C63010eb f29737i;

    /* renamed from: a */
    public int f29738a;

    /* renamed from: b */
    public boolean f29739b;

    /* renamed from: c */
    public C55349pb f29740c;

    /* renamed from: d */
    public int f29741d;

    /* renamed from: e */
    public C58179b f29742e;

    /* renamed from: h */
    private byte f29743h = 2;

    static {
        C8594u uVar = new C8594u();
        f29735f = uVar;
        C62942bv.registerDefaultInstance(C8594u.class, uVar);
        f29736g = C62942bv.newSingularGeneratedExtension(C8523ac.f29564e, uVar, uVar, (C62958ce) null, 102, C63066gd.MESSAGE, C8594u.class);
    }

    private C8594u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29743h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29743h = b;
                return null;
            case 2:
                return newMessageInfo(f29735f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8594u();
            case 4:
                return new C8593t();
            case 5:
                return f29735f;
            case 6:
                C63010eb ebVar = f29737i;
                if (ebVar == null) {
                    synchronized (C8594u.class) {
                        ebVar = f29737i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29735f);
                            f29737i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
