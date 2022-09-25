package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.de */
/* compiled from: PG */
public final class C7605de extends C62942bv implements C63001dt {

    /* renamed from: s */
    public static final C7605de f26269s;

    /* renamed from: u */
    private static volatile C63010eb f26270u;

    /* renamed from: a */
    public int f26271a;

    /* renamed from: b */
    public String f26272b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C7805kp f26273c;

    /* renamed from: d */
    public String f26274d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f26275e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f26276f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f26277g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C7604dd f26278h;

    /* renamed from: i */
    public String f26279i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f26280j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f26281k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f26282l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public int f26283m;

    /* renamed from: n */
    public boolean f26284n;

    /* renamed from: o */
    public String f26285o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public boolean f26286p;

    /* renamed from: q */
    public String f26287q = BuildConfig.FLAVOR;

    /* renamed from: r */
    public C62995dn f26288r = C62995dn.f170057a;

    /* renamed from: t */
    private byte f26289t = 2;

    static {
        C7605de deVar = new C7605de();
        f26269s = deVar;
        C62942bv.registerDefaultInstance(C7605de.class, deVar);
    }

    private C7605de() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26289t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26289t = b;
                return null;
            case 2:
                return newMessageInfo(f26269s, "\u0001\u0011\u0000\u0001\u0001\u0012\u0011\u0001\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ᐉ\u0006\u0007ဈ\u0005\bဈ\u0007\tဈ\t\nဈ\n\u000bဈ\b\fဌ\u000b\rဇ\f\u000eဈ\r\u000fဇ\u000e\u0010ဈ\u000f\u00122", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, C30325g.f82003a, "i", C19621k.f54601a, "l", "j", "m", C7601da.f26265a, C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C7599cz.f26263a});
            case 3:
                return new C7605de();
            case 4:
                return new C7598cy();
            case 5:
                return f26269s;
            case 6:
                C63010eb ebVar = f26270u;
                if (ebVar == null) {
                    synchronized (C7605de.class) {
                        ebVar = f26270u;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26269s);
                            f26270u = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
