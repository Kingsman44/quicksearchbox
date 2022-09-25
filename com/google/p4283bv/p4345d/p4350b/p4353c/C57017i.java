package com.google.p4283bv.p4345d.p4350b.p4353c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C8207zm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4953bc.p4954a.C64408l;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64429t;

/* renamed from: com.google.bv.d.b.c.i */
/* compiled from: PG */
public final class C57017i extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C57017i f152204o;

    /* renamed from: q */
    private static volatile C63010eb f152205q;

    /* renamed from: a */
    public int f152206a;

    /* renamed from: b */
    public int f152207b = 0;

    /* renamed from: c */
    public Object f152208c;

    /* renamed from: d */
    public String f152209d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f152210e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f152211f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C7536ax f152212g;

    /* renamed from: h */
    public long f152213h;

    /* renamed from: i */
    public long f152214i;

    /* renamed from: j */
    public String f152215j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f152216k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f152217l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f152218m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public C57014f f152219n;

    /* renamed from: p */
    private byte f152220p = 2;

    static {
        C57017i iVar = new C57017i();
        f152204o = iVar;
        C62942bv.registerDefaultInstance(C57017i.class, iVar);
    }

    private C57017i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152220p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152220p = b;
                return null;
            case 2:
                return newMessageInfo(f152204o, "\u0001\u0013\u0001\u0001\u0001\u0014\u0013\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဈ\t\u0005ဈ\n\u0006ᐉ\u000b\u0007ဂ\r\bဂ\f\tဈ\b\nြ\u0000\u000bဈ\u000e\fဈ\u000f\rဈ\u0010\u000eဈ\u0011\u000fြ\u0000\u0011ဉ\u0013\u0012ြ\u0000\u0013ြ\u0000\u0014ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C64408l.class, C8207zm.class, C57019k.class, "e", C10662f.f35572a, C30325g.f82003a, "i", C19618h.f54585a, "d", C57021m.class, "j", C19621k.f54601a, "l", "m", C57012d.class, C48004n.f124238a, C57023o.class, C64429t.class, C57010b.class});
            case 3:
                return new C57017i();
            case 4:
                return new C57015g();
            case 5:
                return f152204o;
            case 6:
                C63010eb ebVar = f152205q;
                if (ebVar == null) {
                    synchronized (C57017i.class) {
                        ebVar = f152205q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152204o);
                            f152205q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
