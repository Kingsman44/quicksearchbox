package com.google.android.libraries.search.video.p3196f;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.search.video.lightbox.C41540s;
import com.google.android.libraries.search.video.p3198ui.VideoFrameLayout;
import com.google.android.libraries.search.video.players.C41591v;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.base.C58837ba;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;

/* renamed from: com.google.android.libraries.search.video.f.k */
/* compiled from: PG */
public final class C41517k implements C41513g, C41591v, C41510d {

    /* renamed from: a */
    public static final Uri f108460a = Uri.parse("https://www.gstatic.com/discover/images/play_button_48_48.png");

    /* renamed from: A */
    C28439i f108461A;

    /* renamed from: B */
    C28439i f108462B;

    /* renamed from: C */
    public C41511e f108463C;

    /* renamed from: D */
    public C41592w f108464D;

    /* renamed from: E */
    public C57143b f108465E;

    /* renamed from: F */
    public String f108466F = BuildConfig.FLAVOR;

    /* renamed from: G */
    public boolean f108467G;

    /* renamed from: H */
    public boolean f108468H;

    /* renamed from: b */
    public final Fragment f108469b;

    /* renamed from: c */
    public final C47449e f108470c;

    /* renamed from: d */
    public final ViewGroup f108471d;

    /* renamed from: e */
    public final C28310af f108472e;

    /* renamed from: f */
    public final C28463g f108473f;

    /* renamed from: g */
    public final C28443m f108474g;

    /* renamed from: h */
    public final AccountId f108475h;

    /* renamed from: i */
    public final C41540s f108476i;

    /* renamed from: j */
    public final C41512f f108477j;

    /* renamed from: k */
    public VideoFrameLayout f108478k;

    /* renamed from: l */
    public View f108479l;

    /* renamed from: m */
    public View f108480m;

    /* renamed from: n */
    public ImageView f108481n;

    /* renamed from: o */
    public ImageView f108482o;

    /* renamed from: p */
    public View f108483p;

    /* renamed from: q */
    public View f108484q;

    /* renamed from: r */
    public View f108485r;

    /* renamed from: s */
    public TextView f108486s;

    /* renamed from: t */
    public TextView f108487t;

    /* renamed from: u */
    public TextView f108488u;

    /* renamed from: v */
    public View f108489v;

    /* renamed from: w */
    public View f108490w;

    /* renamed from: x */
    public C28439i f108491x;

    /* renamed from: y */
    public C28439i f108492y;

    /* renamed from: z */
    public C28439i f108493z;

    public C41517k(Fragment fragment, C47449e eVar, C28310af afVar, C28463g gVar, C28443m mVar, AccountId accountId, C41540s sVar, C41512f fVar, ViewGroup viewGroup) {
        this.f108469b = fragment;
        this.f108470c = eVar;
        this.f108472e = afVar;
        this.f108473f = gVar;
        this.f108474g = mVar;
        this.f108475h = accountId;
        this.f108476i = sVar;
        this.f108477j = fVar;
        this.f108471d = viewGroup;
    }

    /* renamed from: a */
    public final void mo42106a(C41592w wVar, int i, int i2) {
        mo44045d(i);
        C41511e eVar = this.f108463C;
        if (eVar != null) {
            eVar.mo44038d(i);
        }
    }

    /* renamed from: b */
    public final void mo44040b() {
        C41592w wVar = this.f108464D;
        if (wVar != null) {
            wVar.mo44089l(this);
        }
        C28439i iVar = this.f108491x;
        if (iVar != null) {
            this.f108473f.mo33921e(iVar);
            this.f108473f.mo33922f();
        }
        C41511e eVar = this.f108463C;
        if (eVar != null) {
            eVar.mo44037c();
        }
    }

    /* renamed from: c */
    public final void mo44044c(C28439i iVar) {
        View view = this.f108489v;
        if (view != null) {
            view.setVisibility(8);
        }
        C41592w wVar = this.f108464D;
        if (wVar != null) {
            wVar.mo44093p();
        }
        if (iVar != null) {
            this.f108474g.mo33853c(C28442l.m53142h().mo33894a(), iVar);
        }
    }

    /* renamed from: d */
    public final void mo44045d(int i) {
        Drawable[] compoundDrawablesRelative;
        TextView textView;
        View view;
        View view2;
        TextView textView2;
        View view3;
        TextView textView3;
        TextView textView4;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 0;
            switch (i2) {
                case 0:
                case 6:
                    View view4 = this.f108479l;
                    if (view4 != null && this.f108468H) {
                        view4.setVisibility(0);
                    }
                    ImageView imageView = this.f108481n;
                    if (imageView != null) {
                        imageView.setVisibility(true != this.f108467G ? 0 : 8);
                    }
                    View view5 = this.f108480m;
                    if (view5 != null) {
                        view5.setVisibility(true != this.f108467G ? 8 : 0);
                    }
                    ImageView imageView2 = this.f108482o;
                    if (imageView2 != null) {
                        imageView2.setVisibility(true != this.f108467G ? 8 : 0);
                    }
                    View view6 = this.f108483p;
                    if (view6 != null) {
                        view6.setVisibility(8);
                    }
                    View view7 = this.f108484q;
                    if (view7 != null) {
                        view7.setVisibility(8);
                    }
                    TextView textView5 = this.f108486s;
                    if (textView5 != null) {
                        textView5.setVisibility(((textView5.length() <= 0 && ((compoundDrawablesRelative = textView5.getCompoundDrawablesRelative()) == null || compoundDrawablesRelative.length <= 2 || compoundDrawablesRelative[2] == null)) || this.f108467G) ? 8 : 0);
                    }
                    TextView textView6 = this.f108487t;
                    if (textView6 != null) {
                        if (textView6.length() <= 0 || !this.f108467G) {
                            i3 = 8;
                        }
                        textView6.setVisibility(i3);
                    }
                    TextView textView7 = this.f108488u;
                    if (textView7 != null) {
                        textView7.setVisibility(8);
                        return;
                    }
                    return;
                case 1:
                    View view8 = this.f108479l;
                    if (view8 != null && this.f108468H) {
                        view8.setVisibility(0);
                    }
                    ImageView imageView3 = this.f108481n;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                    View view9 = this.f108480m;
                    if (view9 != null) {
                        view9.setVisibility(true != this.f108467G ? 8 : 0);
                    }
                    ImageView imageView4 = this.f108482o;
                    if (imageView4 != null) {
                        imageView4.setVisibility(true != this.f108467G ? 8 : 0);
                    }
                    if (!this.f108467G && (view2 = this.f108483p) != null) {
                        view2.setVisibility(0);
                    }
                    if (this.f108467G && (view = this.f108484q) != null) {
                        view.setAlpha(1.0f);
                        this.f108484q.setVisibility(0);
                    }
                    TextView textView8 = this.f108486s;
                    if (textView8 != null) {
                        textView8.setVisibility(8);
                    }
                    TextView textView9 = this.f108487t;
                    if (textView9 != null) {
                        textView9.setVisibility(8);
                    }
                    if (this.f108467G && (textView = this.f108488u) != null) {
                        if (true == C58837ba.m90859h(this.f108466F)) {
                            i3 = 8;
                        }
                        textView.setVisibility(i3);
                        return;
                    }
                    return;
                case 2:
                case 3:
                    View view10 = this.f108479l;
                    if (view10 != null && this.f108468H) {
                        view10.setVisibility(8);
                    }
                    ImageView imageView5 = this.f108481n;
                    if (imageView5 != null) {
                        imageView5.setVisibility(8);
                    }
                    View view11 = this.f108480m;
                    if (view11 != null) {
                        view11.setVisibility(true != this.f108467G ? 8 : 0);
                    }
                    ImageView imageView6 = this.f108482o;
                    if (imageView6 != null) {
                        imageView6.setVisibility(true != this.f108467G ? 8 : 0);
                    }
                    View view12 = this.f108483p;
                    if (view12 != null) {
                        view12.setVisibility(8);
                    }
                    View view13 = this.f108485r;
                    if (view13 != null) {
                        view13.setVisibility(8);
                    }
                    if (!this.f108467G && (textView3 = this.f108486s) != null) {
                        textView3.setVisibility(true != C58837ba.m90859h(this.f108466F) ? 0 : 8);
                    }
                    TextView textView10 = this.f108487t;
                    if (textView10 != null) {
                        textView10.setVisibility(8);
                    }
                    if (this.f108467G && (view3 = this.f108484q) != null) {
                        view3.setAlpha(0.5f);
                        this.f108484q.setVisibility(true != C58837ba.m90859h(this.f108466F) ? 0 : 8);
                    }
                    if (this.f108467G && (textView2 = this.f108488u) != null) {
                        if (true == C58837ba.m90859h(this.f108466F)) {
                            i3 = 8;
                        }
                        textView2.setVisibility(i3);
                        return;
                    }
                    return;
                case 4:
                case 5:
                    View view14 = this.f108479l;
                    if (view14 != null && this.f108468H) {
                        view14.setVisibility(0);
                    }
                    ImageView imageView7 = this.f108481n;
                    if (imageView7 != null) {
                        imageView7.setVisibility(8);
                    }
                    View view15 = this.f108480m;
                    if (view15 != null) {
                        view15.setVisibility(true != this.f108467G ? 8 : 0);
                    }
                    ImageView imageView8 = this.f108482o;
                    if (imageView8 != null) {
                        imageView8.setVisibility(true != this.f108467G ? 8 : 0);
                    }
                    View view16 = this.f108483p;
                    if (view16 != null) {
                        view16.setVisibility(8);
                    }
                    View view17 = this.f108484q;
                    if (view17 != null) {
                        view17.setVisibility(8);
                    }
                    if (!this.f108467G && (textView4 = this.f108486s) != null) {
                        textView4.setVisibility(true != C58837ba.m90859h(this.f108466F) ? 0 : 8);
                    }
                    TextView textView11 = this.f108487t;
                    if (textView11 != null) {
                        if (true != this.f108467G) {
                            i3 = 8;
                        }
                        textView11.setVisibility(i3);
                    }
                    TextView textView12 = this.f108488u;
                    if (textView12 != null) {
                        textView12.setVisibility(8);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            throw null;
        }
    }
}
