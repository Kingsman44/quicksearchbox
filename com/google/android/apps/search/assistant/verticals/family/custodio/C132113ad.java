package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.support.p033v7.widget.C0632eu;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132363y;
import com.google.android.googlequicksearchbox.R;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8649ba;
import com.google.p427am.p432b.p433a.C8675e;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ad */
/* compiled from: PG */
public final /* synthetic */ class C132113ad implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132363y.C132365a f360629a;

    /* renamed from: b */
    public final /* synthetic */ Button f360630b;

    /* renamed from: c */
    public final /* synthetic */ C8675e f360631c;

    /* renamed from: d */
    public final /* synthetic */ C8649ba f360632d;

    public /* synthetic */ C132113ad(C132363y.C132365a aVar, Button button, C8675e eVar, C8649ba baVar) {
        this.f360629a = aVar;
        this.f360630b = button;
        this.f360631c = eVar;
        this.f360632d = baVar;
    }

    public final void onClick(View view) {
        C132363y.C132365a aVar = this.f360629a;
        Button button = this.f360630b;
        C8675e eVar = this.f360631c;
        C8649ba baVar = this.f360632d;
        Context requireContext = C132363y.this.f361308b.requireContext();
        C8628ag agVar = eVar.f29994c;
        if (agVar == null) {
            agVar = C8628ag.f29890g;
        }
        String str = agVar.f29893b;
        C132111ab abVar = new C132111ab(aVar, baVar, eVar);
        C0632eu euVar = new C0632eu(requireContext, button, 0);
        euVar.mo2856a().inflate(R.menu.assistant_custodio_device_list_menu, euVar.f2394a);
        euVar.f2394a.findItem(R.id.assistant_custodio_device_list_menu_unlink_device).setTitle(requireContext.getString(R.string.assistant_custodio_device_list_menu_unlink_device, new Object[]{str}));
        euVar.f2395b.mo1539f();
        euVar.f2396c = abVar;
    }
}
