package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public class MediaControlArgumentView extends C93666w {

    /* renamed from: a */
    private ImageView f261054a;

    /* renamed from: b */
    private TextView f261055b;

    /* renamed from: c */
    private TextView f261056c;

    public MediaControlArgumentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private static final void m154107b(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setText(BuildConfig.FLAVOR);
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo87889a(EntityArgument.Entity entity) {
        if (entity != null) {
            m154107b(this.f261055b, entity.f236170b);
            m154107b(this.f261056c, entity.f236172d);
            ImageView imageView = this.f261054a;
            Bitmap bitmap = entity.f236174f;
            if (bitmap == null) {
                imageView.setImageBitmap((Bitmap) null);
                imageView.setVisibility(8);
                return;
            }
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
    }

    /* renamed from: f */
    public final void mo87732f() {
        mo87889a(((MediaControlArgument) this.f261447m).mo81300g());
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.icon);
        C58838bb.m90866a(findViewById, "MediaControlArgumentView#onFinishInflate: Could not find \"icon\".");
        this.f261054a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.text);
        C58838bb.m90866a(findViewById2, "MediaControlArgumentView#onFinishInflate: Could not find \"text\".");
        this.f261055b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.secondary_text);
        C58838bb.m90866a(findViewById3, "MediaControlArgumentView#onFinishInflate: Could not find \"secondary_text\".");
        this.f261056c = (TextView) findViewById3;
    }
}
