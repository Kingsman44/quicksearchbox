package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.content.Intent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111250m;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.c */
/* compiled from: PG */
public final /* synthetic */ class C111258c implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C111262g f309599a;

    public /* synthetic */ C111258c(C111262g gVar) {
        this.f309599a = gVar;
    }

    public final boolean onLongClick(View view) {
        C111262g gVar = this.f309599a;
        C111250m mVar = (C111250m) gVar.f309609b.get(((ViewPager) Objects.requireNonNull(gVar.f309614g)).mo9122a());
        gVar.f309608a.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", gVar.f309608a.getString(R.string.debug_panel_share_msg_subject, new Object[]{mVar.mo99081c()})).putExtra("android.intent.extra.TEXT", gVar.f309608a.getString(R.string.debug_panel_share_msg_body, new Object[]{mVar.mo99080b()})), gVar.f309608a.getString(R.string.debug_panel_tapas_log)).addFlags(268435456));
        return true;
    }
}
