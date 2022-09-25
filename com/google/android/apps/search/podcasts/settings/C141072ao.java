package com.google.android.apps.search.podcasts.settings;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.ao */
/* compiled from: PG */
public final class C141072ao extends C0640fb {

    /* renamed from: a */
    private final Context f382994a;

    /* renamed from: b */
    private final C47449e f382995b;

    /* renamed from: c */
    private final C47400m f382996c;

    /* renamed from: d */
    private final C69626l f382997d;

    /* renamed from: e */
    private final C69626l f382998e;

    /* renamed from: f */
    private final List f382999f = new ArrayList();

    public C141072ao(Context context, C47449e eVar, C47400m mVar, C69626l lVar, C69626l lVar2) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(mVar, "events");
        this.f382994a = context;
        this.f382995b = eVar;
        this.f382996c = mVar;
        this.f382997d = lVar;
        this.f382998e = lVar2;
    }

    /* renamed from: a */
    public final void mo116129a(List list) {
        if (list.size() == this.f382999f.size()) {
            int size = this.f382999f.size();
            for (int i = 0; i < size; i++) {
                C140646b bVar = (C140646b) list.get(i);
                if (!C69664n.m101066l((C140646b) this.f382999f.get(i), bVar)) {
                    this.f382999f.set(i, bVar);
                    notifyItemChanged(i, bVar);
                }
            }
            return;
        }
        this.f382999f.clear();
        this.f382999f.addAll(list);
        this.mObservable.mo2879a();
    }

    public final int getItemCount() {
        return this.f382999f.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C141071an anVar = (C141071an) ghVar;
        C69664n.m101061g(anVar, "holder");
        C140646b bVar = (C140646b) this.f382999f.get(i);
        boolean booleanValue = ((Boolean) this.f382998e.mo5761a(bVar)).booleanValue();
        C47388b bVar2 = (C47388b) this.f382997d.mo5761a(bVar);
        C69664n.m101061g(bVar, "show");
        C69664n.m101061g(bVar2, "onClickEvent");
        anVar.f382991e.setText(bVar.f381996b);
        anVar.f382990d.setText(bVar.f381997c);
        ThumbnailView thumbnailView = anVar.f382992f;
        String str = bVar.f381996b;
        C69664n.m101060f(str, "show.title");
        String str2 = bVar.f381998d;
        C69664n.m101060f(str2, "show.thumbnailUrl");
        ThumbnailView.m229315d(thumbnailView, str, str2, anVar.f382987a, bVar.f382003i, false, (String) null, 48);
        anVar.f382993g.setChecked(booleanValue);
        anVar.f382988b.mo51252a(anVar.f382989c, bVar2);
        anVar.f382988b.mo51252a(anVar.f382993g, bVar2);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f382994a).inflate(R.layout.podcasts_toggle_show_setting, viewGroup, false);
        C69664n.m101060f(inflate, "from(context)\n        .i… /*attachToRoot=*/ false)");
        return new C141071an(inflate, this.f382995b, this.f382996c);
    }
}
