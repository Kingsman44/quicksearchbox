package com.google.android.libraries.componentview.components.elements.views;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.libraries.componentview.components.elements.C20448k;
import com.google.android.libraries.componentview.components.elements.C20451n;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.p4271bq.C56429h;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.components.elements.views.a */
/* compiled from: PG */
public final class C20460a extends RecyclerView {

    /* renamed from: a */
    public C20448k f57548a = null;

    public C20460a(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void onScrolled$ar$ds(int i) {
        C20448k kVar = this.f57548a;
        if (kVar != null) {
            C20451n nVar = kVar.f57503c;
            if (!nVar.f57514e && i > ((int) (C20482m.m38433a(nVar.f56304o) * 50.0f))) {
                kVar.f57503c.f57514e = true;
                C20601ca caVar = kVar.f57502b;
                C56429h hVar = kVar.f57501a;
                caVar.mo25489d(hVar.f150556h, (String) null, hVar.f150557i, (Map) null);
            }
        }
    }
}
