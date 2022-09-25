package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.GlifLoadingLayout;
import com.google.android.setupdesign.p3555d.C45301i;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.template.ScreenStateView */
/* compiled from: PG */
public final class ScreenStateView extends FrameLayout {
    public ScreenStateView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private final View m204936d(C125009e eVar) {
        DesugarArrays.stream((T[]) C125009e.values()).map(C125005a.f344912a).map(new C125006b(this)).filter(C125007c.f344914a).forEach(C125008d.f344915a);
        ViewStub viewStub = (ViewStub) findViewById(eVar.f344921e);
        if (viewStub != null) {
            return viewStub.inflate();
        }
        View findViewById = findViewById(eVar.f344922f);
        findViewById.setVisibility(0);
        return findViewById;
    }

    /* renamed from: a */
    public final View mo106775a(C125009e eVar, int i) {
        ViewStub viewStub = (ViewStub) findViewById(eVar.f344921e);
        if (viewStub != null) {
            viewStub.setLayoutResource(i);
        }
        return m204936d(eVar);
    }

    /* renamed from: b */
    public final GlifLoadingLayout mo106776b(int i, Integer num) {
        GlifLoadingLayout glifLoadingLayout = (GlifLoadingLayout) m204936d(C125009e.LOADING);
        glifLoadingLayout.mo49196r(i);
        if (num != null) {
            glifLoadingLayout.mo49194p(num.intValue());
        }
        return glifLoadingLayout;
    }

    /* renamed from: c */
    public final void mo106777c() {
        ((C45301i) mo106776b(R.string.assistant_loading_default_header, (Integer) null).mo49129j(C45301i.class)).mo49235c(true);
    }

    public ScreenStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenStateView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ScreenStateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.assistant_oobe_template, this);
    }
}
