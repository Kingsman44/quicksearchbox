package com.google.android.apps.search.podcasts.widgets.p10620b;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.C140992n;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141264b;
import com.google.android.apps.search.podcasts.widgets.subscribebutton.C141271d;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58837ba;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.podcasts.widgets.b.h */
/* compiled from: PG */
public final class C141202h extends C0640fb {

    /* renamed from: a */
    private final C141206l f383360a;

    /* renamed from: b */
    private final C141204j f383361b;

    /* renamed from: c */
    private final List f383362c;

    /* renamed from: d */
    private final C46496q f383363d;

    /* renamed from: e */
    private final Runnable f383364e;

    /* renamed from: f */
    private final boolean f383365f;

    public C141202h(C141206l lVar, C141204j jVar, List list, C46496q qVar, Runnable runnable) {
        this.f383361b = jVar;
        this.f383360a = lVar;
        this.f383362c = list;
        this.f383363d = qVar;
        this.f383364e = runnable;
        this.f383365f = Collection.EL.stream(list).anyMatch(C141196b.f383341a);
    }

    public final int getItemCount() {
        return this.f383362c.size();
    }

    public final int getItemViewType(int i) {
        return ((C141207m) this.f383362c.get(i)).mo116219a();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C141207m mVar = (C141207m) this.f383362c.get(i);
        if (ghVar instanceof C141201g) {
            C141201g gVar = (C141201g) ghVar;
            C141209o oVar = (C141209o) mVar;
            gVar.f383357e.setText(oVar.f383377a.f381996b);
            gVar.f383358f.setText(oVar.f383377a.f381997c);
            ThumbnailView thumbnailView = gVar.f383359g;
            C140646b bVar = oVar.f383377a;
            thumbnailView.mo116305b(bVar.f381996b, bVar.f381998d, gVar.f383354b, bVar.f382003i, C140992n.m228955b(bVar));
            gVar.itemView.setOnClickListener(new C141200f(gVar, oVar));
            gVar.f383356d.mo116292a(oVar.f383377a);
        } else if (ghVar instanceof C141199e) {
            ((TextView) ((C141199e) ghVar).itemView.findViewById(R.id.podcasts_actions_bottom_sheet_title)).setText(((C141208n) mVar).f383376a);
        } else if (ghVar instanceof C141198d) {
            C141198d dVar = (C141198d) ghVar;
            C141195a aVar = (C141195a) mVar;
            Runnable runnable = this.f383364e;
            if (aVar.f383335a == 0 || dVar.f383345a.getVisibility() != 0) {
                dVar.f383345a.setImageDrawable((Drawable) null);
            } else {
                dVar.f383345a.setImageResource(aVar.f383335a);
                ImageView imageView = dVar.f383345a;
                imageView.setColorFilter(C141264b.m229297a(imageView.getContext(), aVar.f383336b));
            }
            dVar.f383346b.setText(aVar.f383337c);
            if (!C58837ba.m90859h(aVar.f383338d)) {
                dVar.f383346b.setContentDescription(aVar.f383338d);
            }
            Integer num = aVar.f383340f;
            if (num != null) {
                dVar.f383350f.mo33802c(dVar.itemView, dVar.f383349e.mo33805a(C28427h.m53115a(num.intValue())));
            }
            dVar.itemView.setOnClickListener(new C47591co(dVar.f383347c, "Click action item", new C141197c(dVar, aVar, runnable)));
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.podcasts_bottom_sheet_show_header_item, viewGroup, false);
            C141206l lVar = this.f383360a;
            C46496q qVar = this.f383363d;
            C47770dh dhVar = (C47770dh) lVar.f383373a.mo17428b();
            dhVar.getClass();
            C47449e eVar = (C47449e) lVar.f383374b.mo17428b();
            eVar.getClass();
            C141271d dVar = (C141271d) lVar.f383375c.mo17428b();
            dVar.getClass();
            inflate.getClass();
            return new C141201g(dhVar, eVar, dVar, qVar, inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.podcasts_bottom_sheet_action_item, viewGroup, false);
            C141204j jVar = this.f383361b;
            boolean z = this.f383365f;
            C47770dh dhVar2 = (C47770dh) jVar.f383369a.mo17428b();
            dhVar2.getClass();
            C28443m mVar = (C28443m) jVar.f383370b.mo17428b();
            mVar.getClass();
            C28310af afVar = (C28310af) jVar.f383371c.mo17428b();
            afVar.getClass();
            C28306ab abVar = (C28306ab) jVar.f383372d.mo17428b();
            abVar.getClass();
            inflate2.getClass();
            return new C141198d(dhVar2, mVar, afVar, abVar, inflate2, z);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.podcasts_bottom_sheet_actions_title, viewGroup, false);
            inflate3.getClass();
            return new C141199e(inflate3);
        }
    }
}
