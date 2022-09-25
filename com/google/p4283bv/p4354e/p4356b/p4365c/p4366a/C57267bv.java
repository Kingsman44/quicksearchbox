package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.C57051b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.c.a.bv */
/* compiled from: PG */
public final class C57267bv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f152869e = new C57265bt();

    /* renamed from: j */
    public static final C57267bv f152870j;

    /* renamed from: k */
    public static final C62940bt f152871k;

    /* renamed from: m */
    private static volatile C63010eb f152872m;

    /* renamed from: a */
    public int f152873a;

    /* renamed from: b */
    public C57338u f152874b;

    /* renamed from: c */
    public C57262bq f152875c;

    /* renamed from: d */
    public C62961ch f152876d = emptyIntList();

    /* renamed from: f */
    public C57340w f152877f;

    /* renamed from: g */
    public C62971cq f152878g = emptyProtobufList();

    /* renamed from: h */
    public C57250be f152879h;

    /* renamed from: i */
    public C57227ai f152880i;

    /* renamed from: l */
    private byte f152881l = 2;

    static {
        C57267bv bvVar = new C57267bv();
        f152870j = bvVar;
        C62942bv.registerDefaultInstance(C57267bv.class, bvVar);
        f152871k = C62942bv.newSingularGeneratedExtension(C57303dd.f152957d, bvVar, bvVar, (C62958ce) null, 1000, C63066gd.MESSAGE, C57267bv.class);
    }

    private C57267bv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152881l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152881l = b;
                return null;
            case 2:
                return newMessageInfo(f152870j, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0002\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004\u001e\u0005ဉ\u0002\fЛ\rဉ\u0003\u000eဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C57325h.m88317b(), C10662f.f35572a, C30325g.f82003a, C57051b.class, C19618h.f54585a, "i"});
            case 3:
                return new C57267bv();
            case 4:
                return new C57266bu();
            case 5:
                return f152870j;
            case 6:
                C63010eb ebVar = f152872m;
                if (ebVar == null) {
                    synchronized (C57267bv.class) {
                        ebVar = f152872m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152870j);
                            f152872m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
