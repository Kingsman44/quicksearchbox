package com.google.android.apps.gsa.staticplugins.nowcards.p8101b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.b.e */
/* compiled from: PG */
public final class C104292e extends C104348l {
    public C104292e(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        if (mo94108G()) {
            return layoutInflater.inflate(R.layout.cluster_footer_hq, mo94115i(), false);
        }
        return layoutInflater.inflate(R.layout.cluster_footer, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        if (mo94109H()) {
            return new View(this.f290308c.f256406b.getContext());
        }
        return this.f290308c.f256406b.inflate(R.layout.cluster_footer, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
    }
}
