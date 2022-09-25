package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141513f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.a.e */
/* compiled from: PG */
final class C141435e implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141432c f383905a;

    public C141435e(C141432c cVar) {
        this.f383905a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C141513f.C141515b bVar2 = (C141513f.C141515b) bVar;
        C141432c cVar = this.f383905a;
        C69664n.m101061g(bVar2, "toggleCheckEvent");
        View view = cVar.f383896b.getView();
        TextView textView = view != null ? (TextView) view.findViewById(R.id.pronunciationlearning_next_button) : null;
        if (textView != null) {
            textView.setEnabled(bVar2.f384135a);
        }
        C59052c cVar2 = (C59052c) C141432c.f383895a.mo56224b();
        Boolean valueOf = Boolean.valueOf(bVar2.f384135a);
        cVar2.mo56379ah(new C59094n(41696));
        cVar2.mo56389s("Toggle check button %s", valueOf);
        return C47392e.f123115a;
    }
}
