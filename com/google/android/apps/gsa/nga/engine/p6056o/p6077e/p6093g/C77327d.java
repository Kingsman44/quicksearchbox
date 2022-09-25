package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.d */
/* compiled from: PG */
public final /* synthetic */ class C77327d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C79326x f213258a;

    /* renamed from: b */
    public final /* synthetic */ String f213259b;

    public /* synthetic */ C77327d(C79326x xVar, String str) {
        this.f213258a = xVar;
        this.f213259b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C79326x xVar = this.f213258a;
        String str = this.f213259b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return Optional.m71637of(new Intent("com.google.android.gms.actions.SEARCH_ACTION").setPackage("com.google.android.gm").addFlags(536870912).putExtra("query", str).putExtra("mail_account", (String) axVar.mo56107c()));
        }
        xVar.mo73900a("ABORT - Could not obtain primary account name.");
        return Optional.empty();
    }
}
