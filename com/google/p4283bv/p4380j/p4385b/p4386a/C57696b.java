package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.aqq;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66208dv;

/* renamed from: com.google.bv.j.b.a.b */
/* compiled from: PG */
public final class C57696b extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C57696b f154137l;

    /* renamed from: m */
    public static final C62940bt f154138m;

    /* renamed from: o */
    private static volatile C63010eb f154139o;

    /* renamed from: a */
    public int f154140a;

    /* renamed from: b */
    public String f154141b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C60214n f154142c;

    /* renamed from: d */
    public int f154143d;

    /* renamed from: e */
    public String f154144e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f154145f;

    /* renamed from: g */
    public boolean f154146g;

    /* renamed from: h */
    public boolean f154147h;

    /* renamed from: i */
    public String f154148i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f154149j;

    /* renamed from: k */
    public C57774f f154150k;

    /* renamed from: n */
    private byte f154151n = 2;

    static {
        C57696b bVar = new C57696b();
        f154137l = bVar;
        C62942bv.registerDefaultInstance(C57696b.class, bVar);
        f154138m = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, bVar, bVar, (C62958ce) null, 218597920, C63066gd.MESSAGE, C57696b.class);
    }

    private C57696b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154151n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154151n = b;
                return null;
            case 2:
                return newMessageInfo(f154137l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဈ\u0003\u0004ဇ\u0004\u0005ဈ\u0007\u0006ᐉ\u0001\u0007င\b\bဇ\u0006\tᐉ\t\nဇ\u0005", new Object[]{"a", "b", "d", aqq.f159779a, "e", C10662f.f35572a, "i", C45240c.f118157a, "j", C19618h.f54585a, C19621k.f54601a, C30325g.f82003a});
            case 3:
                return new C57696b();
            case 4:
                return new C57682a();
            case 5:
                return f154137l;
            case 6:
                C63010eb ebVar = f154139o;
                if (ebVar == null) {
                    synchronized (C57696b.class) {
                        ebVar = f154139o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154137l);
                            f154139o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
