package com.google.android.libraries.search.p3055n;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66908dy;

/* renamed from: com.google.android.libraries.search.n.bn */
/* compiled from: PG */
public final class C39365bn extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C39365bn f103660m;

    /* renamed from: n */
    public static final C62940bt f103661n;

    /* renamed from: p */
    private static volatile C63010eb f103662p;

    /* renamed from: a */
    public int f103663a;

    /* renamed from: b */
    public int f103664b = 0;

    /* renamed from: c */
    public Object f103665c;

    /* renamed from: d */
    public String f103666d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f103667e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63088z f103668f = C63088z.f170246b;

    /* renamed from: g */
    public long f103669g;

    /* renamed from: h */
    public String f103670h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f103671i;

    /* renamed from: j */
    public boolean f103672j;

    /* renamed from: k */
    public int f103673k;

    /* renamed from: l */
    public C51544lq f103674l;

    /* renamed from: o */
    private byte f103675o = 2;

    static {
        C39365bn bnVar = new C39365bn();
        f103660m = bnVar;
        C62942bv.registerDefaultInstance(C39365bn.class, bnVar);
        f103661n = C62942bv.newSingularGeneratedExtension(C39670cx.f104424a, bnVar, bnVar, (C62958ce) null, 413019268, C63066gd.MESSAGE, C39365bn.class);
    }

    private C39365bn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f103675o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f103675o = b;
                return null;
            case 2:
                return newMessageInfo(f103660m, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ျ\u0000\u0006ᐼ\u0000\u0007ᐉ\n\bဈ\u0006\tဇ\u0007\nဌ\t\u000bဇ\b", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C60218r.class, "l", C19618h.f54585a, "i", C19621k.f54601a, C66908dy.f181882a, "j"});
            case 3:
                return new C39365bn();
            case 4:
                return new C39364bm();
            case 5:
                return f103660m;
            case 6:
                C63010eb ebVar = f103662p;
                if (ebVar == null) {
                    synchronized (C39365bn.class) {
                        ebVar = f103662p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103660m);
                            f103662p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
