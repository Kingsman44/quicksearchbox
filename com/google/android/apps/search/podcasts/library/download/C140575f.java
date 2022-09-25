package com.google.android.apps.search.podcasts.library.download;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.tracing.C47752cq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.download.f */
/* compiled from: PG */
final class C140575f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C140581l f381783a;

    public C140575f(C140581l lVar) {
        this.f381783a = lVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "it");
        C44581b bVar = new C44581b(this.f381783a.f381789a.requireContext(), 0);
        bVar.mo47604w(R.string.podcasts_confirm_remove_all_dialog_title);
        bVar.f1347a.f1326g = this.f381783a.f381789a.getString(R.string.podcasts_confirm_remove_all_days_old_dialog_message, 7);
        String string = this.f381783a.f381789a.getString(R.string.podcasts_remove_all_days_old, 7);
        C140581l lVar = this.f381783a;
        bVar.mo47602u(string, new C47752cq(lVar.f381794f, "Remove downloads over one week old", new C140574e(lVar)));
        bVar.mo47598q(R.string.podcasts_cancel, (DialogInterface.OnClickListener) null);
        bVar.create().show();
        return true;
    }
}
