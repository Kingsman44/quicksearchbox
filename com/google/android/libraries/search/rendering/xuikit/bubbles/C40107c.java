package com.google.android.libraries.search.rendering.xuikit.bubbles;

import android.view.ContextThemeWrapper;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40113f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40165ak;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40175au;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40177aw;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40178ax;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40180az;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40211c;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40217d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40221d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.C40259a;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57805b;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.c */
/* compiled from: PG */
public final class C40107c implements C40217d {

    /* renamed from: a */
    public final C40165ak f105345a;

    /* renamed from: b */
    private final C40221d f105346b;

    /* renamed from: c */
    private final C40111d f105347c;

    /* renamed from: d */
    private final C40254h f105348d;

    public C40107c(C40254h hVar, C40111d dVar, C40165ak akVar) {
        this.f105346b = akVar.f105499f;
        this.f105348d = hVar;
        this.f105347c = dVar;
        this.f105345a = akVar;
    }

    /* renamed from: a */
    public final void mo42178a() {
        C40221d dVar = this.f105346b;
        if (dVar.f105673c) {
            dVar.mo42328a(2);
        }
    }

    /* renamed from: b */
    public final void mo42179b(C40211c cVar) {
        String str;
        String str2;
        C40254h hVar = this.f105348d;
        C40111d dVar = this.f105347c;
        C57805b bVar = this.f105346b.f105671a.f154421c;
        if (bVar == null) {
            bVar = C57805b.f154437d;
        }
        C40211c cVar2 = C40211c.REASON_ACCOUNT_CHANGED;
        C40256j jVar = hVar.f105733a;
        if (cVar != cVar2) {
            C40113f fVar = (C40113f) jVar.f105736a.remove(dVar);
            C40180az azVar = (C40180az) jVar.f105739d.mo27525b();
            if ((bVar.f154439a & 2) != 0) {
                str = bVar.f154441c;
            } else {
                str = jVar.f105737b.getResources().getString(R.string.bubble_live_score_removed);
            }
            String str3 = str;
            if ((bVar.f154439a & 1) != 0) {
                str2 = bVar.f154440b;
            } else {
                str2 = jVar.f105737b.getResources().getString(R.string.bubble_undo_remove);
            }
            String str4 = str2;
            C40255i iVar = new C40255i(jVar, fVar);
            C40259a aVar = new C40259a(new ContextThemeWrapper(azVar.f105559b, R.style.bubble_window_snackbar));
            aVar.f105752i = new C40178ax(azVar, aVar, str3, str4, new C40177aw(azVar, iVar));
            WindowManager windowManager = azVar.f105558a;
            WindowManager.LayoutParams a = C40175au.m69773a(-1, -2, 1000);
            a.gravity = 80;
            windowManager.addView(aVar, a);
        }
        C40258l lVar = jVar.f105738c;
        synchronized (lVar.f105742b) {
            lVar.mo42358b(dVar);
        }
    }

    /* renamed from: c */
    public final void mo42180c() {
        this.f105346b.mo42328a(1);
    }

    /* renamed from: d */
    public final void mo42181d() {
        this.f105346b.mo42328a(3);
    }

    /* renamed from: e */
    public final void mo42182e() {
        this.f105346b.mo42328a(1);
    }

    /* renamed from: f */
    public final void mo42183f() {
    }
}
