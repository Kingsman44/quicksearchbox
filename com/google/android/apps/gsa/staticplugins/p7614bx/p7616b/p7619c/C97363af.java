package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.graphics.Rect;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.af */
/* compiled from: PG */
public final /* synthetic */ class C97363af implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C97366ai f271916a;

    public /* synthetic */ C97363af(C97366ai aiVar) {
        this.f271916a = aiVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C97366ai aiVar = this.f271916a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            if (aiVar.mo28297il().getWidth() > 0) {
                aiVar.mo90666e((Rect) axVar.mo56107c());
            } else {
                aiVar.mo28297il().getViewTreeObserver().addOnGlobalLayoutListener(new C97364ag(aiVar, axVar));
            }
        }
    }
}
