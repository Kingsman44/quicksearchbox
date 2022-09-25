package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bf */
/* compiled from: PG */
public final class C20136bf extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C20136bf f56454i;

    /* renamed from: j */
    public static final C62940bt f56455j;

    /* renamed from: k */
    private static volatile C63010eb f56456k;

    /* renamed from: a */
    public int f56457a;

    /* renamed from: b */
    public String f56458b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f56459c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f56460d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f56461e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f56462f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f56463g;

    /* renamed from: h */
    public boolean f56464h;

    static {
        C20136bf bfVar = new C20136bf();
        f56454i = bfVar;
        C62942bv.registerDefaultInstance(C20136bf.class, bfVar);
        f56455j = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bfVar, bfVar, (C62958ce) null, 127580055, C63066gd.MESSAGE, C20136bf.class);
    }

    private C20136bf() {
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
                return newMessageInfo(f56454i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဇ\u0005\u0005ဇ\u0006\u0006ဈ\u0004\u0007ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C30325g.f82003a, C19618h.f54585a, C10662f.f35572a, "d"});
            case 3:
                return new C20136bf();
            case 4:
                return new C20135be();
            case 5:
                return f56454i;
            case 6:
                C63010eb ebVar = f56456k;
                if (ebVar == null) {
                    synchronized (C20136bf.class) {
                        ebVar = f56456k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56454i);
                            f56456k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
