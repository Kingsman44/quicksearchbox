package com.google.p3562ao.p3570b.p3575b.p3576a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.b.b.a.f */
/* compiled from: PG */
public final class C45602f extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C45602f f119938j;

    /* renamed from: k */
    private static volatile C63010eb f119939k;

    /* renamed from: a */
    public int f119940a;

    /* renamed from: b */
    public C59308f f119941b;

    /* renamed from: c */
    public C62971cq f119942c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f119943d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f119944e = emptyProtobufList();

    /* renamed from: f */
    public String f119945f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f119946g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f119947h;

    /* renamed from: i */
    public C45600d f119948i;

    static {
        C45602f fVar = new C45602f();
        f119938j = fVar;
        C62942bv.registerDefaultInstance(C45602f.class, fVar);
    }

    private C45602f() {
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
                return newMessageInfo(f119938j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005ဈ\u0001\u0006ဈ\u0003\u0007ဌ\u0004\tဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, C59308f.class, "d", C59308f.class, "e", C59308f.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C45597a.f119931a, "i"});
            case 3:
                return new C45602f();
            case 4:
                return new C45601e();
            case 5:
                return f119938j;
            case 6:
                C63010eb ebVar = f119939k;
                if (ebVar == null) {
                    synchronized (C45602f.class) {
                        ebVar = f119939k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119938j);
                            f119939k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
