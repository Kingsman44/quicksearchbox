package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.aqf */
/* compiled from: PG */
public final class aqf extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final aqf f159731k;

    /* renamed from: l */
    public static final C62940bt f159732l;

    /* renamed from: m */
    private static volatile C63010eb f159733m;

    /* renamed from: a */
    public int f159734a;

    /* renamed from: b */
    public long f159735b;

    /* renamed from: c */
    public long f159736c;

    /* renamed from: d */
    public String f159737d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63042fg f159738e;

    /* renamed from: f */
    public apx f159739f;

    /* renamed from: g */
    public aqb f159740g;

    /* renamed from: h */
    public int f159741h;

    /* renamed from: i */
    public int f159742i;

    /* renamed from: j */
    public String f159743j = BuildConfig.FLAVOR;

    static {
        aqf aqf = new aqf();
        f159731k = aqf;
        C62942bv.registerDefaultInstance(aqf.class, aqf);
        f159732l = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, aqf, aqf, (C62958ce) null, 345563018, C63066gd.MESSAGE, aqf.class);
    }

    private aqf() {
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
                return newMessageInfo(f159731k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဌ\u0006\bင\u0007\tဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, aqe.m92459c(), "i", "j"});
            case 3:
                return new aqf();
            case 4:
                return new aqc();
            case 5:
                return f159731k;
            case 6:
                C63010eb ebVar = f159733m;
                if (ebVar == null) {
                    synchronized (aqf.class) {
                        ebVar = f159733m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159731k);
                            f159733m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
