package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4682d.C61995f;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.protos.p5146w.C65942b;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.al.d.a.am */
/* compiled from: PG */
public final class C8533am extends C62942bv implements C63001dt {

    /* renamed from: s */
    public static final C8533am f29592s;

    /* renamed from: t */
    public static final C62940bt f29593t;

    /* renamed from: w */
    private static volatile C63010eb f29594w;

    /* renamed from: a */
    public int f29595a;

    /* renamed from: b */
    public boolean f29596b;

    /* renamed from: c */
    public String f29597c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f29598d;

    /* renamed from: e */
    public C62961ch f29599e = emptyIntList();

    /* renamed from: f */
    public String f29600f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f29601g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public C63088z f29602h = C63088z.f170246b;

    /* renamed from: i */
    public String f29603i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f29604j = 1;

    /* renamed from: k */
    public boolean f29605k;

    /* renamed from: l */
    public boolean f29606l;

    /* renamed from: m */
    public String f29607m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public C62971cq f29608n = C62942bv.emptyProtobufList();

    /* renamed from: o */
    public C8575bc f29609o;

    /* renamed from: p */
    public String f29610p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public C8586m f29611q;

    /* renamed from: r */
    public C61995f f29612r;

    /* renamed from: u */
    private C65942b f29613u;

    /* renamed from: v */
    private byte f29614v = 2;

    static {
        C8533am amVar = new C8533am();
        f29592s = amVar;
        C62942bv.registerDefaultInstance(C8533am.class, amVar);
        f29593t = C62942bv.newSingularGeneratedExtension(C8523ac.f29564e, amVar, amVar, (C62958ce) null, 101, C63066gd.MESSAGE, C8533am.class);
    }

    private C8533am() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29614v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29614v = b;
                return null;
            case 2:
                return newMessageInfo(f29592s, "\u0001\u0012\u0000\u0001\u0001\"\u0012\u0000\u0003\u0001\u0001ဇ\u0001\u0002ဈ\u0002\u0003ဇ\u0003\u0004\u0016\u0005ဈ\u0004\u0006\u001a\u0007ည\u0005\bဈ\u0006\tဌ\u0007\nဇ\b\u000bဇ\t\fဈ\n\u0013\u001a\u0019ဉ\u0015\u001bဉ\u0014 ᐉ\u0011!ဉ\u000e\"ဈ\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C8532al.m23274b(), C19621k.f54601a, "l", "m", C48004n.f124238a, C33259r.f88929b, "q", C147476u.f398081a, C66412o.f180592a, "p"});
            case 3:
                return new C8533am();
            case 4:
                return new C8530aj();
            case 5:
                return f29592s;
            case 6:
                C63010eb ebVar = f29594w;
                if (ebVar == null) {
                    synchronized (C8533am.class) {
                        ebVar = f29594w;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29592s);
                            f29594w = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
