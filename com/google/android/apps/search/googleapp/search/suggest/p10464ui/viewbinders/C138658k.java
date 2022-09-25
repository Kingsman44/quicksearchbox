package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138583h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.k */
/* compiled from: PG */
public final class C138658k {

    /* renamed from: a */
    public final CoreSuggestionView f377138a;

    /* renamed from: b */
    public final C47449e f377139b;

    /* renamed from: c */
    public final C138631aj f377140c;

    /* renamed from: d */
    public final TextView f377141d;

    /* renamed from: e */
    public final TextView f377142e;

    /* renamed from: f */
    public final ImageView f377143f;

    /* renamed from: g */
    public final ImageView f377144g;

    /* renamed from: h */
    public final ImageView f377145h;

    /* renamed from: i */
    public final boolean f377146i;

    /* renamed from: j */
    public View f377147j;

    /* renamed from: k */
    public ViewGroup f377148k;

    /* renamed from: l */
    private final Context f377149l;

    /* renamed from: m */
    private final C138668u f377150m;

    public C138658k(Context context, CoreSuggestionView coreSuggestionView, C47449e eVar, C138631aj ajVar, C138668u uVar, boolean z) {
        this.f377149l = context;
        this.f377138a = coreSuggestionView;
        this.f377139b = eVar;
        this.f377140c = ajVar;
        this.f377150m = uVar;
        this.f377146i = z;
        this.f377141d = (TextView) coreSuggestionView.findViewById(16908308);
        this.f377142e = (TextView) coreSuggestionView.findViewById(16908309);
        this.f377143f = (ImageView) coreSuggestionView.findViewById(R.id.googleapp_start_icon);
        this.f377144g = (ImageView) coreSuggestionView.findViewById(R.id.googleapp_primary_action_icon);
        this.f377145h = (ImageView) coreSuggestionView.findViewById(R.id.googleapp_inner_icon);
        this.f377147j = coreSuggestionView.findViewById(R.id.googleapp_suggestion_enhancements_container);
    }

    /* renamed from: a */
    public final void mo114448a(String str, int i) {
        this.f377140c.mo114436j(this.f377139b, this.f377144g, str, i);
    }

    /* renamed from: b */
    public final void mo114449b(String str) {
        this.f377138a.findViewById(R.id.googleapp_core_suggestion).setContentDescription(str);
    }

    /* renamed from: c */
    public final void mo114450c(C138030av avVar, List list) {
        if (!list.isEmpty()) {
            View view = this.f377147j;
            if (view instanceof ViewStub) {
                this.f377147j = ((ViewStub) view).inflate();
            }
            this.f377147j.setVisibility(0);
            ViewGroup viewGroup = (ViewGroup) this.f377147j.findViewById(R.id.googleapp_suggestion_enhancements);
            this.f377148k = viewGroup;
            this.f377150m.mo114458a(viewGroup, avVar, list);
        }
    }

    /* renamed from: d */
    public final void mo114451d(String str) {
        C138631aj ajVar = this.f377140c;
        ImageView imageView = this.f377144g;
        C138631aj.m225138o(imageView, R.drawable.googleapp_query_builder_arrow);
        imageView.setContentDescription(ajVar.f377026a.getString(R.string.ga_accessibility_query_refinement, new Object[]{str}));
        imageView.setClickable(true);
        ajVar.f377027b.mo51252a(imageView, new C138583h(String.valueOf(str).concat(" ")));
    }

    /* renamed from: e */
    public final void mo114452e(int i) {
        C138631aj.m225138o(this.f377143f, i);
        this.f377143f.setColorFilter(C1878d.m5128a(this.f377149l, true != this.f377146i ? R.color.agsa_color_icon_display : R.color.googleapp_pixel_suggestion_icon));
    }

    /* renamed from: f */
    public final void mo114453f(CharSequence charSequence, int i) {
        if (!TextUtils.isEmpty(charSequence)) {
            C138631aj.m225139p(this.f377142e, charSequence, i);
        }
    }
}
