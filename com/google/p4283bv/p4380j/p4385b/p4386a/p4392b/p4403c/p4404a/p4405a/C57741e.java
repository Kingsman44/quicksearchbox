package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a;

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
import com.google.protos.youtube.elements.C66180cy;

/* renamed from: com.google.bv.j.b.a.b.c.a.a.e */
/* compiled from: PG */
public final class C57741e extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C57741e f154257j;

    /* renamed from: l */
    private static volatile C63010eb f154258l;

    /* renamed from: a */
    public int f154259a;

    /* renamed from: b */
    public String f154260b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f154261c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C66180cy f154262d;

    /* renamed from: e */
    public C66180cy f154263e;

    /* renamed from: f */
    public String f154264f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f154265g;

    /* renamed from: h */
    public boolean f154266h;

    /* renamed from: i */
    public boolean f154267i;

    /* renamed from: k */
    private byte f154268k = 2;

    static {
        C57741e eVar = new C57741e();
        f154257j = eVar;
        C62942bv.registerDefaultInstance(C57741e.class, eVar);
    }

    private C57741e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154268k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154268k = b;
                return null;
            case 2:
                return newMessageInfo(f154257j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0005ဈ\u0006\u0006ဌ\u0007\u0007ဇ\b\bဇ\t\tᐉ\u0003\nᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, C57739c.f154256a, C19618h.f54585a, "i", "d", "e"});
            case 3:
                return new C57741e();
            case 4:
                return new C57740d();
            case 5:
                return f154257j;
            case 6:
                C63010eb ebVar = f154258l;
                if (ebVar == null) {
                    synchronized (C57741e.class) {
                        ebVar = f154258l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154257j);
                            f154258l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
