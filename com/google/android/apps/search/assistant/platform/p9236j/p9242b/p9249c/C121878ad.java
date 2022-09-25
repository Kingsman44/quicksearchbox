package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat;
import com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult;
import p3186j$.util.Optional;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.ad */
/* compiled from: PG */
final class C121878ad extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Bundle f338174a;

    /* renamed from: b */
    final /* synthetic */ AssistStructure f338175b;

    /* renamed from: c */
    final /* synthetic */ AssistContent f338176c;

    /* renamed from: d */
    final /* synthetic */ Optional f338177d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121878ad(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, Optional optional) {
        super(1);
        this.f338174a = bundle;
        this.f338175b = assistStructure;
        this.f338176c = assistContent;
        this.f338177d = optional;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C121984bs bsVar = (C121984bs) obj;
        C69664n.m101061g(bsVar, "$this$withCurrentCachesSafe");
        AssistStateCompat assistStateCompat = new AssistStateCompat(this.f338174a, this.f338175b, this.f338176c, 0, (Integer) null, 56);
        bsVar.f338510a.mo39051c(new AssistStateResult(assistStateCompat.f89669a, assistStateCompat.f89670b, assistStateCompat.f89671c));
        bsVar.f338512c.mo39051c(this.f338177d.orElse(null));
        return C69788q.f186170a;
    }
}
