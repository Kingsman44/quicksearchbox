package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143879a;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.common.api.internal.de */
/* compiled from: PG */
public final class C143811de {
    /* renamed from: a */
    public static void m233724a(Status status, Object obj, C146010af afVar) {
        if (status.mo119097c()) {
            afVar.f394698a.mo122508v(obj);
            return;
        }
        afVar.f394698a.mo122507u(C143879a.m233899a(status));
    }

    /* renamed from: b */
    public static boolean m233725b(Status status, Object obj, C146010af afVar) {
        if (status.mo119097c()) {
            return afVar.f394698a.mo122510x(obj);
        }
        return afVar.f394698a.mo122509w(C143879a.m233899a(status));
    }
}
