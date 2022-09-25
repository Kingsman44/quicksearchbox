package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.knowledge.p4671b.C61820m;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.s.a.hs */
/* compiled from: PG */
public final class C53271hs extends C62942bv implements C63001dt {

    /* renamed from: u */
    public static final C53271hs f139650u;

    /* renamed from: y */
    private static volatile C63010eb f139651y;

    /* renamed from: a */
    public int f139652a;

    /* renamed from: b */
    public String f139653b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C54188e f139654c;

    /* renamed from: d */
    public C51334dw f139655d;

    /* renamed from: e */
    public C51715bm f139656e;

    /* renamed from: f */
    public C51450id f139657f;

    /* renamed from: g */
    public C63088z f139658g = C63088z.f170246b;

    /* renamed from: h */
    public long f139659h;

    /* renamed from: i */
    public C62964ck f139660i = emptyLongList();

    /* renamed from: j */
    public C62971cq f139661j = C62942bv.emptyProtobufList();

    /* renamed from: k */
    public C61820m f139662k;

    /* renamed from: l */
    public int f139663l;

    /* renamed from: m */
    public boolean f139664m;

    /* renamed from: n */
    public int f139665n;

    /* renamed from: o */
    public C63088z f139666o = C63088z.f170246b;

    /* renamed from: p */
    public C53274hv f139667p;

    /* renamed from: q */
    public C53287ih f139668q;

    /* renamed from: r */
    public C53090b f139669r;

    /* renamed from: s */
    public C62971cq f139670s = emptyProtobufList();

    /* renamed from: t */
    public boolean f139671t;

    /* renamed from: v */
    private C51379fn f139672v;

    /* renamed from: w */
    private C53295ip f139673w;

    /* renamed from: x */
    private byte f139674x = 2;

    static {
        C53271hs hsVar = new C53271hs();
        f139650u = hsVar;
        C62942bv.registerDefaultInstance(C53271hs.class, hsVar);
    }

    private C53271hs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139674x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139674x = b;
                return null;
            case 2:
                return newMessageInfo(f139650u, "\u0001\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0003\u0007\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0006\u0006ဂ\u0007\u0007\u0014\bဉ\b\tဌ\t\nဇ\n\u000b\u001a\fဌ\u000b\rည\f\u0010ᐉ\u0005\u0011ဉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011\u0014\u001b\u0015ဉ\u0012\u0016ᐉ\u0004\u0018ဇ\u0014", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, "l", C53306j.m86810b(), "m", "j", C48004n.f124238a, C53270hr.m86802b(), C66412o.f180592a, "v", "p", "q", "w", C59002s.f156871a, C48851br.class, C33259r.f88929b, C10662f.f35572a, C42181t.f110467a});
            case 3:
                return new C53271hs();
            case 4:
                return new C53268hp();
            case 5:
                return f139650u;
            case 6:
                C63010eb ebVar = f139651y;
                if (ebVar == null) {
                    synchronized (C53271hs.class) {
                        ebVar = f139651y;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139650u);
                            f139651y = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
