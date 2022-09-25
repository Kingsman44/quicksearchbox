package com.google.speech.p5218j;

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
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;
import com.google.speech.p5218j.p5219a.C66711ao;

/* renamed from: com.google.speech.j.hh */
/* compiled from: PG */
public final class C66999hh extends C62937bq implements C62938br {

    /* renamed from: p */
    public static final C66999hh f182127p;

    /* renamed from: r */
    private static volatile C63010eb f182128r;

    /* renamed from: a */
    public int f182129a;

    /* renamed from: b */
    public C66965ga f182130b;

    /* renamed from: c */
    public C66985gu f182131c;

    /* renamed from: d */
    public C66997hf f182132d;

    /* renamed from: e */
    public C66967gc f182133e;

    /* renamed from: f */
    public C66987gw f182134f;

    /* renamed from: g */
    public String f182135g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C66906dw f182136h;

    /* renamed from: i */
    public C67153n f182137i;

    /* renamed from: j */
    public C66764ae f182138j;

    /* renamed from: k */
    public C67115lp f182139k;

    /* renamed from: l */
    public C66885db f182140l;

    /* renamed from: m */
    public C66867cm f182141m;

    /* renamed from: n */
    public C66975gk f182142n;

    /* renamed from: o */
    public C66711ao f182143o;

    /* renamed from: q */
    private byte f182144q = 2;

    static {
        C66999hh hhVar = new C66999hh();
        f182127p = hhVar;
        C62942bv.registerDefaultInstance(C66999hh.class, hhVar);
    }

    private C66999hh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182144q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182144q = b;
                return null;
            case 2:
                return newMessageInfo(f182127p, "\u0001\u000e\u0000\u0001\u0001\u0012\u000e\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဉ\u0007\tဉ\b\nဉ\t\fဉ\u000b\u000eဉ\r\u0010ဉ\u000f\u0011ဉ\n\u0012ဉ\u0010", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", "l", "m", C48004n.f124238a, C19621k.f54601a, C66412o.f180592a});
            case 3:
                return new C66999hh();
            case 4:
                return new C66998hg();
            case 5:
                return f182127p;
            case 6:
                C63010eb ebVar = f182128r;
                if (ebVar == null) {
                    synchronized (C66999hh.class) {
                        ebVar = f182128r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182127p);
                            f182128r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
