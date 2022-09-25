package com.google.android.apps.search.googleapp.launcher.p10341b.p10349g;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.g.f */
/* compiled from: PG */
public final class C136479f extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C136479f f371574i;

    /* renamed from: j */
    private static volatile C63010eb f371575j;

    /* renamed from: a */
    public int f371576a;

    /* renamed from: b */
    public C136475b f371577b;

    /* renamed from: c */
    public C62971cq f371578c = emptyProtobufList();

    /* renamed from: d */
    public C136475b f371579d;

    /* renamed from: e */
    public C136475b f371580e;

    /* renamed from: f */
    public boolean f371581f;

    /* renamed from: g */
    public int f371582g;

    /* renamed from: h */
    public int f371583h;

    static {
        C136479f fVar = new C136479f();
        f371574i = fVar;
        C62942bv.registerDefaultInstance(C136479f.class, fVar);
    }

    private C136479f() {
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
                return newMessageInfo(f371574i, "\u0001\u0007\u0000\u0001\u0004\u0013\u0007\u0000\u0001\u0000\u0004ဉ\u0004\u0006\u001b\u0007ဉ\u0007\fဉ\f\rဇ\r\u0011ဌ\u000f\u0013ဌ\u0011", new Object[]{"a", "b", C45240c.f118157a, C136477d.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C136484k.f371589a, C19618h.f54585a, C136482i.f371588a});
            case 3:
                return new C136479f();
            case 4:
                return new C136478e();
            case 5:
                return f371574i;
            case 6:
                C63010eb ebVar = f371575j;
                if (ebVar == null) {
                    synchronized (C136479f.class) {
                        ebVar = f371575j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371574i);
                            f371575j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
