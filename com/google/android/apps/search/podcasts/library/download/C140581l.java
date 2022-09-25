package com.google.android.apps.search.podcasts.library.download;

import android.support.p033v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.C1877c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.podcasts.library.p10579a.C140559a;
import com.google.android.apps.search.podcasts.p10588n.C140648a;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.download.l */
/* compiled from: PG */
public final class C140581l {

    /* renamed from: a */
    public final DownloadFragment f381789a;

    /* renamed from: b */
    public final C46855i f381790b;

    /* renamed from: c */
    public final C140648a f381791c;

    /* renamed from: d */
    public final C140559a f381792d;

    /* renamed from: e */
    public final C28306ab f381793e;

    /* renamed from: f */
    public final C47770dh f381794f;

    /* renamed from: g */
    public C140952k f381795g;

    /* renamed from: h */
    public C31974aw f381796h;

    /* renamed from: i */
    public final C46852f f381797i = new C140578i(this);

    /* renamed from: j */
    private final C141213d f381798j;

    public C140581l(DownloadFragment downloadFragment, C46855i iVar, C140648a aVar, C140559a aVar2, C28306ab abVar, C141213d dVar, C47770dh dhVar) {
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f381789a = downloadFragment;
        this.f381790b = iVar;
        this.f381791c = aVar;
        this.f381792d = aVar2;
        this.f381793e = abVar;
        this.f381798j = dVar;
        this.f381794f = dhVar;
    }

    /* renamed from: a */
    public final void mo115756a(C140952k kVar) {
        C141252c cVar;
        FullScreenMessageView fullScreenMessageView;
        if (kVar != null) {
            C31974aw awVar = this.f381796h;
            if (awVar != null) {
                awVar.mo37740a(kVar);
            }
            if (kVar.f382708a.isEmpty()) {
                cVar = C141252c.EMPTY;
            } else {
                cVar = C141252c.NONE;
            }
            View view = this.f381789a.getView();
            if (!(view == null || (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_message_layer)) == null)) {
                fullScreenMessageView.mo17754z().mo116270a(cVar);
            }
        }
        this.f381795g = kVar;
    }

    /* renamed from: b */
    public final void mo115757b(View view) {
        List list;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.podcasts_appbar_layout);
        C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
        C141215f.m229224b(appBarLayout);
        Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.podcasts_appbar_header_toolbar);
        toolbar.mo2393g().clear();
        C140952k kVar = this.f381795g;
        if (!(kVar == null || (list = kVar.f382708a) == null || list.isEmpty())) {
            C69664n.m101060f(toolbar, "this");
            Menu g = toolbar.mo2393g();
            g.add(0, R.id.podcasts_remove_all_menu_item, 0, R.string.podcasts_remove_all);
            MenuItem findItem = g.findItem(R.id.podcasts_remove_all_menu_item);
            findItem.setIcon(C1877c.m5125a(toolbar.getContext(), R.drawable.quantum_gm_ic_delete_vd_theme_24));
            findItem.setOnMenuItemClickListener(new C47579cc(this.f381794f, "Open dialog to remove all downloads", new C140573d(this)));
            g.add(0, R.id.podcasts_remove_over_one_week_old_menu_item, 0, this.f381789a.getString(R.string.podcasts_remove_all_days_old, 7));
            MenuItem findItem2 = g.findItem(R.id.podcasts_remove_over_one_week_old_menu_item);
            findItem2.setIcon(C1877c.m5125a(toolbar.getContext(), R.drawable.quantum_gm_ic_delete_vd_theme_24));
            findItem2.setOnMenuItemClickListener(new C47579cc(this.f381794f, "Open dialog to remove downloads over one week old", new C140575f(this)));
            g.add(0, R.id.podcasts_remove_played_menu_item, 0, R.string.podcasts_remove_all_played);
            MenuItem findItem3 = g.findItem(R.id.podcasts_remove_played_menu_item);
            findItem3.setIcon(C1877c.m5125a(toolbar.getContext(), R.drawable.quantum_gm_ic_delete_vd_theme_24));
            findItem3.setOnMenuItemClickListener(new C47579cc(this.f381794f, "Open dialog to remove played downloads", new C140577h(this)));
        }
        C141213d dVar = this.f381798j;
        C69664n.m101060f(toolbar, "this");
        dVar.mo116228c(toolbar);
        toolbar.mo2423x(this.f381789a.getString(R.string.podcasts_downloads));
    }
}
