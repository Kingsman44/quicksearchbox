package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.v */
/* compiled from: PG */
public final class C88838v extends C88795af {

    /* renamed from: a */
    public final Context f240503a;

    /* renamed from: b */
    public final RemoteViews f240504b;

    /* renamed from: c */
    public View f240505c;

    /* renamed from: d */
    public ImageView f240506d;

    /* renamed from: e */
    public C88821e f240507e;

    /* renamed from: f */
    public boolean f240508f;

    /* renamed from: g */
    public final int f240509g;

    /* renamed from: h */
    public final int f240510h;

    /* renamed from: i */
    public int f240511i;

    /* renamed from: j */
    public int f240512j;

    /* renamed from: k */
    public boolean f240513k;

    /* renamed from: q */
    private final int f240514q;

    /* renamed from: r */
    private final int f240515r;

    public C88838v(Context context, RemoteViews remoteViews, int i, int i2, int i3, int i4) {
        super(context, (AttributeSet) null);
        this.f240416m = 43;
        this.f240503a = context;
        this.f240504b = remoteViews.clone();
        this.f240514q = i;
        this.f240515r = i2;
        this.f240509g = i3;
        this.f240510h = i4;
        this.f240511i = i3;
        this.f240512j = i4;
        mo82582o();
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 43;
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f240504b.setTextViewText(16908310, spanned);
        this.f240504b.setTextColor(16908310, this.f240503a.getResources().getColor(R.color.agsa_color_custom_suggestion_on_surface_variant));
        this.f240504b.reapply(this.f240503a, this.f240505c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hO */
    public final int mo82581hO() {
        return mo82583q();
    }

    /* renamed from: n */
    public final void mo82618n(String str, boolean z, int i, C88705f fVar) {
        this.f240508f = z;
        int i2 = i + i;
        this.f240511i = this.f240509g - i2;
        this.f240512j = this.f240510h - i2;
        if (this.f240507e == null) {
            this.f240507e = new C88821e(this.f240506d, new C88837u(this));
        }
        this.f240507e.mo82609b(str, (String) null, fVar, this.f240513k);
        this.f240513k = false;
        this.f240504b.reapply(this.f240503a, this.f240505c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo82582o() {
        super.mo82582o();
        View apply = this.f240504b.apply(this.f240503a, this);
        this.f240505c = apply;
        apply.getLayoutParams().width = this.f240514q;
        this.f240505c.getLayoutParams().height = this.f240515r;
        addView(this.f240505c);
        this.f240506d = (ImageView) findViewById(16908294);
    }

    /* renamed from: p */
    public final boolean mo82619p(Bitmap bitmap) {
        if (this.f240511i == 0 || this.f240512j == 0) {
            return false;
        }
        return (bitmap.getWidth() == this.f240511i && bitmap.getHeight() == this.f240512j) ? false : true;
    }
}
