package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.android.gms.measurement.a.d */
/* compiled from: PG */
public final class C145155d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C145155d f392333i;

    /* renamed from: j */
    private static volatile C63010eb f392334j;

    /* renamed from: a */
    public int f392335a;

    /* renamed from: b */
    public int f392336b;

    /* renamed from: c */
    public String f392337c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f392338d = emptyProtobufList();

    /* renamed from: e */
    public C145161j f392339e;

    /* renamed from: f */
    public boolean f392340f;

    /* renamed from: g */
    public boolean f392341g;

    /* renamed from: h */
    public boolean f392342h;

    static {
        C145155d dVar = new C145155d();
        f392333i = dVar;
        C62942bv.registerDefaultInstance(C145155d.class, dVar);
    }

    private C145155d() {
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
                return newMessageInfo(f392333i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C145157f.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C145155d();
            case 4:
                return new C145154c();
            case 5:
                return f392333i;
            case 6:
                C63010eb ebVar = f392334j;
                if (ebVar == null) {
                    synchronized (C145155d.class) {
                        ebVar = f392334j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392333i);
                            f392334j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
