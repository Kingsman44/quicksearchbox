package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.content.Context;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0315q;
import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88121py;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88122pz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88124qa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90049da;
import com.google.android.libraries.componentview.components.p1682a.C19830p;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19759d;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19761f;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19764i;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19765j;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20628s;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52562wi;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.l */
/* compiled from: PG */
public final class C84108l extends C20628s {

    /* renamed from: a */
    public static final C59071e f229022a = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.l");

    /* renamed from: b */
    public final Context f229023b;

    /* renamed from: c */
    public final C20601ca f229024c;

    /* renamed from: d */
    public final C87680ah f229025d;

    /* renamed from: e */
    public C0320v f229026e;

    /* renamed from: f */
    public C0315q f229027f;

    /* renamed from: g */
    public final C0310l f229028g = new C84071b(this);

    /* renamed from: h */
    public C19830p f229029h;

    /* renamed from: j */
    private final C90021c f229030j;

    /* renamed from: k */
    private C19765j f229031k;

    public C84108l(Context context, C20601ca caVar, C87680ah ahVar, C90021c cVar) {
        super(context, caVar);
        this.f229023b = context;
        this.f229024c = caVar;
        this.f229025d = ahVar;
        this.f229030j = cVar;
    }

    /* renamed from: q */
    private final void m134027q(Runnable runnable, boolean z) {
        if (this.f229026e == null || this.f229027f == null || !mo77538k()) {
            int i = 0;
            this.f229025d.mo81959a(new C84106j(this, runnable), C88244um.SEND_MEDIA_SESSION_TOKEN);
            C58976aa aaVar = C58975e.f156826a;
            C88489j jVar = new C88489j(C87739bu.OPA_REQUEST_MEDIA_SESSION_TOKEN);
            if (z) {
                C19765j jVar2 = this.f229031k;
                jVar2.getClass();
                int i2 = jVar2.f55209c;
                C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder();
                C19830p pVar = this.f229029h;
                pVar.getClass();
                long a = pVar.mo25135a();
                hvVar.copyOnWrite();
                C52176ia iaVar = (C52176ia) hvVar.instance;
                iaVar.f136913a |= 16;
                iaVar.f136917e = a;
                hvVar.copyOnWrite();
                C52176ia iaVar2 = (C52176ia) hvVar.instance;
                iaVar2.f136913a |= 8;
                iaVar2.f136916d = i2;
                C19830p pVar2 = this.f229029h;
                pVar2.getClass();
                int a2 = C19764i.m37611a(pVar2.f55419a.f55434d.f55216j);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i3 = a2 - 1;
                int i4 = i3 != 1 ? i3 != 2 ? 1 : 3 : 2;
                hvVar.copyOnWrite();
                C52176ia iaVar3 = (C52176ia) hvVar.instance;
                iaVar3.f136918f = i4 - 1;
                iaVar3.f136913a |= 32;
                while (true) {
                    C19765j jVar3 = this.f229031k;
                    jVar3.getClass();
                    if (i >= jVar3.f55208b.size()) {
                        break;
                    }
                    C19765j jVar4 = this.f229031k;
                    jVar4.getClass();
                    C19761f fVar = (C19761f) jVar4.f55208b.get(i);
                    String str = (fVar.f55196a & 16) != 0 ? fVar.f55201f : fVar.f55200e;
                    C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder();
                    String str2 = fVar.f55198c;
                    wjVar.copyOnWrite();
                    C52568wo woVar = (C52568wo) wjVar.instance;
                    str2.getClass();
                    woVar.f137994a |= 1;
                    woVar.f137998e = str2;
                    String str3 = fVar.f55199d;
                    wjVar.copyOnWrite();
                    C52568wo woVar2 = (C52568wo) wjVar.instance;
                    str3.getClass();
                    woVar2.f137994a |= 32;
                    woVar2.f138002i = str3;
                    C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
                    dbVar.copyOnWrite();
                    C51012dc dcVar = (C51012dc) dbVar.instance;
                    str.getClass();
                    dcVar.f132815a |= 2;
                    dcVar.f132817c = str;
                    wjVar.copyOnWrite();
                    C52568wo woVar3 = (C52568wo) wjVar.instance;
                    C51012dc dcVar2 = (C51012dc) dbVar.build();
                    dcVar2.getClass();
                    woVar3.f138004k = dcVar2;
                    woVar3.f137994a |= 1024;
                    if (this.f229030j.mo79746e(C90049da.f248760b)) {
                        C19830p pVar3 = this.f229029h;
                        pVar3.getClass();
                        C19759d dVar = pVar3.f55419a.f55434d.f55217k;
                        if (dVar == null) {
                            dVar = C19759d.f55189d;
                        }
                        if (!dVar.equals(C19759d.f55189d)) {
                            C52562wi wiVar = (C52562wi) C84107k.f229021a.mo56070hd(dVar);
                            wjVar.copyOnWrite();
                            C52568wo woVar4 = (C52568wo) wjVar.instance;
                            wiVar.getClass();
                            woVar4.f137997d = wiVar;
                            woVar4.f137996c = 41;
                        }
                    }
                    C52171hw hwVar = (C52171hw) C52174hz.f136892m.createBuilder();
                    String str4 = fVar.f55197b;
                    hwVar.copyOnWrite();
                    C52174hz hzVar = (C52174hz) hwVar.instance;
                    str4.getClass();
                    hzVar.f136894a |= 1;
                    hzVar.f136895b = str4;
                    C52568wo woVar5 = (C52568wo) wjVar.build();
                    hwVar.copyOnWrite();
                    C52174hz hzVar2 = (C52174hz) hwVar.instance;
                    woVar5.getClass();
                    hzVar2.f136897d = woVar5;
                    hzVar2.f136894a |= 8;
                    if (i == i2) {
                        C19765j jVar5 = this.f229031k;
                        jVar5.getClass();
                        int i5 = jVar5.f55210d;
                        hwVar.copyOnWrite();
                        C52174hz hzVar3 = (C52174hz) hwVar.instance;
                        hzVar3.f136894a |= 16;
                        hzVar3.f136898e = (long) i5;
                    }
                    hvVar.mo53807c(hwVar);
                    i++;
                }
                C88122pz pzVar = (C88122pz) C88124qa.f238228d.createBuilder();
                C63088z byteString = ((C52176ia) hvVar.build()).toByteString();
                pzVar.copyOnWrite();
                C88124qa qaVar = (C88124qa) pzVar.instance;
                byteString.getClass();
                qaVar.f238230a |= 1;
                qaVar.f238231b = byteString;
                pzVar.copyOnWrite();
                C88124qa qaVar2 = (C88124qa) pzVar.instance;
                qaVar2.f238230a |= 2;
                qaVar2.f238232c = true;
                jVar.mo82014b(C88121py.f238227a, (C88124qa) pzVar.build());
            }
            this.f229025d.mo81961c(jVar.mo82013a());
            return;
        }
        runnable.run();
    }

    /* renamed from: a */
    public final int mo25497a() {
        C0320v vVar;
        if (!mo77538k() || (vVar = this.f229026e) == null || vVar.mo1038f() == null) {
            return -1;
        }
        return (int) this.f229026e.mo1038f().f995b;
    }

    /* renamed from: b */
    public final int mo25498b() {
        C0320v vVar;
        if (!mo77538k() || (vVar = this.f229026e) == null || vVar.mo1036d() == null || !this.f229026e.mo1036d().f945b.containsKey("android.media.metadata.DURATION")) {
            return 0;
        }
        C0320v vVar2 = this.f229026e;
        vVar2.getClass();
        return (int) vVar2.mo1036d().mo816a("android.media.metadata.DURATION");
    }

    /* renamed from: c */
    public final void mo25499c() {
        if (this.f229029h == null) {
            C59104x d = f229022a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CanvasAudioService");
            ((C59052c) ((C59052c) d).mo56372aa(7015)).mo56386p("Trying to replay audio without callback provided.");
            return;
        }
        m134027q(new C84103g(this), true);
    }

    /* renamed from: d */
    public final void mo25500d() {
        if (this.f229029h == null) {
            C59104x d = f229022a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CanvasAudioService");
            ((C59052c) ((C59052c) d).mo56372aa(7016)).mo56386p("Trying to play next audio without callback provided.");
            return;
        }
        m134027q(new C84104h(this), true);
    }

    /* renamed from: e */
    public final void mo25501e() {
        super.mo25501e();
        C59104x b = f229022a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CanvasAudioService");
        ((C59052c) ((C59052c) b).mo56372aa(7017)).mo56386p("onDestroy");
        mo77537i();
    }

    /* renamed from: f */
    public final void mo25502f() {
        if (this.f229029h == null) {
            C59104x d = f229022a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CanvasAudioService");
            ((C59052c) ((C59052c) d).mo56372aa(7018)).mo56386p("Trying to pause audio without callback provided.");
            return;
        }
        m134027q(new C84101e(this), true);
    }

    /* renamed from: g */
    public final void mo25503g() {
        if (this.f229029h == null) {
            C59104x d = f229022a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CanvasAudioService");
            ((C59052c) ((C59052c) d).mo56372aa(7019)).mo56386p("Trying to play audio without callback and audio list provided.");
            return;
        }
        m134027q(new C84100d(this), true);
    }

    /* renamed from: h */
    public final void mo25504h() {
        if (this.f229029h == null) {
            C59104x d = f229022a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CanvasAudioService");
            ((C59052c) ((C59052c) d).mo56372aa(7020)).mo56386p("Trying to play previous audio without callback provided.");
            return;
        }
        m134027q(new C84105i(this), true);
    }

    /* renamed from: i */
    public final void mo77537i() {
        C58976aa aaVar = C58975e.f156826a;
        C0320v vVar = this.f229026e;
        if (vVar != null) {
            vVar.mo1041i(this.f229028g);
        }
        this.f229026e = null;
        this.f229027f = null;
    }

    /* renamed from: j */
    public final void mo25505j() {
        if (this.f229029h == null) {
            C59104x d = f229022a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CanvasAudioService");
            ((C59052c) ((C59052c) d).mo56372aa(7023)).mo56386p("Trying to replay audio without callback provided.");
            return;
        }
        m134027q(new C84102f(this), true);
    }

    /* renamed from: k */
    public final boolean mo77538k() {
        C0320v vVar = this.f229026e;
        long j = 0;
        if (!(vVar == null || vVar.mo1036d() == null || !this.f229026e.mo1036d().f945b.containsKey("assistant.api.params.MediaParams.MediaSession.SessionId"))) {
            C0320v vVar2 = this.f229026e;
            vVar2.getClass();
            j = vVar2.mo1036d().mo816a("assistant.api.params.MediaParams.MediaSession.SessionId");
        }
        C19830p pVar = this.f229029h;
        return pVar != null && j == pVar.mo25135a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r5.f229026e;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25506l() {
        /*
            r5 = this;
            boolean r0 = r5.mo77538k()
            if (r0 == 0) goto L_0x0023
            android.support.v4.media.session.v r0 = r5.f229026e
            if (r0 == 0) goto L_0x0023
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.mo1038f()
            if (r0 == 0) goto L_0x0023
            android.support.v4.media.session.v r0 = r5.f229026e
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.mo1038f()
            long r0 = r0.f998e
            r2 = 256(0x100, double:1.265E-321)
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            r0 = 1
            return r0
        L_0x0023:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.plugins.nativeresults.canvas.C84108l.mo25506l():boolean");
    }

    /* renamed from: m */
    public final void mo25507m(C19765j jVar, C19830p pVar) {
        C58976aa aaVar = C58975e.f156826a;
        C19830p pVar2 = this.f229029h;
        if (pVar2 != null) {
            pVar2.mo25137c();
        }
        this.f229029h = pVar;
        this.f229031k = jVar;
        m134027q(new C84099c(this), false);
    }
}
