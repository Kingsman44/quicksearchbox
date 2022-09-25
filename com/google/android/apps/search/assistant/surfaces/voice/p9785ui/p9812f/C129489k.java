package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128565a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128625d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128626e;
import com.google.android.googlequicksearchbox.R;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.k */
/* compiled from: PG */
final class C129489k extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ View f355523a;

    /* renamed from: b */
    final /* synthetic */ View f355524b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129489k(View view, View view2) {
        super(1);
        this.f355523a = view;
        this.f355524b = view2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C128565a aVar = (C128565a) obj;
        C69664n.m101061g(aVar, "insets");
        Context context = this.f355523a.getContext();
        C69664n.m101060f(context, "view.context");
        C128625d.m209921a(this.f355524b, C128626e.m209922a(context, R.dimen.assistant_right_icon_bottom_margin_fix) + C128567c.m209820c(aVar.f353517a).f5824e);
        return C69788q.f186170a;
    }
}
