package com.google.android.apps.gsa.staticplugins.p7630bz.p7632b;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.apps.gsa.staticplugins.bz.b.b */
/* compiled from: PG */
public final class C97480b implements C97479a {

    /* renamed from: a */
    private final C23112h f272192a;

    public C97480b(C23112h hVar) {
        this.f272192a = hVar;
    }

    /* renamed from: a */
    public final void mo84178a(CommandOuterClass$Command commandOuterClass$Command) {
        Bundle bundle = new Bundle();
        CommandOuterClass$Command.f179510a.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("command", C23245b.m43556a(commandOuterClass$Command));
        this.f272192a.mo28345s("handleCommand_com.google.protos.youtube.elements.CommandOuterClass.Command", "ElementsEventsDispatcher", bundle);
    }
}
