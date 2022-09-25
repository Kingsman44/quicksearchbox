package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.p10139b.C133488d;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138579d;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.o */
/* compiled from: PG */
public final class C138662o extends C46756m {

    /* renamed from: a */
    public final Context f377154a;

    /* renamed from: b */
    private final C47770dh f377155b;

    /* renamed from: c */
    private final C47400m f377156c;

    public C138662o(Context context, C47770dh dhVar, C47400m mVar) {
        this.f377154a = context;
        this.f377155b = dhVar;
        this.f377156c = mVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_discover_promo, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C138030av avVar = (C138030av) ((C138015ag) obj).f375483c.get(0);
        this.f377156c.mo51252a(view, new C138579d(avVar));
        C133488d.m216677b(view, C133488d.m216676a(this.f377155b, new C138661n(this, avVar, view), "Long-clicked suggestion"));
    }
}
