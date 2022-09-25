package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48800ah;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.nf */
/* compiled from: PG */
public final class C53420nf extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C53420nf f140165o;

    /* renamed from: q */
    private static volatile C63010eb f140166q;

    /* renamed from: a */
    public int f140167a;

    /* renamed from: b */
    public int f140168b = 0;

    /* renamed from: c */
    public Object f140169c;

    /* renamed from: d */
    public C53265hm f140170d;

    /* renamed from: e */
    public C53267ho f140171e;

    /* renamed from: f */
    public boolean f140172f;

    /* renamed from: g */
    public C53382lv f140173g;

    /* renamed from: h */
    public boolean f140174h;

    /* renamed from: i */
    public String f140175i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C53250gy f140176j;

    /* renamed from: k */
    public C53411mx f140177k;

    /* renamed from: l */
    public boolean f140178l;

    /* renamed from: m */
    public C48800ah f140179m;

    /* renamed from: n */
    public boolean f140180n;

    /* renamed from: p */
    private byte f140181p = 2;

    static {
        C53420nf nfVar = new C53420nf();
        f140165o = nfVar;
        C62942bv.registerDefaultInstance(C53420nf.class, nfVar);
    }

    private C53420nf() {
        emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140181p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140181p = b;
                return null;
            case 2:
                return newMessageInfo(f140165o, "\u0001\u0013\u0001\u0001\u0001\u001a\u0013\u0000\u0000\t\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0005ᐼ\u0000\u0006ဉ\u0001\u0007ဇ\u0005\bᐼ\u0000\tဉ\u0002\u000bᐼ\u0000\fဇ\b\rᐉ\u0012\u000eဈ\t\u000fᐉ\u0013\u0010ᐼ\u0000\u0013ြ\u0000\u0014ဇ\u0014\u0017ဉ\u0015\u0018ဇ\u0016\u001aဉ\u0007", new Object[]{C45240c.f118157a, "b", "a", C53426nl.class, C53403mp.class, C53350kq.class, C53088ay.class, "d", C10662f.f35572a, C53086aw.class, "e", C53084au.class, C19618h.f54585a, "j", "i", C19621k.f54601a, C53097bg.class, C53289ij.class, "l", "m", C48004n.f124238a, C30325g.f82003a});
            case 3:
                return new C53420nf();
            case 4:
                return new C53419ne();
            case 5:
                return f140165o;
            case 6:
                C63010eb ebVar = f140166q;
                if (ebVar == null) {
                    synchronized (C53420nf.class) {
                        ebVar = f140166q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140165o);
                            f140166q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
