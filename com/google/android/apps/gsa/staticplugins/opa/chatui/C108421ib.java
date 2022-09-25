package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.RecyclerView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ib */
/* compiled from: PG */
final class C108421ib extends C90953s {

    /* renamed from: a */
    final /* synthetic */ TextView f301543a;

    /* renamed from: b */
    final /* synthetic */ int f301544b;

    /* renamed from: c */
    final /* synthetic */ C58833ax f301545c;

    /* renamed from: d */
    final /* synthetic */ C108237bh f301546d;

    /* renamed from: e */
    final /* synthetic */ RecyclerView f301547e;

    /* renamed from: f */
    final /* synthetic */ boolean f301548f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108421ib(TextView textView, int i, C58833ax axVar, C108237bh bhVar, RecyclerView recyclerView, boolean z) {
        super("SuggestCarouselAdapter");
        this.f301543a = textView;
        this.f301544b = i;
        this.f301545c = axVar;
        this.f301546d = bhVar;
        this.f301547e = recyclerView;
        this.f301548f = z;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        C108423id.m180229k(this.f301543a, (Drawable) obj, this.f301544b, this.f301545c, this.f301546d);
        RecyclerView recyclerView = this.f301547e;
        if (recyclerView != null && !this.f301548f) {
            recyclerView.scrollToPosition(0);
        }
    }
}
