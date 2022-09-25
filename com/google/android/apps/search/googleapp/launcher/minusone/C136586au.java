package com.google.android.apps.search.googleapp.launcher.minusone;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10347e.C136463a;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.au */
/* compiled from: PG */
public final class C136586au {

    /* renamed from: a */
    public final C136463a f371829a;

    /* renamed from: b */
    public final C89859i f371830b;

    /* renamed from: c */
    public final C139708c f371831c;

    /* renamed from: d */
    private final C47770dh f371832d;

    /* renamed from: e */
    private final C137419h f371833e;

    /* renamed from: f */
    private final boolean f371834f;

    public C136586au(C136463a aVar, C47770dh dhVar, C89859i iVar, C139708c cVar, C137419h hVar, boolean z) {
        this.f371829a = aVar;
        this.f371832d = dhVar;
        this.f371830b = iVar;
        this.f371831c = cVar;
        this.f371833e = hVar;
        this.f371834f = z;
    }

    /* renamed from: a */
    public final void mo113253a(View view, Fragment fragment, boolean z) {
        if (view != null) {
            this.f371829a.mo113061a(114273, view);
            view.setOnClickListener(new C47591co(this.f371832d, "Minusone Search box tapped", new C136585at(this, fragment)));
            if (z) {
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.googleapp_minus_one_search_box_elevation);
                view.setBackgroundResource(R.drawable.googleapp_minus_one_search_box_background_no_stroke);
                view.setElevation((float) dimensionPixelSize);
            }
        }
    }

    /* renamed from: b */
    public final void mo113254b(View view, Fragment fragment) {
        if (view != null) {
            this.f371829a.mo113061a(114274, view);
            view.setOnClickListener(new C47591co(this.f371832d, "Minusone Search box mic icon tapped", new C136584as(this, fragment)));
        }
    }

    /* renamed from: c */
    public final void mo113255c(Optional optional, Optional optional2, Fragment fragment) {
        Intent intent = new Intent();
        if (!this.f371833e.mo113716a() || !this.f371834f) {
            intent.setPackage("com.google.android.googlequicksearchbox");
            intent.putExtra("source", "and.gsa.tng.minus1");
            if (optional.isPresent()) {
                intent.setAction("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
                intent.putExtra("query", (String) optional.get());
                if (optional2.isPresent()) {
                    C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                    String str = (String) optional.get();
                    eVar.copyOnWrite();
                    C137418g gVar = (C137418g) eVar.instance;
                    str.getClass();
                    gVar.f373769a |= 1;
                    gVar.f373770b = str;
                    eVar.mo113713a((Map) optional2.get());
                    intent.putExtra("search_query_options", ((C137418g) eVar.build()).toByteArray());
                }
            } else {
                intent.setAction("android.search.action.GLOBAL_SEARCH");
            }
        } else {
            C137416e eVar2 = (C137416e) C137418g.f373767r.createBuilder();
            Objects.requireNonNull(eVar2);
            optional.ifPresent(new C136582aq(eVar2));
            Objects.requireNonNull(eVar2);
            optional2.ifPresent(new C136583ar(eVar2));
            eVar2.copyOnWrite();
            C137418g gVar2 = (C137418g) eVar2.instance;
            gVar2.f373779k = 5;
            gVar2.f373769a |= 512;
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.SEARCH);
            l.mo112775j(Optional.m71637of((C137418g) eVar2.build()));
            C136127h.m221196a(intent, l.mo112766a());
        }
        C47709i.m84861a(fragment, intent);
    }
}
