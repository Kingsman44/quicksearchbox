package com.google.android.apps.search.podcasts.search;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.search.p10609a.C141000a;
import com.google.android.apps.search.podcasts.search.p10610b.C141008f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.p4017at.p4082j.p4083a.C54406de;
import com.google.p4017at.p4082j.p4083a.C54407df;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.search.n */
/* compiled from: PG */
public final class C141022n extends C31978d {

    /* renamed from: a */
    public final SearchFragment f382842a;

    /* renamed from: b */
    public final C46485f f382843b;

    /* renamed from: c */
    public final C140385d f382844c;

    /* renamed from: d */
    public final C141008f f382845d;

    /* renamed from: e */
    public final Executor f382846e;

    /* renamed from: j */
    private final C47770dh f382847j;

    /* renamed from: k */
    private final TextView f382848k;

    /* renamed from: l */
    private final ImageView f382849l;

    /* renamed from: m */
    private final ImageView f382850m;

    public C141022n(View view, SearchFragment searchFragment, C47770dh dhVar, C46485f fVar, C140385d dVar, C141008f fVar2, Executor executor) {
        super(view);
        this.f382842a = searchFragment;
        this.f382847j = dhVar;
        this.f382843b = fVar;
        this.f382844c = dVar;
        this.f382845d = fVar2;
        this.f382846e = executor;
        View findViewById = view.findViewById(R.id.podcasts_search_suggest_item_suggested_query_text);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.p…tem_suggested_query_text)");
        this.f382848k = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.podcasts_search_suggest_item_icon);
        C69664n.m101060f(findViewById2, "view.findViewById(R.id.p…search_suggest_item_icon)");
        this.f382849l = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.podcasts_search_suggest_item_clear);
        C69664n.m101060f(findViewById3, "view.findViewById(R.id.p…earch_suggest_item_clear)");
        this.f382850m = (ImageView) findViewById3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C141000a aVar = (C141000a) obj;
        C69664n.m101061g(aVar, "viewData");
        C54407df dfVar = aVar.f382801a;
        int b = C54406de.m87381b(dfVar.f142898b);
        int i = 0;
        boolean z = b != 0 && b == 4;
        this.f382848k.setText(dfVar.f142897a);
        this.f382849l.setImageDrawable(C1877c.m5125a(this.f382842a.requireContext(), z ? R.drawable.quantum_gm_ic_history_vd_theme_24 : R.drawable.quantum_gm_ic_search_vd_theme_24));
        ImageView imageView = this.f382850m;
        if (true != z) {
            i = 8;
        }
        imageView.setVisibility(i);
        imageView.setOnClickListener(new C47591co(this.f382847j, "Search suggest clear button", new C141020l(this, aVar)));
        this.f85977f.setOnClickListener(new C47591co(this.f382847j, "Search suggest item clicked", new C141021m(this, aVar)));
    }
}
