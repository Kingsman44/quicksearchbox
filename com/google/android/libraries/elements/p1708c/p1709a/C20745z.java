package com.google.android.libraries.elements.p1708c.p1709a;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.libraries.elements.c.a.z */
/* compiled from: PG */
public final /* synthetic */ class C20745z implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C20702ac f58065a;

    /* renamed from: b */
    public final /* synthetic */ C20701ab f58066b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f58067c;

    public /* synthetic */ C20745z(C20702ac acVar, C20701ab abVar, C21311r rVar) {
        this.f58065a = acVar;
        this.f58066b = abVar;
        this.f58067c = rVar;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C20702ac acVar = this.f58065a;
        C20701ab abVar = this.f58066b;
        C21311r rVar = this.f58067c;
        Long l = (Long) obj;
        C21313t tVar = (C21313t) acVar.f58002b.mo27525b();
        CommandOuterClass$Command commandOuterClass$Command = abVar.f57997a.f179579d;
        if (commandOuterClass$Command == null) {
            commandOuterClass$Command = CommandOuterClass$Command.f179510a;
        }
        tVar.mo26124a(commandOuterClass$Command, rVar).mo61452j(acVar.f58003c).mo61453k();
    }
}
