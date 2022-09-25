package com.google.android.apps.search.googleapp.launcher.minusone.suspendmode;

import android.content.Intent;
import android.graphics.ColorMatrix;
import android.view.View;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136470f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136532j;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.tracing.C47770dh;
import dagger.hilt.android.internal.managers.C68324h;
import java.io.PrintWriter;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.suspendmode.k */
/* compiled from: PG */
public final class C136675k implements C136470f {

    /* renamed from: a */
    public static final ColorMatrix f372041a = new ColorMatrix(new float[]{0.213f, 0.715f, 0.072f, 0.0f, 40.0f, 0.213f, 0.715f, 0.072f, 0.0f, 40.0f, 0.213f, 0.715f, 0.072f, 0.0f, 40.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});

    /* renamed from: b */
    public final C28310af f372042b;

    /* renamed from: c */
    public final C28306ab f372043c;

    /* renamed from: d */
    public final C47770dh f372044d;

    /* renamed from: e */
    private final C47274n f372045e;

    /* renamed from: f */
    private final C28443m f372046f;

    /* renamed from: g */
    private final C136673i f372047g;

    public C136675k(C47274n nVar, C47770dh dhVar, C28310af afVar, C28306ab abVar, C28443m mVar, C136673i iVar) {
        this.f372045e = nVar;
        this.f372044d = dhVar;
        this.f372042b = afVar;
        this.f372043c = abVar;
        this.f372046f = mVar;
        this.f372047g = iVar;
    }

    /* renamed from: a */
    public static C136673i m222238a() {
        C136673i iVar = new C136673i();
        C68324h.m98669f(iVar);
        return iVar;
    }

    /* renamed from: b */
    public final void mo113323b() {
        View view = this.f372047g.getView();
        if (view != null) {
            this.f372046f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        }
        Intent intent = new Intent(this.f372045e, SelfDestructingActivity.class);
        intent.addFlags(268435456);
        this.f372045e.startActivity(intent);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo113066d() {
        return Optional.empty();
    }

    /* renamed from: e */
    public final void mo113067e(PrintWriter printWriter, String str) {
        printWriter.println("         ".concat("Suspend mode enabled"));
    }

    /* renamed from: f */
    public final /* synthetic */ void mo113068f(boolean z) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo113069h() {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo113070i() {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo113071j() {
    }

    /* renamed from: k */
    public final void mo113072k() {
        mo113323b();
    }

    /* renamed from: l */
    public final /* synthetic */ void mo113073l(float f) {
    }

    /* renamed from: n */
    public final /* synthetic */ boolean mo113074n() {
        return false;
    }

    /* renamed from: o */
    public final /* synthetic */ boolean mo113075o() {
        return false;
    }

    /* renamed from: p */
    public final /* synthetic */ void mo113076p(C136532j jVar) {
    }
}
