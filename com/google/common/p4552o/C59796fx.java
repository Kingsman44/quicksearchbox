package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.C37584ey;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.fx */
/* compiled from: PG */
public final class C59796fx extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C59796fx f161580r;

    /* renamed from: t */
    private static volatile C63010eb f161581t;

    /* renamed from: a */
    public int f161582a;

    /* renamed from: b */
    public C59817gj f161583b;

    /* renamed from: c */
    public C59858hv f161584c;

    /* renamed from: d */
    public C62971cq f161585d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C59831gx f161586e;

    /* renamed from: f */
    public C62971cq f161587f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f161588g = emptyProtobufList();

    /* renamed from: h */
    public C59848hl f161589h;

    /* renamed from: i */
    public C62971cq f161590i = emptyProtobufList();

    /* renamed from: j */
    public C62971cq f161591j = emptyProtobufList();

    /* renamed from: k */
    public C62971cq f161592k = emptyProtobufList();

    /* renamed from: l */
    public C62971cq f161593l = emptyProtobufList();

    /* renamed from: m */
    public C62971cq f161594m = emptyProtobufList();

    /* renamed from: n */
    public C59780fh f161595n;

    /* renamed from: o */
    public C59778ff f161596o;

    /* renamed from: p */
    public C62971cq f161597p = emptyProtobufList();

    /* renamed from: q */
    public C37584ey f161598q;

    /* renamed from: s */
    private byte f161599s = 2;

    static {
        C59796fx fxVar = new C59796fx();
        f161580r = fxVar;
        C62942bv.registerDefaultInstance(C59796fx.class, fxVar);
    }

    private C59796fx() {
    }

    /* renamed from: a */
    public final void mo57059a() {
        C62971cq cqVar = this.f161587f;
        if (!cqVar.mo58948c()) {
            this.f161587f = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f161599s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f161599s = b;
                return null;
            case 2:
                return newMessageInfo(f161580r, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\t\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001a\u0004ဉ\u0002\u0005\u001b\u0006ဉ\u0003\u0007\u001b\t\u001b\n\u001b\u000b\u001b\f\u001b\u000eဉ\u0006\u000fဉ\u0007\u0010\u001b\u0012Л\u0014ᐉ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C59827gt.class, C19618h.f54585a, "i", C59833gz.class, "j", C59794fv.class, C19621k.f54601a, C59988il.class, "l", C59842hf.class, C30325g.f82003a, C59852hp.class, C48004n.f124238a, C66412o.f180592a, "p", C59792ft.class, "m", C59811gd.class, "q"});
            case 3:
                return new C59796fx();
            case 4:
                return new C59795fw();
            case 5:
                return f161580r;
            case 6:
                C63010eb ebVar = f161581t;
                if (ebVar == null) {
                    synchronized (C59796fx.class) {
                        ebVar = f161581t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161580r);
                            f161581t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
