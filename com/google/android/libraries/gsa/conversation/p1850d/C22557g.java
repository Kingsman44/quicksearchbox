package com.google.android.libraries.gsa.conversation.p1850d;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.logging.Level;

/* renamed from: com.google.android.libraries.gsa.conversation.d.g */
/* compiled from: PG */
final class C22557g extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C22559i f62178a;

    public C22557g(C22559i iVar) {
        this.f62178a = iVar;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Level level;
        int i = C22558h.f62179a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            this.f62178a.f62188i = C58833ax.m90834k(consoleMessage.message());
            level = Level.SEVERE;
        } else if (i != 2) {
            level = Level.FINE;
        } else {
            level = Level.WARNING;
        }
        C59052c g = C22559i.f62180a.mo56223a(level);
        g.mo56378ag(C58975e.f156826a, "JavascriptRunner");
        ((C59052c) g.mo56372aa(48312)).mo56352E("%s -- from line %s", consoleMessage.message(), consoleMessage.lineNumber());
        return true;
    }
}
