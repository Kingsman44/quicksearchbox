package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143772bt;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.usonia.directory.internal.bl */
/* compiled from: PG */
final class C146249bl extends C143772bt {

    /* renamed from: a */
    final /* synthetic */ C146010af f395107a;

    public C146249bl(C146010af afVar) {
        this.f395107a = afVar;
    }

    /* renamed from: a */
    public final void mo117762a(Status status) {
        if (status.mo119097c()) {
            this.f395107a.f394698a.mo122508v(true);
        } else {
            this.f395107a.f394698a.mo122508v(false);
        }
    }
}
