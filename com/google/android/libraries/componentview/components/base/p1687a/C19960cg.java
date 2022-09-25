package com.google.android.libraries.componentview.components.base.p1687a;

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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.base.a.cg */
/* compiled from: PG */
public final class C19960cg extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C19960cg f55884m;

    /* renamed from: n */
    public static final C62940bt f55885n;

    /* renamed from: p */
    private static volatile C63010eb f55886p;

    /* renamed from: a */
    public int f55887a;

    /* renamed from: b */
    public C19943bq f55888b;

    /* renamed from: c */
    public String f55889c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f55890d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f55891e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f55892f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f55893g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f55894h;

    /* renamed from: i */
    public boolean f55895i;

    /* renamed from: j */
    public boolean f55896j;

    /* renamed from: k */
    public boolean f55897k;

    /* renamed from: l */
    public boolean f55898l;

    /* renamed from: o */
    private byte f55899o = 2;

    static {
        C19960cg cgVar = new C19960cg();
        f55884m = cgVar;
        C62942bv.registerDefaultInstance(C19960cg.class, cgVar);
        f55885n = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, cgVar, cgVar, (C62958ce) null, 108390332, C63066gd.MESSAGE, C19960cg.class);
    }

    private C19960cg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55899o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55899o = b;
                return null;
            case 2:
                return newMessageInfo(f55884m, "\u0001\u000b\u0000\u0001\u0002\u000e\u000b\u0000\u0000\u0001\u0002ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003\u0007ဈ\u0004\bဈ\u0005\tဇ\u0006\nဇ\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eᐉ\u0000", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "b"});
            case 3:
                return new C19960cg();
            case 4:
                return new C19959cf();
            case 5:
                return f55884m;
            case 6:
                C63010eb ebVar = f55886p;
                if (ebVar == null) {
                    synchronized (C19960cg.class) {
                        ebVar = f55886p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55884m);
                            f55886p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
