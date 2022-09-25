package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.c */
/* compiled from: PG */
public final class C94771c extends C91093c {

    /* renamed from: a */
    private final Context f265005a;

    /* renamed from: b */
    private final C58833ax f265006b;

    public C94771c(Context context, C58833ax axVar) {
        super(context);
        this.f265005a = context;
        this.f265006b = axVar;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        if (this.f265006b.mo56113h()) {
            this.f254388d = ((C100321a) this.f265006b.mo56107c()).mo91877a(this.f265005a, "BistoIntentStarter");
        }
        return super.mo65089a(intent);
    }
}
