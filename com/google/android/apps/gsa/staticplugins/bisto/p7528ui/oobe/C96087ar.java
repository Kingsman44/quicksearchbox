package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opaonboarding.p8660e.C115874g;
import com.google.android.apps.gsa.staticplugins.opaonboarding.p8660e.C115875h;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ar */
/* compiled from: PG */
public final class C96087ar extends C84036z {

    /* renamed from: a */
    private final cb f269020a;

    /* renamed from: b */
    private final C83893b f269021b;

    /* renamed from: c */
    private final C115875h f269022c;

    public C96087ar(C115875h hVar, C83893b bVar, cb cbVar) {
        this.f269022c = hVar;
        this.f269021b = bVar;
        this.f269020a = cbVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f269021b.mo77278a().mo56113h() || this.f269020a.g((Account) this.f269021b.mo77278a().mo56107c())) {
            return C58485gu.m89845m();
        }
        C115875h hVar = this.f269022c;
        SharedPreferences sharedPreferences = (SharedPreferences) hVar.f321318a.mo17428b();
        sharedPreferences.getClass();
        l lVar = (l) hVar.f321319b.mo17428b();
        lVar.getClass();
        C83893b bVar = (C83893b) hVar.f321320c.mo17428b();
        bVar.getClass();
        PackageManager packageManager = (PackageManager) hVar.f321321d.mo17428b();
        packageManager.getClass();
        C84026u uVar = (C84026u) hVar.f321322e.mo17428b();
        uVar.getClass();
        C86124t tVar = (C86124t) hVar.f321323f.mo17428b();
        tVar.getClass();
        return C58485gu.m89846n(new C115874g(sharedPreferences, lVar, bVar, packageManager, uVar, tVar));
    }
}
