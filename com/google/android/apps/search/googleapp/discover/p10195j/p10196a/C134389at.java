package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.search.video.conductor.C41478a;
import com.google.android.libraries.search.video.conductor.C41481d;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64198at;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.at */
/* compiled from: PG */
final class C134389at implements C41481d {

    /* renamed from: a */
    final /* synthetic */ C64198at f366091a;

    /* renamed from: b */
    final /* synthetic */ C21311r f366092b;

    /* renamed from: c */
    final /* synthetic */ C134390au f366093c;

    public C134389at(C134390au auVar, C64198at atVar, C21311r rVar) {
        this.f366093c = auVar;
        this.f366091a = atVar;
        this.f366092b = rVar;
    }

    /* renamed from: a */
    public final void mo43993a(C41478a aVar) {
        C64198at atVar = this.f366091a;
        if ((atVar.f173579a & 16) != 0) {
            this.f366093c.f366095b.mo44003a(atVar.f173584f).mo43996d(true);
        }
        if ((this.f366091a.f173579a & 2) != 0) {
            C21313t a = this.f366093c.f366094a.mo42396a();
            CommandOuterClass$Command commandOuterClass$Command = this.f366091a.f173581c;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
            a.mo26124a(commandOuterClass$Command, this.f366092b).mo61453k();
        }
    }

    /* renamed from: b */
    public final void mo43994b(C41478a aVar) {
        C64198at atVar = this.f366091a;
        if ((atVar.f173579a & 16) != 0) {
            this.f366093c.f366095b.mo44003a(atVar.f173584f).mo43996d(false);
        }
        if ((this.f366091a.f173579a & 4) != 0) {
            C21313t a = this.f366093c.f366094a.mo42396a();
            CommandOuterClass$Command commandOuterClass$Command = this.f366091a.f173582d;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
            a.mo26124a(commandOuterClass$Command, this.f366092b).mo61453k();
        }
    }
}
