package com.google.android.apps.search.podcasts.library.download;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.tracing.C47752cq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.download.d */
/* compiled from: PG */
final class C140573d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C140581l f381781a;

    public C140573d(C140581l lVar) {
        this.f381781a = lVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "it");
        C44581b bVar = new C44581b(this.f381781a.f381789a.requireContext(), 0);
        bVar.mo47604w(R.string.podcasts_confirm_remove_all_dialog_title);
        bVar.mo47597p(R.string.podcasts_confirm_remove_all_dialog_message);
        C140581l lVar = this.f381781a;
        bVar.mo47601t(R.string.podcasts_remove_all, new C47752cq(lVar.f381794f, "Remove all downloads", new C140572c(lVar)));
        bVar.mo47598q(R.string.podcasts_cancel, (DialogInterface.OnClickListener) null);
        bVar.create().show();
        return true;
    }
}
