package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.u */
/* compiled from: PG */
public final class C54122u extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C54122u f142014h;

    /* renamed from: p */
    private static volatile C63010eb f142015p;

    /* renamed from: a */
    public int f142016a;

    /* renamed from: b */
    public String f142017b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f142018c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C60214n f142019d;

    /* renamed from: e */
    public C60214n f142020e;

    /* renamed from: f */
    public C60214n f142021f;

    /* renamed from: g */
    public C60214n f142022g;

    /* renamed from: i */
    private C60214n f142023i;

    /* renamed from: j */
    private C60214n f142024j;

    /* renamed from: k */
    private C60214n f142025k;

    /* renamed from: l */
    private C60214n f142026l;

    /* renamed from: m */
    private C60214n f142027m;

    /* renamed from: n */
    private C60214n f142028n;

    /* renamed from: o */
    private byte f142029o = 2;

    static {
        C54122u uVar = new C54122u();
        f142014h = uVar;
        C62942bv.registerDefaultInstance(C54122u.class, uVar);
    }

    private C54122u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142029o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142029o = b;
                return null;
            case 2:
                return newMessageInfo(f142014h, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\n\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C54122u();
            case 4:
                return new C54121t();
            case 5:
                return f142014h;
            case 6:
                C63010eb ebVar = f142015p;
                if (ebVar == null) {
                    synchronized (C54122u.class) {
                        ebVar = f142015p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142014h);
                            f142015p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
