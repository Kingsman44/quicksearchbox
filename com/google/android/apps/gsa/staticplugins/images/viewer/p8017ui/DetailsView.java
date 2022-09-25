package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.DetailsView */
/* compiled from: PG */
public class DetailsView extends LinearLayout {

    /* renamed from: a */
    public TextView f285421a;

    /* renamed from: b */
    public View f285422b;

    /* renamed from: c */
    public View f285423c;

    /* renamed from: d */
    public TextView f285424d;

    /* renamed from: e */
    public RichMetadataView f285425e;

    /* renamed from: f */
    public View f285426f;

    /* renamed from: g */
    public View f285427g;

    /* renamed from: h */
    public TextView f285428h;

    /* renamed from: i */
    public TextView f285429i;

    /* renamed from: j */
    public View f285430j;

    /* renamed from: k */
    public C102374p f285431k;

    /* renamed from: l */
    public C65930h f285432l;

    /* renamed from: m */
    private ImageView f285433m;

    /* renamed from: n */
    private boolean f285434n = false;

    public DetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo93065a(boolean z) {
        this.f285426f.setActivated(z);
        View view = this.f285426f;
        C28292j jVar = new C28292j(true != z ? 15087 : 35661);
        jVar.mo33794h(1);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
        if (z) {
            this.f285426f.setContentDescription(getResources().getString(R.string.images_saved_button_description));
            this.f285433m.setImageResource(R.drawable.quantum_ic_bookmark_white_24);
            return;
        }
        this.f285426f.setContentDescription(getResources().getString(R.string.save_action));
        this.f285433m.setImageResource(R.drawable.quantum_ic_bookmark_border_white_24);
    }

    public final boolean isAttachedToWindow() {
        return this.f285434n;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f285434n = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f285434n = false;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f285421a = (TextView) findViewById(R.id.image_viewer_image_copyright_message);
        this.f285422b = findViewById(R.id.image_viewer_overflow_menu);
        this.f285423c = findViewById(R.id.image_viewer_metadata_buttons_bar);
        this.f285424d = (TextView) findViewById(R.id.image_viewer_referrer_title);
        this.f285425e = (RichMetadataView) findViewById(R.id.image_viewer_rich_metadata_view);
        this.f285426f = findViewById(R.id.image_viewer_save);
        this.f285433m = (ImageView) findViewById(R.id.image_viewer_save_icon);
        this.f285427g = findViewById(R.id.image_viewer_share);
        this.f285428h = (TextView) findViewById(R.id.image_viewer_snippet);
        this.f285429i = (TextView) findViewById(R.id.image_viewer_image_title);
        this.f285430j = findViewById(R.id.image_viewer_visit);
        RichMetadataView richMetadataView = this.f285425e;
        richMetadataView.f285514c = this.f285421a;
        richMetadataView.f285513b = this.f285429i;
        TextView textView = this.f285429i;
        C28292j jVar = new C28292j(3598);
        jVar.mo33795i(5);
        C28295m.m52919e(textView, jVar);
        RichMetadataView richMetadataView2 = this.f285425e;
        C28292j jVar2 = new C28292j(17893);
        jVar2.mo33794h(2);
        C28295m.m52919e(richMetadataView2, jVar2);
        View view = this.f285422b;
        C28292j jVar3 = new C28292j(8168);
        jVar3.mo33795i(5);
        C28295m.m52919e(view, jVar3);
        View view2 = this.f285430j;
        C28292j jVar4 = new C28292j(17629);
        jVar4.mo33795i(5);
        C28295m.m52919e(view2, jVar4);
        View view3 = this.f285427g;
        C28292j jVar5 = new C28292j(17628);
        jVar5.mo33795i(5);
        C28295m.m52919e(view3, jVar5);
    }
}
