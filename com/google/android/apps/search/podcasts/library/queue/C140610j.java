package com.google.android.apps.search.podcasts.library.queue;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.tracing.C47752cq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.queue.j */
/* compiled from: PG */
final class C140610j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C140607h f381882a;

    public C140610j(C140607h hVar) {
        this.f381882a = hVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "it");
        C140607h hVar = this.f381882a;
        C44581b bVar = new C44581b(hVar.f381866b.requireContext(), 0);
        bVar.mo47604w(R.string.podcasts_confirm_clear_queue_dialog_title);
        bVar.mo47597p(R.string.podcasts_confirm_clear_queue_dialog_message);
        bVar.mo47601t(R.string.podcasts_clear_your_queue, new C47752cq(hVar.f381872h, "Clear queue", new C140612l(hVar)));
        bVar.mo47598q(R.string.podcasts_cancel, (DialogInterface.OnClickListener) null);
        bVar.create().show();
        return true;
    }
}
