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
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62965cl;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;
import com.google.speech.p5204e.C66498i;
import com.google.speech.p5218j.C66964g;

/* renamed from: com.google.al.c.c.b.as */
/* compiled from: PG */
public final class C8476as extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C62962ci f29412m = new C8471an();

    /* renamed from: p */
    public static final C8476as f29413p;

    /* renamed from: q */
    public static final C62965cl f29414q = new C62965cl(C66498i.f180831Y, C66498i.NORMAL);

    /* renamed from: r */
    private static volatile C63010eb f29415r;

    /* renamed from: a */
    public int f29416a;

    /* renamed from: b */
    public String f29417b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f29418c;

    /* renamed from: d */
    public int f29419d;

    /* renamed from: e */
    public int f29420e;

    /* renamed from: f */
    public String f29421f;

    /* renamed from: g */
    public C62961ch f29422g;

    /* renamed from: h */
    public int f29423h;

    /* renamed from: i */
    public String f29424i;

    /* renamed from: j */
    public String f29425j;

    /* renamed from: k */
    public int f29426k;

    /* renamed from: l */
    public C62961ch f29427l;

    /* renamed from: n */
    public C62971cq f29428n;

    /* renamed from: o */
    public C62995dn f29429o = C62995dn.f170057a;

    static {
        C8476as asVar = new C8476as();
        f29413p = asVar;
        C62942bv.registerDefaultInstance(C8476as.class, asVar);
    }

    private C8476as() {
        C62942bv.emptyProtobufList();
        this.f29418c = BuildConfig.FLAVOR;
        this.f29421f = BuildConfig.FLAVOR;
        this.f29422g = emptyIntList();
        emptyProtobufList();
        this.f29424i = BuildConfig.FLAVOR;
        this.f29425j = BuildConfig.FLAVOR;
        this.f29427l = emptyIntList();
        emptyIntList();
        this.f29428n = emptyProtobufList();
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
                return newMessageInfo(f29413p, "\u0001\r\u0000\u0001\u0001\u0015\r\u0001\u0003\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004င\u0002\u0005င\u0004\u0006ဈ\u0005\u0007\u0016\bင\u0006\fဈ\t\u000eဌ\f\u000f\u001e\u0011ဈ\n\u0014\u001b\u0015࠲", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, C8474aq.f29411a, "l", C66964g.m97397b(), "j", C48004n.f124238a, C8488bd.class, C66412o.f180592a, C8473ap.f29410a, C66498i.m97223b()});
            case 3:
                return new C8476as();
            case 4:
                return new C8472ao();
            case 5:
                return f29413p;
            case 6:
                C63010eb ebVar = f29415r;
                if (ebVar == null) {
                    synchronized (C8476as.class) {
                        ebVar = f29415r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29413p);
                            f29415r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
