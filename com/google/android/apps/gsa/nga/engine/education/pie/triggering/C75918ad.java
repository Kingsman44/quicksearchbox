package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75830bd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80204ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80205az;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81354b;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81376j;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81359e;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aam;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protos.p4985f.p5036r.C65316b;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.ad */
/* compiled from: PG */
public final class C75918ad extends BroadcastReceiver implements C81376j {

    /* renamed from: a */
    private static final C58974d f210634a = C58974d.m91136j();

    /* renamed from: b */
    private final Context f210635b;

    /* renamed from: c */
    private final C75924aj f210636c;

    /* renamed from: d */
    private final C75928an f210637d;

    /* renamed from: e */
    private final C75911l f210638e;

    /* renamed from: f */
    private final C84516aa f210639f;

    /* renamed from: g */
    private final C81359e f210640g;

    /* renamed from: h */
    private final C91142g f210641h;

    /* renamed from: i */
    private final C75906g f210642i;

    /* renamed from: j */
    private C81374h f210643j = null;

    public C75918ad(Context context, C75924aj ajVar, C75928an anVar, C75911l lVar, C84516aa aaVar, C81359e eVar, C91142g gVar, C75906g gVar2) {
        this.f210635b = context;
        this.f210636c = ajVar;
        this.f210637d = anVar;
        this.f210638e = lVar;
        this.f210639f = aaVar;
        this.f210640g = eVar;
        this.f210641h = gVar;
        this.f210642i = gVar2;
    }

    /* renamed from: b */
    private final void m122427b(C81374h hVar) {
        C81354b bVar = (C81354b) hVar;
        if (!bVar.f222676g) {
            this.f210640g.mo75040a(C81377k.m129443a(bVar.f222670a), bVar.f222677h, bVar.f222675f, this.f210642i);
        }
        if (this.f210641h.mo85405j(C90126fx.f251690na)) {
            C75928an anVar = this.f210637d;
            Locale e = anVar.f210675e.mo72021b().mo72039e();
            C47872f fVar = (C47872f) C47887u.f123976l.createBuilder();
            String string = anVar.f210674d.mo75121a(e).getString(bVar.f222671b, bVar.f222672c.toArray(C58471gg.f156097c));
            fVar.copyOnWrite();
            C47887u uVar = (C47887u) fVar.instance;
            string.getClass();
            uVar.f123978a = 1;
            uVar.f123979b = string;
            String string2 = anVar.f210674d.mo75121a(e).getString(bVar.f222673d, bVar.f222674e.toArray(C58471gg.f156097c));
            fVar.copyOnWrite();
            C47887u uVar2 = (C47887u) fVar.instance;
            string2.getClass();
            uVar2.f123980c = 7;
            uVar2.f123981d = string2;
            C47873g gVar = (C47873g) C47875i.f123945g.createBuilder();
            String string3 = anVar.f210674d.mo75121a(e).getString(R.string.nga_pie_notification_begin_button_text_2, new Object[0]);
            gVar.copyOnWrite();
            C47875i iVar = (C47875i) gVar.instance;
            string3.getClass();
            iVar.f123947a = 1;
            iVar.f123948b = string3;
            C47868b c = C75928an.m122450c("NGA_PIE.notification_button", bVar.f222670a);
            gVar.copyOnWrite();
            c.getClass();
            ((C47875i) gVar.instance).f123950d = c;
            fVar.mo51702a(gVar);
            C47868b c2 = C75928an.m122450c("NGA_PIE.notification_tap", bVar.f222670a);
            fVar.copyOnWrite();
            c2.getClass();
            ((C47887u) fVar.instance).f123984g = c2;
            C47887u uVar3 = (C47887u) fVar.build();
            aax aax = (aax) abc.f134691o.createBuilder();
            aax.copyOnWrite();
            abc abc = (abc) aax.instance;
            uVar3.getClass();
            abc.f134698e = uVar3;
            abc.f134694a |= 2;
            aax.copyOnWrite();
            abc abc2 = (abc) aax.instance;
            abc2.f134694a |= 32;
            abc2.f134700g = 3;
            aax.copyOnWrite();
            abc abc3 = (abc) aax.instance;
            abc3.f134697d = 1;
            abc3.f134694a |= 1;
            aax.copyOnWrite();
            abc abc4 = (abc) aax.instance;
            abc4.f134699f = 2;
            abc4.f134694a |= 16;
            aaj aaj = (aaj) aas.f134661u.createBuilder();
            aaj.copyOnWrite();
            aas aas = (aas) aaj.instance;
            aas.f134664b = 1;
            aas.f134663a |= 1;
            aaj.copyOnWrite();
            aas aas2 = (aas) aaj.instance;
            aas2.f134663a |= 256;
            aas2.f134670h = "NGA_PIE_GROUP";
            long e2 = anVar.f210676f.mo26873e();
            aaj.copyOnWrite();
            aas aas3 = (aas) aaj.instance;
            aas3.f134663a |= 65536;
            aas3.f134678p = e2 / 1000;
            boolean z = bVar.f222675f;
            aaj.copyOnWrite();
            aas aas4 = (aas) aaj.instance;
            aas4.f134663a |= 16384;
            aas4.f134677o = z;
            aaj.mo58885m(abc.f134692p, (abc) aax.build());
            aam aam = (aam) aap.f134650h.createBuilder();
            aam.copyOnWrite();
            aap aap = (aap) aam.instance;
            aap.f134652a |= 1;
            aap.f134653b = 98;
            int b = C65316b.m96665b(268);
            aam.copyOnWrite();
            aap aap2 = (aap) aam.instance;
            aap2.f134652a |= 4;
            aap2.f134655d = b;
            aap aap3 = (aap) aam.build();
            aaj.copyOnWrite();
            aas aas5 = (aas) aaj.instance;
            aap3.getClass();
            aas5.f134676n = aap3;
            aas5.f134663a |= 8192;
            aas aas6 = (aas) aaj.build();
            C75830bd bdVar = anVar.f210677g;
            C80204ay ayVar = (C80204ay) C80205az.f220051c.createBuilder();
            ayVar.copyOnWrite();
            C80205az azVar = (C80205az) ayVar.instance;
            aas6.getClass();
            azVar.f220054b = aas6;
            azVar.f220053a = 2;
            C60856cj.m92911t(bdVar.mo71917a((C80205az) ayVar.build()), new C75927am(anVar, hVar), C60826bg.f164896a);
            return;
        }
        this.f210636c.mo71961d(hVar);
    }

    /* renamed from: c */
    private final synchronized void m122428c() {
        C81374h hVar = this.f210643j;
        this.f210643j = null;
        if (hVar == null) {
            ((C58970a) ((C58970a) f210634a.mo56225c()).mo56372aa(3451)).mo56386p("Failed to show notification - params are null");
            return;
        }
        this.f210635b.unregisterReceiver(this);
        try {
            m122427b(hVar);
        } catch (C81381o e) {
            this.f210638e.mo71913b(e, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1.f210639f.mo78229c() != false) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo71958a(com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h r2, int r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == r0) goto L_0x0044
            r0 = 2
            if (r3 != r0) goto L_0x000f
            com.google.android.apps.gsa.search.core.aj.aa r3 = r1.f210639f     // Catch:{ all -> 0x0049 }
            boolean r3 = r3.mo78229c()     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0044
        L_0x000f:
            com.google.android.apps.gsa.nga.shared.l.a.h r3 = r1.f210643j     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x0023
            r1.f210643j = r2     // Catch:{ all -> 0x0049 }
            android.content.Context r2 = r1.f210635b     // Catch:{ all -> 0x0049 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            r3.<init>(r0)     // Catch:{ all -> 0x0049 }
            r2.registerReceiver(r1, r3)     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)
            return
        L_0x0023:
            com.google.android.apps.gsa.nga.shared.l.a.n r3 = com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o.m129461d()     // Catch:{ all -> 0x0049 }
            r0 = r2
            com.google.android.apps.gsa.nga.shared.l.a.b r0 = (com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81354b) r0     // Catch:{ all -> 0x0049 }
            int r0 = r0.f222677h     // Catch:{ all -> 0x0049 }
            r3.mo75045d(r0)     // Catch:{ all -> 0x0049 }
            com.google.android.apps.gsa.nga.shared.l.a.b r2 = (com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81354b) r2     // Catch:{ all -> 0x0049 }
            android.os.Bundle r2 = r2.f222670a     // Catch:{ all -> 0x0049 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.v r2 = com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k.m129443a(r2)     // Catch:{ all -> 0x0049 }
            r3.mo75044c(r2)     // Catch:{ all -> 0x0049 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.t r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t.TRIGGER_NOTIFICATION_ALREADY_ACTIVE     // Catch:{ all -> 0x0049 }
            r3.mo75043b(r2)     // Catch:{ all -> 0x0049 }
            com.google.android.apps.gsa.nga.shared.l.a.o r2 = r3.mo75042a()     // Catch:{ all -> 0x0049 }
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0044:
            r1.m122427b(r2)     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)
            return
        L_0x0049:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.triggering.C75918ad.mo71958a(com.google.android.apps.gsa.nga.shared.l.a.h, int):void");
    }

    public final void onReceive(Context context, Intent intent) {
        if (!this.f210639f.mo78229c()) {
            m122428c();
        }
    }
}
