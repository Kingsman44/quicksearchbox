package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.am */
/* compiled from: PG */
final class C88802am extends C90953s {

    /* renamed from: a */
    final /* synthetic */ int f240422a;

    /* renamed from: b */
    final /* synthetic */ int f240423b;

    /* renamed from: c */
    final /* synthetic */ int f240424c;

    /* renamed from: d */
    final /* synthetic */ C88821e f240425d;

    /* renamed from: e */
    final /* synthetic */ int f240426e;

    /* renamed from: f */
    final /* synthetic */ int f240427f;

    /* renamed from: g */
    final /* synthetic */ SuggestionIconView f240428g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88802am(SuggestionIconView suggestionIconView, int i, int i2, int i3, C88821e eVar, int i4, int i5) {
        super("sb.u.IconView");
        this.f240428g = suggestionIconView;
        this.f240422a = i;
        this.f240423b = i2;
        this.f240424c = i3;
        this.f240425d = eVar;
        this.f240426e = i4;
        this.f240427f = i5;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        SuggestionIconView suggestionIconView = this.f240428g;
        if (suggestionIconView.f240382i != null && suggestionIconView.f240380g == this.f240422a) {
            C88727aj ajVar = new C88727aj(this.f240428g.getContext());
            if (drawable != null || this.f240423b == 0) {
                if (this.f240426e != 0) {
                    Drawable drawable2 = this.f240428g.getContext().getResources().getDrawable(this.f240426e);
                    if (drawable2 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable2;
                        bitmapDrawable.setAlpha(222);
                        bitmapDrawable.setColorFilter(0, PorterDuff.Mode.OVERLAY);
                        bitmapDrawable.setGravity(17);
                        drawable = new LayerDrawable(new Drawable[]{drawable, bitmapDrawable});
                    }
                }
                if (!(drawable instanceof BitmapDrawable) || drawable.getIntrinsicWidth() == drawable.getIntrinsicHeight() || this.f240427f == 0) {
                    C88821e eVar = this.f240425d;
                    eVar.f240478b = null;
                    eVar.mo82610c(drawable, (Uri) null);
                    return;
                }
                C88821e eVar2 = this.f240425d;
                LayerDrawable k = ajVar.mo82461k((BitmapDrawable) drawable, -1, false, Math.max(drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth()));
                eVar2.f240478b = null;
                eVar2.mo82610c(k, (Uri) null);
                return;
            }
            this.f240428g.setCropToPadding(false);
            int i = this.f240424c;
            if (i == 0) {
                this.f240428g.setColorFilter(SuggestionIconView.f240375b, PorterDuff.Mode.SRC_IN);
                this.f240428g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                C88821e eVar3 = this.f240425d;
                Drawable drawable3 = this.f240428g.getContext().getResources().getDrawable(this.f240423b);
                eVar3.f240478b = null;
                eVar3.mo82610c(drawable3, (Uri) null);
                return;
            }
            C88821e eVar4 = this.f240425d;
            LayerDrawable i2 = ajVar.mo82459i(this.f240423b, i, false, 46);
            eVar4.f240478b = null;
            eVar4.mo82610c(i2, (Uri) null);
        }
    }
}
