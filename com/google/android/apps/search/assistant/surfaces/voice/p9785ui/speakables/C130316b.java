package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables;

import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.b */
/* compiled from: PG */
final class C130316b extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Wiggle f357198a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130316b(Wiggle wiggle) {
        super(1);
        this.f357198a = wiggle;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        int intValue = ((Number) obj).intValue();
        Wiggle wiggle = this.f357198a;
        if (intValue != wiggle.getVisibility()) {
            if (intValue == 0) {
                wiggle.mo109656c();
            } else {
                wiggle.mo109654a();
            }
            wiggle.setVisibility(intValue);
        }
        return C69788q.f186170a;
    }
}
