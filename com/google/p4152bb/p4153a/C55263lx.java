package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
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

/* renamed from: com.google.bb.a.lx */
/* compiled from: PG */
public final class C55263lx extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C55263lx f145542i;

    /* renamed from: j */
    public static final C62940bt f145543j;

    /* renamed from: k */
    public static final C62940bt f145544k;

    /* renamed from: m */
    private static volatile C63010eb f145545m;

    /* renamed from: a */
    public int f145546a;

    /* renamed from: b */
    public C55136he f145547b;

    /* renamed from: c */
    public int f145548c;

    /* renamed from: d */
    public String f145549d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f145550e;

    /* renamed from: f */
    public C62971cq f145551f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f145552g = emptyProtobufList();

    /* renamed from: h */
    public C55192jg f145553h;

    /* renamed from: l */
    private byte f145554l = 2;

    static {
        C55263lx lxVar = new C55263lx();
        f145542i = lxVar;
        C62942bv.registerDefaultInstance(C55263lx.class, lxVar);
        C55263lx lxVar2 = lxVar;
        C55263lx lxVar3 = lxVar;
        f145543j = C62942bv.newSingularGeneratedExtension(C55365pr.f145876l, lxVar2, lxVar3, (C62958ce) null, 80591106, C63066gd.MESSAGE, C55263lx.class);
        f145544k = C62942bv.newSingularGeneratedExtension(C54976bg.f144641o, lxVar2, lxVar3, (C62958ce) null, 83436304, C63066gd.MESSAGE, C55263lx.class);
    }

    private C55263lx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145554l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145554l = b;
                return null;
            case 2:
                return newMessageInfo(f145542i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0003\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005Л\u0006Л\u0007ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C55418u.f146030a, "d", "e", C10662f.f35572a, C55253ln.class, C30325g.f82003a, C55136he.class, C19618h.f54585a});
            case 3:
                return new C55263lx();
            case 4:
                return new C55262lw();
            case 5:
                return f145542i;
            case 6:
                C63010eb ebVar = f145545m;
                if (ebVar == null) {
                    synchronized (C55263lx.class) {
                        ebVar = f145545m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145542i);
                            f145545m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
