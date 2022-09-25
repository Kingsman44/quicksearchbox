package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.n */
/* compiled from: PG */
public final class C63541n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63541n f171865f;

    /* renamed from: p */
    private static volatile C63010eb f171866p;

    /* renamed from: a */
    public int f171867a;

    /* renamed from: b */
    public C63516ax f171868b;

    /* renamed from: c */
    public C63504al f171869c;

    /* renamed from: d */
    public C63539l f171870d;

    /* renamed from: e */
    public C63508ap f171871e;

    /* renamed from: g */
    private C63506an f171872g;

    /* renamed from: h */
    private C63512at f171873h;

    /* renamed from: i */
    private C63514av f171874i;

    /* renamed from: j */
    private C63502aj f171875j;

    /* renamed from: k */
    private C63547t f171876k;

    /* renamed from: l */
    private C63510ar f171877l;

    /* renamed from: m */
    private C63494ab f171878m;

    /* renamed from: n */
    private C63527bh f171879n;

    /* renamed from: o */
    private byte f171880o = 2;

    static {
        C63541n nVar = new C63541n();
        f171865f = nVar;
        C62942bv.registerDefaultInstance(C63541n.class, nVar);
    }

    private C63541n() {
        emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171880o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171880o = b;
                return null;
            case 2:
                return newMessageInfo(f171865f, "\u0001\f\u0000\u0001\u0001\u0013\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\t\tᐉ\n\rᐉ\u000e\u000eᐉ\u000f\u0013ᐉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C30325g.f82003a, C19618h.f54585a, "e", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, "i"});
            case 3:
                return new C63541n();
            case 4:
                return new C63540m();
            case 5:
                return f171865f;
            case 6:
                C63010eb ebVar = f171866p;
                if (ebVar == null) {
                    synchronized (C63541n.class) {
                        ebVar = f171866p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171865f);
                            f171866p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
