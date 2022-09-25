package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.p1727f.C21166o;
import com.google.protos.youtube.elements.C66260r;
import p5488io.grpc.Status;
import p5488io.p5490b.p5496d.C69820b;

/* renamed from: com.google.android.libraries.elements.d.z */
/* compiled from: PG */
public final /* synthetic */ class C21136z implements C69820b {

    /* renamed from: a */
    public final /* synthetic */ C20794ag f59285a;

    /* renamed from: b */
    public final /* synthetic */ C21166o f59286b;

    /* renamed from: c */
    public final /* synthetic */ Component f59287c;

    /* renamed from: d */
    public final /* synthetic */ C21319z f59288d;

    public /* synthetic */ C21136z(C20794ag agVar, C21166o oVar, Component component, C21319z zVar) {
        this.f59285a = agVar;
        this.f59286b = oVar;
        this.f59287c = component;
        this.f59288d = zVar;
    }

    /* renamed from: a */
    public final void mo26097a() {
        C20794ag agVar = this.f59285a;
        C21166o oVar = this.f59286b;
        Component component = this.f59287c;
        C21319z zVar = this.f59288d;
        if (oVar != null) {
            synchronized (oVar.f59370e) {
                oVar.f59367b = null;
            }
        }
        Status dispose = component.dispose();
        if (!dispose.mo61679g()) {
            C21259bb bbVar = agVar.f58180b;
            C66260r rVar = C66260r.LOG_TYPE_INTERNAL_ERROR;
            String obj = dispose.getCode().toString();
            String description = dispose.getDescription();
            bbVar.mo25782a(rVar, "Error disposing Component (" + obj + "): " + description, zVar, dispose.f186920q);
        }
    }
}
