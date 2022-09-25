package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8435b;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8441b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.ac */
/* compiled from: PG */
public final class C54079ac extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C54079ac f141889k;

    /* renamed from: m */
    private static volatile C63010eb f141890m;

    /* renamed from: a */
    public int f141891a;

    /* renamed from: b */
    public C8441b f141892b;

    /* renamed from: c */
    public C8435b f141893c;

    /* renamed from: d */
    public boolean f141894d;

    /* renamed from: e */
    public String f141895e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f141896f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f141897g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C8435b f141898h;

    /* renamed from: i */
    public boolean f141899i;

    /* renamed from: j */
    public C54102az f141900j;

    /* renamed from: l */
    private byte f141901l = 2;

    static {
        C54079ac acVar = new C54079ac();
        f141889k = acVar;
        C62942bv.registerDefaultInstance(C54079ac.class, acVar);
    }

    private C54079ac() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141901l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141901l = b;
                return null;
            case 2:
                return newMessageInfo(f141889k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ᐉ\u0006\tဇ\t\nဇ\u0002\fဉ\n", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "d", "j"});
            case 3:
                return new C54079ac();
            case 4:
                return new C54078ab();
            case 5:
                return f141889k;
            case 6:
                C63010eb ebVar = f141890m;
                if (ebVar == null) {
                    synchronized (C54079ac.class) {
                        ebVar = f141890m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141889k);
                            f141890m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
