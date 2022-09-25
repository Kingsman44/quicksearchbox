package com.google.android.libraries.lens.view.p2069am;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4700f.C62247b;
import com.google.lens.p4707j.C62498du;
import com.google.lens.p4707j.C62511eg;
import com.google.lens.p4707j.C62576j;
import com.google.lens.p4707j.C62590x;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4799ag.p4802b.C63164d;

/* renamed from: com.google.android.libraries.lens.view.am.r */
/* compiled from: PG */
public final class C25342r extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C25342r f68970o;

    /* renamed from: q */
    private static volatile C63010eb f68971q;

    /* renamed from: a */
    public int f68972a;

    /* renamed from: b */
    public String f68973b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f68974c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f68975d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f68976e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62247b f68977f;

    /* renamed from: g */
    public C56251be f68978g;

    /* renamed from: h */
    public C63164d f68979h;

    /* renamed from: i */
    public String f68980i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62576j f68981j;

    /* renamed from: k */
    public C62511eg f68982k;

    /* renamed from: l */
    public C25341q f68983l;

    /* renamed from: m */
    public C62498du f68984m;

    /* renamed from: n */
    public C62590x f68985n;

    /* renamed from: p */
    private byte f68986p = 2;

    static {
        C25342r rVar = new C25342r();
        f68970o = rVar;
        C62942bv.registerDefaultInstance(C25342r.class, rVar);
    }

    private C25342r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f68986p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f68986p = b;
                return null;
            case 2:
                return newMessageInfo(f68970o, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\tဈ\b\u000bဉ\n\fဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C25342r();
            case 4:
                return new C25339o();
            case 5:
                return f68970o;
            case 6:
                C63010eb ebVar = f68971q;
                if (ebVar == null) {
                    synchronized (C25342r.class) {
                        ebVar = f68971q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68970o);
                            f68971q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
