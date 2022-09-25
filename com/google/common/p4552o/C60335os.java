package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.os */
/* compiled from: PG */
public final class C60335os extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C60335os f163295r;

    /* renamed from: s */
    private static volatile C63010eb f163296s;

    /* renamed from: a */
    public int f163297a;

    /* renamed from: b */
    public long f163298b;

    /* renamed from: c */
    public long f163299c;

    /* renamed from: d */
    public long f163300d;

    /* renamed from: e */
    public long f163301e;

    /* renamed from: f */
    public long f163302f;

    /* renamed from: g */
    public long f163303g;

    /* renamed from: h */
    public long f163304h;

    /* renamed from: i */
    public long f163305i;

    /* renamed from: j */
    public long f163306j;

    /* renamed from: k */
    public long f163307k;

    /* renamed from: l */
    public long f163308l;

    /* renamed from: m */
    public long f163309m;

    /* renamed from: n */
    public long f163310n;

    /* renamed from: o */
    public long f163311o;

    /* renamed from: p */
    public long f163312p;

    /* renamed from: q */
    public boolean f163313q;

    static {
        C60335os osVar = new C60335os();
        f163295r = osVar;
        C62942bv.registerDefaultInstance(C60335os.class, osVar);
    }

    private C60335os() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f163295r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဇ\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C60335os();
            case 4:
                return new C60334or();
            case 5:
                return f163295r;
            case 6:
                C63010eb ebVar = f163296s;
                if (ebVar == null) {
                    synchronized (C60335os.class) {
                        ebVar = f163296s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163295r);
                            f163296s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
