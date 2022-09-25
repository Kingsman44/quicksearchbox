package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8074c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.c.l */
/* compiled from: PG */
public abstract class C103429l extends C22939d {

    /* renamed from: a */
    private final Context f288281a;

    /* renamed from: b */
    public TextView f288282b;

    public C103429l(C22945j jVar, Context context) {
        super(jVar);
        this.f288281a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo93783e();

    /* access modifiers changed from: protected */
    /* renamed from: iC */
    public final void mo28295iC(View view) {
        View inflate = LayoutInflater.from(this.f288281a).inflate(true != mo93783e() ? R.layout.nga_half_shelf_feature_small : R.layout.nga_half_shelf_feature_large, (ViewGroup) null, false);
        this.f288282b = (TextView) inflate.findViewById(R.id.nga_base_renderer_heading_text);
        ((ViewGroup) inflate.findViewById(R.id.nga_base_renderer_content)).addView(view);
        ((LogoView) inflate.findViewById(R.id.nga_base_renderer_logo_view)).mo28225e(11, true);
        super.mo28295iC(inflate);
    }
}
