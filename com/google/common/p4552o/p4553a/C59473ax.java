package com.google.common.p4552o.p4553a;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ax */
/* compiled from: PG */
public final class C59473ax extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C59473ax f157780o;

    /* renamed from: p */
    private static volatile C63010eb f157781p;

    /* renamed from: a */
    public int f157782a;

    /* renamed from: b */
    public int f157783b;

    /* renamed from: c */
    public int f157784c;

    /* renamed from: d */
    public String f157785d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f157786e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f157787f = emptyProtobufList();

    /* renamed from: g */
    public long f157788g;

    /* renamed from: h */
    public long f157789h;

    /* renamed from: i */
    public int f157790i;

    /* renamed from: j */
    public C59453ad f157791j;

    /* renamed from: k */
    public int f157792k;

    /* renamed from: l */
    public boolean f157793l;

    /* renamed from: m */
    public String f157794m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public boolean f157795n;

    static {
        C59473ax axVar = new C59473ax();
        f157780o = axVar;
        C62942bv.registerDefaultInstance(C59473ax.class, axVar);
    }

    private C59473ax() {
    }

    /* renamed from: a */
    public final void mo56967a() {
        C62971cq cqVar = this.f157787f;
        if (!cqVar.mo58948c()) {
            this.f157787f = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f157780o, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0007\u001b\bဂ\u0004\tဂ\u0005\nင\u0006\u000bဉ\u0007\fင\b\rဇ\t\u000eဈ\n\u000fဇ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C59472aw.class, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C59473ax();
            case 4:
                return new C59470au();
            case 5:
                return f157780o;
            case 6:
                C63010eb ebVar = f157781p;
                if (ebVar == null) {
                    synchronized (C59473ax.class) {
                        ebVar = f157781p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157780o);
                            f157781p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
