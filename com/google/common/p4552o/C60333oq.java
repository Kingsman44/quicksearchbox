package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.oq */
/* compiled from: PG */
public final class C60333oq extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C60333oq f163277q;

    /* renamed from: r */
    private static volatile C63010eb f163278r;

    /* renamed from: a */
    public int f163279a;

    /* renamed from: b */
    public long f163280b;

    /* renamed from: c */
    public long f163281c;

    /* renamed from: d */
    public long f163282d;

    /* renamed from: e */
    public long f163283e;

    /* renamed from: f */
    public int f163284f;

    /* renamed from: g */
    public int f163285g;

    /* renamed from: h */
    public int f163286h;

    /* renamed from: i */
    public String f163287i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f163288j;

    /* renamed from: k */
    public int f163289k;

    /* renamed from: l */
    public C62961ch f163290l = emptyIntList();

    /* renamed from: m */
    public int f163291m;

    /* renamed from: n */
    public long f163292n;

    /* renamed from: o */
    public long f163293o;

    /* renamed from: p */
    public C60335os f163294p;

    static {
        C60333oq oqVar = new C60333oq();
        f163277q = oqVar;
        C62942bv.registerDefaultInstance(C60333oq.class, oqVar);
    }

    private C60333oq() {
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
                return newMessageInfo(f163277q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007\tဌ\b\nင\t\u000b\u0016\fင\n\rဂ\u000b\u000eဂ\f\u000fဉ\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C60332op.m92570b(), C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new C60333oq();
            case 4:
                return new C60330on();
            case 5:
                return f163277q;
            case 6:
                C63010eb ebVar = f163278r;
                if (ebVar == null) {
                    synchronized (C60333oq.class) {
                        ebVar = f163278r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163277q);
                            f163278r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
