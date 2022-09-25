package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140371f;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.C140992n;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.play.unison.binding.C31970as;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31987m;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.podcasts.g.a.z */
/* compiled from: PG */
final class C140364z extends C31978d {

    /* renamed from: a */
    public final C46485f f381294a;

    /* renamed from: b */
    public final C28443m f381295b;

    /* renamed from: c */
    private final C47449e f381296c;

    /* renamed from: d */
    private final ThumbnailView f381297d;

    /* renamed from: e */
    private final View f381298e;

    /* renamed from: j */
    private final C28306ab f381299j;

    /* renamed from: k */
    private final C47770dh f381300k;

    public C140364z(C47449e eVar, C46485f fVar, C28306ab abVar, C28443m mVar, C47770dh dhVar, View view) {
        super(view);
        this.f381296c = eVar;
        this.f381294a = fVar;
        this.f381299j = abVar;
        this.f381295b = mVar;
        this.f381300k = dhVar;
        this.f381297d = (ThumbnailView) view.findViewById(R.id.podcasts_show_image);
        this.f381298e = view.findViewById(R.id.podcasts_new_badge);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C140371f fVar = (C140371f) obj;
        this.f381298e.setVisibility(true != fVar.f381317a.f382045b ? 8 : 0);
        ThumbnailView thumbnailView = this.f381297d;
        C140646b bVar = fVar.f381318b;
        thumbnailView.mo116305b(bVar.f381996b, bVar.f381998d, this.f381296c, bVar.f382003i, C140992n.m228955b(bVar));
        this.f381297d.setContentDescription(fVar.f381318b.f381996b);
        this.f381297d.setOnClickListener(new C47591co(this.f381300k, "Click cover art image", new C140363y(this, fVar)));
        C28306ab abVar = this.f381299j;
        ThumbnailView thumbnailView2 = this.f381297d;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(106742));
        a.mo33858f(C28375ak.m53059a((long) fVar.f381317a.f382044a.f381995a.hashCode()));
        C31970as asVar = (C31970as) ((C31987m) oVar).f85985a;
        asVar.getClass();
        a.mo33858f(C28449s.m53155a(asVar.mo37732a()));
        abVar.mo33802c(thumbnailView2, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37736b() {
        C28306ab.m52929e(this.f381297d);
    }
}
