package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.cx */
/* compiled from: PG */
public final class C59527cx extends C62937bq implements C62938br {

    /* renamed from: n */
    public static final C59527cx f157947n;

    /* renamed from: p */
    private static volatile C63010eb f157948p;

    /* renamed from: a */
    public int f157949a;

    /* renamed from: b */
    public int f157950b;

    /* renamed from: c */
    public int f157951c;

    /* renamed from: d */
    public boolean f157952d;

    /* renamed from: e */
    public int f157953e;

    /* renamed from: f */
    public int f157954f;

    /* renamed from: g */
    public int f157955g;

    /* renamed from: h */
    public int f157956h;

    /* renamed from: i */
    public C62995dn f157957i = C62995dn.f170057a;

    /* renamed from: j */
    public double f157958j;

    /* renamed from: k */
    public double f157959k;

    /* renamed from: l */
    public C62995dn f157960l = C62995dn.f170057a;

    /* renamed from: m */
    public String f157961m = BuildConfig.FLAVOR;

    /* renamed from: o */
    private byte f157962o = 2;

    static {
        C59527cx cxVar = new C59527cx();
        f157947n = cxVar;
        C62942bv.registerDefaultInstance(C59527cx.class, cxVar);
    }

    private C59527cx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f157962o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f157962o = b;
                return null;
            case 2:
                return newMessageInfo(f157947n, "\u0001\f\u0000\u0001\u0001\u0013\f\u0002\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004ဇ\u0003\u0005င\u0004\u0006င\u0006\u0007င\u0007\bက\n\tက\u000b\n2\u000b2\u000eဈ\f\u0013ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "j", C19621k.f54601a, "l", C59526cw.f157946a, "i", C59524cu.f157945a, "m", C10662f.f35572a, C48580an.m85242c()});
            case 3:
                return new C59527cx();
            case 4:
                return new C59525cv();
            case 5:
                return f157947n;
            case 6:
                C63010eb ebVar = f157948p;
                if (ebVar == null) {
                    synchronized (C59527cx.class) {
                        ebVar = f157948p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157947n);
                            f157948p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
