package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import android.content.Context;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.k */
/* compiled from: PG */
public final class C18365k {

    /* renamed from: a */
    public static final C58974d f52091a = C58974d.m91134h("DspModelDownloadCntrl");

    /* renamed from: b */
    public final Context f52092b;

    /* renamed from: c */
    public final String f52093c;

    /* renamed from: d */
    public final C68214a f52094d;

    /* renamed from: e */
    public boolean f52095e = false;

    /* renamed from: f */
    private final C68214a f52096f;

    /* renamed from: g */
    private final C68214a f52097g;

    public C18365k(Context context, String str, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f52092b = context;
        this.f52093c = str;
        this.f52094d = aVar;
        this.f52096f = aVar2;
        this.f52097g = aVar3;
    }

    /* renamed from: a */
    public final synchronized void mo23845a(int i, String str) {
        if (!this.f52095e) {
            this.f52095e = true;
            ((C60888db) this.f52097g.mo27525b()).mo19398a(C47810es.m84977q(new C18363i(this, i, str)));
            return;
        }
        ((C58970a) ((C58970a) f52091a.mo56224b()).mo56372aa(47304)).mo56386p("Already updating DSP models, ingoring call to update.");
    }

    /* renamed from: b */
    public final synchronized void mo23846b(int i, String str, int i2) {
        if (i2 != 0) {
            ((C58970a) ((C58970a) f52091a.mo56224b()).mo56372aa(47303)).mo56386p("Requesting DSP models download.");
            C60856cj.m92911t(C60846c.m92879h(C60922j.m93044g(C60922j.m93045h(((C18359e) this.f52096f.mo27525b()).mo19336b((C29409fd) this.f52094d.mo27525b()), C47810es.m84966f(new C18360f(this, i, str)), C60826bg.f164896a), C47810es.m84963c(new C18361g(this)), (Executor) this.f52097g.mo27525b()), Exception.class, C47810es.m84966f(C18362h.f52083a), (Executor) this.f52097g.mo27525b()), C47810es.m84974n(new C18364j(this, i2, i, str)), C60826bg.f164896a);
        }
    }
}
