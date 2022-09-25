package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout */
/* compiled from: PG */
public class OpaPageLayout extends LinearLayout {

    /* renamed from: a */
    public final FooterLayout f228726a;

    /* renamed from: b */
    public final ScrollView f228727b;

    /* renamed from: c */
    public View f228728c;

    public OpaPageLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final C84012g mo77369a() {
        C84013h hVar = new C84013h(this.f228726a);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.useGlifFooter, typedValue, true);
        return typedValue.data != 0 ? new C84017l(this, hVar) : hVar;
    }

    /* renamed from: b */
    public final void mo77370b(int i) {
        mo77371c(inflate(getContext(), i, (ViewGroup) null));
    }

    /* renamed from: c */
    public final void mo77371c(View view) {
        this.f228728c = view;
        this.f228727b.removeAllViews();
        this.f228727b.addView(this.f228728c);
    }

    public OpaPageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.opa_page_layout, this);
        setId(R.id.opa_page_layout);
        this.f228726a = (FooterLayout) findViewById(R.id.opa_footer_container);
        this.f228727b = (ScrollView) findViewById(R.id.opa_page_scrollview);
        int resourceId = getContext().getTheme().obtainStyledAttributes(attributeSet, C83976aa.f228769c, 0, 0).getResourceId(0, 0);
        if (resourceId != 0) {
            mo77370b(resourceId);
        }
    }
}
