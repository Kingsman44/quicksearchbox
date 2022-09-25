package com.google.assistant.p3897e.p3921j;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.e.j.aco */
/* compiled from: PG */
public final class aco extends C62942bv implements C63001dt {

    /* renamed from: t */
    public static final aco f134821t;

    /* renamed from: u */
    private static volatile C63010eb f134822u;

    /* renamed from: a */
    public int f134823a;

    /* renamed from: b */
    public int f134824b;

    /* renamed from: c */
    public String f134825c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public acn f134826d;

    /* renamed from: e */
    public String f134827e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f134828f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f134829g;

    /* renamed from: h */
    public int f134830h;

    /* renamed from: i */
    public int f134831i = 1;

    /* renamed from: j */
    public String f134832j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public boolean f134833k;

    /* renamed from: l */
    public String f134834l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f134835m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f134836n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public String f134837o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public String f134838p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public C63088z f134839q = C63088z.f170246b;

    /* renamed from: r */
    public C62971cq f134840r = emptyProtobufList();

    /* renamed from: s */
    public String f134841s = BuildConfig.FLAVOR;

    static {
        aco aco = new aco();
        f134821t = aco;
        C62942bv.registerDefaultInstance(aco.class, aco);
    }

    private aco() {
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
                return newMessageInfo(f134821t, "\u0001\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဂ\u0005\u0005င\u0006\u0006ဌ\u0007\u0007ဈ\b\bဇ\t\tဈ\u000b\nဈ\u0004\fဈ\f\rဈ\r\u000e\u001b\u000fဉ\u0002\u0010ဈ\u0011\u0011ဈ\u000e\u0012ဈ\u000f\u0013ည\u0010", new Object[]{"a", "b", C45240c.f118157a, "e", C30325g.f82003a, C19618h.f54585a, "i", aci.f134808a, "j", C19621k.f54601a, "l", C10662f.f35572a, "m", C48004n.f124238a, C33259r.f88929b, acl.class, "d", C59002s.f156871a, C66412o.f180592a, "p", "q"});
            case 3:
                return new aco();
            case 4:
                return new ach();
            case 5:
                return f134821t;
            case 6:
                C63010eb ebVar = f134822u;
                if (ebVar == null) {
                    synchronized (aco.class) {
                        ebVar = f134822u;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134821t);
                            f134822u = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
