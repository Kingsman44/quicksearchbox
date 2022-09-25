package com.google.p4172bg.p4174b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.bg.b.b */
/* compiled from: PG */
public final class C55713b extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C55713b f146977q;

    /* renamed from: t */
    private static volatile C63010eb f146978t;

    /* renamed from: a */
    public String f146979a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f146980b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f146981c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f146982d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62960cg f146983e = emptyFloatList();

    /* renamed from: f */
    public float f146984f = 1.0f;

    /* renamed from: g */
    public float f146985g = 0.4f;

    /* renamed from: h */
    public boolean f146986h;

    /* renamed from: i */
    public boolean f146987i;

    /* renamed from: j */
    public float f146988j;

    /* renamed from: k */
    public String f146989k;

    /* renamed from: l */
    public C62971cq f146990l;

    /* renamed from: m */
    public float f146991m;

    /* renamed from: n */
    public double f146992n;

    /* renamed from: o */
    public boolean f146993o;

    /* renamed from: p */
    public boolean f146994p;

    /* renamed from: r */
    private int f146995r;

    /* renamed from: s */
    private int f146996s;

    static {
        C55713b bVar = new C55713b();
        f146977q = bVar;
        C62942bv.registerDefaultInstance(C55713b.class, bVar);
    }

    private C55713b() {
        C62942bv.emptyProtobufList();
        this.f146989k = BuildConfig.FLAVOR;
        this.f146990l = C62942bv.emptyProtobufList();
        this.f146992n = 1.0d;
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
                return newMessageInfo(f146977q, "\u0001\u0010\u0000\u0002\u00016\u0010\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004\u001a\u0005\u001a\u0006\u0013\tခ\u0005\u000eခ\n\u001bဇ\u0017\u001cဇ\u0018\u001eခ\u001b!ဈ\u001e\"\u001a&ခ *က#/ဇ(6ဇ.", new Object[]{C33259r.f88929b, C59002s.f156871a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new C55713b();
            case 4:
                return new C55712a();
            case 5:
                return f146977q;
            case 6:
                C63010eb ebVar = f146978t;
                if (ebVar == null) {
                    synchronized (C55713b.class) {
                        ebVar = f146978t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146977q);
                            f146978t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
