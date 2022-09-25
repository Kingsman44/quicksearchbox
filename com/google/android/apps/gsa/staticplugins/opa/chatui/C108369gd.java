package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.widget.RemoteViews;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120904a;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120918an;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120941bj;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.assistant.p3931f.p3939c.C52849z;
import com.google.assistant.p3931f.p3940d.p3941a.C52860aj;
import com.google.assistant.p3931f.p3940d.p3941a.C52866ap;
import com.google.assistant.p3931f.p3940d.p3941a.C52875ay;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gd */
/* compiled from: PG */
public final class C108369gd implements C120904a {

    /* renamed from: a */
    final /* synthetic */ Consumer f301422a;

    public C108369gd(Consumer consumer) {
        this.f301422a = consumer;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96810a(C52829f fVar) {
        C69664n.m101061g(fVar, "appActionsContext");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo96811b(RemoteViews remoteViews, C52860aj ajVar) {
        C69664n.m101061g(ajVar, "remoteViewsInfo");
    }

    /* renamed from: c */
    public final void mo96812c(C120918an anVar, C52813ac acVar) {
        C69664n.m101061g(anVar, "endingStatus");
        this.f301422a.accept(anVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo96813d(C52866ap apVar) {
        C69664n.m101061g(apVar, "config");
    }

    /* renamed from: e */
    public final /* synthetic */ void mo96814e(C120941bj bjVar) {
        C69664n.m101061g(bjVar, "responses");
    }

    /* renamed from: f */
    public final /* synthetic */ void mo96815f(C52849z zVar) {
        C69664n.m101061g(zVar, "speech");
    }

    /* renamed from: g */
    public final /* synthetic */ void mo96816g(String str) {
        C69664n.m101061g(str, "text");
    }

    /* renamed from: h */
    public final /* synthetic */ void mo96817h(C52875ay ayVar) {
        C69664n.m101061g(ayVar, "tileLayout");
    }
}
