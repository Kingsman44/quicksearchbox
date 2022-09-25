package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.l */
/* compiled from: PG */
public final /* synthetic */ class C40004l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C40006n f105147a;

    /* renamed from: b */
    public final /* synthetic */ CommandOuterClass$Command f105148b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f105149c;

    public /* synthetic */ C40004l(C40006n nVar, CommandOuterClass$Command commandOuterClass$Command, C21311r rVar) {
        this.f105147a = nVar;
        this.f105148b = commandOuterClass$Command;
        this.f105149c = rVar;
    }

    public final void onClick(View view) {
        C40006n nVar = this.f105147a;
        CommandOuterClass$Command commandOuterClass$Command = this.f105148b;
        C21311r rVar = this.f105149c;
        if (!nVar.f105153a) {
            nVar.f105153a = true;
            ((C21313t) nVar.f105154b.f105157c.mo27525b()).mo26124a(commandOuterClass$Command, rVar).mo61453k();
        }
    }
}
