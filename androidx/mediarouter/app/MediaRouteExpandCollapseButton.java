package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.p033v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C1877c;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
class MediaRouteExpandCollapseButton extends AppCompatImageButton {

    /* renamed from: a */
    final AnimationDrawable f12065a;

    /* renamed from: b */
    final AnimationDrawable f12066b;

    /* renamed from: c */
    final String f12067c;

    /* renamed from: d */
    final String f12068d;

    /* renamed from: e */
    boolean f12069e;

    /* renamed from: f */
    View.OnClickListener f12070f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12070f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) C1877c.m5125a(context, R.drawable.mr_group_expand);
        this.f12065a = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) C1877c.m5125a(context, R.drawable.mr_group_collapse);
        this.f12066b = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C3763ai.m10922c(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f12067c = string;
        this.f12068d = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new C3762ah(this));
    }
}
