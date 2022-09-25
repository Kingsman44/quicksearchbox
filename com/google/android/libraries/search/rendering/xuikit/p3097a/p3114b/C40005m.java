package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.material.snackbar.C44893x;
import com.google.android.material.snackbar.Snackbar;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b.C64251h;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.m */
/* compiled from: PG */
final class C40005m extends C44893x {

    /* renamed from: a */
    final /* synthetic */ C64251h f105150a;

    /* renamed from: b */
    final /* synthetic */ C21311r f105151b;

    /* renamed from: c */
    final /* synthetic */ C40006n f105152c;

    public C40005m(C40006n nVar, C64251h hVar, C21311r rVar) {
        this.f105152c = nVar;
        this.f105150a = hVar;
        this.f105151b = rVar;
    }

    /* renamed from: a */
    public final void mo33564a(Snackbar snackbar, int i) {
        C40006n nVar = this.f105152c;
        if (!nVar.f105153a) {
            nVar.f105153a = true;
            C40007o oVar = nVar.f105154b;
            CommandOuterClass$Command commandOuterClass$Command = this.f105150a.f173729f;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
            ((C21313t) oVar.f105157c.mo27525b()).mo26124a(commandOuterClass$Command, this.f105151b).mo61453k();
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo33565b(Object obj, int i) {
        mo33565b((Snackbar) obj, i);
    }
}
