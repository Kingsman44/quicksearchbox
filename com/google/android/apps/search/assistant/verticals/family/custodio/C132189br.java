package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.os.CountDownTimer;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8660bl;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.br */
/* compiled from: PG */
public final class C132189br {

    /* renamed from: a */
    public static final C59071e f360810a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.br");

    /* renamed from: b */
    public CountDownTimer f360811b;

    /* renamed from: c */
    public int f360812c;

    /* renamed from: d */
    public final CustodioLoadingFragment f360813d;

    /* renamed from: e */
    public final Bundle f360814e;

    /* renamed from: f */
    public final C132140a f360815f;

    /* renamed from: g */
    public final C46801dp f360816g;

    /* renamed from: h */
    public final C46485f f360817h;

    /* renamed from: i */
    public final C132190a f360818i;

    /* renamed from: j */
    public final C37215b f360819j;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.br$a */
    /* compiled from: PG */
    final class C132190a implements C46792di {
        public C132190a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132189br.f360810a.mo56225c()).mo56382g(th)).mo56372aa(39543)).mo56386p("Failed to fetch kid account details");
            C132189br.this.mo110529a();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() != 1) {
                ((C59052c) ((C59052c) C132189br.f360810a.mo56225c()).mo56372aa(39544)).mo56387q("Expected one child's data provided to CustodioLoading, got %d!", blVar.f29964b.size());
                C132189br.this.mo110529a();
                return;
            }
            C132189br.this.mo110530b();
            C132189br brVar = C132189br.this;
            brVar.f360817h.mo50482c(brVar.f360813d).mo50508d(R.id.assistant_custodio_loading_fragment_success, C132189br.this.f360814e);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C132189br(CustodioLoadingFragment custodioLoadingFragment, C132140a aVar, C46801dp dpVar, C46485f fVar, C37215b bVar) {
        this.f360813d = custodioLoadingFragment;
        Bundle arguments = custodioLoadingFragment.getArguments();
        this.f360814e = arguments == null ? new Bundle() : arguments;
        this.f360815f = aVar;
        this.f360816g = dpVar;
        this.f360817h = fVar;
        this.f360818i = new C132190a();
        this.f360819j = bVar;
    }

    /* renamed from: a */
    public final void mo110529a() {
        this.f360819j.mo19974a(C37176a.f97023di);
        this.f360817h.mo50482c(this.f360813d).mo50508d(R.id.assistant_custodio_loading_fragment_to_dialog, C132287ei.m214954a(this.f360813d.getString(R.string.assistant_custodio_fatal_error_title), this.f360813d.getString(R.string.assistant_custodio_fatal_error_body), this.f360813d.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: b */
    public final void mo110530b() {
        CountDownTimer countDownTimer = this.f360811b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f360811b = null;
        }
    }
}
