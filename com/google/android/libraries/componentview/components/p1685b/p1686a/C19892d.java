package com.google.android.libraries.componentview.components.p1685b.p1686a;

import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19984g;
import com.google.android.libraries.componentview.components.base.p1687a.C19986i;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.b.a.d */
/* compiled from: PG */
public final class C19892d extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C19892d f55637k;

    /* renamed from: l */
    public static final C62940bt f55638l;

    /* renamed from: m */
    private static volatile C63010eb f55639m;

    /* renamed from: a */
    public int f55640a;

    /* renamed from: b */
    public C62971cq f55641b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f55642c;

    /* renamed from: d */
    public int f55643d;

    /* renamed from: e */
    public boolean f55644e;

    /* renamed from: f */
    public int f55645f;

    /* renamed from: g */
    public float f55646g;

    /* renamed from: h */
    public boolean f55647h;

    /* renamed from: i */
    public int f55648i;

    /* renamed from: j */
    public C19916aq f55649j;

    static {
        C19892d dVar = new C19892d();
        f55637k = dVar;
        C62942bv.registerDefaultInstance(C19892d.class, dVar);
        f55638l = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, dVar, dVar, (C62958ce) null, 116604373, C63066gd.MESSAGE, C19892d.class);
    }

    private C19892d() {
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
                return newMessageInfo(f55637k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဌ\u0001\u0004ဇ\u0002\u0005ဌ\u0003\u0006ခ\u0004\bဇ\u0005\tဌ\u0006\u000bဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C19890b.f55636a, "e", C10662f.f35572a, C19984g.f56010a, C30325g.f82003a, C19618h.f54585a, "i", C19986i.f56011a, "j"});
            case 3:
                return new C19892d();
            case 4:
                return new C19889a();
            case 5:
                return f55637k;
            case 6:
                C63010eb ebVar = f55639m;
                if (ebVar == null) {
                    synchronized (C19892d.class) {
                        ebVar = f55639m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55637k);
                            f55639m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
