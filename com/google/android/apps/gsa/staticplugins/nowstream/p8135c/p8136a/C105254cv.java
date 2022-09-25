package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87316ao;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87320c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105352n;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105359u;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1863e.C22802c;
import com.google.android.libraries.gsa.p1863e.C22803d;
import com.google.common.base.C58836b;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.p375ai.p378b.C7669fo;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.cv */
/* compiled from: PG */
final class C105254cv implements C105359u {

    /* renamed from: a */
    final /* synthetic */ C105263dd f293529a;

    /* renamed from: b */
    private final int f293530b;

    public C105254cv(C105263dd ddVar, int i) {
        this.f293529a = ddVar;
        this.f293530b = i;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo94667a(Object obj) {
        C89885b bVar;
        C105352n nVar = (C105352n) obj;
        C105263dd ddVar = this.f293529a;
        ddVar.f293544C = null;
        if (!ddVar.f293551J) {
            if (!ddVar.f293618k.mo79141N() || !this.f293529a.f293618k.mo79140M()) {
                if (this.f293529a.mo94671C()) {
                    bVar = C89885b.FEED_LAUNCH_USER_NOT_SIGNED_IN;
                } else if (!this.f293529a.f293618k.mo79133F()) {
                    bVar = C89885b.FEED_LAUNCH_USER_NOT_ELIGIBLE;
                } else if (!this.f293529a.f293618k.mo79140M()) {
                    bVar = C89885b.FEED_LAUNCH_DISABLED_BY_USER;
                } else {
                    bVar = C89885b.FEED_LAUNCH_LEGACY_OPT_OUT;
                }
                C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
                eVar.copyOnWrite();
                C59770f fVar = (C59770f) eVar.instance;
                fVar.f161503a |= 1;
                fVar.f161504b = 0;
                int i = bVar.f246280a;
                eVar.copyOnWrite();
                C59770f fVar2 = (C59770f) eVar.instance;
                fVar2.f161503a |= 2;
                fVar2.f161505c = i;
                this.f293529a.f293619l.mo86044i((C59770f) eVar.build());
            } else if (nVar.mo94737b() == null) {
                C59742e eVar2 = (C59742e) C59770f.f161501d.createBuilder();
                eVar2.copyOnWrite();
                C59770f fVar3 = (C59770f) eVar2.instance;
                fVar3.f161503a |= 1;
                fVar3.f161504b = 0;
                eVar2.copyOnWrite();
                C59770f fVar4 = (C59770f) eVar2.instance;
                fVar4.f161503a |= 2;
                fVar4.f161505c = C89885b.FEED_LAUNCH_FAILED_TO_GET_ANY_CARD_VALUE;
                this.f293529a.f293619l.mo86045j((C59770f) eVar2.build());
            }
            this.f293529a.f293632y.mo94631p().mo28730f(Long.valueOf(this.f293529a.f293615h.mo26871c()), false);
            this.f293529a.f293555N.mo94721d(nVar.mo94737b());
            C105263dd ddVar2 = this.f293529a;
            C105687ar arVar = ddVar2.f293549H;
            if (arVar != null) {
                arVar.f294839J = ddVar2.f293618k.mo79141N();
                arVar.f294844O = this.f293529a.f293618k.mo79140M();
                if ((((C22803d) this.f293529a.f293632y.mo94628m().f63720e).f62773a & 1024) != 0) {
                    C23251a m = this.f293529a.f293632y.mo94628m();
                    C22802c cVar = (C22802c) ((C22803d) this.f293529a.f293632y.mo94628m().f63720e).toBuilder();
                    cVar.copyOnWrite();
                    C22803d dVar = (C22803d) cVar.instance;
                    dVar.f62773a &= -1025;
                    dVar.f62782j = C22803d.f62771k.f62782j;
                    m.mo28730f((C22803d) cVar.build(), false);
                    this.f293529a.f293548G = null;
                    if (nVar.mo94737b() != null) {
                        C91396h b = nVar.mo94737b();
                        b.getClass();
                        if (!b.mo85714d()) {
                            C91396h b2 = nVar.mo94737b();
                            b2.getClass();
                            C7669fo e = C105263dd.m174794e(b2.mo85712b());
                            if (e != null) {
                                C105263dd ddVar3 = this.f293529a;
                                ddVar3.f293547F = e;
                                arVar.f294834E = ddVar3.f293547F;
                            }
                        }
                    }
                }
                if (!nVar.mo94739d() || nVar.mo94740e()) {
                    this.f293529a.mo94680k(nVar.mo94737b(), nVar.mo94736a());
                } else {
                    this.f293529a.mo94681l(nVar.mo94737b());
                }
                if (nVar.mo94740e() && this.f293529a.f293618k.mo79141N()) {
                    arVar.f294838I = true;
                    C59742e eVar3 = (C59742e) C59770f.f161501d.createBuilder();
                    eVar3.copyOnWrite();
                    C59770f fVar5 = (C59770f) eVar3.instance;
                    fVar5.f161503a |= 1;
                    fVar5.f161504b = 0;
                    eVar3.copyOnWrite();
                    C59770f fVar6 = (C59770f) eVar3.instance;
                    fVar6.f161503a |= 2;
                    fVar6.f161505c = C89885b.FEED_LAUNCH_AUTHENTICATION_ERROR_VALUE;
                    this.f293529a.f293619l.mo86045j((C59770f) eVar3.build());
                }
            }
            if (this.f293530b != 1) {
                ((C118831d) this.f293529a.f293626s.mo6453a()).mo104025g(1);
                if (this.f293530b == 3) {
                    ((C118831d) this.f293529a.f293627t.mo6453a()).mo104025g(1);
                }
            }
            if (nVar.mo94738c().mo56113h() && !((Boolean) nVar.mo94738c().mo56107c()).booleanValue()) {
                C91656e eVar4 = this.f293529a.f293619l;
                boolean z = eVar4.f255622i;
                eVar4.mo86040e(eVar4.f255618e.mo26872d(), C89849ae.NOTIFICATION_REFRESH_FAILED_CONTENT_MISSING);
                C105263dd ddVar4 = this.f293529a;
                C23052c cVar2 = ddVar4.f63405W;
                String string = ddVar4.f293617j.getString(R.string.notification_fulfillment_error);
                C87320c cVar3 = C87320c.NORMAL;
                C58836b bVar2 = C58836b.f156633a;
                C87316ao aoVar = new C87316ao(cVar2, string, BuildConfig.FLAVOR, cVar3, bVar2, bVar2, bVar2);
                aoVar.f235809b = C105253cu.f293528a;
                this.f293529a.f293542A.mo80980c(aoVar);
            }
            if (!this.f293529a.f293620m.getBoolean("momo_new_content_button_ui_test", false)) {
                this.f293529a.mo94682m();
            }
            this.f293529a.mo94684o();
        }
    }
}
