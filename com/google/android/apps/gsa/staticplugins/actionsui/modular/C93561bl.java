package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.C93437ad;
import com.google.android.googlequicksearchbox.R;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bl */
/* compiled from: PG */
public abstract class C93561bl extends C93437ad {

    /* renamed from: f */
    public int f261240f;

    public C93561bl(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo87719a(Parcelable parcelable, Object obj, boolean z, Comparator comparator) {
        GenericDisambiguationItemView genericDisambiguationItemView;
        Void voidR = (Void) obj;
        if (this.f260792e) {
            genericDisambiguationItemView = GenericDisambiguationItemView.m154098b(R.layout.immersive_actions_disambiguation_item, this.f260789b, this, parcelable, mo87907f(parcelable), mo87906c(parcelable));
        } else {
            genericDisambiguationItemView = GenericDisambiguationItemView.m154098b(R.layout.disambiguation_item, this.f260789b, this, parcelable, mo87907f(parcelable), mo87906c(parcelable));
        }
        int i = this.f261240f;
        if (i > 0) {
            C89941l.m146512c(genericDisambiguationItemView, i);
        }
        return genericDisambiguationItemView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Drawable mo87906c(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo87907f(Parcelable parcelable);

    public C93561bl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C93561bl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261240f = -1;
    }
}
