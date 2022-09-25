package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.p033v7.widget.C0678gm;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class CheckableView extends ConstraintLayout {

    /* renamed from: d */
    public CheckBox f283002d;

    public CheckableView(Context context) {
        super(context);
        m167745b(context, (AttributeSet) null, 0);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private final void m167745b(Context context, AttributeSet attributeSet, int i) {
        Resources resources = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.checkable_view, this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.summary);
        this.f283002d = (CheckBox) inflate.findViewById(R.id.checkbox);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C101434b.f283004a, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                int color = obtainStyledAttributes.getColor(2, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(3, 0);
                int resourceId3 = obtainStyledAttributes.getResourceId(4, 0);
                boolean z = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                Drawable c = C0678gm.m2375e().mo3100c(context, resourceId);
                if (color != 0) {
                    c = c.mutate();
                    C1929b.m5225f(c, color);
                }
                imageView.setImageDrawable(c);
                textView.setText(resourceId3);
                if (resourceId2 > 0) {
                    textView2.setText(resourceId2);
                    textView2.setVisibility(0);
                }
                this.f283002d.setContentDescription(resources.getString(R.string.checkable_view_content_description_title_and_summary, new Object[]{resources.getString(resourceId3), resources.getString(resourceId2)}));
                this.f283002d.setChecked(z);
                setClickable(true);
                setBackgroundResource(R.drawable.checkable_view_touch_feedback);
                setOnClickListener(new C101433a(this));
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public CheckableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m167745b(context, attributeSet, i);
    }
}
