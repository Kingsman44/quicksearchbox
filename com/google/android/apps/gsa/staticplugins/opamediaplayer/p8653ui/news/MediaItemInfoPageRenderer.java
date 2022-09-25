package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.Toolbar;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115467k;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115470n;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.MediaItemInfoPageRenderer */
/* compiled from: PG */
public final class MediaItemInfoPageRenderer extends C22939d {

    /* renamed from: a */
    public final Context f320510a;

    /* renamed from: b */
    public final C115467k f320511b;

    /* renamed from: c */
    public final C21370a f320512c;

    /* renamed from: d */
    public final C22871g f320513d;

    /* renamed from: e */
    public final C115620ah f320514e;

    /* renamed from: f */
    public TextView f320515f;

    /* renamed from: g */
    public TextView f320516g;

    /* renamed from: h */
    public TextView f320517h;

    /* renamed from: i */
    public TextView f320518i;

    /* renamed from: j */
    public TextView f320519j;

    /* renamed from: k */
    public TextView f320520k;

    /* renamed from: l */
    public TextView f320521l;

    /* renamed from: m */
    public TextView f320522m;

    /* renamed from: n */
    public View f320523n;

    /* renamed from: o */
    public View f320524o;

    /* renamed from: p */
    public View f320525p;

    /* renamed from: q */
    public ThumbnailView f320526q;

    /* renamed from: r */
    public final C58833ax f320527r;

    /* renamed from: s */
    public C52174hz f320528s;

    /* renamed from: t */
    public C58833ax f320529t = C58836b.f156633a;

    /* renamed from: u */
    private final C115470n f320530u;

    /* renamed from: v */
    private View f320531v;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.MediaItemInfoPageRenderer$URLSpanNoUnderline */
    /* compiled from: PG */
    class URLSpanNoUnderline extends URLSpan {
        public URLSpanNoUnderline(String str) {
            super(str);
        }

        public final void onClick(View view) {
            C58976aa aaVar = C58975e.f156826a;
            MediaItemInfoPageRenderer mediaItemInfoPageRenderer = MediaItemInfoPageRenderer.this;
            C115142a.m190821e(mediaItemInfoPageRenderer.f320522m, mediaItemInfoPageRenderer.f320529t, 1391);
            super.onClick(view);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public MediaItemInfoPageRenderer(C22945j jVar, C115470n nVar, Context context, C115467k kVar, C21370a aVar, C58833ax axVar, C22871g gVar, C115620ah ahVar) {
        super(jVar);
        this.f320510a = context;
        this.f320530u = nVar;
        this.f320511b = kVar;
        this.f320512c = aVar;
        this.f320527r = axVar;
        this.f320513d = gVar;
        this.f320514e = ahVar;
    }

    /* renamed from: g */
    private final void m191673g(TextView textView) {
        Drawable drawable = textView.getCompoundDrawables()[0];
        if (drawable != null) {
            drawable.setTint(C1878d.m5128a(this.f320510a, R.color.google_grey800));
        }
    }

    /* renamed from: e */
    public final void mo102084e(C52568wo woVar) {
        if ((woVar.f137994a & 67108864) == 0 || woVar.f138010q.isEmpty()) {
            this.f320531v.setVisibility(8);
            return;
        }
        try {
            this.f320531v.setOnClickListener(new C115553a(this, Intent.parseUri(woVar.f138010q, 1)));
            this.f320531v.setVisibility(0);
        } catch (URISyntaxException unused) {
            C58976aa aaVar = C58975e.f156826a;
            C59081b.m91349a(C58979ad.FULL, "stack size");
            this.f320531v.setVisibility(8);
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        View inflate = LayoutInflater.from(this.f320510a).inflate(R.layout.omp_feature_media_item_info_page, (ViewGroup) null);
        mo28295iC(inflate);
        this.f320515f = (TextView) inflate.findViewById(R.id.story_title);
        this.f320518i = (TextView) inflate.findViewById(R.id.story_notes);
        this.f320519j = (TextView) inflate.findViewById(R.id.play_button_text);
        TextView textView = (TextView) inflate.findViewById(R.id.published_time);
        this.f320521l = textView;
        m191673g(textView);
        TextView textView2 = (TextView) inflate.findViewById(R.id.duration);
        this.f320520k = textView2;
        m191673g(textView2);
        this.f320523n = inflate.findViewById(R.id.play_button);
        this.f320531v = inflate.findViewById(R.id.visit_story_page_button);
        this.f320524o = inflate.findViewById(R.id.about_show_container);
        this.f320525p = inflate.findViewById(R.id.story_notes_container);
        TextView textView3 = (TextView) inflate.findViewById(R.id.show_title_and_publisher);
        this.f320522m = textView3;
        m191673g(textView3);
        this.f320516g = (TextView) inflate.findViewById(R.id.about_show_title);
        this.f320517h = (TextView) inflate.findViewById(R.id.about_show);
        this.f320526q = (ThumbnailView) inflate.findViewById(R.id.media_item_image);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.media_item_info_toolbar);
        toolbar.mo2417r(R.drawable.quantum_ic_arrow_back_grey600_24);
        toolbar.mo2419t(new C115584d(this));
        this.f320523n.setOnClickListener(new C115585e(this));
        ((C115574au) this.f320530u).f320596a.mo28726b(new C115577b(this));
        ((C115574au) this.f320530u).f320597b.mo28726b(new C115578c(this));
        C28295m.m52919e(mo28297il(), new C28292j(72083));
        View view = this.f320523n;
        C28292j jVar = new C28292j(71370);
        jVar.mo33795i(5);
        jVar.mo33794h(1);
        C28295m.m52919e(view, jVar);
        TextView textView4 = this.f320522m;
        C28292j jVar2 = new C28292j(71371);
        jVar2.mo33795i(5);
        jVar2.mo33794h(2);
        C28295m.m52919e(textView4, jVar2);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C58976aa aaVar = C58975e.f156826a;
        C89949q.m146521e(C28285c.m52874a(mo28297il(), 72126), false);
    }
}
