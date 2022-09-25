package com.google.speech.p5228m;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.m.e */
/* compiled from: PG */
public final class C67341e extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C67341e f183034i;

    /* renamed from: j */
    public static final C62940bt f183035j;

    /* renamed from: k */
    private static volatile C63010eb f183036k;

    /* renamed from: a */
    public int f183037a;

    /* renamed from: b */
    public boolean f183038b;

    /* renamed from: c */
    public boolean f183039c;

    /* renamed from: d */
    public boolean f183040d;

    /* renamed from: e */
    public C62995dn f183041e = C62995dn.f170057a;

    /* renamed from: f */
    public long f183042f;

    /* renamed from: g */
    public boolean f183043g;

    /* renamed from: h */
    public int f183044h;

    static {
        C67341e eVar = new C67341e();
        f183034i = eVar;
        C62942bv.registerDefaultInstance(C67341e.class, eVar);
        f183035j = C62942bv.newSingularGeneratedExtension(C67355s.f183081a, eVar, eVar, (C62958ce) null, 413855631, C63066gd.MESSAGE, C67341e.class);
    }

    private C67341e() {
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
                return newMessageInfo(f183034i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0001\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u00042\u0005ဂ\u0003\u0007ဇ\u0005\tဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C67296b.f182923a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C67323c.f182990a});
            case 3:
                return new C67341e();
            case 4:
                return new C67251a();
            case 5:
                return f183034i;
            case 6:
                C63010eb ebVar = f183036k;
                if (ebVar == null) {
                    synchronized (C67341e.class) {
                        ebVar = f183036k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183034i);
                            f183036k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
