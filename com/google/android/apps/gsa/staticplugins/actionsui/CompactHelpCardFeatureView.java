package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class CompactHelpCardFeatureView extends LinearLayout {

    /* renamed from: a */
    public LinearLayout f260738a;

    /* renamed from: b */
    public View f260739b;

    /* renamed from: c */
    public View f260740c;

    /* renamed from: d */
    public ImageView f260741d;

    public CompactHelpCardFeatureView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.feature_title);
        this.f260741d = (ImageView) findViewById(R.id.feature_expand);
        this.f260738a = (LinearLayout) findViewById(R.id.examples);
        this.f260739b = findViewById(R.id.space);
        this.f260740c = findViewById(R.id.divider);
        C89941l.m146512c(this.f260741d, 20207);
        this.f260738a.setVisibility(8);
        this.f260740c.setVisibility(8);
        setOnClickListener(new C93694s(this));
    }

    public CompactHelpCardFeatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
