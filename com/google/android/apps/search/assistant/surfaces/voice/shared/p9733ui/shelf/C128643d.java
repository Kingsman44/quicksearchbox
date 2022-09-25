package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.shelf;

import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69663m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.shelf.d */
/* compiled from: PG */
final /* synthetic */ class C128643d extends C69663m implements C69615a {
    public C128643d(Object obj) {
        super(0, obj, ShelfView.class, "getViewName", "getViewName()Ljava/lang/String;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        ShelfView shelfView = (ShelfView) this.f186034c;
        return shelfView.getId() != 0 ? shelfView.getContext().getResources().getResourceName(shelfView.getId()) : shelfView.getClass().getSimpleName();
    }
}
