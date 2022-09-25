package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.C115515ai;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.j */
/* compiled from: PG */
public class C115634j extends LinearLayout {

    /* renamed from: a */
    public final C115632h f320785a;

    /* renamed from: b */
    public final TextView f320786b;

    /* renamed from: c */
    public final int f320787c;

    /* renamed from: d */
    public final C58485gu f320788d;

    /* renamed from: e */
    public C115633i f320789e;

    /* renamed from: f */
    public C115515ai f320790f = null;

    public C115634j(Context context, AttributeSet attributeSet, C58485gu guVar) {
        super(context, attributeSet);
        boolean z = true;
        super.setOrientation(1);
        this.f320787c = 5;
        LayoutInflater.from(context).inflate(R.layout.omp_horizontal_value_selector_gm2, this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.horizontal_value_selector_scroll_view_frame);
        this.f320786b = (TextView) findViewById(R.id.value_text);
        C58838bb.m90869d(!guVar.isEmpty(), "We should have one available value at least for selector.");
        C58838bb.m90869d(guVar.size() != new HashSet(guVar).size() ? false : z, "All available values should be different.");
        this.f320788d = guVar;
        C115632h hVar = new C115632h(this, context);
        this.f320785a = hVar;
        frameLayout.addView(hVar);
    }

    public final void setOrientation(int i) {
        throw new UnsupportedOperationException("Setting orientation is not allowed.");
    }
}
