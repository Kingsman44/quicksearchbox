package com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.p10139b.C133488d;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.a.g */
/* compiled from: PG */
public final class C138141g extends C46756m {

    /* renamed from: a */
    private final C47770dh f375846a;

    /* renamed from: b */
    private final C47400m f375847b;

    public C138141g(C47770dh dhVar, C47400m mVar) {
        this.f375846a = dhVar;
        this.f375847b = mVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_spyw_icc_suggestion, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C138030av avVar = (C138030av) ((C138015ag) obj).f375483c.get(0);
        this.f375847b.mo51252a(view, new C138146l(avVar));
        C133488d.m216677b(view, C133488d.m216676a(this.f375846a, C138140f.f375845a, "Long-clicked suggestion"));
        ((TextView) view.findViewById(16908308)).setText(Html.fromHtml(avVar.f375539b));
    }
}
