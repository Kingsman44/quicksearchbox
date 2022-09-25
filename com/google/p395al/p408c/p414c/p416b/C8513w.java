package com.google.p395al.p408c.p414c.p416b;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.al.c.c.b.w */
/* compiled from: PG */
public final class C8513w extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C8513w f29529p;

    /* renamed from: r */
    private static volatile C63010eb f29530r;

    /* renamed from: a */
    public int f29531a;

    /* renamed from: b */
    public String f29532b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f29533c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f29534d;

    /* renamed from: e */
    public C8468ak f29535e;

    /* renamed from: f */
    public C8462ae f29536f;

    /* renamed from: g */
    public C8492bh f29537g;

    /* renamed from: h */
    public C8490bf f29538h;

    /* renamed from: i */
    public C8482ay f29539i;

    /* renamed from: j */
    public C8466ai f29540j;

    /* renamed from: k */
    public C8480aw f29541k;

    /* renamed from: l */
    public C8515y f29542l;

    /* renamed from: m */
    public C8511u f29543m;

    /* renamed from: n */
    public C8485ba f29544n;

    /* renamed from: o */
    public C62971cq f29545o;

    /* renamed from: q */
    private byte f29546q = 2;

    static {
        C8513w wVar = new C8513w();
        f29529p = wVar;
        C62942bv.registerDefaultInstance(C8513w.class, wVar);
    }

    private C8513w() {
        emptyProtobufList();
        this.f29534d = emptyProtobufList();
        this.f29545o = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29546q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29546q = b;
                return null;
            case 2:
                return newMessageInfo(f29529p, "\u0001\u000e\u0000\u0001\u0001\u0019\u000e\u0000\u0003\u0001\u0001ᔈ\u0000\u0002\u001b\u0006\u001b\u0007ဉ\u0002\bဉ\u0003\fဉ\u000b\rဉ\u0004\u000eဉ\u0005\u0010ဉ\u0007\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f\u0014ဉ\b\u0019\u001b", new Object[]{"a", "b", C45240c.f118157a, C8470am.class, "d", C8476as.class, "e", C10662f.f35572a, C19621k.f54601a, C30325g.f82003a, C19618h.f54585a, "i", "l", "m", C48004n.f124238a, "j", C66412o.f180592a, C8478au.class});
            case 3:
                return new C8513w();
            case 4:
                return new C8512v();
            case 5:
                return f29529p;
            case 6:
                C63010eb ebVar = f29530r;
                if (ebVar == null) {
                    synchronized (C8513w.class) {
                        ebVar = f29530r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29529p);
                            f29530r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
