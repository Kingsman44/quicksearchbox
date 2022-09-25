package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.al */
/* compiled from: PG */
public final class C16724al extends C62942bv implements C63001dt {

    /* renamed from: u */
    public static final C16724al f48899u;

    /* renamed from: v */
    private static volatile C63010eb f48900v;

    /* renamed from: a */
    public int f48901a;

    /* renamed from: b */
    public boolean f48902b;

    /* renamed from: c */
    public boolean f48903c;

    /* renamed from: d */
    public boolean f48904d;

    /* renamed from: e */
    public boolean f48905e;

    /* renamed from: f */
    public boolean f48906f;

    /* renamed from: g */
    public boolean f48907g;

    /* renamed from: h */
    public boolean f48908h;

    /* renamed from: i */
    public boolean f48909i;

    /* renamed from: j */
    public boolean f48910j;

    /* renamed from: k */
    public boolean f48911k;

    /* renamed from: l */
    public boolean f48912l;

    /* renamed from: m */
    public boolean f48913m;

    /* renamed from: n */
    public boolean f48914n;

    /* renamed from: o */
    public boolean f48915o;

    /* renamed from: p */
    public boolean f48916p;

    /* renamed from: q */
    public String f48917q = BuildConfig.FLAVOR;

    /* renamed from: r */
    public int f48918r;

    /* renamed from: s */
    public boolean f48919s;

    /* renamed from: t */
    public boolean f48920t;

    static {
        C16724al alVar = new C16724al();
        f48899u = alVar;
        C62942bv.registerDefaultInstance(C16724al.class, alVar);
    }

    private C16724al() {
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
                return newMessageInfo(f48899u, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0010ဈ\u000f\u0011ဌ\u0010\u0012ဇ\u0011\u0013ဇ\u0012", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C12989g.m29226b(), C59002s.f156871a, C42181t.f110467a});
            case 3:
                return new C16724al();
            case 4:
                return new C16723ak();
            case 5:
                return f48899u;
            case 6:
                C63010eb ebVar = f48900v;
                if (ebVar == null) {
                    synchronized (C16724al.class) {
                        ebVar = f48900v;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48899u);
                            f48900v = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
