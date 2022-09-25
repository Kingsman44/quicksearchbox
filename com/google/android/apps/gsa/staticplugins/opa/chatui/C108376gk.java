package com.google.android.apps.gsa.staticplugins.opa.chatui;

import androidx.slice.SliceItem;
import androidx.slice.widget.C4141as;
import androidx.slice.widget.C4147c;
import com.google.android.apps.gsa.search.shared.p6930h.C87570m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gk */
/* compiled from: PG */
public final /* synthetic */ class C108376gk implements C4141as {

    /* renamed from: a */
    public final /* synthetic */ OpaSliceCard f301437a;

    /* renamed from: b */
    public final /* synthetic */ C87570m f301438b;

    public /* synthetic */ C108376gk(OpaSliceCard opaSliceCard, C87570m mVar) {
        this.f301437a = opaSliceCard;
        this.f301438b = mVar;
    }

    /* renamed from: b */
    public final void mo8726b(C4147c cVar, SliceItem sliceItem) {
        OpaSliceCard opaSliceCard = this.f301437a;
        this.f301438b.mo8726b(cVar, sliceItem);
        if (opaSliceCard.f300922a.isPresent()) {
            ((C4141as) opaSliceCard.f300922a.get()).mo8726b(cVar, sliceItem);
        }
    }
}
