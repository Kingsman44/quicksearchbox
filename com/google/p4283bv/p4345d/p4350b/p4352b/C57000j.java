package com.google.p4283bv.p4345d.p4350b.p4352b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7669fo;
import com.google.p4283bv.p4345d.C57025d;
import com.google.p4283bv.p4345d.C57035n;
import com.google.p4283bv.p4345d.C57037p;
import com.google.p4283bv.p4345d.C57041t;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.b.j */
/* compiled from: PG */
public final class C57000j extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C57000j f152155i;

    /* renamed from: k */
    private static volatile C63010eb f152156k;

    /* renamed from: a */
    public int f152157a;

    /* renamed from: b */
    public C7669fo f152158b;

    /* renamed from: c */
    public C60220t f152159c;

    /* renamed from: d */
    public C57041t f152160d;

    /* renamed from: e */
    public C57035n f152161e;

    /* renamed from: f */
    public C57025d f152162f;

    /* renamed from: g */
    public C57037p f152163g;

    /* renamed from: h */
    public C57057b f152164h;

    /* renamed from: j */
    private byte f152165j = 2;

    static {
        C57000j jVar = new C57000j();
        f152155i = jVar;
        C62942bv.registerDefaultInstance(C57000j.class, jVar);
    }

    private C57000j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152165j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152165j = b;
                return null;
            case 2:
                return newMessageInfo(f152155i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0005\u0001ဉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C57000j();
            case 4:
                return new C56999i();
            case 5:
                return f152155i;
            case 6:
                C63010eb ebVar = f152156k;
                if (ebVar == null) {
                    synchronized (C57000j.class) {
                        ebVar = f152156k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152155i);
                            f152156k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
