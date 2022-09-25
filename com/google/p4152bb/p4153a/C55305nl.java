package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.bb.a.nl */
/* compiled from: PG */
public final class C55305nl extends C62937bq implements C62938br {

    /* renamed from: r */
    public static final C55305nl f145689r;

    /* renamed from: t */
    private static volatile C63010eb f145690t;

    /* renamed from: a */
    public int f145691a;

    /* renamed from: b */
    public C62971cq f145692b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f145693c = emptyProtobufList();

    /* renamed from: d */
    public C55244le f145694d;

    /* renamed from: e */
    public C55244le f145695e;

    /* renamed from: f */
    public C55244le f145696f;

    /* renamed from: g */
    public C55244le f145697g;

    /* renamed from: h */
    public int f145698h;

    /* renamed from: i */
    public String f145699i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C55136he f145700j;

    /* renamed from: k */
    public String f145701k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C55136he f145702l;

    /* renamed from: m */
    public C62961ch f145703m = emptyIntList();

    /* renamed from: n */
    public C62961ch f145704n = emptyIntList();

    /* renamed from: o */
    public String f145705o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public C55210jy f145706p;

    /* renamed from: q */
    public C62971cq f145707q = emptyProtobufList();

    /* renamed from: s */
    private byte f145708s = 2;

    static {
        C55305nl nlVar = new C55305nl();
        f145689r = nlVar;
        C62942bv.registerDefaultInstance(C55305nl.class, nlVar);
    }

    private C55305nl() {
    }

    /* renamed from: a */
    public final void mo54238a() {
        C62971cq cqVar = this.f145692b;
        if (!cqVar.mo58948c()) {
            this.f145692b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo54239b() {
        C62971cq cqVar = this.f145693c;
        if (!cqVar.mo58948c()) {
            this.f145693c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145708s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145708s = b;
                return null;
            case 2:
                return newMessageInfo(f145689r, "\u0001\u0010\u0000\u0001\u0001\u0016\u0010\u0000\u0005\t\u0001Л\u0002Л\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\bဌ\u0005\nဈ\u0006\u000b\u0016\f\u0016\rဈ\f\u0010ဉ\u000e\u0011ဈ\t\u0013Л\u0015ᐉ\b\u0016ᐉ\u000b", new Object[]{"a", "b", C55240la.class, C45240c.f118157a, C55240la.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C55303nj.f145688a, "i", "m", C48004n.f124238a, C66412o.f180592a, "p", C19621k.f54601a, "q", C55005ci.class, "j", "l"});
            case 3:
                return new C55305nl();
            case 4:
                return new C55302ni();
            case 5:
                return f145689r;
            case 6:
                C63010eb ebVar = f145690t;
                if (ebVar == null) {
                    synchronized (C55305nl.class) {
                        ebVar = f145690t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145689r);
                            f145690t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
