package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.research.xeno.effect.C66412o;
import com.google.speech.p5195a.C66449d;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.speech.k.a.v */
/* compiled from: PG */
public final class C67244v extends C62942bv implements C63001dt {

    /* renamed from: s */
    public static final C67244v f182771s;

    /* renamed from: t */
    public static final C62940bt f182772t;

    /* renamed from: v */
    private static volatile C63010eb f182773v;

    /* renamed from: a */
    public int f182774a;

    /* renamed from: b */
    public int f182775b;

    /* renamed from: c */
    public C66422b f182776c;

    /* renamed from: d */
    public int f182777d = 1;

    /* renamed from: e */
    public C66449d f182778e;

    /* renamed from: f */
    public boolean f182779f;

    /* renamed from: g */
    public boolean f182780g;

    /* renamed from: h */
    public boolean f182781h;

    /* renamed from: i */
    public int f182782i = 2;

    /* renamed from: j */
    public String f182783j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public boolean f182784k;

    /* renamed from: l */
    public boolean f182785l;

    /* renamed from: m */
    public boolean f182786m;

    /* renamed from: n */
    public C67243u f182787n;

    /* renamed from: o */
    public C67231i f182788o;

    /* renamed from: p */
    public boolean f182789p;

    /* renamed from: q */
    public boolean f182790q;

    /* renamed from: r */
    public boolean f182791r;

    /* renamed from: u */
    private byte f182792u = 2;

    static {
        C67244v vVar = new C67244v();
        f182771s = vVar;
        C62942bv.registerDefaultInstance(C67244v.class, vVar);
        f182772t = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, vVar, vVar, (C62958ce) null, 294500, C63066gd.MESSAGE, C67244v.class);
    }

    private C67244v() {
        C62942bv.emptyProtobufList();
        this.f182790q = true;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182792u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182792u = b;
                return null;
            case 2:
                return newMessageInfo(f182771s, "\u0001\u0010\u0000\u0002\u0001(\u0010\u0000\u0000\u0001\u0001ᐉ\u0000\u0003င\u0001\u0004ဉ\u0002\u0005ဇ\u0003\u0007င\n\nဈ\r\rဇ\u0011\u000eဇ\u0012\u0014ဇ\u0019\u0016ဇ\u0006\u0017ဇ\u0005\u0019ဉ\u001d\u001cဉ\u001e\"ဇ#'ဇ&(ဇ'", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, "i", "j", C19621k.f54601a, "l", "m", C19618h.f54585a, C30325g.f82003a, C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b});
            case 3:
                return new C67244v();
            case 4:
                return new C67239q();
            case 5:
                return f182771s;
            case 6:
                C63010eb ebVar = f182773v;
                if (ebVar == null) {
                    synchronized (C67244v.class) {
                        ebVar = f182773v;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182771s);
                            f182773v = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
