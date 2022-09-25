package com.google.android.apps.gsa.search.core.state.p6875g;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.core.state.g.b */
/* compiled from: PG */
public final class C87067b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87067b f235250e;

    /* renamed from: f */
    public static final C62940bt f235251f;

    /* renamed from: h */
    private static volatile C63010eb f235252h;

    /* renamed from: a */
    public int f235253a;

    /* renamed from: b */
    public C90488d f235254b;

    /* renamed from: c */
    public C62971cq f235255c = emptyProtobufList();

    /* renamed from: d */
    public boolean f235256d;

    /* renamed from: g */
    private byte f235257g = 2;

    static {
        C87067b bVar = new C87067b();
        f235250e = bVar;
        C62942bv.registerDefaultInstance(C87067b.class, bVar);
        f235251f = C62942bv.newSingularGeneratedExtension(C88433bd.f239087e, bVar, bVar, (C62958ce) null, 132269847, C63066gd.MESSAGE, C87067b.class);
    }

    private C87067b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f235257g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f235257g = b;
                return null;
            case 2:
                return newMessageInfo(f235250e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001c\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C87067b();
            case 4:
                return new C87066a();
            case 5:
                return f235250e;
            case 6:
                C63010eb ebVar = f235252h;
                if (ebVar == null) {
                    synchronized (C87067b.class) {
                        ebVar = f235252h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235250e);
                            f235252h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
