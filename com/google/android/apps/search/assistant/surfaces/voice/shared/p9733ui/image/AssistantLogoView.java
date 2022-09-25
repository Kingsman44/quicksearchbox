package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.image;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.material.p3505b.C44534d;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.image.AssistantLogoView */
/* compiled from: PG */
public final class AssistantLogoView extends AppCompatImageView {

    /* renamed from: a */
    private boolean f353623a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AssistantLogoView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AssistantLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssistantLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C69664n.m101061g(context, "context");
        if (!C44534d.m78715b()) {
            setImageTintList((ColorStateList) null);
        } else if (getImageTintList() == null) {
            setImageTintList(ColorStateList.valueOf(C19391a.m36980a(context, R.attr.assistantOnBackground)));
        }
        this.f353623a = true;
        setImageResource(R.drawable.product_logo_assistant_color_48);
        this.f353623a = false;
    }

    public final /* bridge */ /* synthetic */ void setImageBitmap(Bitmap bitmap) {
        throw new UnsupportedOperationException("AssistantLogo does not allow to change image");
    }

    public final /* bridge */ /* synthetic */ void setImageIcon(Icon icon) {
        throw new UnsupportedOperationException("AssistantLogo does not allow to change image");
    }

    public final void setImageTintList(ColorStateList colorStateList) {
        if (!C44534d.m78715b()) {
            if (colorStateList == null) {
                colorStateList = null;
            } else {
                return;
            }
        }
        super.setImageTintList(colorStateList);
    }

    public final /* bridge */ /* synthetic */ void setImageURI(Uri uri) {
        throw new UnsupportedOperationException("AssistantLogo does not allow to change image");
    }

    public final void setImageDrawable(Drawable drawable) {
        if (this.f353623a) {
            super.setImageDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("AssistantLogo does not allow to change image");
    }

    public final void setImageResource(int i) {
        if (this.f353623a) {
            super.setImageResource(i);
            return;
        }
        throw new UnsupportedOperationException("AssistantLogo does not allow to change image");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssistantLogoView(Context context, AttributeSet attributeSet, int i, int i2, C69659i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
