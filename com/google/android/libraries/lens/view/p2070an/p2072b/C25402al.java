package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.content.Context;
import android.graphics.RectF;
import android.location.Location;
import android.os.Build;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2067ak.C25197ac;
import com.google.android.libraries.lens.view.p2070an.C25437i;
import com.google.android.libraries.lens.view.p2077as.C25475a;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.session.C27749al;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.lens.p4698d.C62165d;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62453cc;
import com.google.lens.p4707j.C62454cd;
import com.google.lens.p4707j.C62468cr;
import com.google.lens.p4707j.C62471cu;
import com.google.lens.p4707j.C62477d;
import com.google.lens.p4707j.C62504e;
import com.google.lens.p4707j.C62505ea;
import com.google.lens.p4707j.C62531f;
import com.google.lens.p4707j.C62558g;
import com.google.lens.p4711m.C62624a;
import com.google.lens.p4711m.C62632i;
import com.google.p4017at.p4056g.p4057a.p4058a.C53971af;
import com.google.p4017at.p4056g.p4057a.p4058a.C53972ag;
import com.google.p4017at.p4056g.p4057a.p4058a.C53973ah;
import com.google.p4017at.p4056g.p4057a.p4058a.C53974ai;
import com.google.p4017at.p4056g.p4057a.p4058a.C53975aj;
import com.google.p4017at.p4056g.p4057a.p4058a.C53976ak;
import com.google.p4017at.p4056g.p4057a.p4058a.C53977al;
import com.google.p4017at.p4056g.p4057a.p4058a.C53978am;
import com.google.p4017at.p4056g.p4057a.p4058a.C53984as;
import com.google.p4017at.p4056g.p4057a.p4058a.C54002bj;
import com.google.p4017at.p4056g.p4057a.p4058a.C54016bx;
import com.google.p4017at.p4056g.p4057a.p4058a.C54017by;
import com.google.p4017at.p4056g.p4057a.p4058a.C54018bz;
import com.google.p4017at.p4056g.p4057a.p4058a.C54020ca;
import com.google.p4017at.p4056g.p4057a.p4058a.C54021cb;
import com.google.p4017at.p4056g.p4057a.p4058a.C54022cc;
import com.google.p4017at.p4056g.p4057a.p4058a.C54027ch;
import com.google.p4017at.p4056g.p4057a.p4058a.C54028ci;
import com.google.p4017at.p4056g.p4057a.p4058a.C54047da;
import com.google.p4017at.p4056g.p4057a.p4058a.C54048db;
import com.google.p4017at.p4056g.p4057a.p4058a.C54061m;
import com.google.p4017at.p4056g.p4057a.p4058a.C54062n;
import com.google.p4017at.p4056g.p4057a.p4058a.C54063o;
import com.google.p4017at.p4056g.p4057a.p4058a.C54064p;
import com.google.p4017at.p4056g.p4057a.p4058a.C54065q;
import com.google.p4017at.p4056g.p4057a.p4058a.C54066r;
import com.google.p4017at.p4056g.p4057a.p4058a.C54067s;
import com.google.p4017at.p4056g.p4057a.p4058a.C54068t;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56245az;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56247ba;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56248bb;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56249bc;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56252bf;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56253bg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62931bk;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63077o;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4963bf.p4964a.p4965a.C64579ba;
import com.google.protos.p4963bf.p4964a.p4965a.C64580bb;
import com.google.protos.p4963bf.p4964a.p4965a.C64581bc;
import com.google.protos.p4963bf.p4964a.p4965a.C64582bd;
import com.google.protos.p4963bf.p4964a.p4965a.C64583be;
import com.google.protos.p4963bf.p4964a.p4965a.C64584bf;
import com.google.protos.p4963bf.p4964a.p4965a.C64585bg;
import com.google.protos.p4963bf.p4964a.p4965a.C64589bk;
import com.google.protos.p4963bf.p4964a.p4965a.C64590bl;
import com.google.protos.p4963bf.p4964a.p4965a.C64591bm;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;
import p3186j$.net.URLDecoder;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.an.b.al */
/* compiled from: PG */
final class C25402al {

    /* renamed from: b */
    public static final /* synthetic */ int f69223b = 0;

    /* renamed from: c */
    private static final C58974d f69224c = C58974d.m91135i("ServerRequestFactory");

    /* renamed from: a */
    public final C26244b f69225a;

    /* renamed from: d */
    private final C58833ax f69226d;

    /* renamed from: e */
    private final C25475a f69227e;

    /* renamed from: f */
    private final Context f69228f;

    /* renamed from: g */
    private final C58833ax f69229g;

    /* renamed from: h */
    private final C58833ax f69230h;

    /* renamed from: i */
    private final C21370a f69231i;

    /* renamed from: j */
    private final boolean f69232j;

    /* renamed from: k */
    private final C25437i f69233k;

    /* renamed from: l */
    private final boolean f69234l;

    public C25402al(Context context, C21370a aVar, C58833ax axVar, C26244b bVar, C25475a aVar2, boolean z, C58833ax axVar2, C58833ax axVar3, C25437i iVar, boolean z2) {
        this.f69228f = context;
        this.f69226d = axVar;
        this.f69225a = bVar;
        this.f69227e = aVar2;
        this.f69232j = z;
        this.f69229g = axVar2;
        this.f69230h = axVar3;
        this.f69231i = aVar;
        this.f69233k = iVar;
        this.f69234l = z2;
    }

    /* renamed from: a */
    public static RectF m46789a(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF();
        rectF3.left = (rectF.left - rectF2.left) / rectF2.width();
        rectF3.right = (rectF.right - rectF2.left) / rectF2.width();
        rectF3.top = (rectF.top - rectF2.top) / rectF2.height();
        rectF3.bottom = (rectF.bottom - rectF2.top) / rectF2.height();
        return rectF3;
    }

    /* renamed from: d */
    static C62454cd m46790d(RectF rectF, C25411i iVar, C25411i iVar2) {
        boolean z = false;
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            z = true;
        }
        C58838bb.m90884s(z, "region crop box should have non-zero size");
        C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
        float centerX = rectF.centerX();
        bqVar.copyOnWrite();
        C62441br brVar = (C62441br) bqVar.instance;
        brVar.f168610a |= 1;
        brVar.f168611b = centerX;
        float centerY = rectF.centerY();
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 2;
        brVar2.f168612c = centerY;
        float width = rectF.width();
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 4;
        brVar3.f168613d = width;
        float height = rectF.height();
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 8;
        brVar4.f168614e = height;
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168616g = 1;
        brVar5.f168610a |= 32;
        C62441br brVar6 = (C62441br) bqVar.build();
        int width2 = iVar2.mo30449b().getWidth();
        int height2 = iVar2.mo30449b().getHeight();
        int width3 = iVar.mo30449b().getWidth();
        float width4 = rectF.width();
        C62453cc ccVar = (C62453cc) C62454cd.f168644f.createBuilder();
        ccVar.copyOnWrite();
        C62454cd cdVar = (C62454cd) ccVar.instance;
        cdVar.f168646a |= 2;
        cdVar.f168648c = width2;
        ccVar.copyOnWrite();
        C62454cd cdVar2 = (C62454cd) ccVar.instance;
        cdVar2.f168646a |= 4;
        cdVar2.f168649d = height2;
        ccVar.copyOnWrite();
        C62454cd cdVar3 = (C62454cd) ccVar.instance;
        cdVar3.f168646a |= 8;
        cdVar3.f168650e = ((float) width3) / (((float) width2) * width4);
        ccVar.copyOnWrite();
        C62454cd cdVar4 = (C62454cd) ccVar.instance;
        brVar6.getClass();
        cdVar4.f168647b = brVar6;
        cdVar4.f168646a |= 1;
        return (C62454cd) ccVar.build();
    }

    /* renamed from: e */
    public static C64591bm m46791e(C25411i iVar) {
        C25410h hVar = (C25410h) iVar.mo30452e().mo56107c();
        int height = iVar.mo30449b().getHeight();
        int width = iVar.mo30449b().getWidth();
        int centerX = hVar.mo30457a().centerX();
        int width2 = hVar.mo30457a().width() / 2;
        float f = (float) width;
        float max = Math.max(0.0f, ((float) (centerX - width2)) / f);
        float min = Math.min(1.0f, ((float) (centerX + width2)) / f);
        int centerY = hVar.mo30457a().centerY();
        int height2 = hVar.mo30457a().height() / 2;
        float f2 = (float) height;
        float max2 = Math.max(0.0f, ((float) (centerY - height2)) / f2);
        float min2 = Math.min(1.0f, ((float) (centerY + height2)) / f2);
        C64583be beVar = (C64583be) C64584bf.f175100d.createBuilder();
        C64580bb bbVar = (C64580bb) C64581bc.f175093f.createBuilder();
        bbVar.copyOnWrite();
        C64581bc bcVar = (C64581bc) bbVar.instance;
        bcVar.f175095a |= 1;
        bcVar.f175096b = max;
        bbVar.copyOnWrite();
        C64581bc bcVar2 = (C64581bc) bbVar.instance;
        bcVar2.f175095a |= 2;
        bcVar2.f175097c = max2;
        bbVar.copyOnWrite();
        C64581bc bcVar3 = (C64581bc) bbVar.instance;
        bcVar3.f175095a |= 4;
        bcVar3.f175098d = min;
        bbVar.copyOnWrite();
        C64581bc bcVar4 = (C64581bc) bbVar.instance;
        bcVar4.f175095a |= 8;
        bcVar4.f175099e = min2;
        C64581bc bcVar5 = (C64581bc) bbVar.build();
        beVar.copyOnWrite();
        C64584bf bfVar = (C64584bf) beVar.instance;
        bcVar5.getClass();
        bfVar.f175103b = bcVar5;
        bfVar.f175102a |= 1;
        for (int i = 0; i < hVar.mo30458b().size(); i++) {
            float floatValue = ((Float) hVar.mo30458b().get(i)).floatValue();
            beVar.copyOnWrite();
            C64584bf bfVar2 = (C64584bf) beVar.instance;
            C62960cg cgVar = bfVar2.f175104c;
            if (!cgVar.mo58948c()) {
                bfVar2.f175104c = C62942bv.mutableCopy(cgVar);
            }
            bfVar2.f175104c.mo58861g(floatValue);
        }
        C64582bd bdVar = (C64582bd) C64585bg.f175105b.createBuilder();
        C64584bf bfVar3 = (C64584bf) beVar.build();
        bdVar.copyOnWrite();
        C64585bg bgVar = (C64585bg) bdVar.instance;
        bfVar3.getClass();
        C62971cq cqVar = bgVar.f175107a;
        if (!cqVar.mo58948c()) {
            bgVar.f175107a = C62942bv.mutableCopy(cqVar);
        }
        bgVar.f175107a.add(bfVar3);
        C64590bl blVar = (C64590bl) C64591bm.f175122b.createBuilder();
        C64579ba baVar = (C64579ba) C64589bk.f175115e.createBuilder();
        baVar.copyOnWrite();
        C64589bk bkVar = (C64589bk) baVar.instance;
        bkVar.f175120d = 2;
        bkVar.f175117a |= 1;
        C64585bg bgVar2 = (C64585bg) bdVar.build();
        baVar.copyOnWrite();
        C64589bk bkVar2 = (C64589bk) baVar.instance;
        bgVar2.getClass();
        bkVar2.f175119c = bgVar2;
        bkVar2.f175118b = 2;
        blVar.copyOnWrite();
        C64591bm bmVar = (C64591bm) blVar.instance;
        C64589bk bkVar3 = (C64589bk) baVar.build();
        bkVar3.getClass();
        C62971cq cqVar2 = bmVar.f175124a;
        if (!cqVar2.mo58948c()) {
            bmVar.f175124a = C62942bv.mutableCopy(cqVar2);
        }
        bmVar.f175124a.add(bkVar3);
        return (C64591bm) blVar.build();
    }

    /* renamed from: g */
    public static void m46792g(C53984as asVar, C25411i iVar, boolean z) {
        C54066r rVar;
        if (z) {
            C54022cc ccVar = ((C54002bj) asVar.instance).f141681c;
            if (ccVar == null) {
                ccVar = C54022cc.f141741c;
            }
            if (ccVar.f141743a == 5) {
                return;
            }
        }
        byte[] bArr = (byte[]) iVar.mo30451d().mo56107c();
        if (bArr.length == 0) {
            ((C58970a) ((C58970a) f69224c.mo56225c()).mo56372aa(49906)).mo56386p("Compressed image is empty");
        }
        C54022cc ccVar2 = ((C54002bj) asVar.instance).f141681c;
        if (ccVar2 == null) {
            ccVar2 = C54022cc.f141741c;
        }
        C54021cb cbVar = (C54021cb) ccVar2.toBuilder();
        C54022cc ccVar3 = ((C54002bj) asVar.instance).f141681c;
        if (ccVar3 == null) {
            ccVar3 = C54022cc.f141741c;
        }
        if (ccVar3.f141743a == 1) {
            rVar = (C54066r) ccVar3.f141744b;
        } else {
            rVar = C54066r.f141866d;
        }
        C54065q qVar = (C54065q) rVar.toBuilder();
        C63088z A = C63088z.m96139A(bArr);
        qVar.copyOnWrite();
        ((C54066r) qVar.instance).f141868a = A;
        cbVar.copyOnWrite();
        C54022cc ccVar4 = (C54022cc) cbVar.instance;
        C54066r rVar2 = (C54066r) qVar.build();
        rVar2.getClass();
        ccVar4.f141744b = rVar2;
        ccVar4.f141743a = 1;
        asVar.copyOnWrite();
        C54022cc ccVar5 = (C54022cc) cbVar.build();
        ccVar5.getClass();
        ((C54002bj) asVar.instance).f141681c = ccVar5;
    }

    /* renamed from: h */
    public static boolean m46793h(C24226r rVar) {
        return rVar == C24226r.CAMERA;
    }

    /* renamed from: i */
    private final C54020ca m46794i(Location location) {
        int i;
        C54018bz bzVar = (C54018bz) C54020ca.f141734f.createBuilder();
        if (location != null) {
            C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
            double latitude = location.getLatitude();
            jVar.copyOnWrite();
            ((C58079k) jVar.instance).f155252a = latitude;
            double longitude = location.getLongitude();
            jVar.copyOnWrite();
            ((C58079k) jVar.instance).f155253b = longitude;
            bzVar.copyOnWrite();
            C58079k kVar = (C58079k) jVar.build();
            kVar.getClass();
            ((C54020ca) bzVar.instance).f141736a = kVar;
            C62910ar l = C62948a.m95461l(this.f69231i.mo26872d() - location.getElapsedRealtimeNanos());
            bzVar.copyOnWrite();
            l.getClass();
            ((C54020ca) bzVar.instance).f141738c = l;
            if (location.hasAccuracy()) {
                float accuracy = location.getAccuracy();
                bzVar.copyOnWrite();
                ((C54020ca) bzVar.instance).f141737b = accuracy;
            }
        }
        int f = this.f69230h.mo56113h() ? ((C27749al) this.f69230h.mo56107c()).mo33228f() : 0;
        if (f != 0) {
            int i2 = f - 1;
            if (i2 != 1) {
                i = 5;
                if (i2 != 2) {
                    i = i2 != 3 ? i2 != 5 ? 3 : 2 : 6;
                }
            } else {
                i = 4;
            }
            bzVar.copyOnWrite();
            ((C54020ca) bzVar.instance).f141740e = i - 2;
        }
        return (C54020ca) bzVar.build();
    }

    /* renamed from: b */
    public final C54064p mo30445b(C60214n nVar, String str, Location location, C26733ab abVar, C56280cg cgVar, C27232l lVar, C24226r rVar, C25437i iVar, Locale locale) {
        C62468cr crVar;
        C62468cr crVar2;
        C62468cr crVar3;
        C62468cr crVar4;
        C60214n nVar2 = nVar;
        String str2 = str;
        C56280cg cgVar2 = cgVar;
        C54061m mVar = (C54061m) C54064p.f141850n.createBuilder();
        mVar.copyOnWrite();
        ((C54064p) mVar.instance).f141852a = 1;
        C54016bx bxVar = (C54016bx) C54017by.f141729d.createBuilder();
        String languageTag = locale.toLanguageTag();
        bxVar.copyOnWrite();
        languageTag.getClass();
        ((C54017by) bxVar.instance).f141731a = languageTag;
        String country = locale.getCountry();
        bxVar.copyOnWrite();
        country.getClass();
        ((C54017by) bxVar.instance).f141732b = country;
        String id = TimeZone.getDefault().getID();
        bxVar.copyOnWrite();
        id.getClass();
        ((C54017by) bxVar.instance).f141733c = id;
        mVar.copyOnWrite();
        C54017by byVar = (C54017by) bxVar.build();
        byVar.getClass();
        ((C54064p) mVar.instance).f141855d = byVar;
        C56252bf bfVar = (C56252bf) C56253bg.f149850aJ.createBuilder();
        int a = iVar.mo30377a();
        bfVar.copyOnWrite();
        C56253bg bgVar = (C56253bg) bfVar.instance;
        bgVar.f149916d |= 512;
        bgVar.f149911ax = a;
        boolean z = this.f69234l;
        bfVar.copyOnWrite();
        C56253bg bgVar2 = (C56253bg) bfVar.instance;
        bgVar2.f149916d |= 2048;
        bgVar2.f149913az = z;
        boolean g = this.f69225a.mo31462g(C26239a.ENABLE_ONELRP_HTML_COMPRESSION);
        bfVar.copyOnWrite();
        C56253bg bgVar3 = (C56253bg) bfVar.instance;
        bgVar3.f149916d |= 8388608;
        bgVar3.f149886aH = g;
        bfVar.copyOnWrite();
        C56253bg bgVar4 = (C56253bg) bfVar.instance;
        bgVar4.f149878a |= 4;
        bgVar4.f149918f = true;
        boolean w = lVar.mo32718w();
        bfVar.copyOnWrite();
        C56253bg bgVar5 = (C56253bg) bfVar.instance;
        bgVar5.f149878a |= 2;
        bgVar5.f149917e = w;
        bfVar.copyOnWrite();
        C56253bg bgVar6 = (C56253bg) bfVar.instance;
        bgVar6.f149878a |= 8;
        bgVar6.f149919g = true;
        bfVar.copyOnWrite();
        C56253bg bgVar7 = (C56253bg) bfVar.instance;
        bgVar7.f149878a |= 64;
        bgVar7.f149922j = true;
        bfVar.copyOnWrite();
        C56253bg bgVar8 = (C56253bg) bfVar.instance;
        bgVar8.f149878a |= 32;
        bgVar8.f149921i = true;
        bfVar.copyOnWrite();
        C56253bg bgVar9 = (C56253bg) bfVar.instance;
        bgVar9.f149878a |= 2048;
        bgVar9.f149925m = true;
        bfVar.copyOnWrite();
        C56253bg bgVar10 = (C56253bg) bfVar.instance;
        bgVar10.f149878a |= 8192;
        bgVar10.f149927o = true;
        bfVar.copyOnWrite();
        C56253bg bgVar11 = (C56253bg) bfVar.instance;
        bgVar11.f149878a |= 65536;
        bgVar11.f149928p = false;
        bfVar.copyOnWrite();
        C56253bg bgVar12 = (C56253bg) bfVar.instance;
        bgVar12.f149914b |= 512;
        bgVar12.f149859H = true;
        bfVar.copyOnWrite();
        C56253bg bgVar13 = (C56253bg) bfVar.instance;
        bgVar13.f149878a |= 4194304;
        bgVar13.f149933u = false;
        bfVar.copyOnWrite();
        C56253bg bgVar14 = (C56253bg) bfVar.instance;
        bgVar14.f149878a |= 1048576;
        bgVar14.f149931s = true;
        boolean c = this.f69233k.mo30379c();
        bfVar.copyOnWrite();
        C56253bg bgVar15 = (C56253bg) bfVar.instance;
        bgVar15.f149878a |= 16777216;
        bgVar15.f149935w = c;
        boolean c2 = this.f69233k.mo30379c();
        bfVar.copyOnWrite();
        C56253bg bgVar16 = (C56253bg) bfVar.instance;
        bgVar16.f149914b |= 128;
        bgVar16.f149857F = c2;
        bfVar.copyOnWrite();
        C56253bg bgVar17 = (C56253bg) bfVar.instance;
        bgVar17.f149878a |= 1073741824;
        bgVar17.f149937y = true;
        bfVar.copyOnWrite();
        C56253bg bgVar18 = (C56253bg) bfVar.instance;
        bgVar18.f149914b |= 16;
        bgVar18.f149854C = true;
        bfVar.copyOnWrite();
        C56253bg bgVar19 = (C56253bg) bfVar.instance;
        bgVar19.f149914b |= 32;
        bgVar19.f149855D = true;
        bfVar.copyOnWrite();
        C56253bg bgVar20 = (C56253bg) bfVar.instance;
        bgVar20.f149914b |= 64;
        bgVar20.f149856E = false;
        bfVar.copyOnWrite();
        C56253bg bgVar21 = (C56253bg) bfVar.instance;
        bgVar21.f149878a |= 33554432;
        bgVar21.f149936x = true;
        bfVar.copyOnWrite();
        C56253bg bgVar22 = (C56253bg) bfVar.instance;
        bgVar22.f149914b |= 4;
        bgVar22.f149853B = true;
        bfVar.copyOnWrite();
        C56253bg bgVar23 = (C56253bg) bfVar.instance;
        bgVar23.f149914b |= 2048;
        bgVar23.f149860I = true;
        bfVar.copyOnWrite();
        C56253bg bgVar24 = (C56253bg) bfVar.instance;
        bgVar24.f149878a |= 8388608;
        bgVar24.f149934v = true;
        bfVar.copyOnWrite();
        C56253bg bgVar25 = (C56253bg) bfVar.instance;
        bgVar25.f149914b |= 32768;
        bgVar25.f149862K = true;
        bfVar.copyOnWrite();
        C56253bg bgVar26 = (C56253bg) bfVar.instance;
        bgVar26.f149915c |= 256;
        bgVar26.f149889ab = false;
        bfVar.copyOnWrite();
        C56253bg bgVar27 = (C56253bg) bfVar.instance;
        bgVar27.f149915c |= 16;
        bgVar27.f149876Y = true;
        boolean z2 = this.f69232j;
        bfVar.copyOnWrite();
        C56253bg bgVar28 = (C56253bg) bfVar.instance;
        bgVar28.f149914b |= 65536;
        bgVar28.f149863L = z2;
        bfVar.copyOnWrite();
        C56253bg bgVar29 = (C56253bg) bfVar.instance;
        bgVar29.f149915c |= 512;
        bgVar29.f149890ac = false;
        bfVar.copyOnWrite();
        C56253bg bgVar30 = (C56253bg) bfVar.instance;
        bgVar30.f149915c |= 1024;
        bgVar30.f149891ad = false;
        bfVar.copyOnWrite();
        C56253bg bgVar31 = (C56253bg) bfVar.instance;
        bgVar31.f149914b |= C89885b.HTTP_VALUE;
        bgVar31.f149864M = true;
        bfVar.copyOnWrite();
        C56253bg bgVar32 = (C56253bg) bfVar.instance;
        bgVar32.f149914b |= 1048576;
        bgVar32.f149866O = true;
        bfVar.copyOnWrite();
        C56253bg bgVar33 = (C56253bg) bfVar.instance;
        bgVar33.f149914b |= 8388608;
        bgVar33.f149867P = true;
        boolean e = this.f69233k.mo30381e();
        bfVar.copyOnWrite();
        C56253bg bgVar34 = (C56253bg) bfVar.instance;
        bgVar34.f149914b |= 16777216;
        bgVar34.f149868Q = e;
        bfVar.copyOnWrite();
        C56253bg bgVar35 = (C56253bg) bfVar.instance;
        bgVar35.f149914b |= 268435456;
        bgVar35.f149871T = true;
        bfVar.copyOnWrite();
        C56253bg bgVar36 = (C56253bg) bfVar.instance;
        bgVar36.f149915c |= 4096;
        bgVar36.f149893af = false;
        boolean g2 = this.f69225a.mo31462g(C26239a.SINGLE_PRODUCT_MULTI_MERCHANT_ENABLED);
        bfVar.copyOnWrite();
        C56253bg bgVar37 = (C56253bg) bfVar.instance;
        bgVar37.f149916d |= C89885b.NOW_VALUE;
        bgVar37.f149885aG = g2;
        boolean g3 = this.f69225a.mo31462g(C26239a.MULTI_MERCHANT_VIEWER_ENABLED);
        bfVar.copyOnWrite();
        C56253bg bgVar38 = (C56253bg) bfVar.instance;
        bgVar38.f149916d |= C89885b.S3REQUEST_VALUE;
        bgVar38.f149881aC = g3;
        boolean g4 = this.f69225a.mo31462g(C26239a.MULTI_MERCHANT_STRICT_TRIGGERING_ENABLED);
        bfVar.copyOnWrite();
        C56253bg bgVar39 = (C56253bg) bfVar.instance;
        bgVar39.f149916d |= C89885b.HTTP_VALUE;
        bgVar39.f149882aD = g4;
        boolean g5 = this.f69225a.mo31462g(C26239a.MULTI_MERCHANT_REMOVE_OFFERS_CTA_ENABLED);
        bfVar.copyOnWrite();
        C56253bg bgVar40 = (C56253bg) bfVar.instance;
        bgVar40.f149916d |= 524288;
        bgVar40.f149883aE = g5;
        boolean g6 = this.f69225a.mo31462g(C26239a.PRODUCT_CLUSTER_INTERSTITIAL_DISABLED);
        bfVar.copyOnWrite();
        C56253bg bgVar41 = (C56253bg) bfVar.instance;
        bgVar41.f149916d |= 1048576;
        bgVar41.f149884aF = g6;
        bfVar.copyOnWrite();
        C56253bg bgVar42 = (C56253bg) bfVar.instance;
        bgVar42.f149915c |= C89885b.S3REQUEST_VALUE;
        bgVar42.f149897aj = true;
        bfVar.copyOnWrite();
        C56253bg bgVar43 = (C56253bg) bfVar.instance;
        bgVar43.f149915c |= 8192;
        bgVar43.f149894ag = true;
        bfVar.copyOnWrite();
        C56253bg bgVar44 = (C56253bg) bfVar.instance;
        bgVar44.f149915c |= 32768;
        bgVar44.f149896ai = false;
        bfVar.copyOnWrite();
        C56253bg bgVar45 = (C56253bg) bfVar.instance;
        bgVar45.f149915c |= 1048576;
        bgVar45.f149899al = true;
        bfVar.copyOnWrite();
        C56253bg bgVar46 = (C56253bg) bfVar.instance;
        bgVar46.f149878a |= 4096;
        bgVar46.f149926n = true;
        bfVar.copyOnWrite();
        C56253bg bgVar47 = (C56253bg) bfVar.instance;
        bgVar47.f149915c |= 64;
        bgVar47.f149888aa = true;
        bfVar.copyOnWrite();
        C56253bg bgVar48 = (C56253bg) bfVar.instance;
        bgVar48.f149914b |= 524288;
        bgVar48.f149865N = true;
        bfVar.copyOnWrite();
        C56253bg bgVar49 = (C56253bg) bfVar.instance;
        bgVar49.f149914b |= 67108864;
        bgVar49.f149870S = true;
        bfVar.copyOnWrite();
        C56253bg bgVar50 = (C56253bg) bfVar.instance;
        bgVar50.f149915c |= 4;
        bgVar50.f149874W = true;
        bfVar.copyOnWrite();
        C56253bg bgVar51 = (C56253bg) bfVar.instance;
        bgVar51.f149915c |= 32;
        bgVar51.f149877Z = true;
        bfVar.copyOnWrite();
        C56253bg bgVar52 = (C56253bg) bfVar.instance;
        bgVar52.f149914b |= 256;
        bgVar52.f149858G = true;
        bfVar.copyOnWrite();
        C56253bg bgVar53 = (C56253bg) bfVar.instance;
        bgVar53.f149878a |= C89885b.NOW_VALUE;
        bgVar53.f149932t = true;
        bfVar.copyOnWrite();
        C56253bg bgVar54 = (C56253bg) bfVar.instance;
        bgVar54.f149878a |= C89885b.HTTP_VALUE;
        bgVar54.f149930r = true;
        bfVar.copyOnWrite();
        C56253bg bgVar55 = (C56253bg) bfVar.instance;
        bgVar55.f149878a |= 16;
        bgVar55.f149920h = true;
        bfVar.copyOnWrite();
        C56253bg bgVar56 = (C56253bg) bfVar.instance;
        bgVar56.f149914b |= 1;
        bgVar56.f149852A = true;
        bfVar.copyOnWrite();
        C56253bg bgVar57 = (C56253bg) bfVar.instance;
        bgVar57.f149878a |= LinearLayoutManager.INVALID_OFFSET;
        bgVar57.f149938z = true;
        bfVar.copyOnWrite();
        C56253bg bgVar58 = (C56253bg) bfVar.instance;
        bgVar58.f149878a |= 256;
        bgVar58.f149923k = true;
        bfVar.copyOnWrite();
        C56253bg bgVar59 = (C56253bg) bfVar.instance;
        bgVar59.f149914b |= 4096;
        bgVar59.f149861J = true;
        bfVar.copyOnWrite();
        C56253bg bgVar60 = (C56253bg) bfVar.instance;
        bgVar60.f149878a |= C89885b.S3REQUEST_VALUE;
        bgVar60.f149929q = true;
        bfVar.copyOnWrite();
        C56253bg bgVar61 = (C56253bg) bfVar.instance;
        bgVar61.f149878a |= 1024;
        bgVar61.f149924l = true;
        bfVar.copyOnWrite();
        C56253bg bgVar62 = (C56253bg) bfVar.instance;
        bgVar62.f149914b |= 33554432;
        bgVar62.f149869R = true;
        bfVar.copyOnWrite();
        C56253bg bgVar63 = (C56253bg) bfVar.instance;
        bgVar63.f149914b |= 536870912;
        bgVar63.f149872U = true;
        bfVar.copyOnWrite();
        C56253bg bgVar64 = (C56253bg) bfVar.instance;
        bgVar64.f149915c |= 1;
        bgVar64.f149873V = true;
        bfVar.copyOnWrite();
        C56253bg bgVar65 = (C56253bg) bfVar.instance;
        bgVar65.f149915c |= 2048;
        bgVar65.f149892ae = true;
        bfVar.copyOnWrite();
        C56253bg bgVar66 = (C56253bg) bfVar.instance;
        bgVar66.f149915c |= 8;
        bgVar66.f149875X = true;
        bfVar.copyOnWrite();
        C56253bg bgVar67 = (C56253bg) bfVar.instance;
        bgVar67.f149916d |= 4;
        bgVar67.f149906as = true;
        bfVar.copyOnWrite();
        C56253bg bgVar68 = (C56253bg) bfVar.instance;
        bgVar68.f149915c |= 16384;
        bgVar68.f149895ah = true;
        bfVar.copyOnWrite();
        C56253bg bgVar69 = (C56253bg) bfVar.instance;
        bgVar69.f149915c |= C89885b.HTTP_VALUE;
        bgVar69.f149898ak = true;
        bfVar.copyOnWrite();
        C56253bg bgVar70 = (C56253bg) bfVar.instance;
        bgVar70.f149915c |= 33554432;
        bgVar70.f149900am = true;
        bfVar.copyOnWrite();
        C56253bg bgVar71 = (C56253bg) bfVar.instance;
        bgVar71.f149915c |= 67108864;
        bgVar71.f149901an = true;
        bfVar.copyOnWrite();
        C56253bg bgVar72 = (C56253bg) bfVar.instance;
        bgVar72.f149915c |= 268435456;
        bgVar72.f149902ao = false;
        bfVar.copyOnWrite();
        C56253bg bgVar73 = (C56253bg) bfVar.instance;
        bgVar73.f149915c |= LinearLayoutManager.INVALID_OFFSET;
        bgVar73.f149904aq = false;
        bfVar.copyOnWrite();
        C56253bg bgVar74 = (C56253bg) bfVar.instance;
        bgVar74.f149915c |= 1073741824;
        bgVar74.f149903ap = 0;
        bfVar.copyOnWrite();
        C56253bg bgVar75 = (C56253bg) bfVar.instance;
        bgVar75.f149916d |= 1;
        bgVar75.f149905ar = true;
        bfVar.copyOnWrite();
        C56253bg bgVar76 = (C56253bg) bfVar.instance;
        bgVar76.f149916d |= 16;
        bgVar76.f149907at = true;
        boolean g7 = C62632i.m94822g(lVar.mo32701h());
        bfVar.copyOnWrite();
        C56253bg bgVar77 = (C56253bg) bfVar.instance;
        bgVar77.f149916d |= 32;
        bgVar77.f149908au = !g7;
        boolean g8 = this.f69225a.mo31462g(C26239a.ENABLE_MATH_GLEAMS_IN_EDUCATION_FILTER);
        bfVar.copyOnWrite();
        C56253bg bgVar78 = (C56253bg) bfVar.instance;
        bgVar78.f149916d |= 64;
        bgVar78.f149909av = g8;
        bfVar.copyOnWrite();
        C56253bg bgVar79 = (C56253bg) bfVar.instance;
        bgVar79.f149916d |= 256;
        bgVar79.f149910aw = true;
        bfVar.copyOnWrite();
        C56253bg bgVar80 = (C56253bg) bfVar.instance;
        bgVar80.f149916d |= 1024;
        bgVar80.f149912ay = true;
        bfVar.copyOnWrite();
        C56253bg bgVar81 = (C56253bg) bfVar.instance;
        bgVar81.f149916d |= 4096;
        bgVar81.f149879aA = true;
        boolean a2 = this.f69227e.mo30509a(lVar, cgVar2);
        bfVar.copyOnWrite();
        C56253bg bgVar82 = (C56253bg) bfVar.instance;
        bgVar82.f149916d |= 8192;
        bgVar82.f149880aB = a2;
        boolean f = iVar.mo30383f();
        bfVar.copyOnWrite();
        C56253bg bgVar83 = (C56253bg) bfVar.instance;
        bgVar83.f149916d |= 33554432;
        bgVar83.f149887aI = f;
        C56253bg bgVar84 = (C56253bg) bfVar.build();
        C56245az azVar = (C56245az) C56247ba.f149808c.createBuilder();
        azVar.copyOnWrite();
        C56247ba baVar = (C56247ba) azVar.instance;
        bgVar84.getClass();
        baVar.f149811b = bgVar84;
        baVar.f149810a |= 1;
        C56247ba baVar2 = (C56247ba) azVar.build();
        mVar.copyOnWrite();
        baVar2.getClass();
        ((C54064p) mVar.instance).f141859h = baVar2;
        C56248bb bbVar = (C56248bb) C56249bc.f149812F.createBuilder();
        bbVar.copyOnWrite();
        C56249bc bcVar = (C56249bc) bbVar.instance;
        bcVar.f149819a |= 1;
        bcVar.f149822d = false;
        bbVar.copyOnWrite();
        C56249bc bcVar2 = (C56249bc) bbVar.instance;
        bcVar2.f149819a |= 32;
        bcVar2.f149823e = false;
        bbVar.copyOnWrite();
        C56249bc bcVar3 = (C56249bc) bbVar.instance;
        bcVar3.f149819a |= 16384;
        bcVar3.f149825g = false;
        boolean i = iVar.mo30387i();
        bbVar.copyOnWrite();
        C56249bc bcVar4 = (C56249bc) bbVar.instance;
        bcVar4.f149819a |= 65536;
        bcVar4.f149827i = i;
        bbVar.copyOnWrite();
        C56249bc bcVar5 = (C56249bc) bbVar.instance;
        bcVar5.f149819a |= C89885b.HTTP_VALUE;
        bcVar5.f149828j = false;
        bbVar.copyOnWrite();
        C56249bc bcVar6 = (C56249bc) bbVar.instance;
        bcVar6.f149819a |= 524288;
        bcVar6.f149829k = 2;
        bbVar.copyOnWrite();
        C56249bc bcVar7 = (C56249bc) bbVar.instance;
        bcVar7.f149819a |= 8388608;
        bcVar7.f149830l = true;
        bbVar.copyOnWrite();
        C56249bc bcVar8 = (C56249bc) bbVar.instance;
        bcVar8.f149819a |= LinearLayoutManager.INVALID_OFFSET;
        bcVar8.f149831m = false;
        bbVar.copyOnWrite();
        C56249bc bcVar9 = (C56249bc) bbVar.instance;
        bcVar9.f149820b |= 8;
        bcVar9.f149833o = true;
        bbVar.copyOnWrite();
        C56249bc bcVar10 = (C56249bc) bbVar.instance;
        bcVar10.f149820b |= 4;
        bcVar10.f149832n = false;
        bbVar.copyOnWrite();
        C56249bc bcVar11 = (C56249bc) bbVar.instance;
        bcVar11.f149820b |= 32;
        bcVar11.f149834p = true;
        bbVar.copyOnWrite();
        C56249bc bcVar12 = (C56249bc) bbVar.instance;
        bcVar12.f149820b |= 4096;
        bcVar12.f149839u = true;
        bbVar.copyOnWrite();
        C56249bc bcVar13 = (C56249bc) bbVar.instance;
        bcVar13.f149820b |= 8192;
        bcVar13.f149840v = false;
        boolean h = m46793h(rVar);
        bbVar.copyOnWrite();
        C56249bc bcVar14 = (C56249bc) bbVar.instance;
        bcVar14.f149820b |= 16777216;
        bcVar14.f149814A = h;
        bbVar.copyOnWrite();
        C56249bc bcVar15 = (C56249bc) bbVar.instance;
        bcVar15.f149820b |= 256;
        bcVar15.f149835q = false;
        bbVar.copyOnWrite();
        C56249bc bcVar16 = (C56249bc) bbVar.instance;
        bcVar16.f149820b = 65536 | bcVar16.f149820b;
        bcVar16.f149841w = true;
        bbVar.copyOnWrite();
        C56249bc bcVar17 = (C56249bc) bbVar.instance;
        bcVar17.f149820b |= 512;
        bcVar17.f149836r = false;
        bbVar.copyOnWrite();
        C56249bc bcVar18 = (C56249bc) bbVar.instance;
        bcVar18.f149820b |= C89885b.S3REQUEST_VALUE;
        bcVar18.f149842x = 0.02f;
        bbVar.copyOnWrite();
        C56249bc bcVar19 = (C56249bc) bbVar.instance;
        bcVar19.f149820b |= 1048576;
        bcVar19.f149844z = false;
        bbVar.copyOnWrite();
        C56249bc bcVar20 = (C56249bc) bbVar.instance;
        bcVar20.f149820b |= 524288;
        bcVar20.f149843y = false;
        bbVar.copyOnWrite();
        C56249bc bcVar21 = (C56249bc) bbVar.instance;
        bcVar21.f149820b |= 2048;
        bcVar21.f149838t = true;
        bbVar.copyOnWrite();
        C56249bc bcVar22 = (C56249bc) bbVar.instance;
        bcVar22.f149819a |= 512;
        bcVar22.f149824f = true;
        bbVar.copyOnWrite();
        C56249bc bcVar23 = (C56249bc) bbVar.instance;
        bcVar23.f149819a |= 32768;
        bcVar23.f149826h = true;
        bbVar.copyOnWrite();
        C56249bc bcVar24 = (C56249bc) bbVar.instance;
        bcVar24.f149820b |= 536870912;
        bcVar24.f149816C = true;
        boolean h2 = iVar.mo30385h();
        bbVar.copyOnWrite();
        C56249bc bcVar25 = (C56249bc) bbVar.instance;
        bcVar25.f149820b |= 1073741824;
        bcVar25.f149817D = h2;
        boolean g9 = iVar.mo30384g();
        bbVar.copyOnWrite();
        C56249bc bcVar26 = (C56249bc) bbVar.instance;
        bcVar26.f149821c |= 1;
        bcVar26.f149818E = g9;
        C62471cu v = lVar.mo32717v();
        if (v.f168678a == 3) {
            crVar = (C62468cr) v.f168679b;
        } else {
            crVar = C62468cr.f168665d;
        }
        if ((crVar.f168667a & 1) != 0) {
            C62471cu v2 = lVar.mo32717v();
            if (v2.f168678a == 3) {
                crVar4 = (C62468cr) v2.f168679b;
            } else {
                crVar4 = C62468cr.f168665d;
            }
            if (crVar4.f168668b) {
                bbVar.copyOnWrite();
                C56249bc bcVar27 = (C56249bc) bbVar.instance;
                bcVar27.f149820b |= 1024;
                bcVar27.f149837s = true;
            }
        }
        C62471cu v3 = lVar.mo32717v();
        if (v3.f168678a == 3) {
            crVar2 = (C62468cr) v3.f168679b;
        } else {
            crVar2 = C62468cr.f168665d;
        }
        if ((crVar2.f168667a & 2) != 0) {
            C62471cu v4 = lVar.mo32717v();
            if (v4.f168678a == 3) {
                crVar3 = (C62468cr) v4.f168679b;
            } else {
                crVar3 = C62468cr.f168665d;
            }
            if (crVar3.f168669c) {
                bbVar.copyOnWrite();
                C56249bc bcVar28 = (C56249bc) bbVar.instance;
                bcVar28.f149820b |= 268435456;
                bcVar28.f149815B = true;
                bbVar.copyOnWrite();
                C56249bc bcVar29 = (C56249bc) bbVar.instance;
                bcVar29.f149819a |= 524288;
                bcVar29.f149829k = 4;
            }
        }
        C56249bc bcVar30 = (C56249bc) bbVar.build();
        mVar.copyOnWrite();
        bcVar30.getClass();
        ((C54064p) mVar.instance).f141858g = bcVar30;
        if (iVar.mo30380d()) {
            mVar.copyOnWrite();
            ((C54064p) mVar.instance).f141862k = 3;
        }
        C54020ca i2 = m46794i(location);
        mVar.copyOnWrite();
        i2.getClass();
        ((C54064p) mVar.instance).f141856e = i2;
        if (lVar.mo32701h().mo56113h()) {
            String str3 = (String) lVar.mo32701h().mo56107c();
            mVar.copyOnWrite();
            str3.getClass();
            ((C54064p) mVar.instance).f141857f = str3;
        }
        C62505ea a3 = C62632i.m94816a((String) lVar.mo32701h().mo56111f());
        mVar.copyOnWrite();
        ((C54064p) mVar.instance).f141853b = a3.getNumber();
        C53977al alVar = (C53977al) C53978am.f141633b.createBuilder();
        int a4 = lVar.mo32694a();
        alVar.copyOnWrite();
        ((C53978am) alVar.instance).f141635a = a4;
        C53978am amVar = (C53978am) alVar.build();
        mVar.copyOnWrite();
        amVar.getClass();
        ((C54064p) mVar.instance).f141854c = amVar;
        mVar.copyOnWrite();
        cgVar.getClass();
        ((C54064p) mVar.instance).f141860i = cgVar2;
        C62477d dVar = (C62477d) C62558g.f168894e.createBuilder();
        if (m46793h(rVar)) {
            C62504e eVar = (C62504e) C62531f.f168830c.createBuilder();
            String str4 = Build.FINGERPRINT;
            eVar.copyOnWrite();
            C62531f fVar = (C62531f) eVar.instance;
            str4.getClass();
            fVar.f168832a |= 1;
            fVar.f168833b = str4;
            dVar.copyOnWrite();
            C62558g gVar = (C62558g) dVar.instance;
            C62531f fVar2 = (C62531f) eVar.build();
            fVar2.getClass();
            gVar.f168897b = fVar2;
            gVar.f168896a |= 1;
        }
        if (abVar != null) {
            if (abVar.mo32055i().mo56113h()) {
                float floatValue = ((Float) abVar.mo32055i().mo56107c()).floatValue();
                dVar.copyOnWrite();
                C62558g gVar2 = (C62558g) dVar.instance;
                gVar2.f168896a |= 4;
                gVar2.f168899d = (double) floatValue;
            }
            if (abVar.mo32049c().mo56113h()) {
                float floatValue2 = ((Float) abVar.mo32049c().mo56107c()).floatValue();
                dVar.copyOnWrite();
                C62558g gVar3 = (C62558g) dVar.instance;
                gVar3.f168896a |= 2;
                gVar3.f168898c = (double) floatValue2;
            }
        }
        C62558g gVar4 = (C62558g) dVar.build();
        mVar.copyOnWrite();
        gVar4.getClass();
        ((C54064p) mVar.instance).f141861j = gVar4;
        DisplayMetrics b = iVar.mo30378b();
        C54062n nVar3 = (C54062n) C54063o.f141845d.createBuilder();
        nVar3.copyOnWrite();
        ((C54063o) nVar3.instance).f141849c = 1;
        int i3 = b.widthPixels;
        float f2 = b.density;
        nVar3.copyOnWrite();
        ((C54063o) nVar3.instance).f141847a = (int) (((float) i3) / f2);
        int i4 = b.heightPixels;
        float f3 = b.density;
        nVar3.copyOnWrite();
        ((C54063o) nVar3.instance).f141848b = (int) (((float) i4) / f3);
        C54063o oVar = (C54063o) nVar3.build();
        mVar.copyOnWrite();
        oVar.getClass();
        ((C54064p) mVar.instance).f141863l = oVar;
        C54067s sVar = (C54067s) C54068t.f141871c.createBuilder();
        if (nVar2 != null) {
            sVar.copyOnWrite();
            ((C54068t) sVar.instance).f141873a = nVar2;
        }
        if (str2 != null && !str.isEmpty()) {
            sVar.copyOnWrite();
            ((C54068t) sVar.instance).f141874b = str2;
        }
        C54068t tVar = (C54068t) sVar.build();
        mVar.copyOnWrite();
        tVar.getClass();
        ((C54064p) mVar.instance).f141864m = tVar;
        return (C54064p) mVar.build();
    }

    /* renamed from: c */
    public final C54022cc mo30446c(C24227s sVar, C25411i iVar, int i, int i2, C27232l lVar, Location location) {
        C58833ax axVar;
        if (sVar.mo29711f().mo32052f().mo56113h()) {
            axVar = sVar.mo29711f().mo32052f();
        } else if (!m46793h(sVar.mo29709e())) {
            axVar = C58836b.f156633a;
        } else {
            axVar = location != null ? C58833ax.m90834k(m46794i(location)) : C58836b.f156633a;
        }
        C54020ca caVar = (C54020ca) axVar.mo56111f();
        C53971af afVar = (C53971af) C53976ak.f141619m.createBuilder();
        C63042fg h = C62953e.m95483h(sVar.mo29706b());
        afVar.copyOnWrite();
        h.getClass();
        ((C53976ak) afVar.instance).f141621a = h;
        int a = sVar.mo29705a();
        afVar.copyOnWrite();
        ((C53976ak) afVar.instance).f141625e = a;
        C53972ag agVar = (C53972ag) C53973ah.f141613b.createBuilder();
        agVar.copyOnWrite();
        ((C53973ah) agVar.instance).f141615a = 1;
        afVar.copyOnWrite();
        C53973ah ahVar = (C53973ah) agVar.build();
        ahVar.getClass();
        ((C53976ak) afVar.instance).f141626f = ahVar;
        afVar.copyOnWrite();
        ((C53976ak) afVar.instance).f141623c = i;
        afVar.copyOnWrite();
        ((C53976ak) afVar.instance).f141624d = i2;
        C26733ab f = sVar.mo29711f();
        if (f.mo32048b().mo56113h()) {
            C62910ar l = C62948a.m95461l(((Long) f.mo32048b().mo56107c()).longValue());
            afVar.copyOnWrite();
            l.getClass();
            ((C53976ak) afVar.instance).f141628h = l;
        }
        if (f.mo32054h().mo56113h()) {
            C63077o a2 = C63077o.m96099a(((Boolean) f.mo32054h().mo56107c()).booleanValue());
            afVar.copyOnWrite();
            a2.getClass();
            ((C53976ak) afVar.instance).f141629i = a2;
        }
        if (f.mo32053g().mo56113h()) {
            C63077o a3 = C63077o.m96099a(((Boolean) f.mo32053g().mo56107c()).booleanValue());
            afVar.copyOnWrite();
            a3.getClass();
            ((C53976ak) afVar.instance).f141630j = a3;
        }
        if ((sVar.mo29716j().f158090a & 1) != 0) {
            C53974ai aiVar = (C53974ai) C53975aj.f141616b.createBuilder();
            int b = C62165d.m94756b(sVar.mo29716j().f158091b);
            if (b == 0) {
                b = 2;
            }
            aiVar.copyOnWrite();
            ((C53975aj) aiVar.instance).f141618a = C62165d.m94755a(b);
            afVar.copyOnWrite();
            C53975aj ajVar = (C53975aj) aiVar.build();
            ajVar.getClass();
            ((C53976ak) afVar.instance).f141627g = ajVar;
        }
        if (sVar.mo29715i().mo56113h()) {
            C62931bk a4 = C62931bk.m95422a(((Float) sVar.mo29715i().mo56107c()).floatValue());
            afVar.copyOnWrite();
            a4.getClass();
            ((C53976ak) afVar.instance).f141631k = a4;
        }
        if (caVar != null) {
            afVar.copyOnWrite();
            ((C53976ak) afVar.instance).f141622b = caVar;
        }
        if (lVar.mo32710p().mo56113h() || lVar.mo32713s().mo56113h()) {
            C54047da daVar = (C54047da) C54048db.f141804c.createBuilder();
            if (lVar.mo32710p().mo56113h()) {
                String str = (String) lVar.mo32710p().mo56107c();
                daVar.copyOnWrite();
                str.getClass();
                ((C54048db) daVar.instance).f141807b = str;
            }
            if (lVar.mo32713s().mo56113h()) {
                String str2 = (String) lVar.mo32713s().mo56107c();
                daVar.copyOnWrite();
                str2.getClass();
                ((C54048db) daVar.instance).f141806a = str2;
            }
            afVar.copyOnWrite();
            C54048db dbVar = (C54048db) daVar.build();
            dbVar.getClass();
            ((C53976ak) afVar.instance).f141632l = dbVar;
        }
        if (iVar.mo30454f().mo56113h()) {
            try {
                String decode = URLDecoder.decode((String) iVar.mo30454f().mo56107c(), "UTF-8");
                C54027ch chVar = (C54027ch) C54028ci.f141752d.createBuilder();
                chVar.copyOnWrite();
                C54028ci ciVar = (C54028ci) chVar.instance;
                decode.getClass();
                ciVar.f141754a = 6;
                ciVar.f141755b = decode;
                chVar.copyOnWrite();
                C53976ak akVar = (C53976ak) afVar.build();
                akVar.getClass();
                ((C54028ci) chVar.instance).f141756c = akVar;
                C54021cb cbVar = (C54021cb) C54022cc.f141741c.createBuilder();
                cbVar.copyOnWrite();
                C54022cc ccVar = (C54022cc) cbVar.instance;
                C54028ci ciVar2 = (C54028ci) chVar.build();
                ciVar2.getClass();
                ccVar.f141744b = ciVar2;
                ccVar.f141743a = 5;
                return (C54022cc) cbVar.build();
            } catch (UnsupportedEncodingException e) {
                ((C58970a) ((C58970a) ((C58970a) f69224c.mo56225c()).mo56382g(e)).mo56372aa(49905)).mo56386p("Failed to decode FIFE url.");
            }
        }
        C54021cb cbVar2 = (C54021cb) C54022cc.f141741c.createBuilder();
        C54065q qVar = (C54065q) C54066r.f141866d.createBuilder();
        boolean z = false;
        if (this.f69226d.mo56113h()) {
            C58833ax axVar2 = this.f69229g;
            if (axVar2.mo56113h() && ((C25197ac) axVar2.mo56107c()).mo30344d()) {
                C58833ax h2 = lVar.mo32701h();
                C58528ij ijVar = C62632i.f169088a;
                Objects.requireNonNull(ijVar);
                if (!((Boolean) h2.mo56106b(new C62624a(ijVar)).mo56109e(false)).booleanValue()) {
                    z = true;
                }
            }
        }
        qVar.copyOnWrite();
        ((C54066r) qVar.instance).f141870c = z;
        qVar.copyOnWrite();
        C53976ak akVar2 = (C53976ak) afVar.build();
        akVar2.getClass();
        ((C54066r) qVar.instance).f141869b = akVar2;
        cbVar2.copyOnWrite();
        C54022cc ccVar2 = (C54022cc) cbVar2.instance;
        C54066r rVar = (C54066r) qVar.build();
        rVar.getClass();
        ccVar2.f141744b = rVar;
        ccVar2.f141743a = 1;
        return (C54022cc) cbVar2.build();
    }

    /* renamed from: f */
    public final Locale mo30447f() {
        return this.f69228f.getResources().getConfiguration().getLocales().get(0);
    }
}
