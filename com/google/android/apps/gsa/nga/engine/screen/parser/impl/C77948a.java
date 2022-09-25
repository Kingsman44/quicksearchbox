package com.google.android.apps.gsa.nga.engine.screen.parser.impl;

import com.google.android.apps.gsa.nga.d.a.aa;
import com.google.android.apps.gsa.nga.d.a.w;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.parser.impl.a */
/* compiled from: PG */
public final /* synthetic */ class C77948a implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C77948a f214692a = new C77948a();

    private /* synthetic */ C77948a() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        aa aaVar = (aa) obj;
        C58838bb.m90884s(aaVar.a == 1, "Parser did not produce a valid screen content upon second request.");
        if (aaVar.a == 1) {
            return (w) aaVar.b;
        }
        return w.b;
    }
}
