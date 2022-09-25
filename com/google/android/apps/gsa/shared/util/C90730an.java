package com.google.android.apps.gsa.shared.util;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.shared.util.an */
/* compiled from: PG */
public final class C90730an {
    /* renamed from: a */
    public static C58833ax m148188a(C58833ax axVar) {
        return axVar.mo56113h() ? (C58833ax) axVar.mo56107c() : C58836b.f156633a;
    }

    /* renamed from: b */
    public static C58833ax m148189b(C58833ax... axVarArr) {
        for (C58833ax axVar : axVarArr) {
            if (axVar.mo56113h()) {
                return axVar;
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public static void m148190c(C58833ax axVar, C90736at atVar) {
        if (axVar.mo56113h()) {
            atVar.mo17700a(axVar.mo56107c());
        }
    }
}
