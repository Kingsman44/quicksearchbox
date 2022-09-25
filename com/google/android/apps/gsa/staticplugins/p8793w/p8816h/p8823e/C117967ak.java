package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import android.content.Context;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.ak */
/* compiled from: PG */
public final class C117967ak {

    /* renamed from: b */
    private static final C59071e f327407b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.h.e.ak");

    /* renamed from: a */
    public final C84352a f327408a;

    /* renamed from: c */
    private final C85392b f327409c;

    /* renamed from: d */
    private final Context f327410d;

    /* renamed from: e */
    private final C86610af f327411e;

    /* renamed from: f */
    private final C85710c f327412f;

    /* renamed from: g */
    private final Optional f327413g;

    /* renamed from: h */
    private final C91123v f327414h;

    public C117967ak(C85392b bVar, Context context, C86610af afVar, C84352a aVar, C85710c cVar, Optional optional, C91123v vVar) {
        this.f327409c = bVar;
        this.f327410d = context;
        this.f327411e = afVar;
        this.f327408a = aVar;
        this.f327412f = cVar;
        this.f327413g = optional;
        this.f327414h = vVar;
    }

    /* renamed from: a */
    public final C60870cx mo103485a(Query query) {
        String str;
        if (!this.f327414h.mo85390b() || !this.f327413g.isPresent()) {
            str = this.f327410d.getResources().getString(R.string.no_matches_with_suggestions_offline_mode_tts);
        } else {
            C9309a aVar = (C9309a) this.f327413g.get();
            str = aVar.mo17491a(aVar.f32300b).getString(R.string.no_matches_with_suggestions_offline_mode_tts_embedded);
        }
        return mo103486b(query, str);
    }

    /* renamed from: b */
    public final C60870cx mo103486b(Query query, String str) {
        mo103488d(C88244um.ASSISTANT_REQUEST_ID);
        SettableFuture settableFuture = new SettableFuture();
        mo103489e(2, mo103487c(), query, new TtsRequest(str, false), (String) null, new C117966aj(this, settableFuture));
        return settableFuture;
    }

    /* renamed from: c */
    public final String mo103487c() {
        if (this.f327414h.mo85390b()) {
            return this.f327412f.mo79343a();
        }
        return this.f327410d.getResources().getConfiguration().locale.toString();
    }

    /* renamed from: d */
    public final void mo103488d(C88244um umVar) {
        C86775r rVar = this.f327411e.f233977l;
        if (rVar == null) {
            ((C59052c) ((C59052c) f327407b.mo56226d()).mo56372aa(18851)).mo56386p("notifyAttachedClient - no attached client.");
            return;
        }
        rVar.f234383e.mo80379b(new C87684al(umVar).mo81964a());
    }

    /* renamed from: e */
    public final void mo103489e(int i, String str, Query query, TtsRequest ttsRequest, String str2, C85386a aVar) {
        this.f327409c.mo78915d(i, str, query, (C90606n) null, ttsRequest, false, false, str2, aVar);
    }
}
