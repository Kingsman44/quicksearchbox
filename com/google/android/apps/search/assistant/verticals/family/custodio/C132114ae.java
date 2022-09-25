package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132363y;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ae */
/* compiled from: PG */
public final /* synthetic */ class C132114ae implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132363y.C132365a f360633a;

    public /* synthetic */ C132114ae(C132363y.C132365a aVar) {
        this.f360633a = aVar;
    }

    public final void onClick(View view) {
        C132363y.C132365a aVar = this.f360633a;
        Bundle a = C132361w.m215129a(C132363y.this.f361309c);
        a.putBoolean("custodio_is_from_device_list", true);
        C132363y yVar = C132363y.this;
        yVar.f361313g.mo50482c(yVar.f361308b).mo50508d(R.id.assistant_custodio_device_list_fragment_link_button_action, a);
    }
}
