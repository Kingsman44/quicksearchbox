package com.google.android.apps.gsa.staticplugins.backup;

import android.app.backup.BackupManager;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.backup.j */
/* compiled from: PG */
public final class C94482j implements C118549h {

    /* renamed from: a */
    private final String f264172a;

    public C94482j(String str) {
        this.f264172a = str;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        BackupManager.dataChanged(this.f264172a);
        return C118826c.f331423b;
    }
}
