package com.google.android.apps.search.podcasts.language;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.language.p10577a.C140518c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31989o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.r */
/* compiled from: PG */
public final class C140553r extends C31978d {

    /* renamed from: a */
    private final TextView f381722a;

    public C140553r(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.podcasts_language_list_header);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.p…sts_language_list_header)");
        this.f381722a = (TextView) findViewById;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C140518c cVar = (C140518c) obj;
        C69664n.m101061g(cVar, "viewData");
        this.f381722a.setText(cVar.f381655a);
    }
}
