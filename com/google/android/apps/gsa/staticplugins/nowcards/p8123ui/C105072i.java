package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.view.LayoutInflater;
import com.google.android.apps.gsa.now.shared.p6421ui.C83421j;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.i */
/* compiled from: PG */
public final class C105072i {

    /* renamed from: a */
    public final MetadataLineView f292801a;

    /* renamed from: b */
    private final Context f292802b;

    /* renamed from: c */
    private final LayoutInflater f292803c;

    /* renamed from: d */
    private final C105070g f292804d;

    public C105072i(Context context, C105070g gVar) {
        this.f292802b = context;
        this.f292803c = LayoutInflater.from(context);
        this.f292801a = new MetadataLineView(context);
        this.f292804d = gVar;
    }

    /* renamed from: a */
    public final void mo94518a(CardRenderingContext cardRenderingContext, List list) {
        this.f292801a.mo94502d(this.f292804d.mo94516a(this.f292802b, this.f292803c, (Map) null, cardRenderingContext), list, (C83421j) null);
    }
}
