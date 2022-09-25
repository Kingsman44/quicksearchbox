package com.google.android.apps.gsa.queryentry;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.queryentry.b */
/* compiled from: PG */
final class C84240b extends C91090a {

    /* renamed from: e */
    private final QueryEntryActivity f229260e;

    public C84240b(QueryEntryActivity queryEntryActivity) {
        super(queryEntryActivity, queryEntryActivity, 0);
        this.f229260e = queryEntryActivity;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        int i = QueryEntryActivity.f229240x;
        C58976aa aaVar = C58975e.f156826a;
        this.f229260e.f229246k = true;
        if (intent.getIntExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 0) == 0) {
            intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
        }
        return super.mo65089a(intent);
    }
}
