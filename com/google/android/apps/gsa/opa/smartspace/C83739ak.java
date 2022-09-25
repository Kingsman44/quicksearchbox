package com.google.android.apps.gsa.opa.smartspace;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50794cr;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.ak */
/* compiled from: PG */
public final class C83739ak extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C83739ak f228230q;

    /* renamed from: r */
    private static volatile C63010eb f228231r;

    /* renamed from: a */
    public int f228232a;

    /* renamed from: b */
    public C83738aj f228233b;

    /* renamed from: c */
    public String f228234c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f228235d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f228236e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f228237f;

    /* renamed from: g */
    public String f228238g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f228239h;

    /* renamed from: i */
    public C49156z f228240i;

    /* renamed from: j */
    public boolean f228241j;

    /* renamed from: k */
    public String f228242k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C62971cq f228243l = emptyProtobufList();

    /* renamed from: m */
    public boolean f228244m;

    /* renamed from: n */
    public C63088z f228245n = C63088z.f170246b;

    /* renamed from: o */
    public C62971cq f228246o = emptyProtobufList();

    /* renamed from: p */
    public C83736ah f228247p;

    static {
        C83739ak akVar = new C83739ak();
        f228230q = akVar;
        C62942bv.registerDefaultInstance(C83739ak.class, akVar);
    }

    private C83739ak() {
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
                return newMessageInfo(f228230q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003င\u0004\u0004ဈ\u0005\u0005ဌ\u0006\u0006ဉ\u0007\u0007ဉ\u0000\bဇ\b\nဈ\n\fဇ\u000b\rည\f\u000eဈ\u0003\u000f\u001b\u0010ဉ\r\u0011\u001b", new Object[]{"a", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C50794cr.m85939b(), "i", "b", "j", C19621k.f54601a, "m", C48004n.f124238a, "e", C66412o.f180592a, C83729aa.class, "p", "l", C83734af.class});
            case 3:
                return new C83739ak();
            case 4:
                return new C83730ab();
            case 5:
                return f228230q;
            case 6:
                C63010eb ebVar = f228231r;
                if (ebVar == null) {
                    synchronized (C83739ak.class) {
                        ebVar = f228231r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228230q);
                            f228231r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
