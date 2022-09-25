package com.google.android.apps.gsa.staticplugins.p7630bz.p7632b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.apps.gsa.staticplugins.bz.b.c */
/* compiled from: PG */
public final class C97481c implements C23113i {

    /* renamed from: a */
    private final C97479a f272193a;

    public C97481c(C97479a aVar) {
        this.f272193a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("ElementsEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("handleCommand_com.google.protos.youtube.elements.CommandOuterClass.Command")) {
                this.f272193a.mo84178a((CommandOuterClass$Command) new C23271p(CommandOuterClass$Command.f179510a.getParserForType(), C62921ba.m95368a(), CommandOuterClass$Command.f179510a).mo28733b("command", pVar));
            }
        }
    }
}
