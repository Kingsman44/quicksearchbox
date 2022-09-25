package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.content.ClipboardManager;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43441a;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43442b;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import dagger.p5294a.C68221g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.j */
/* compiled from: PG */
public final class C43423j implements C43441a {

    /* renamed from: a */
    private final C69464a f113444a;

    /* renamed from: b */
    private final C69464a f113445b;

    public C43423j(C69464a aVar, C69464a aVar2) {
        aVar.getClass();
        this.f113444a = aVar;
        aVar2.getClass();
        this.f113445b = aVar2;
    }

    /* renamed from: b */
    public final /* synthetic */ C43442b mo46523b(C43446f fVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f113444a.mo17428b();
        clipboardManager.getClass();
        Fragment fragment = (Fragment) ((C68221g) this.f113445b).f184583a;
        fragment.getClass();
        return new C43422i(fVar, clipboardManager, fragment);
    }
}
