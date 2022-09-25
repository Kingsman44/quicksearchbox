package com.google.android.libraries.componentview.components.p1682a.p1683a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
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

/* renamed from: com.google.android.libraries.componentview.components.a.a.j */
/* compiled from: PG */
public final class C19765j extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C19765j f55204l;

    /* renamed from: m */
    public static final C62940bt f55205m;

    /* renamed from: n */
    private static volatile C63010eb f55206n;

    /* renamed from: a */
    public int f55207a;

    /* renamed from: b */
    public C62971cq f55208b = emptyProtobufList();

    /* renamed from: c */
    public int f55209c;

    /* renamed from: d */
    public int f55210d;

    /* renamed from: e */
    public boolean f55211e = true;

    /* renamed from: f */
    public boolean f55212f = true;

    /* renamed from: g */
    public String f55213g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f55214h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f55215i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f55216j;

    /* renamed from: k */
    public C19759d f55217k;

    static {
        C19765j jVar = new C19765j();
        f55204l = jVar;
        C62942bv.registerDefaultInstance(C19765j.class, jVar);
        f55205m = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, jVar, jVar, (C62958ce) null, 163394486, C63066gd.MESSAGE, C19765j.class);
    }

    private C19765j() {
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
                return newMessageInfo(f55204l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဌ\b\u000bဉ\t", new Object[]{"a", "b", C19761f.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19763h.f55203a, C19621k.f54601a});
            case 3:
                return new C19765j();
            case 4:
                return new C19762g();
            case 5:
                return f55204l;
            case 6:
                C63010eb ebVar = f55206n;
                if (ebVar == null) {
                    synchronized (C19765j.class) {
                        ebVar = f55206n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55204l);
                            f55206n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
