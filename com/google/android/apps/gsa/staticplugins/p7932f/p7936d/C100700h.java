package com.google.android.apps.gsa.staticplugins.p7932f.p7936d;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.google.android.apps.gsa.staticplugins.p7932f.p7935c.C100689a;
import com.google.android.apps.gsa.staticplugins.p7932f.p7935c.C100690b;
import com.google.android.apps.gsa.staticplugins.p7932f.p7935c.C100692d;
import com.google.android.libraries.assistant.ampactions.C11039l;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.d.h */
/* compiled from: PG */
public final class C100700h extends C22939d {

    /* renamed from: a */
    public C11039l f281559a;

    /* renamed from: b */
    private final Context f281560b;

    /* renamed from: c */
    private final C58833ax f281561c;

    /* renamed from: d */
    private final C100692d f281562d;

    /* renamed from: e */
    private final C100689a f281563e;

    public C100700h(C22945j jVar, C100692d dVar, C100689a aVar, Context context, C58833ax axVar) {
        super(jVar);
        this.f281560b = context;
        this.f281561c = axVar;
        this.f281562d = dVar;
        this.f281563e = aVar;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo92016d() {
        C100689a aVar = this.f281563e;
        ((C100690b) aVar).f281550a.mo28345s("onClose", "AmpActionsEventsDispatcher", new Bundle());
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C11039l lVar = new C11039l(this.f281560b);
        this.f281559a = lVar;
        lVar.f36266m = new C100699g(this);
        mo28295iC(lVar);
        ((C100702j) this.f281562d).f281571f.mo28726b(new C100693a(this));
        C23251a aVar = ((C100702j) this.f281562d).f281567b;
        C11039l lVar2 = this.f281559a;
        Objects.requireNonNull(lVar2);
        aVar.mo28726b(new C100694b(lVar2));
        C23251a aVar2 = ((C100702j) this.f281562d).f281569d;
        C11039l lVar3 = this.f281559a;
        Objects.requireNonNull(lVar3);
        aVar2.mo28726b(new C100695c(lVar3));
        ((C100702j) this.f281562d).f281568c.mo28726b(new C100696d(this));
        ((C100702j) this.f281562d).f281570e.mo28726b(new C100697e(this));
        ((C100702j) this.f281562d).f281566a.mo28726b(new C100698f(this));
        if (this.f281561c.mo56113h()) {
            Window window = ((Activity) this.f281561c.mo56107c()).getWindow();
            window.setSoftInputMode(16);
            window.setStatusBarColor(-16777216);
        }
    }
}
