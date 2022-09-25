package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: j.a.i.b.a.br */
/* compiled from: PG */
public final class C71235br extends C62942bv implements C63001dt {

    /* renamed from: A */
    private static volatile C63010eb f190168A;

    /* renamed from: y */
    public static final C71235br f190169y;

    /* renamed from: a */
    public int f190170a;

    /* renamed from: b */
    public String f190171b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f190172c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f190173d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f190174e;

    /* renamed from: f */
    public int f190175f;

    /* renamed from: g */
    public int f190176g;

    /* renamed from: h */
    public int f190177h;

    /* renamed from: i */
    public int f190178i;

    /* renamed from: j */
    public int f190179j;

    /* renamed from: k */
    public C71264ct f190180k;

    /* renamed from: l */
    public int f190181l;

    /* renamed from: m */
    public C71231bn f190182m;

    /* renamed from: n */
    public int f190183n;

    /* renamed from: o */
    public long f190184o;

    /* renamed from: p */
    public int f190185p;

    /* renamed from: q */
    public int f190186q;

    /* renamed from: r */
    public int f190187r;

    /* renamed from: s */
    public int f190188s;

    /* renamed from: t */
    public String f190189t;

    /* renamed from: u */
    public C62964ck f190190u;

    /* renamed from: v */
    public String f190191v;

    /* renamed from: w */
    public C71245ca f190192w;

    /* renamed from: x */
    public C71227bj f190193x;

    /* renamed from: z */
    private byte f190194z = 2;

    static {
        C71235br brVar = new C71235br();
        f190169y = brVar;
        C62942bv.registerDefaultInstance(C71235br.class, brVar);
    }

    private C71235br() {
        emptyProtobufList();
        this.f190189t = BuildConfig.FLAVOR;
        this.f190190u = emptyLongList();
        this.f190191v = BuildConfig.FLAVOR;
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190194z);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190194z = b;
                return null;
            case 2:
                return newMessageInfo(f190169y, "\u0001\u0017\u0000\u0001\u0001\u001b\u0017\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဌ\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000eဌ\u000f\u000fဌ\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018ဌ\n\u0019ဈ\u0002\u001aဉ\u0017\u001bဌ\f", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C71241bx.f190201a, C19621k.f54601a, "m", C66412o.f180592a, "p", C71242by.f190202a, "q", C71239bv.f190200a, C59002s.f156871a, C42181t.f110467a, C33259r.f88929b, "v", C147476u.f398081a, "w", "l", C71234bq.m103943b(), "d", "x", C48004n.f124238a, C71238bu.f190199a});
            case 3:
                return new C71235br();
            case 4:
                return new C71232bo();
            case 5:
                return f190169y;
            case 6:
                C63010eb ebVar = f190168A;
                if (ebVar == null) {
                    synchronized (C71235br.class) {
                        ebVar = f190168A;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190169y);
                            f190168A = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
