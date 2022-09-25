package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fi */
/* compiled from: PG */
public final class C14333fi extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C14333fi f43350q;

    /* renamed from: s */
    private static volatile C63010eb f43351s;

    /* renamed from: a */
    public int f43352a = 0;

    /* renamed from: b */
    public Object f43353b;

    /* renamed from: c */
    public String f43354c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f43355d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C14216b f43356e;

    /* renamed from: f */
    public String f43357f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f43358g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C14286dp f43359h;

    /* renamed from: i */
    public C14286dp f43360i;

    /* renamed from: j */
    public C14286dp f43361j;

    /* renamed from: k */
    public C14286dp f43362k;

    /* renamed from: l */
    public C14286dp f43363l;

    /* renamed from: m */
    public C14286dp f43364m;

    /* renamed from: n */
    public long f43365n;

    /* renamed from: o */
    public long f43366o;

    /* renamed from: p */
    public int f43367p;

    /* renamed from: r */
    private byte f43368r = 2;

    static {
        C14333fi fiVar = new C14333fi();
        f43350q = fiVar;
        C62942bv.registerDefaultInstance(C14333fi.class, fiVar);
    }

    private C14333fi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43368r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43368r = b;
                return null;
            case 2:
                return newMessageInfo(f43350q, "\u0000\u0010\u0001\u0000\u0001\u0010\u0010\u0000\u0000\u0006\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȼ\u0000\u0006<\u0000\u0007Љ\bЉ\tЉ\nЉ\u000bЉ\fЉ\r\u0010\u000e\u0003\u000f\f\u0010\t", new Object[]{"b", "a", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C14361gj.class, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "e"});
            case 3:
                return new C14333fi();
            case 4:
                return new C14332fh();
            case 5:
                return f43350q;
            case 6:
                C63010eb ebVar = f43351s;
                if (ebVar == null) {
                    synchronized (C14333fi.class) {
                        ebVar = f43351s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43350q);
                            f43351s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
