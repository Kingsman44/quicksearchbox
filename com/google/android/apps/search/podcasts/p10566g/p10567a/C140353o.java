package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140368c;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140969a;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140975g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.podcasts.g.a.o */
/* compiled from: PG */
public final class C140353o extends C31978d {
    public C140353o(C47400m mVar, C47770dh dhVar, View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.podcasts_prompt_title);
        TextView textView2 = (TextView) view.findViewById(R.id.podcasts_confirm_button);
        mVar.mo51252a(view.findViewById(R.id.podcasts_close_button), new C140975g(C140969a.DISMISS_PLAY_STORE_CARD));
        mVar.mo51252a((TextView) view.findViewById(R.id.podcasts_cancel_button), new C140975g(C140969a.DISMISS_PLAY_STORE_CARD));
        ViewSwitcher viewSwitcher = (ViewSwitcher) view.findViewById(R.id.podcasts_view_switcher);
        ((TextView) view.findViewById(R.id.podcasts_love_it_button)).setOnClickListener(new C47591co(dhVar, "clicked love it", new C140350l(textView, textView2, viewSwitcher)));
        ((TextView) view.findViewById(R.id.podcasts_could_be_better_button)).setOnClickListener(new C47591co(dhVar, "clicked could be better", new C140351m(textView, textView2, viewSwitcher)));
        mVar.mo51253b(textView2, new C140352n(view, textView));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C140368c cVar = (C140368c) obj;
    }
}
