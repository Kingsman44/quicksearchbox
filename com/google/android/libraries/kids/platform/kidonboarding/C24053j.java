package com.google.android.libraries.kids.platform.kidonboarding;

import android.view.View;
import android.webkit.WebView;
import androidx.activity.C0800m;
import com.google.p4109av.p4114c.p4115a.p4116a.C54610c;
import com.google.p4109av.p4114c.p4115a.p4116a.C54612e;
import com.google.p4109av.p4114c.p4115a.p4116a.C54613f;
import com.google.p4109av.p4114c.p4115a.p4116a.C54615h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.j */
/* compiled from: PG */
final class C24053j extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C24058o f65723a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24053j(C24058o oVar) {
        super(true);
        this.f65723a = oVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        C24058o oVar = this.f65723a;
        View requireView = oVar.f65728c.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        WebView a = oVar.mo29443a(requireView);
        if (a.canGoBack()) {
            a.goBack();
            return;
        }
        C24058o oVar2 = this.f65723a;
        C54610c cVar = (C54610c) C54613f.f143382f.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C54615h a2 = C69664n.m101061g(cVar, "builder");
        a2.mo54146b(C54612e.CANCELED_BY_USER);
        oVar2.mo29445c(a2.mo54145a());
    }
}
