package com.google.android.apps.gsa.speech.p7272e.p7273a;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.speech.e.a.b */
/* compiled from: PG */
final class C92236b extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ int f257160a;

    /* renamed from: b */
    final /* synthetic */ C92237c f257161b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92236b(C92237c cVar, int i) {
        super("Handle callback");
        this.f257161b = cVar;
        this.f257160a = i;
    }

    public final void run() {
        synchronized (this.f257161b) {
            if (this.f257161b.f257165c != null) {
                this.f257161b.f257165c.mo49086a(Integer.valueOf(this.f257160a));
                this.f257161b.f257165c = null;
            }
        }
    }
}
