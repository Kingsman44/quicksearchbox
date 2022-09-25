package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.C140666ao;
import com.google.android.apps.search.podcasts.p10601r.C140992n;
import com.google.android.apps.search.podcasts.show.C141121af;
import com.google.android.apps.search.podcasts.show.C141122ag;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.k */
/* compiled from: PG */
public final class C140630k extends C0640fb {

    /* renamed from: a */
    public List f381937a;

    /* renamed from: b */
    private final C46485f f381938b;

    /* renamed from: c */
    private final C47449e f381939c;

    public C140630k(C46485f fVar, C47449e eVar) {
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(eVar, "imageManager");
        this.f381938b = fVar;
        this.f381939c = eVar;
        C58485gu m = C58485gu.m89845m();
        C69664n.m101060f(m, "of()");
        this.f381937a = m;
    }

    public final int getItemCount() {
        return this.f381937a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C140628i iVar = (C140628i) ghVar;
        C69664n.m101061g(iVar, "viewHolder");
        C140666ao aoVar = (C140666ao) this.f381937a.get(i);
        iVar.f381932a.setText(aoVar.f382044a.f381996b);
        iVar.f381934c.setVisibility(0);
        iVar.f381934c.setOnClickListener(this.f381938b.mo50480a(R.id.podcasts_action_to_show_subscription_settings, C46490k.m82868a(aoVar.f382044a).mo50504d(), "Open show subscription settings dialog"));
        ThumbnailView thumbnailView = iVar.f381933b;
        String str = aoVar.f382044a.f381996b;
        C69664n.m101060f(str, "subscription.showItem.title");
        String str2 = aoVar.f382044a.f381998d;
        C69664n.m101060f(str2, "subscription.showItem.thumbnailUrl");
        C47449e eVar = this.f381939c;
        C140646b bVar = aoVar.f382044a;
        ThumbnailView.m229315d(thumbnailView, str, str2, eVar, bVar.f382003i, C140992n.m228955b(bVar), (String) null, 32);
        View view = iVar.itemView;
        C46485f fVar = this.f381938b;
        C141121af afVar = (C141121af) C141122ag.f383149c.createBuilder();
        String str3 = aoVar.f382044a.f381995a;
        afVar.copyOnWrite();
        str3.getClass();
        ((C141122ag) afVar.instance).f383151a = str3;
        view.setOnClickListener(fVar.mo50480a(R.id.podcasts_action_to_show, C46490k.m82868a(afVar.build()).mo50504d(), "Open show page"));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.podcasts_show_tile, viewGroup, false);
        C69664n.m101060f(inflate, "view");
        return new C140628i(inflate);
    }
}
