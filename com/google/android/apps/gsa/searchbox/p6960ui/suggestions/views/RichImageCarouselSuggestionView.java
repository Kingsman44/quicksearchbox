package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.RichImageCarouselSuggestionView */
/* compiled from: PG */
public class RichImageCarouselSuggestionView extends C88795af {

    /* renamed from: a */
    public final Context f240355a;

    /* renamed from: b */
    public SuggestionIconView f240356b;

    /* renamed from: c */
    public View f240357c;

    /* renamed from: d */
    public ViewStub f240358d;

    /* renamed from: e */
    public boolean f240359e;

    /* renamed from: f */
    boolean f240360f;

    /* renamed from: g */
    public final LayoutInflater f240361g;

    /* renamed from: h */
    public Drawable f240362h;

    /* renamed from: i */
    public int f240363i;

    /* renamed from: j */
    public Animator f240364j;

    /* renamed from: k */
    public Animator f240365k;

    /* renamed from: q */
    HorizontalScrollView f240366q;

    /* renamed from: r */
    public LinearLayout f240367r;

    /* renamed from: s */
    public List f240368s;

    /* renamed from: t */
    private TextView f240369t;

    /* renamed from: u */
    private SuggestionIconView f240370u;

    public RichImageCarouselSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240361g = LayoutInflater.from(context);
        this.f240416m = 50;
        this.f240355a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo82341a() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 50;
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        if (i == 0) {
            return this.f240370u;
        }
        if (i == 5 || i == 6) {
            return this.f240356b;
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f240369t.setText(spanned.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        if (this.f240360f) {
            HorizontalScrollView horizontalScrollView = this.f240366q;
            if (horizontalScrollView != null) {
                horizontalScrollView.setVisibility(8);
            }
            this.f240357c.setVisibility(8);
            this.f240360f = false;
        }
        for (SuggestionIconView visibility : this.f240368s) {
            visibility.setVisibility(8);
        }
        HorizontalScrollView horizontalScrollView2 = this.f240366q;
        if (horizontalScrollView2 != null) {
            horizontalScrollView2.scrollTo(0, 0);
        }
        this.f240370u.setVisibility(4);
        this.f240356b.setVisibility(4);
        this.f240359e = false;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.text);
        textView.getClass();
        this.f240369t = textView;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.label_icon);
        suggestionIconView.getClass();
        this.f240370u = suggestionIconView;
        SuggestionIconView suggestionIconView2 = (SuggestionIconView) findViewById(R.id.action_icon);
        suggestionIconView2.getClass();
        this.f240356b = suggestionIconView2;
        View findViewById = findViewById(R.id.suggestion_divider);
        findViewById.getClass();
        this.f240357c = findViewById;
        ViewStub viewStub = (ViewStub) findViewById(R.id.image_carousel_stub);
        viewStub.getClass();
        this.f240358d = viewStub;
        this.f240362h = this.f240355a.getResources().getDrawable(R.drawable.ghost_image_bg);
        this.f240363i = this.f240355a.getResources().getDimensionPixelSize(R.dimen.image_carousel_thumbnail_height);
        this.f240356b.setOnClickListener(new C88796ag(this));
        this.f240356b.setBackground(new RippleDrawable(ColorStateList.valueOf(getResources().getColor(R.color.suggestion_background_pressed)), (Drawable) null, (Drawable) null));
        this.f240368s = new ArrayList();
    }
}
