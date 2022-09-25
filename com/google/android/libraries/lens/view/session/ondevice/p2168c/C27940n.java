package com.google.android.libraries.lens.view.session.ondevice.p2168c;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.common.p1999b.C24103a;
import com.google.android.libraries.lens.ondevice.p2025e.C24434a;
import com.google.android.libraries.lens.view.session.ondevice.p2167b.C27924b;
import com.google.android.libraries.lens.view.utils.C28133v;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19666d;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19663b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4699e.C62223d;
import com.google.lens.p4699e.C62226g;
import com.google.lens.p4699e.C62227h;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62444bu;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62486di;
import com.google.lens.p4707j.C62487dj;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62490dm;
import com.google.lens.p4707j.C62491dn;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56219a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56234ao;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56300d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56307e;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56308f;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56309g;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56317o;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56321s;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56323u;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56324v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56326x;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.c.n */
/* compiled from: PG */
public final class C27940n {

    /* renamed from: a */
    public static final C58974d f76094a = C58974d.m91135i("GleamCreationHelper");

    /* renamed from: b */
    private static final Comparator f76095b = Comparator.CC.comparing(C27930d.f76084a);

    /* renamed from: c */
    private final C27924b f76096c;

    /* renamed from: d */
    private final boolean f76097d;

    /* renamed from: e */
    private final boolean f76098e;

    public C27940n(C27924b bVar, boolean z, boolean z2) {
        this.f76096c = bVar;
        this.f76097d = z;
        this.f76098e = z2;
    }

    /* renamed from: b */
    static C62227h m52001b(String str) {
        String trim = str.trim();
        C62226g gVar = (C62226g) C62227h.f168014f.createBuilder();
        gVar.copyOnWrite();
        C62227h hVar = (C62227h) gVar.instance;
        hVar.f168020e = 1;
        hVar.f168016a |= 8;
        boolean h = C28133v.m52422h(trim);
        boolean g = C28133v.m52421g(trim);
        try {
            if (!trim.contains("://") && !h && !g) {
                trim = "http://" + trim;
            }
            C58833ax g2 = m52006g(new URI(trim));
            if (g2.mo56113h()) {
                String str2 = (String) g2.mo56107c();
                gVar.copyOnWrite();
                C62227h hVar2 = (C62227h) gVar.instance;
                str2.getClass();
                hVar2.f168016a |= 2;
                hVar2.f168018c = str2;
                gVar.copyOnWrite();
                C62227h hVar3 = (C62227h) gVar.instance;
                trim.getClass();
                hVar3.f168016a |= 1;
                hVar3.f168017b = trim;
            }
        } catch (URISyntaxException unused) {
        }
        return (C62227h) gVar.build();
    }

    /* renamed from: c */
    public static C56327y m52002c(C27942p pVar) {
        C56219a aVar = (C56219a) C56327y.f150136i.createBuilder();
        C56321s sVar = (C56321s) C56324v.f150122c.createBuilder();
        C56323u uVar = C56323u.TEXT_GLEAM;
        sVar.copyOnWrite();
        C56324v vVar = (C56324v) sVar.instance;
        vVar.f150125b = uVar.f150121l;
        vVar.f150124a |= 1;
        C56324v vVar2 = (C56324v) sVar.build();
        aVar.copyOnWrite();
        C56327y yVar = (C56327y) aVar.instance;
        vVar2.getClass();
        yVar.f150144g = vVar2;
        yVar.f150138a |= 32;
        C56234ao aoVar = (C56234ao) C56235ap.f149780e.createBuilder();
        C56224ae c = pVar.mo33401c();
        aoVar.copyOnWrite();
        C56235ap apVar = (C56235ap) aoVar.instance;
        apVar.mo54343a();
        C62947c.addAll((Iterable) Collection.EL.stream(pVar.mo33400b()).map(C27938l.f76092a).collect(C58370cn.f155946a), (List) apVar.f149783b);
        aoVar.copyOnWrite();
        C56235ap apVar2 = (C56235ap) aoVar.instance;
        c.getClass();
        apVar2.f149784c = c;
        apVar2.f149782a |= 1;
        String concat = String.valueOf(((C27943q) pVar.mo33400b().get(0)).mo33408c()).concat(pVar.mo33400b().size() > 1 ? "..." : BuildConfig.FLAVOR);
        C56300d dVar = (C56300d) C56320r.f150092n.createBuilder();
        dVar.copyOnWrite();
        C56320r rVar = (C56320r) dVar.instance;
        rVar.f150094a |= 4;
        rVar.f150097d = concat;
        dVar.copyOnWrite();
        C56320r rVar2 = (C56320r) dVar.instance;
        rVar2.f150094a |= 8;
        rVar2.f150098e = concat;
        dVar.copyOnWrite();
        C56320r rVar3 = (C56320r) dVar.instance;
        rVar3.f150095b = 5;
        rVar3.f150094a |= 1;
        C56326x xVar = C56326x.NONE;
        dVar.copyOnWrite();
        C56320r rVar4 = (C56320r) dVar.instance;
        rVar4.f150103j = xVar.f150135h;
        rVar4.f150094a |= 256;
        C56317o oVar = (C56317o) C56318p.f150087c.createBuilder();
        String d = pVar.mo33402d();
        oVar.copyOnWrite();
        C56318p pVar2 = (C56318p) oVar.instance;
        d.getClass();
        pVar2.f150089a |= 4;
        pVar2.f150090b = d;
        dVar.copyOnWrite();
        C56320r rVar5 = (C56320r) dVar.instance;
        C56318p pVar3 = (C56318p) oVar.build();
        pVar3.getClass();
        rVar5.f150101h = pVar3;
        rVar5.f150094a |= 128;
        C56309g gVar = (C56309g) C56310h.f150072g.createBuilder();
        gVar.copyOnWrite();
        C56310h hVar = (C56310h) gVar.instance;
        C56235ap apVar3 = (C56235ap) aoVar.build();
        apVar3.getClass();
        hVar.f150077d = apVar3;
        hVar.f150074a |= 1;
        dVar.copyOnWrite();
        C56320r rVar6 = (C56320r) dVar.instance;
        C56310h hVar2 = (C56310h) gVar.build();
        hVar2.getClass();
        rVar6.f150100g = hVar2;
        rVar6.f150094a |= 64;
        aVar.mo54333b((C56320r) dVar.build());
        RectF a = C24093a.m44745a(c);
        float centerX = a.centerX();
        float centerY = a.centerY();
        float f = c.f149759e;
        float f2 = c.f149758d;
        float radians = (float) Math.toRadians((double) c.f149760f);
        C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
        C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
        bqVar.copyOnWrite();
        C62441br brVar = (C62441br) bqVar.instance;
        brVar.f168610a |= 1;
        brVar.f168611b = centerX;
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 2;
        brVar2.f168612c = centerY;
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 8;
        brVar3.f168614e = f;
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 4;
        brVar4.f168613d = f2;
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168616g = 1;
        brVar5.f168610a |= 32;
        bqVar.copyOnWrite();
        C62441br brVar6 = (C62441br) bqVar.instance;
        brVar6.f168610a |= 16;
        brVar6.f168615f = radians;
        C62441br brVar7 = (C62441br) bqVar.build();
        buVar.copyOnWrite();
        C62445bv bvVar = (C62445bv) buVar.instance;
        brVar7.getClass();
        bvVar.f168621b = brVar7;
        bvVar.f168620a |= 1;
        C62445bv bvVar2 = (C62445bv) buVar.build();
        aVar.copyOnWrite();
        C56327y yVar2 = (C56327y) aVar.instance;
        bvVar2.getClass();
        yVar2.f150140c = bvVar2;
        yVar2.f150139b = 7;
        return (C56327y) aVar.build();
    }

    /* renamed from: d */
    public static void m52003d(C58833ax axVar, C58485gu guVar, C58485gu guVar2) {
        C62219be beVar;
        C62219be beVar2;
        C62219be beVar3;
        if (axVar.mo56113h() && ((C24434a) axVar.mo56107c()).mo29875b()) {
            C24434a j = ((C24434a) axVar.mo56107c()).mo29874a().mo29883j();
            int size = guVar2.size();
            for (int i = 0; i < size; i++) {
                C62223d dVar = (C62223d) guVar2.get(i);
                StringBuilder sb = new StringBuilder();
                int i2 = ((C58724pq) guVar).f156474d;
                for (int i3 = 0; i3 < i2; i3++) {
                    C27942p pVar = (C27942p) guVar.get(i3);
                    if (dVar.f168010d.size() > 0 && pVar.mo33402d().equals((String) dVar.f168010d.get(0))) {
                        C58485gu b = pVar.mo33400b();
                        int size2 = b.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            C27943q qVar = (C27943q) b.get(i4);
                            if (sb.length() != 0) {
                                sb.append("<br>");
                            }
                            sb.append("Line: ");
                            sb.append(qVar.mo33408c());
                        }
                    }
                }
                C24434a a = j.mo29874a();
                if (dVar.f168007a == 10) {
                    beVar = (C62219be) dVar.f168008b;
                } else {
                    beVar = C62219be.f167986j;
                }
                String str = beVar.f167992e;
                C24434a j2 = a.mo29883j();
                int i5 = dVar.f168007a;
                if (i5 == 10) {
                    beVar2 = (C62219be) dVar.f168008b;
                } else {
                    beVar2 = C62219be.f167986j;
                }
                String str2 = beVar2.f167991d;
                if (i5 == 10) {
                    beVar3 = (C62219be) dVar.f168008b;
                } else {
                    beVar3 = C62219be.f167986j;
                }
                String str3 = beVar3.f167990c;
                j2.mo29880g().mo29874a().mo29883j().mo29880g();
            }
        }
    }

    /* renamed from: e */
    public static C56327y m52004e(Barcode barcode, Size size) {
        float f;
        C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
        Rect boundingBox = barcode.getBoundingBox();
        C62441br h = m52007h(boundingBox.left, boundingBox.top, boundingBox.width(), boundingBox.height(), size);
        buVar.copyOnWrite();
        C62445bv bvVar = (C62445bv) buVar.instance;
        h.getClass();
        bvVar.f168621b = h;
        bvVar.f168620a |= 1;
        Point[] pointArr = barcode.cornerPoints;
        C62490dm dmVar = C62490dm.CLOCKWISE;
        C58838bb.m90869d(pointArr.length == 4, "quad input must have 4 corner points");
        C62486di diVar = (C62486di) C62491dn.f168710e.createBuilder();
        diVar.copyOnWrite();
        C62491dn dnVar = (C62491dn) diVar.instance;
        dnVar.f168715d = 1;
        dnVar.f168712a |= 2;
        diVar.copyOnWrite();
        C62491dn dnVar2 = (C62491dn) diVar.instance;
        dnVar2.f168714c = dmVar.f168709d;
        dnVar2.f168712a |= 1;
        diVar.mo58500c(m52008i(pointArr[0], size));
        diVar.mo58500c(m52008i(pointArr[1], size));
        diVar.mo58500c(m52008i(pointArr[2], size));
        diVar.mo58500c(m52008i(pointArr[3], size));
        C62491dn dnVar3 = (C62491dn) diVar.build();
        buVar.copyOnWrite();
        C62445bv bvVar2 = (C62445bv) buVar.instance;
        dnVar3.getClass();
        bvVar2.f168622c = dnVar3;
        bvVar2.f168620a |= 2;
        if (barcode.format == 256) {
            f = 1.0f;
        } else {
            f = ((float) barcode.getBoundingBox().width()) / ((float) barcode.getBoundingBox().height());
        }
        buVar.copyOnWrite();
        C62445bv bvVar3 = (C62445bv) buVar.instance;
        bvVar3.f168620a |= 4;
        bvVar3.f168623d = f;
        C62445bv bvVar4 = (C62445bv) buVar.build();
        C56219a aVar = (C56219a) C56327y.f150136i.createBuilder();
        aVar.copyOnWrite();
        C56327y yVar = (C56327y) aVar.instance;
        bvVar4.getClass();
        yVar.f150140c = bvVar4;
        yVar.f150139b = 7;
        C56321s sVar = (C56321s) C56324v.f150122c.createBuilder();
        C56323u uVar = C56323u.BARCODE_GLEAM;
        sVar.copyOnWrite();
        C56324v vVar = (C56324v) sVar.instance;
        vVar.f150125b = uVar.f150121l;
        vVar.f150124a |= 1;
        aVar.copyOnWrite();
        C56327y yVar2 = (C56327y) aVar.instance;
        C56324v vVar2 = (C56324v) sVar.build();
        vVar2.getClass();
        yVar2.f150144g = vVar2;
        yVar2.f150138a |= 32;
        C56300d dVar = (C56300d) C56320r.f150092n.createBuilder();
        String a = C24103a.m44778a("barcode", barcode.displayValue);
        dVar.copyOnWrite();
        C56320r rVar = (C56320r) dVar.instance;
        rVar.f150094a |= 2;
        rVar.f150096c = a;
        C56307e eVar = (C56307e) C56308f.f150069b.createBuilder();
        eVar.mo54352a("Barhopper");
        dVar.copyOnWrite();
        C56320r rVar2 = (C56320r) dVar.instance;
        C56308f fVar = (C56308f) eVar.build();
        fVar.getClass();
        rVar2.f150104k = fVar;
        rVar2.f150094a |= 1024;
        dVar.copyOnWrite();
        C56320r rVar3 = (C56320r) dVar.instance;
        rVar3.f150095b = 5;
        rVar3.f150094a = 1 | rVar3.f150094a;
        C56318p j = m52009j("barcode", bvVar4);
        dVar.copyOnWrite();
        C56320r rVar4 = (C56320r) dVar.instance;
        j.getClass();
        rVar4.f150101h = j;
        rVar4.f150094a |= 128;
        C56309g gVar = (C56309g) C56310h.f150072g.createBuilder();
        C62227h b = m52001b(barcode.displayValue);
        gVar.copyOnWrite();
        C56310h hVar = (C56310h) gVar.instance;
        b.getClass();
        hVar.f150076c = b;
        hVar.f150075b = 8;
        dVar.copyOnWrite();
        C56320r rVar5 = (C56320r) dVar.instance;
        C56310h hVar2 = (C56310h) gVar.build();
        hVar2.getClass();
        rVar5.f150100g = hVar2;
        rVar5.f150094a |= 64;
        dVar.copyOnWrite();
        C56320r rVar6 = (C56320r) dVar.instance;
        rVar6.f150094a |= 16;
        rVar6.f150099f = 0.9f;
        dVar.copyOnWrite();
        C56320r rVar7 = (C56320r) dVar.instance;
        C62961ch chVar = rVar7.f150102i;
        if (!chVar.mo58948c()) {
            rVar7.f150102i = C62942bv.mutableCopy(chVar);
        }
        rVar7.f150102i.mo58916g(12);
        aVar.mo54332a(dVar);
        return (C56327y) aVar.build();
    }

    /* renamed from: f */
    public static C56327y m52005f(C19663b bVar, Size size) {
        C19666d dVar;
        if (bVar.f54687b.size() > 0) {
            dVar = (C19666d) Collections.max(bVar.f54687b, f76095b);
        } else {
            dVar = C19666d.f54694d;
        }
        C19652b bVar2 = bVar.f54686a;
        if (bVar2 == null) {
            bVar2 = C19652b.f54662e;
        }
        int i = bVar2.f54664a;
        C19652b bVar3 = bVar.f54686a;
        if (bVar3 == null) {
            bVar3 = C19652b.f54662e;
        }
        int i2 = bVar3.f54665b;
        C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
        C19652b bVar4 = bVar.f54686a;
        int i3 = (bVar4 == null ? C19652b.f54662e : bVar4).f54666c;
        if (bVar4 == null) {
            bVar4 = C19652b.f54662e;
        }
        C62441br h = m52007h(i, i2, i3, bVar4.f54667d, size);
        buVar.copyOnWrite();
        C62445bv bvVar = (C62445bv) buVar.instance;
        h.getClass();
        bvVar.f168621b = h;
        bvVar.f168620a |= 1;
        C62445bv bvVar2 = (C62445bv) buVar.build();
        C56219a aVar = (C56219a) C56327y.f150136i.createBuilder();
        aVar.copyOnWrite();
        C56327y yVar = (C56327y) aVar.instance;
        bvVar2.getClass();
        yVar.f150140c = bvVar2;
        yVar.f150139b = 7;
        C56321s sVar = (C56321s) C56324v.f150122c.createBuilder();
        C56323u uVar = C56323u.REGION_GLEAM;
        sVar.copyOnWrite();
        C56324v vVar = (C56324v) sVar.instance;
        vVar.f150125b = uVar.f150121l;
        vVar.f150124a |= 1;
        aVar.copyOnWrite();
        C56327y yVar2 = (C56327y) aVar.instance;
        C56324v vVar2 = (C56324v) sVar.build();
        vVar2.getClass();
        yVar2.f150144g = vVar2;
        yVar2.f150138a |= 32;
        C56300d dVar2 = (C56300d) C56320r.f150092n.createBuilder();
        String a = C24103a.m44778a("object", dVar.f54698c);
        dVar2.copyOnWrite();
        C56320r rVar = (C56320r) dVar2.instance;
        rVar.f150094a |= 2;
        rVar.f150096c = a;
        C56307e eVar = (C56307e) C56308f.f150069b.createBuilder();
        eVar.mo54352a("RAID");
        dVar2.copyOnWrite();
        C56320r rVar2 = (C56320r) dVar2.instance;
        C56308f fVar = (C56308f) eVar.build();
        fVar.getClass();
        rVar2.f150104k = fVar;
        rVar2.f150094a |= 1024;
        String str = dVar.f54698c;
        dVar2.copyOnWrite();
        C56320r rVar3 = (C56320r) dVar2.instance;
        str.getClass();
        rVar3.f150094a |= 4;
        rVar3.f150097d = str;
        String str2 = dVar.f54697b;
        dVar2.copyOnWrite();
        C56320r rVar4 = (C56320r) dVar2.instance;
        str2.getClass();
        rVar4.f150094a |= 8;
        rVar4.f150098e = str2;
        float f = dVar.f54696a;
        dVar2.copyOnWrite();
        C56320r rVar5 = (C56320r) dVar2.instance;
        rVar5.f150094a |= 16;
        rVar5.f150099f = f;
        dVar2.copyOnWrite();
        C56320r rVar6 = (C56320r) dVar2.instance;
        rVar6.f150095b = 5;
        rVar6.f150094a |= 1;
        C56318p j = m52009j("object", bvVar2);
        dVar2.copyOnWrite();
        C56320r rVar7 = (C56320r) dVar2.instance;
        j.getClass();
        rVar7.f150101h = j;
        rVar7.f150094a |= 128;
        aVar.mo54333b((C56320r) dVar2.build());
        return (C56327y) aVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c8, code lost:
        if (r6.startsWith("home.") != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.base.C58833ax m52006g(java.net.URI r17) {
        /*
            java.lang.String r0 = r17.getScheme()
            if (r0 != 0) goto L_0x0009
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x0009:
            java.lang.String r1 = "http"
            boolean r1 = com.google.common.base.C58890d.m90990e(r0, r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = "https"
            boolean r1 = com.google.common.base.C58890d.m90990e(r0, r1)
            if (r1 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r1 = 0
            goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            java.lang.String r4 = r17.toString()
            boolean r4 = com.google.android.libraries.lens.view.utils.C28133v.m52422h(r4)
            java.lang.String r5 = r17.toString()
            boolean r5 = com.google.android.libraries.lens.view.utils.C28133v.m52421g(r5)
            java.lang.String r6 = r17.getHost()
            java.lang.String r15 = r17.getPath()
            java.lang.String r16 = r17.getSchemeSpecificPart()
            if (r1 == 0) goto L_0x003f
            if (r6 != 0) goto L_0x0047
        L_0x003f:
            if (r4 != 0) goto L_0x0047
            if (r5 == 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x0047:
            r4 = 2
            if (r6 == 0) goto L_0x00d0
            r5 = 0
            r7 = 0
        L_0x004c:
            int r8 = r6.length()
            r9 = 46
            if (r5 >= r8) goto L_0x005f
            char r8 = r6.charAt(r5)
            if (r8 != r9) goto L_0x005c
            int r7 = r7 + 1
        L_0x005c:
            int r5 = r5 + 1
            goto L_0x004c
        L_0x005f:
            if (r7 < r4) goto L_0x00cb
            int r5 = r6.length()
            r7 = 4
            if (r5 <= r7) goto L_0x008e
            java.lang.String r5 = "www"
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L_0x008e
            r5 = 3
        L_0x0071:
            int r7 = r6.length()
            if (r5 >= r7) goto L_0x00cb
            char r7 = r6.charAt(r5)
            if (r7 != r9) goto L_0x0080
            int r7 = r5 + 1
            goto L_0x00cc
        L_0x0080:
            char r7 = r6.charAt(r5)
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 != 0) goto L_0x008b
            goto L_0x00cb
        L_0x008b:
            int r5 = r5 + 1
            goto L_0x0071
        L_0x008e:
            int r5 = r6.length()
            if (r5 <= r7) goto L_0x009d
            java.lang.String r5 = "web."
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L_0x009d
            goto L_0x00cc
        L_0x009d:
            int r5 = r6.length()
            if (r5 <= r7) goto L_0x00ac
            java.lang.String r5 = "ftp."
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L_0x00ac
            goto L_0x00cc
        L_0x00ac:
            int r5 = r6.length()
            if (r5 <= r7) goto L_0x00bb
            java.lang.String r5 = "wap."
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L_0x00bb
            goto L_0x00cc
        L_0x00bb:
            int r5 = r6.length()
            r7 = 5
            if (r5 <= r7) goto L_0x00cb
            java.lang.String r5 = "home."
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            java.lang.String r6 = r6.substring(r7)
        L_0x00d0:
            if (r6 != 0) goto L_0x00f0
            if (r15 != 0) goto L_0x00f0
            java.lang.String r5 = r17.getSchemeSpecificPart()     // Catch:{ URISyntaxException -> 0x01c2 }
            if (r5 == 0) goto L_0x00f0
            java.net.URI r5 = new java.net.URI     // Catch:{ URISyntaxException -> 0x01c2 }
            java.lang.String r7 = r17.getScheme()     // Catch:{ URISyntaxException -> 0x01c2 }
            java.lang.String r8 = r17.getSchemeSpecificPart()     // Catch:{ URISyntaxException -> 0x01c2 }
            java.lang.String r9 = r17.getFragment()     // Catch:{ URISyntaxException -> 0x01c2 }
            r5.<init>(r7, r8, r9)     // Catch:{ URISyntaxException -> 0x01c2 }
            java.lang.String r5 = r5.toString()     // Catch:{ URISyntaxException -> 0x01c2 }
            goto L_0x0112
        L_0x00f0:
            java.net.URI r5 = new java.net.URI     // Catch:{ URISyntaxException -> 0x01c2 }
            if (r3 == r1) goto L_0x00f6
            r8 = r0
            goto L_0x00f8
        L_0x00f6:
            r7 = 0
            r8 = r7
        L_0x00f8:
            java.lang.String r9 = r17.getUserInfo()     // Catch:{ URISyntaxException -> 0x01c2 }
            int r11 = r17.getPort()     // Catch:{ URISyntaxException -> 0x01c2 }
            java.lang.String r13 = r17.getQuery()     // Catch:{ URISyntaxException -> 0x01c2 }
            java.lang.String r14 = r17.getFragment()     // Catch:{ URISyntaxException -> 0x01c2 }
            r7 = r5
            r10 = r6
            r12 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ URISyntaxException -> 0x01c2 }
            java.lang.String r5 = r5.toString()     // Catch:{ URISyntaxException -> 0x01c2 }
        L_0x0112:
            java.lang.String r7 = "/"
            boolean r7 = r5.endsWith(r7)
            if (r7 == 0) goto L_0x0124
            int r7 = r5.length()
            int r7 = r7 + -1
            java.lang.String r5 = r5.substring(r2, r7)
        L_0x0124:
            java.lang.String r7 = "//"
            boolean r7 = r5.startsWith(r7)
            if (r7 == 0) goto L_0x0130
            java.lang.String r5 = r5.substring(r4)
        L_0x0130:
            int r7 = r5.length()
            r8 = 25
            if (r7 > r8) goto L_0x013d
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r5)
            return r0
        L_0x013d:
            if (r6 == 0) goto L_0x0141
            r5 = r6
            goto L_0x0149
        L_0x0141:
            if (r15 == 0) goto L_0x0145
            r5 = r15
            goto L_0x0149
        L_0x0145:
            java.lang.String r5 = com.google.common.base.C58837ba.m90858g(r16)
        L_0x0149:
            if (r6 == 0) goto L_0x015e
            if (r15 == 0) goto L_0x015e
            int r6 = r15.length()
            if (r6 <= r3) goto L_0x015e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "/…"
            java.lang.String r5 = r5.concat(r6)
            goto L_0x0172
        L_0x015e:
            java.lang.String r6 = r17.getQuery()
            boolean r6 = com.google.common.base.C58837ba.m90859h(r6)
            if (r6 != 0) goto L_0x0174
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "?…"
            java.lang.String r5 = r5.concat(r6)
        L_0x0172:
            r6 = 1
            goto L_0x018a
        L_0x0174:
            java.lang.String r6 = r17.getFragment()
            boolean r6 = com.google.common.base.C58837ba.m90859h(r6)
            if (r6 != 0) goto L_0x0189
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "#…"
            java.lang.String r5 = r5.concat(r6)
            goto L_0x0172
        L_0x0189:
            r6 = 0
        L_0x018a:
            if (r1 == 0) goto L_0x018f
            java.lang.String r0 = ""
            goto L_0x0195
        L_0x018f:
            java.lang.String r1 = ":"
            java.lang.String r0 = r0.concat(r1)
        L_0x0195:
            int r1 = r0.length()
            int r7 = r5.length()
            int r1 = r1 + r7
            if (r3 == r6) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r2 = 2
        L_0x01a2:
            int r1 = r1 + r2
            if (r1 <= r8) goto L_0x01b5
            int r1 = r1 + -22
            java.lang.String r1 = r5.substring(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "…"
            java.lang.String r5 = r2.concat(r1)
        L_0x01b5:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r0.concat(r1)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x01c2:
            r0 = move-exception
            com.google.common.f.a.d r1 = f76094a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Failed to build intermediate barcode URI"
            r3 = 50117(0xc3c5, float:7.0229E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n.m52006g(java.net.URI):com.google.common.base.ax");
    }

    /* renamed from: h */
    private static C62441br m52007h(int i, int i2, int i3, int i4, Size size) {
        float f = (float) i3;
        int width = size.getWidth();
        float f2 = (float) i4;
        int height = size.getHeight();
        int width2 = size.getWidth();
        int height2 = size.getHeight();
        C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
        bqVar.copyOnWrite();
        C62441br brVar = (C62441br) bqVar.instance;
        brVar.f168610a |= 1;
        brVar.f168611b = (((float) i) + (f / 2.0f)) / ((float) width);
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 2;
        brVar2.f168612c = (((float) i2) + (f2 / 2.0f)) / ((float) height);
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 4;
        brVar3.f168613d = f / ((float) width2);
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 8;
        brVar4.f168614e = f2 / ((float) height2);
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168616g = 1;
        brVar5.f168610a |= 32;
        return (C62441br) bqVar.build();
    }

    /* renamed from: i */
    private static C62488dk m52008i(Point point, Size size) {
        C62487dj djVar = (C62487dj) C62488dk.f168699d.createBuilder();
        int i = point.x;
        int width = size.getWidth();
        djVar.copyOnWrite();
        C62488dk dkVar = (C62488dk) djVar.instance;
        dkVar.f168701a |= 1;
        dkVar.f168702b = ((float) i) / ((float) width);
        int i2 = point.y;
        int height = size.getHeight();
        djVar.copyOnWrite();
        C62488dk dkVar2 = (C62488dk) djVar.instance;
        dkVar2.f168701a |= 2;
        dkVar2.f168703c = ((float) i2) / ((float) height);
        return (C62488dk) djVar.build();
    }

    /* renamed from: j */
    private static C56318p m52009j(String str, C62445bv bvVar) {
        C62441br brVar = bvVar.f168621b;
        if (brVar == null) {
            brVar = C62441br.f168608h;
        }
        float f = brVar.f168611b;
        C62441br brVar2 = bvVar.f168621b;
        float f2 = (brVar2 == null ? C62441br.f168608h : brVar2).f168612c;
        float f3 = (brVar2 == null ? C62441br.f168608h : brVar2).f168613d;
        float f4 = (brVar2 == null ? C62441br.f168608h : brVar2).f168614e;
        if (brVar2 == null) {
            brVar2 = C62441br.f168608h;
        }
        String str2 = f + "," + f2 + "," + f3 + "," + f4 + "," + brVar2.f168615f;
        C56317o oVar = (C56317o) C56318p.f150087c.createBuilder();
        String a = C24103a.m44778a(str, str2);
        oVar.copyOnWrite();
        C56318p pVar = (C56318p) oVar.instance;
        pVar.f150089a |= 4;
        pVar.f150090b = a;
        return (C56318p) oVar.build();
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r1v24, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.lens.p4699e.C62223d mo33412a(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, com.google.common.p4522b.C58485gu r27, com.google.common.p4522b.C58485gu r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r28
            com.google.android.libraries.lens.view.session.ondevice.b.b r3 = r0.f76096c
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r27)
            com.google.android.libraries.lens.view.session.ondevice.c.m r5 = com.google.android.libraries.lens.view.session.ondevice.p2168c.C27939m.f76093a
            j$.util.stream.Stream r4 = r4.map(r5)
            j$.util.stream.Collector r5 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r4 = r4.collect(r5)
            com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4
            java.util.Locale r5 = java.util.Locale.forLanguageTag(r26)
            com.google.common.b.gu r3 = r3.mo33398a(r1, r4, r5)
            com.google.lens.e.d r4 = com.google.lens.p4699e.C62223d.f168005e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.lens.e.c r4 = (com.google.lens.p4699e.C62222c) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.lens.e.d r5 = (com.google.lens.p4699e.C62223d) r5
            r23.getClass()
            com.google.protobuf.cq r6 = r5.f168010d
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x0042
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r5.f168010d = r6
        L_0x0042:
            com.google.protobuf.cq r5 = r5.f168010d
            r6 = r23
            r5.add(r6)
            com.google.lens.e.be r5 = com.google.lens.p4699e.C62219be.f167986j
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.lens.e.as r5 = (com.google.lens.p4699e.C62206as) r5
            com.google.lens.e.ba r6 = com.google.lens.p4699e.C62215ba.f167974c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.lens.e.ax r6 = (com.google.lens.p4699e.C62211ax) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.lens.e.ba r7 = (com.google.lens.p4699e.C62215ba) r7
            r8 = 1
            r7.f167977b = r8
            int r9 = r7.f167976a
            r9 = r9 | r8
            r7.f167976a = r9
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.lens.e.be r7 = (com.google.lens.p4699e.C62219be) r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.lens.e.ba r6 = (com.google.lens.p4699e.C62215ba) r6
            r6.getClass()
            r7.f167989b = r6
            int r6 = r7.f167988a
            r6 = r6 | r8
            r7.f167988a = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.e.be r6 = (com.google.lens.p4699e.C62219be) r6
            r25.getClass()
            int r7 = r6.f167988a
            r9 = 4
            r7 = r7 | r9
            r6.f167988a = r7
            r7 = r25
            r6.f167991d = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.e.be r6 = (com.google.lens.p4699e.C62219be) r6
            r26.getClass()
            int r7 = r6.f167988a
            r10 = 2
            r7 = r7 | r10
            r6.f167988a = r7
            r7 = r26
            r6.f167990c = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.lens.e.be r6 = (com.google.lens.p4699e.C62219be) r6
            r11 = 0
            r6.f167994g = r11
            int r12 = r6.f167988a
            r12 = r12 | 16
            r6.f167988a = r12
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()
            r12 = 0
        L_0x00bc:
            int r13 = r3.size()
            if (r12 >= r13) goto L_0x01e7
            java.lang.Object r13 = r3.get(r12)
            com.google.lens.e.aw r13 = (com.google.lens.p4699e.C62210aw) r13
            com.google.protobuf.bn r13 = r13.toBuilder()
            com.google.lens.e.at r13 = (com.google.lens.p4699e.C62207at) r13
            int r14 = r28.size()
            if (r12 >= r14) goto L_0x0120
            boolean r14 = r0.f76098e
            if (r14 == 0) goto L_0x0120
            java.lang.Object r14 = r2.get(r12)
            com.google.lens.g.ai r14 = (com.google.lens.p4701g.C62259ai) r14
            com.google.protobuf.z r14 = r14.f168092a
            r13.copyOnWrite()
            com.google.protobuf.bv r15 = r13.instance
            com.google.lens.e.aw r15 = (com.google.lens.p4699e.C62210aw) r15
            r14.getClass()
            int r11 = r15.f167965a
            r11 = r11 | 16
            r15.f167965a = r11
            r15.f167970f = r14
            java.lang.Object r11 = r2.get(r12)
            com.google.lens.g.ai r11 = (com.google.lens.p4701g.C62259ai) r11
            int r11 = r11.f168093b
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.lens.e.aw r14 = (com.google.lens.p4699e.C62210aw) r14
            int r15 = r14.f167965a
            r15 = r15 | 32
            r14.f167965a = r15
            r14.f167971g = r11
            java.lang.Object r11 = r2.get(r12)
            com.google.lens.g.ai r11 = (com.google.lens.p4701g.C62259ai) r11
            int r11 = r11.f168094c
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.lens.e.aw r14 = (com.google.lens.p4699e.C62210aw) r14
            int r15 = r14.f167965a
            r15 = r15 | 64
            r14.f167965a = r15
            r14.f167972h = r11
        L_0x0120:
            int r11 = r27.size()
            if (r12 >= r11) goto L_0x01cc
            r11 = r27
            java.lang.Object r14 = r11.get(r12)
            com.google.android.libraries.lens.view.session.ondevice.c.q r14 = (com.google.android.libraries.lens.view.session.ondevice.p2168c.C27943q) r14
            com.google.lens.e.bd r14 = r14.mo33406a()
            int r15 = r14.f167982a
            r16 = r15 & 2
            if (r16 == 0) goto L_0x018e
            r15 = r15 & 1
            if (r15 == 0) goto L_0x018e
            int r15 = r14.f167983b
            int r10 = r14.f167984c
            double r8 = androidx.core.graphics.C1924a.m5183b(r15)
            double r1 = androidx.core.graphics.C1924a.m5183b(r10)
            double r17 = com.google.android.libraries.lens.common.text.C24142r.m44845a(r8, r1)
            r19 = 4616752568008179712(0x4012000000000000, double:4.5)
            int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r21 >= 0) goto L_0x018e
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.lens.e.bc r14 = (com.google.lens.p4699e.C62217bc) r14
            int r17 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r17 < 0) goto L_0x015e
            r7 = 0
            goto L_0x015f
        L_0x015e:
            r7 = 1
        L_0x015f:
            int r17 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r17 < 0) goto L_0x0165
            r8 = 1
            goto L_0x0166
        L_0x0165:
            r8 = 0
        L_0x0166:
            int r8 = com.google.android.libraries.lens.common.text.C24142r.m44846b(r1, r8, r15)
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            com.google.lens.e.bd r9 = (com.google.lens.p4699e.C62218bd) r9
            int r15 = r9.f167982a
            r16 = 1
            r15 = r15 | 1
            r9.f167982a = r15
            r9.f167983b = r8
            double r8 = androidx.core.graphics.C1924a.m5183b(r8)
            double r1 = com.google.android.libraries.lens.common.text.C24142r.m44845a(r8, r1)
            int r15 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r15 < 0) goto L_0x0190
            com.google.protobuf.bv r1 = r14.build()
            r14 = r1
            com.google.lens.e.bd r14 = (com.google.lens.p4699e.C62218bd) r14
        L_0x018e:
            r8 = 2
            goto L_0x01b9
        L_0x0190:
            r14.copyOnWrite()
            com.google.protobuf.bv r1 = r14.instance
            com.google.lens.e.bd r1 = (com.google.lens.p4699e.C62218bd) r1
            int r2 = r1.f167982a
            r15 = 4
            r2 = r2 | r15
            r1.f167982a = r2
            r1.f167985d = r10
            int r1 = com.google.android.libraries.lens.common.text.C24142r.m44846b(r8, r7, r10)
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.lens.e.bd r2 = (com.google.lens.p4699e.C62218bd) r2
            int r7 = r2.f167982a
            r8 = 2
            r7 = r7 | r8
            r2.f167982a = r7
            r2.f167984c = r1
            com.google.protobuf.bv r1 = r14.build()
            r14 = r1
            com.google.lens.e.bd r14 = (com.google.lens.p4699e.C62218bd) r14
        L_0x01b9:
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.lens.e.aw r1 = (com.google.lens.p4699e.C62210aw) r1
            r14.getClass()
            r1.f167969e = r14
            int r2 = r1.f167965a
            r7 = 4
            r2 = r2 | r7
            r1.f167965a = r2
            goto L_0x01d0
        L_0x01cc:
            r11 = r27
            r7 = 4
            r8 = 2
        L_0x01d0:
            com.google.protobuf.bv r1 = r13.build()
            com.google.lens.e.aw r1 = (com.google.lens.p4699e.C62210aw) r1
            r6.mo55395g(r1)
            int r12 = r12 + 1
            r1 = r24
            r7 = r26
            r2 = r28
            r8 = 1
            r9 = 4
            r10 = 2
            r11 = 0
            goto L_0x00bc
        L_0x01e7:
            r7 = 4
            r8 = 2
            com.google.common.b.gu r1 = r6.mo55394f()
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.lens.e.be r2 = (com.google.lens.p4699e.C62219be) r2
            com.google.protobuf.cq r6 = r2.f167993f
            boolean r9 = r6.mo58948c()
            if (r9 != 0) goto L_0x0202
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r2.f167993f = r6
        L_0x0202:
            com.google.protobuf.cq r2 = r2.f167993f
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)
            int r1 = r3.size()
            boolean r2 = r0.f76097d
            if (r2 == 0) goto L_0x0214
            r2 = 1
            if (r1 != r2) goto L_0x0214
            r9 = 4
            goto L_0x0221
        L_0x0214:
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r26)
            int r1 = androidx.core.p096h.C1965r.m5296a(r1)
            if (r1 != 0) goto L_0x0220
            r9 = 2
            goto L_0x0221
        L_0x0220:
            r9 = 3
        L_0x0221:
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.lens.e.be r1 = (com.google.lens.p4699e.C62219be) r1
            int r2 = com.google.lens.p4707j.C62473cw.m94779a(r9)
            r1.f167996i = r2
            int r2 = r1.f167988a
            r2 = r2 | 64
            r1.f167988a = r2
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.lens.e.be r1 = (com.google.lens.p4699e.C62219be) r1
            r24.getClass()
            int r2 = r1.f167988a
            r2 = r2 | 8
            r1.f167988a = r2
            r2 = r24
            r1.f167992e = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.lens.e.d r1 = (com.google.lens.p4699e.C62223d) r1
            com.google.protobuf.bv r2 = r5.build()
            com.google.lens.e.be r2 = (com.google.lens.p4699e.C62219be) r2
            r2.getClass()
            r1.f168008b = r2
            r2 = 10
            r1.f168007a = r2
            com.google.protobuf.bv r1 = r4.build()
            com.google.lens.e.d r1 = (com.google.lens.p4699e.C62223d) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n.mo33412a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.common.b.gu, com.google.common.b.gu):com.google.lens.e.d");
    }
}
