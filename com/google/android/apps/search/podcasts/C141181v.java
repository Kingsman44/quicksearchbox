package com.google.android.apps.search.podcasts;

import android.content.DialogInterface;
import com.google.android.apps.search.podcasts.p10550b.p10553c.C140049a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.podcasts.v */
/* compiled from: PG */
final class C141181v implements C46852f {

    /* renamed from: a */
    public boolean f383285a = false;

    /* renamed from: b */
    final /* synthetic */ C141182w f383286b;

    public C141181v(C141182w wVar) {
        this.f383286b = wVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C140381h hVar = (C140381h) obj;
        C141182w wVar = this.f383286b;
        C140639m mVar = wVar.f383288b;
        AccountId accountId = wVar.f383302p;
        boolean z = hVar.f381337a;
        int i = C141182w.m229195b(mVar).f115862E;
        boolean z2 = i == 5 || i == 4;
        C141182w.m229196f(mVar, accountId, z, true, z2);
        C141182w.m229196f(mVar, accountId, z, false, z2);
        C140049a aVar = hVar.f381338b;
        if (!this.f383285a && this.f383286b.f383288b.getContext() != null && aVar != null) {
            C141182w wVar2 = this.f383286b;
            wVar2.f383303q.f380622a = null;
            this.f383285a = true;
            C44581b bVar = new C44581b(wVar2.f383288b.getContext(), 0);
            bVar.mo47604w(R.string.podcasts_blocked_cleartext_dialog_title);
            bVar.f1347a.f1326g = this.f383286b.f383288b.getString(R.string.podcasts_blocked_cleartext_dialog_message, aVar.f380620a);
            bVar.mo47601t(R.string.podcasts_blocked_cleartext_dialog_positive_action, new C47752cq(this.f383286b.f383289c, "Open media in browser", new C141179t(this, aVar)));
            bVar.mo47598q(R.string.podcasts_cancel, (DialogInterface.OnClickListener) null);
            bVar.f1347a.f1335p = new C141180u(this);
            bVar.create().show();
            ((C59052c) ((C59052c) C141182w.f383287a.mo56224b()).mo56372aa(41497)).mo56386p("Cleartext error dialog shown.");
        }
    }
}
