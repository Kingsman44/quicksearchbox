package com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs.d */
/* compiled from: PG */
public final /* synthetic */ class C114763d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ AgendaHubActivity f318479a;

    public /* synthetic */ C114763d(AgendaHubActivity agendaHubActivity) {
        this.f318479a = agendaHubActivity;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        AgendaHubActivity agendaHubActivity = this.f318479a;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) AgendaHubActivity.f318464j.mo56226d()).mo56372aa(29357)).mo56386p("#createContentViewAsync: Unable to get ZeroStateResponse.");
        agendaHubActivity.f318472r.setVisibility(8);
        agendaHubActivity.findViewById(R.id.empty_agenda).setVisibility(0);
    }
}
