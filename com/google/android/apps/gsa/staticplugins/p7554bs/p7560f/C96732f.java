package com.google.android.apps.gsa.staticplugins.p7554bs.p7560f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87938jd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87940jf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87942jh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87944jj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87946jl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87948jn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87949jo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87950jp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87951jq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87952jr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87953js;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87954jt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87955ju;
import com.google.android.apps.gsa.shared.p7066m.C89997bc;
import com.google.android.apps.gsa.shared.p7066m.C90031cj;
import com.google.android.apps.search.lens.p10548b.C139925a;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.android.libraries.lens.view.p2051ab.C24971d;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.android.libraries.lens.view.utils.C28122k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62471cu;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.C68214a;
import java.util.BitSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.f.f */
/* compiled from: PG */
public final class C96732f implements C96731e {

    /* renamed from: a */
    private static final C59071e f270568a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bs.f.f");

    /* renamed from: b */
    private final Context f270569b;

    /* renamed from: c */
    private final C86124t f270570c;

    /* renamed from: d */
    private final PackageManager f270571d;

    /* renamed from: e */
    private final C68214a f270572e;

    /* renamed from: f */
    private final C68214a f270573f;

    /* renamed from: g */
    private final boolean f270574g;

    /* renamed from: h */
    private final boolean f270575h;

    /* renamed from: i */
    private final C58485gu f270576i;

    /* renamed from: j */
    private int f270577j = 0;

    /* renamed from: k */
    private int f270578k = -1;

    /* renamed from: l */
    private String f270579l;

    /* renamed from: m */
    private Location f270580m;

    /* renamed from: n */
    private String f270581n;

    /* renamed from: o */
    private PointF f270582o;

    /* renamed from: p */
    private long f270583p;

    /* renamed from: q */
    private int f270584q = 0;

    /* renamed from: r */
    private Bitmap f270585r;

    /* renamed from: s */
    private Uri f270586s;

    /* renamed from: t */
    private String f270587t;

    /* renamed from: u */
    private byte[] f270588u;

    /* renamed from: v */
    private C62471cu f270589v = C62471cu.f168676c;

    public C96732f(Context context, C86124t tVar, C68214a aVar, PackageManager packageManager, C68214a aVar2, boolean z, boolean z2, C65603f fVar) {
        this.f270569b = context;
        this.f270570c = tVar;
        this.f270572e = aVar;
        this.f270571d = packageManager;
        this.f270573f = aVar2;
        this.f270574g = z;
        this.f270575h = z2;
        this.f270576i = C58485gu.m89842j(fVar.f178307a);
    }

    /* renamed from: l */
    private final void m160300l() {
        C58838bb.m90884s(this.f270577j != 0, "TargetServiceApiVersion must be set before using LensServiceControllerImpl.");
    }

    /* renamed from: a */
    public final int mo90321a() {
        C22872h.m42742b(C86593a.class);
        m160300l();
        return 3;
    }

    /* renamed from: b */
    public final C87953js mo90322b() {
        C87938jd jdVar = (C87938jd) C87953js.f237872i.createBuilder();
        C87951jq jqVar = (C87951jq) C87952jr.f237869b.createBuilder();
        jqVar.mo81983a(this.f270576i);
        jdVar.copyOnWrite();
        C87953js jsVar = (C87953js) jdVar.instance;
        C87952jr jrVar = (C87952jr) jqVar.build();
        jrVar.getClass();
        jsVar.f237876c = jrVar;
        jsVar.f237874a |= 2;
        C87949jo joVar = (C87949jo) C87950jp.f237865c.createBuilder();
        joVar.copyOnWrite();
        C87950jp jpVar = (C87950jp) joVar.instance;
        jpVar.f237867a |= 1;
        jpVar.f237868b = true;
        jdVar.copyOnWrite();
        C87953js jsVar2 = (C87953js) jdVar.instance;
        C87950jp jpVar2 = (C87950jp) joVar.build();
        jpVar2.getClass();
        jsVar2.f237877d = jpVar2;
        jsVar2.f237874a |= 4;
        C87946jl jlVar = C87946jl.f237861a;
        jdVar.copyOnWrite();
        C87953js jsVar3 = (C87953js) jdVar.instance;
        jlVar.getClass();
        jsVar3.f237880g = jlVar;
        jsVar3.f237874a |= 32;
        C87944jj jjVar = C87944jj.f237859a;
        jdVar.copyOnWrite();
        C87953js jsVar4 = (C87953js) jdVar.instance;
        jjVar.getClass();
        jsVar4.f237881h = jjVar;
        jsVar4.f237874a |= 64;
        C87948jn jnVar = C87948jn.f237863a;
        jdVar.copyOnWrite();
        C87953js jsVar5 = (C87953js) jdVar.instance;
        jnVar.getClass();
        jsVar5.f237879f = jnVar;
        jsVar5.f237874a |= 16;
        if (!this.f270574g) {
            C87942jh jhVar = C87942jh.f237857a;
            jdVar.copyOnWrite();
            C87953js jsVar6 = (C87953js) jdVar.instance;
            jhVar.getClass();
            jsVar6.f237875b = jhVar;
            jsVar6.f237874a |= 1;
        }
        if (!this.f270575h) {
            C87940jf jfVar = C87940jf.f237855a;
            jdVar.copyOnWrite();
            C87953js jsVar7 = (C87953js) jdVar.instance;
            jfVar.getClass();
            jsVar7.f237878e = jfVar;
            jsVar7.f237874a |= 8;
        }
        return (C87953js) jdVar.build();
    }

    /* renamed from: c */
    public final C87955ju mo90323c() {
        C87954jt jtVar = (C87954jt) C87955ju.f237882f.createBuilder();
        long a = this.f270570c.mo79743a(C90031cj.f248314c);
        jtVar.copyOnWrite();
        C87955ju juVar = (C87955ju) jtVar.instance;
        juVar.f237884a |= 1;
        juVar.f237885b = (int) a;
        jtVar.copyOnWrite();
        C87955ju juVar2 = (C87955ju) jtVar.instance;
        juVar2.f237884a |= 2;
        juVar2.f237886c = 2;
        long a2 = this.f270570c.mo79743a(C90031cj.f248313b);
        jtVar.copyOnWrite();
        C87955ju juVar3 = (C87955ju) jtVar.instance;
        juVar3.f237884a |= 4;
        juVar3.f237887d = (int) a2;
        long a3 = this.f270570c.mo79743a(C89997bc.f246817n);
        jtVar.copyOnWrite();
        C87955ju juVar4 = (C87955ju) jtVar.instance;
        juVar4.f237884a |= 8;
        juVar4.f237888e = (int) a3;
        return (C87955ju) jtVar.build();
    }

    /* renamed from: d */
    public final void mo90324d(Bundle bundle) {
        C22872h.m42742b(C86593a.class);
        m160300l();
        this.f270585r = (Bitmap) bundle.getParcelable("bitmap");
        this.f270586s = (Uri) bundle.getParcelable("uri");
        this.f270587t = bundle.getString("lens_fife_url");
        this.f270588u = bundle.getByteArray("image_payload");
        this.f270581n = bundle.getString("image_place_id");
        Location location = (Location) bundle.getParcelable("location");
        if (!(location == null || (location.getLatitude() == C59203do.f157270a && location.getLongitude() == C59203do.f157270a))) {
            this.f270580m = location;
        }
        this.f270579l = bundle.getString("account");
        this.f270584q = bundle.getInt("lens_transition_type");
        this.f270582o = (PointF) bundle.getParcelable("lens_tap_location");
    }

    /* renamed from: e */
    public final void mo90325e(int i) {
        if (i != -1) {
            this.f270578k = i;
        }
    }

    /* renamed from: f */
    public final void mo90326f(int i) {
        C22872h.m42742b(C86593a.class);
        this.f270577j = i;
        m160300l();
    }

    /* renamed from: g */
    public final void mo90327g(Bundle bundle, C1967b bVar) {
        C22872h.m42742b(C86593a.class);
        m160300l();
        this.f270583p = bundle.getLong("activity_launch_timestamp_nanos");
        boolean z = bundle.getBoolean("hide_lens_close_button");
        this.f270581n = bundle.getString("image_place_id");
        BitSet bitSet = (BitSet) bundle.getSerializable("disable_lens_features");
        boolean z2 = bitSet == null || !bitSet.get(0);
        int i = bundle.getInt("lens_intent_type", C62433bj.UNKNOWN.f168594ao);
        Rect rect = (Rect) bundle.getParcelable("lens_sreen_image_location");
        boolean z3 = bundle.getBoolean("promo_add_shorcut");
        int i2 = bundle.getInt("lens_theme", 0);
        this.f270589v = C24971d.m46222b(bundle);
        int c = C28122k.m52403c(this.f270569b);
        C24970c cVar = new C24970c();
        cVar.f68093a = true;
        cVar.f68094b = this.f270589v;
        cVar.f68104l = this.f270584q;
        cVar.f68105m = i;
        cVar.f68112t = z2;
        cVar.f68113u = z;
        cVar.f68115w = C24971d.m46221a(c);
        cVar.f68109q = i2;
        cVar.f68092C = z3;
        String str = this.f270579l;
        if (str != null) {
            cVar.f68103k = str;
        }
        String k = mo90331k();
        if (k != null) {
            cVar.f68102j = k;
        }
        PointF pointF = this.f270582o;
        if (pointF != null) {
            cVar.f68108p = pointF;
        }
        Uri uri = this.f270586s;
        if (uri != null) {
            cVar.f68096d = uri;
            C58976aa aaVar = C58975e.f156826a;
        }
        Bitmap bitmap = this.f270585r;
        if (bitmap != null) {
            cVar.f68097e = bitmap;
            C58976aa aaVar2 = C58975e.f156826a;
        }
        byte[] bArr = this.f270588u;
        if (bArr != null) {
            cVar.f68101i = bArr;
            C58976aa aaVar3 = C58975e.f156826a;
        }
        Location location = this.f270580m;
        if (location != null) {
            cVar.f68110r = location;
        }
        String str2 = this.f270581n;
        if (str2 != null) {
            cVar.f68111s = str2;
        }
        String str3 = this.f270587t;
        if (str3 != null) {
            cVar.f68098f = str3;
        }
        if (rect != null) {
            cVar.f68090A = rect;
        }
        cVar.f68118z = Long.valueOf(this.f270583p);
        bVar.mo3353a(cVar.mo30192a());
    }

    /* renamed from: h */
    public final int mo90328h() {
        return this.f270570c.mo79746e(C90031cj.f248312a) ? 2 : 3;
    }

    /* renamed from: i */
    public final int mo90329i() {
        C58833ax j = C58833ax.m90833j(mo90331k());
        return (!j.mo56113h() || ((C139925a) this.f270573f.mo27525b()).mo115342a((String) j.mo56107c()) != -1) ? 3 : 2;
    }

    /* renamed from: j */
    public final int mo90330j() {
        return ((C27683a) this.f270572e.mo27525b()).mo33176c(mo90331k());
    }

    /* renamed from: k */
    public final String mo90331k() {
        int length;
        int i = this.f270578k;
        if (i == -1) {
            return "com.google.android.googlequicksearchbox";
        }
        String[] packagesForUid = this.f270571d.getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            return null;
        }
        if (length > 1) {
            C59104x d = f270568a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LensServiceCtrlrImpl");
            ((C59052c) ((C59052c) d).mo56372aa(20864)).mo56395y("There were %d packages instead of the expected 1. Ignoring extra packages... [%s]", length, packagesForUid);
        }
        return packagesForUid[0];
    }
}
