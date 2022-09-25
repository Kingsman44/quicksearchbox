package com.google.android.apps.gsa.speech.p7279h;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84559s;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92415u;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92417w;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.h.b */
/* compiled from: PG */
public final class C92301b extends C86052m {

    /* renamed from: a */
    public final C92518d f257390a;

    /* renamed from: b */
    public final C89994f f257391b;

    /* renamed from: c */
    private final Context f257392c;

    /* renamed from: d */
    private final C68214a f257393d;

    /* renamed from: e */
    private final C92417w f257394e;

    /* renamed from: f */
    private final C86054o f257395f;

    /* renamed from: g */
    private final C89859i f257396g;

    public C92301b(Context context, C92518d dVar, C68214a aVar, C89994f fVar, C92417w wVar, C86054o oVar, C89859i iVar) {
        this.f257392c = context;
        this.f257390a = dVar;
        this.f257393d = aVar;
        this.f257391b = fVar;
        this.f257394e = wVar;
        this.f257395f = oVar;
        this.f257396g = iVar;
    }

    /* renamed from: c */
    public final void mo86968c() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f257391b.mo83850M()) {
            this.f257391b.mo83844G();
        }
        this.f257391b.mo83843F((String) null, EventForDump.m147676e(2, "HotwordAcctChangeHndlr:deleteVoiceModel"));
        C92417w wVar = this.f257394e;
        wVar.f257736b.mo28207g("Delete All Enrollment Utterances", new C92415u(wVar));
        this.f257396g.mo83702b(C89849ae.DELETE_UTTERANCES_ON_ACCOUNT_REMOVED);
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        C58976aa aaVar = C58975e.f156826a;
        if (!(this.f257390a == null || account == null || !this.f257391b.mo83848K())) {
            String languageTag = ((ae) this.f257393d.mo27525b()).d(C58837ba.m90858g(account.name)).toLanguageTag();
            Context context = this.f257392c;
            context.sendBroadcast(C84559s.m135275a(languageTag, context.getPackageName()));
        }
        if (this.f257395f.mo79684r().length == 0) {
            C92518d dVar = this.f257390a;
            if (dVar != null) {
                dVar.mo87273a(new C92300a(this));
            } else {
                mo86968c();
            }
        }
    }
}
