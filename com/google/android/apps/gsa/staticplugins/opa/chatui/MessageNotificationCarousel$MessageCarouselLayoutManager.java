package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107571n;

/* compiled from: PG */
public class MessageNotificationCarousel$MessageCarouselLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public final C107571n f300893a;

    /* renamed from: b */
    public boolean f300894b = true;

    /* renamed from: c */
    private final Context f300895c;

    public MessageNotificationCarousel$MessageCarouselLayoutManager(Context context, C107571n nVar) {
        super(context, 0, false);
        this.f300895c = context;
        this.f300893a = nVar;
    }

    public final boolean canScrollHorizontally() {
        return this.f300894b && super.canScrollHorizontally();
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        C108337ez ezVar = new C108337ez(this.f300895c);
        ezVar.f2449g = i;
        startSmoothScroll(ezVar);
    }
}
