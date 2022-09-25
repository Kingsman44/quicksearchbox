package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.api.C74742z;
import com.google.android.libraries.assistant.p1484g.p1502d.C18155ag;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.ai */
/* compiled from: PG */
public final /* synthetic */ class C104190ai implements C104194am {

    /* renamed from: a */
    public final /* synthetic */ C104196ao f289798a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f289799b;

    /* renamed from: c */
    public final /* synthetic */ AssistStructure f289800c;

    /* renamed from: d */
    public final /* synthetic */ AssistContent f289801d;

    /* renamed from: e */
    public final /* synthetic */ Optional f289802e;

    public /* synthetic */ C104190ai(C104196ao aoVar, Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, Optional optional) {
        this.f289798a = aoVar;
        this.f289799b = bundle;
        this.f289800c = assistStructure;
        this.f289801d = assistContent;
        this.f289802e = optional;
    }

    /* renamed from: a */
    public final void mo93985a(C74742z zVar) {
        C104196ao aoVar = this.f289798a;
        Bundle bundle = this.f289799b;
        AssistStructure assistStructure = this.f289800c;
        AssistContent assistContent = this.f289801d;
        Optional optional = this.f289802e;
        zVar.mo71122h(bundle, assistStructure, assistContent, ((Integer) optional.map(C104213m.f289884a).orElse(0)).intValue(), (C18155ag) optional.map(new C104214n(aoVar)).orElse(null));
    }
}
