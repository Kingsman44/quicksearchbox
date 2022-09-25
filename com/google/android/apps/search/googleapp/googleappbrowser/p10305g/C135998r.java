package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.web.profile.C44069d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import java.util.EnumSet;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.r */
/* compiled from: PG */
public final /* synthetic */ class C135998r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C135999s f370385a;

    public /* synthetic */ C135998r(C135999s sVar) {
        this.f370385a = sVar;
    }

    public final void onClick(View view) {
        C135999s sVar = this.f370385a;
        sVar.f370389d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        EnumSet<E> noneOf = EnumSet.noneOf(C44069d.class);
        if (sVar.f370394i.f370297c) {
            noneOf.add(C44069d.COOKIES_AND_SITE_DATA);
        }
        if (sVar.f370394i.f370296b) {
            noneOf.add(C44069d.CACHE);
        }
        C46439e eVar = sVar.f370392g;
        C46438d b = C46438d.m82810b(sVar.f370391f.mo46483a(noneOf));
        eVar.mo50428h(b.f121541a, (Object) null, sVar.f370396k);
        Dialog requireDialog = sVar.f370393h.requireDialog();
        View inflate = sVar.f370393h.getLayoutInflater().inflate(R.layout.googleapp_browser_settings_cleardata_dialog_clearing_in_progress, (ViewGroup) null);
        sVar.mo112675b(inflate, 150042);
        requireDialog.setContentView(inflate);
    }
}
