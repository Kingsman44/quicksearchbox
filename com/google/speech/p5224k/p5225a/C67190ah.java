package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.research.xeno.effect.C66412o;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5226l.p5227a.C67250b;

/* renamed from: com.google.speech.k.a.ah */
/* compiled from: PG */
public final class C67190ah extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C67190ah f182619q;

    /* renamed from: r */
    public static final C62940bt f182620r;

    /* renamed from: t */
    private static volatile C63010eb f182621t;

    /* renamed from: a */
    public int f182622a;

    /* renamed from: b */
    public int f182623b = 0;

    /* renamed from: c */
    public Object f182624c;

    /* renamed from: d */
    public String f182625d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f182626e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C67250b f182627f;

    /* renamed from: g */
    public int f182628g = 4;

    /* renamed from: h */
    public boolean f182629h;

    /* renamed from: i */
    public boolean f182630i;

    /* renamed from: j */
    public C62961ch f182631j;

    /* renamed from: k */
    public String f182632k;

    /* renamed from: l */
    public String f182633l;

    /* renamed from: m */
    public int f182634m;

    /* renamed from: n */
    public String f182635n;

    /* renamed from: o */
    public boolean f182636o;

    /* renamed from: p */
    public int f182637p;

    /* renamed from: s */
    private byte f182638s = 2;

    static {
        C67190ah ahVar = new C67190ah();
        f182619q = ahVar;
        C62942bv.registerDefaultInstance(C67190ah.class, ahVar);
        f182620r = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, ahVar, ahVar, (C62958ce) null, 27801516, C63066gd.MESSAGE, C67190ah.class);
    }

    private C67190ah() {
        C62942bv.emptyProtobufList();
        this.f182631j = emptyIntList();
        this.f182632k = BuildConfig.FLAVOR;
        this.f182633l = BuildConfig.FLAVOR;
        this.f182635n = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182638s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182638s = b;
                return null;
            case 2:
                return newMessageInfo(f182619q, "\u0001\u000f\u0001\u0001\u0001\u001f\u000f\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\r\u0004ဈ\u000e\u0005င\u000f\u0007ဳ\u0000\nဌ\u0007\rᐉ\u0002\u0010ဇ\u0019\u0011ဈ\u0011\u0012ဇ\t\u0013ဇ\n\u001a\u001e\u001bဳ\u0000\u001fဌ\u001b", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C19621k.f54601a, "l", "m", C30325g.f82003a, C67188af.f182618a, C10662f.f35572a, C66412o.f180592a, C48004n.f124238a, C19618h.f54585a, "i", "j", C67198ap.f182652a, "p", C67196an.f182648a});
            case 3:
                return new C67190ah();
            case 4:
                return new C67187ae();
            case 5:
                return f182619q;
            case 6:
                C63010eb ebVar = f182621t;
                if (ebVar == null) {
                    synchronized (C67190ah.class) {
                        ebVar = f182621t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182619q);
                            f182621t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
