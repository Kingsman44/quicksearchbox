package com.google.android.apps.gsa.staticplugins.p7884dz;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dz.b */
/* compiled from: PG */
public final class C100322b extends ContextWrapper {

    /* renamed from: a */
    private final C100324d f280542a;

    public C100322b(Context context, C100324d dVar) {
        super(context);
        this.f280542a = dVar;
    }

    public final void startActivities(Intent[] intentArr) {
        C58976aa aaVar = C58975e.f156826a;
        Object[] objArr = (Object[]) intentArr;
        super.startActivities(intentArr);
        this.f280542a.mo91885a("INTENT_START", intentArr[0].toUri(0));
    }

    public final void startActivity(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        intent.toUri(0);
        super.startActivity(intent);
        this.f280542a.mo91885a("INTENT_START", intent.toUri(0));
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        intent.toUri(0);
        super.startActivity(intent, bundle);
        this.f280542a.mo91885a("INTENT_START", intent.toUri(0));
    }

    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        Object[] objArr = (Object[]) intentArr;
        super.startActivities(intentArr, bundle);
        this.f280542a.mo91885a("INTENT_START", intentArr[0].toUri(0));
    }
}
