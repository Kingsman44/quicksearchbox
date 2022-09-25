package com.google.android.libraries.performance.p2392b.p2393a.p2394a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.libraries.performance.b.a.a.b */
/* compiled from: PG */
public final class C31123b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C31123b f83819j;

    /* renamed from: l */
    private static volatile C63010eb f83820l;

    /* renamed from: a */
    public int f83821a;

    /* renamed from: b */
    public C71195ae f83822b;

    /* renamed from: c */
    public long f83823c;

    /* renamed from: d */
    public long f83824d;

    /* renamed from: e */
    public long f83825e;

    /* renamed from: f */
    public long f83826f;

    /* renamed from: g */
    public int f83827g;

    /* renamed from: h */
    public String f83828h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C71207aq f83829i;

    /* renamed from: k */
    private byte f83830k = 2;

    static {
        C31123b bVar = new C31123b();
        f83819j = bVar;
        C62942bv.registerDefaultInstance(C31123b.class, bVar);
    }

    private C31123b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f83830k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f83830k = b;
                return null;
            case 2:
                return newMessageInfo(f83819j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C31123b();
            case 4:
                return new C31122a();
            case 5:
                return f83819j;
            case 6:
                C63010eb ebVar = f83820l;
                if (ebVar == null) {
                    synchronized (C31123b.class) {
                        ebVar = f83820l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f83819j);
                            f83820l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
