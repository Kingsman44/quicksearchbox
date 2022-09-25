package com.google.android.libraries.lens.ondevice.p2037n;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4701g.C62250a;
import com.google.lens.p4701g.C62331d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63233f;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;

/* renamed from: com.google.android.libraries.lens.ondevice.n.s */
/* compiled from: PG */
public final class C24808s extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C24808s f67804l;

    /* renamed from: m */
    private static volatile C63010eb f67805m;

    /* renamed from: a */
    public int f67806a;

    /* renamed from: b */
    public String f67807b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f67808c;

    /* renamed from: d */
    public C24812w f67809d;

    /* renamed from: e */
    public C24787at f67810e;

    /* renamed from: f */
    public int f67811f;

    /* renamed from: g */
    public int f67812g;

    /* renamed from: h */
    public C63233f f67813h;

    /* renamed from: i */
    public long f67814i;

    /* renamed from: j */
    public long f67815j;

    /* renamed from: k */
    public C63240m f67816k;

    static {
        C24808s sVar = new C24808s();
        f67804l = sVar;
        C62942bv.registerDefaultInstance(C24808s.class, sVar);
    }

    private C24808s() {
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
                return newMessageInfo(f67804l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဉ\u0006\u0007ဂ\u0007\bဂ\b\tဌ\u0005\nဉ\t", new Object[]{"a", "b", C45240c.f118157a, C24806q.f67803a, "d", "e", C10662f.f35572a, C62331d.m94768b(), C19618h.f54585a, "i", "j", C30325g.f82003a, C62250a.f168059a, C19621k.f54601a});
            case 3:
                return new C24808s();
            case 4:
                return new C24807r();
            case 5:
                return f67804l;
            case 6:
                C63010eb ebVar = f67805m;
                if (ebVar == null) {
                    synchronized (C24808s.class) {
                        ebVar = f67805m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67804l);
                            f67805m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
