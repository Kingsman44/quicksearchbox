package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d;

import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;
import org.p5610a.p5611a.p5612a.C71978d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.a */
/* compiled from: PG */
public final /* synthetic */ class C15680a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15755h f46811a;

    public /* synthetic */ C15680a(C15755h hVar) {
        this.f46811a = hVar;
    }

    public final void run() {
        C15755h hVar = this.f46811a;
        if (!hVar.f46955e.exists() || !hVar.f46955e.isDirectory()) {
            ((C58970a) ((C58970a) C15755h.f46951a.mo56226d()).mo56372aa(46266)).mo56389s("Cache deletion requested on invalid path: %s", hVar.f46955e);
            return;
        }
        try {
            C71978d.m105262c(hVar.f46955e);
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C15755h.f46951a.mo56225c()).mo56382g(e)).mo56372aa(46267)).mo56389s("Cache deletion at path %s failed", hVar.f46955e.getAbsolutePath());
        }
    }
}
