package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.z */
/* compiled from: PG */
public final class C8194z extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C8194z f28777k;

    /* renamed from: m */
    private static volatile C63010eb f28778m;

    /* renamed from: a */
    public int f28779a;

    /* renamed from: b */
    public String f28780b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C7918ou f28781c;

    /* renamed from: d */
    public C7536ax f28782d;

    /* renamed from: e */
    public boolean f28783e;

    /* renamed from: f */
    public boolean f28784f;

    /* renamed from: g */
    public C7838lv f28785g;

    /* renamed from: h */
    public C8150xj f28786h;

    /* renamed from: i */
    public String f28787i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C8178yk f28788j;

    /* renamed from: l */
    private byte f28789l = 2;

    static {
        C8194z zVar = new C8194z();
        f28777k = zVar;
        C62942bv.registerDefaultInstance(C8194z.class, zVar);
    }

    private C8194z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28789l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28789l = b;
                return null;
            case 2:
                return newMessageInfo(f28777k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဇ\u0004\bဈ\u0007\nᐉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, C10662f.f35572a, "i", "j"});
            case 3:
                return new C8194z();
            case 4:
                return new C8167y();
            case 5:
                return f28777k;
            case 6:
                C63010eb ebVar = f28778m;
                if (ebVar == null) {
                    synchronized (C8194z.class) {
                        ebVar = f28778m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28777k);
                            f28778m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
