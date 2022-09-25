package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

import android.os.Bundle;
import androidx.core.app.C1826m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129567ai;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128622a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.g */
/* compiled from: PG */
public final class C129669g {

    /* renamed from: a */
    public final C129541aa f355877a;

    /* renamed from: b */
    public final C129676j f355878b;

    /* renamed from: c */
    public final NavigatorArgs$Transition f355879c;

    /* renamed from: d */
    public final C34053bp f355880d;

    public C129669g(C129541aa aaVar, C129676j jVar, NavigatorArgs$Transition navigatorArgs$Transition, C34053bp bpVar) {
        C69664n.m101061g(aaVar, "host");
        C69664n.m101061g(jVar, "content");
        this.f355877a = aaVar;
        this.f355878b = jVar;
        this.f355879c = navigatorArgs$Transition;
        this.f355880d = bpVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C129669g m211718b(C129669g gVar, C129541aa aaVar, C129676j jVar, int i) {
        if ((i & 1) != 0) {
            aaVar = gVar.f355877a;
        }
        if ((i & 2) != 0) {
            jVar = gVar.f355878b;
        }
        return m211719c(aaVar, jVar, (i & 4) != 0 ? gVar.f355879c : null, gVar.f355880d);
    }

    /* renamed from: c */
    public static final C129669g m211719c(C129541aa aaVar, C129676j jVar, NavigatorArgs$Transition navigatorArgs$Transition, C34053bp bpVar) {
        C69664n.m101061g(aaVar, "host");
        C69664n.m101061g(jVar, "content");
        return new C129669g(aaVar, jVar, navigatorArgs$Transition, bpVar);
    }

    /* renamed from: a */
    public final void mo109180a(Bundle bundle) {
        C69788q qVar;
        C69664n.m101061g(bundle, "bundle");
        C128622a.m209917b(bundle, "host", this.f355877a);
        C128622a.m209917b(bundle, "destination_content", this.f355878b);
        C34053bp bpVar = this.f355880d;
        if (bpVar != null) {
            C128622a.m209917b(bundle, "invocation_token", bpVar);
        }
        NavigatorArgs$Transition navigatorArgs$Transition = this.f355879c;
        if (navigatorArgs$Transition != null) {
            C69664n.m101061g(bundle, "bundle");
            C129675m mVar = navigatorArgs$Transition.f355867a;
            C69664n.m101061g(bundle, "bundle");
            C1826m.m5005b(bundle, "source", mVar.f355889a);
            bundle.putInt("transition_type", navigatorArgs$Transition.f355868b.ordinal());
            qVar = C69788q.f186170a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            C69664n.m101061g(bundle, "bundle");
            C69664n.m101061g(bundle, "bundle");
            bundle.remove("source");
            bundle.remove("transition_type");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C129669g)) {
            return false;
        }
        C129669g gVar = (C129669g) obj;
        return C69664n.m101066l(this.f355877a, gVar.f355877a) && C69664n.m101066l(this.f355878b, gVar.f355878b) && C69664n.m101066l(this.f355879c, gVar.f355879c) && C69664n.m101066l(this.f355880d, gVar.f355880d);
    }

    public final int hashCode() {
        int hashCode = ((this.f355877a.hashCode() * 31) + this.f355878b.hashCode()) * 31;
        NavigatorArgs$Transition navigatorArgs$Transition = this.f355879c;
        int i = 0;
        int hashCode2 = (hashCode + (navigatorArgs$Transition == null ? 0 : navigatorArgs$Transition.hashCode())) * 31;
        C34053bp bpVar = this.f355880d;
        if (bpVar != null) {
            i = bpVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String b = C129567ai.m211555b(this.f355877a);
        String a = C129567ai.m211554a(this.f355878b);
        return b + "{" + a + "}";
    }
}
