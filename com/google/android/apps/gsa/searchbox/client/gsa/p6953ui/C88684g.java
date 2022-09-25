package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui;

import com.google.android.apps.gsa.searchbox.p6960ui.C88706g;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41640a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.ane;
import com.google.common.p4552o.aom;
import com.google.common.p4552o.aon;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.g */
/* compiled from: PG */
public final class C88684g extends C41641b implements C89204i, C89203h, C89199d, C89200e {

    /* renamed from: a */
    private C88706g f239783a;

    /* renamed from: b */
    private boolean f239784b;

    /* renamed from: c */
    private int f239785c;

    /* renamed from: d */
    private int f239786d;

    /* renamed from: e */
    private int f239787e;

    /* renamed from: f */
    private int f239788f;

    /* renamed from: g */
    private int f239789g;

    /* renamed from: h */
    private boolean f239790h;

    /* renamed from: i */
    private C89205j f239791i;

    /* renamed from: c */
    public final synchronized void mo82374c() {
        int i = this.f239785c + 1;
        this.f239785c = i;
        C89205j jVar = this.f239791i;
        if (jVar != null) {
            jVar.mo83171k("PREDICTION_CLICKED_OR_AUTO_COMMIT_COUNT", i);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239783a = ((C88715p) obj).f239940l;
    }

    /* renamed from: e */
    public final synchronized void mo78004e() {
        C89205j jVar = this.f239791i;
        jVar.getClass();
        if (!jVar.mo83177q("IS_GOOGLE_KEYBOARD_USED")) {
            jVar.mo83170j("IS_GOOGLE_KEYBOARD_USED", this.f239784b);
            jVar.mo83171k("PREDICTION_CLICKED_OR_AUTO_COMMIT_COUNT", this.f239785c);
            jVar.mo83171k("TYPING_SUGGESTION_CLICK_COUNT", this.f239786d);
            jVar.mo83171k("GESTURE_SUGGESTION_CLICK_COUNT", this.f239787e);
            jVar.mo83171k("RECORRECTION_CLICK_COUNT", this.f239788f);
            jVar.mo83171k("RECAPITALIZATION_CLICK_COUNT", this.f239789g);
            return;
        }
        this.f239784b = jVar.mo83178r("IS_GOOGLE_KEYBOARD_USED");
        this.f239785c = jVar.mo83161a("PREDICTION_CLICKED_OR_AUTO_COMMIT_COUNT");
        this.f239786d = jVar.mo83161a("TYPING_SUGGESTION_CLICK_COUNT");
        this.f239787e = jVar.mo83161a("GESTURE_SUGGESTION_CLICK_COUNT");
        this.f239788f = jVar.mo83161a("RECORRECTION_CLICK_COUNT");
        this.f239789g = jVar.mo83161a("RECAPITALIZATION_CLICK_COUNT");
    }

    /* renamed from: f */
    public final synchronized void mo44231f(amt amt) {
        C88706g gVar;
        if (this.f239791i != null) {
            aom aom = (aom) aon.f159495e.createBuilder();
            apd apd = (apd) amt.instance;
            if ((apd.f159611c & 256) != 0) {
                aon aon = apd.f159593aj;
                if (aon == null) {
                    aon = aon.f159495e;
                }
                aom = (aom) aon.toBuilder();
            }
            C89205j jVar = this.f239791i;
            jVar.getClass();
            if (!(jVar.mo83166f("LAST_KEYBOARD_DISMISS_QUERY") == null || (gVar = this.f239783a) == null)) {
                boolean z = !gVar.mo82429a().toString().equals(jVar.mo83166f("LAST_KEYBOARD_DISMISS_QUERY"));
                if (z) {
                    jVar.mo83170j("KEYBOARD_DISMISS_BEFORE_DONE_TYPING", true);
                }
                boolean r = jVar.mo83178r("KEYBOARD_DISMISS_IN_0P");
                aom.copyOnWrite();
                aon aon2 = (aon) aom.instance;
                aon2.f159497a |= 1;
                aon2.f159498b = r;
                boolean r2 = jVar.mo83178r("KEYBOARD_DISMISS_BEFORE_DONE_TYPING");
                aom.copyOnWrite();
                aon aon3 = (aon) aom.instance;
                aon3.f159497a |= 2;
                aon3.f159499c = r2;
                aom.copyOnWrite();
                aon aon4 = (aon) aom.instance;
                aon4.f159497a |= 4;
                aon4.f159500d = !z;
            }
            amt.copyOnWrite();
            apd apd2 = (apd) amt.instance;
            aon aon5 = (aon) aom.build();
            aon5.getClass();
            apd2.f159593aj = aon5;
            apd2.f159611c |= 256;
            jVar.mo83170j("KEYBOARD_DISMISS_SINCE_LAST_UI_LOGGING_SNAPSHOT", false);
        }
    }

    /* renamed from: g */
    public final synchronized void mo82375g() {
        int i = this.f239789g + 1;
        this.f239789g = i;
        C89205j jVar = this.f239791i;
        if (jVar != null) {
            jVar.mo83171k("RECAPITALIZATION_CLICK_COUNT", i);
        }
    }

    /* renamed from: h */
    public final synchronized void mo82376h() {
        int i = this.f239788f + 1;
        this.f239788f = i;
        C89205j jVar = this.f239791i;
        if (jVar != null) {
            jVar.mo83171k("RECORRECTION_CLICK_COUNT", i);
        }
    }

    /* renamed from: hC */
    public final synchronized void mo78005hC(C89205j jVar) {
        this.f239791i = jVar;
    }

    /* renamed from: hD */
    public final /* synthetic */ void mo82217hD(Object obj) {
        this.f239790h = ((C88709j) obj).f239892r;
    }

    /* renamed from: hE */
    public final synchronized void mo78006hE() {
        this.f239784b = false;
        this.f239785c = 0;
        this.f239786d = 0;
        this.f239787e = 0;
        this.f239788f = 0;
        this.f239789g = 0;
        C89205j jVar = this.f239791i;
        if (jVar != null) {
            jVar.mo83170j("IS_GOOGLE_KEYBOARD_USED", false);
            this.f239791i.mo83171k("PREDICTION_CLICKED_OR_AUTO_COMMIT_COUNT", 0);
            this.f239791i.mo83171k("TYPING_SUGGESTION_CLICK_COUNT", 0);
            this.f239791i.mo83171k("GESTURE_SUGGESTION_CLICK_COUNT", 0);
            this.f239791i.mo83171k("RECORRECTION_CLICK_COUNT", 0);
            this.f239791i.mo83171k("RECAPITALIZATION_CLICK_COUNT", 0);
            this.f239791i.mo83170j("KEYBOARD_DISMISS_IN_0P", false);
            this.f239791i.mo83170j("KEYBOARD_DISMISS_BEFORE_DONE_TYPING", false);
            this.f239791i.mo83176p("LAST_KEYBOARD_DISMISS_QUERY", (String) null);
            this.f239791i.mo83170j("KEYBOARD_DISMISS_SINCE_LAST_UI_LOGGING_SNAPSHOT", false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82377i(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0014
            int r3 = r2.f239787e     // Catch:{ all -> 0x0027 }
            int r3 = r3 + 1
            r2.f239787e = r3     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.an.a.j r0 = r2.f239791i     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = "GESTURE_SUGGESTION_CLICK_COUNT"
            r0.mo83171k(r1, r3)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0014:
            int r3 = r2.f239786d     // Catch:{ all -> 0x0027 }
            int r3 = r3 + 1
            r2.f239786d = r3     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.an.a.j r0 = r2.f239791i     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = "TYPING_SUGGESTION_CLICK_COUNT"
            r0.mo83171k(r1, r3)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88684g.mo82377i(boolean):void");
    }

    /* renamed from: j */
    public final synchronized void mo82378j(String str) {
        C89205j jVar = this.f239791i;
        if (jVar != null) {
            String f = jVar.mo83166f("LAST_KEYBOARD_DISMISS_QUERY");
            if (!str.equals(f)) {
                C89205j jVar2 = this.f239791i;
                jVar2.getClass();
                if (str.isEmpty()) {
                    jVar2.mo83170j("KEYBOARD_DISMISS_IN_0P", true);
                }
                if (f != null && !str.equals(f)) {
                    jVar2.mo83170j("KEYBOARD_DISMISS_BEFORE_DONE_TYPING", true);
                }
                jVar2.mo83176p("LAST_KEYBOARD_DISMISS_QUERY", str);
                jVar2.mo83170j("KEYBOARD_DISMISS_SINCE_LAST_UI_LOGGING_SNAPSHOT", true);
            }
        }
    }

    /* renamed from: k */
    public final synchronized void mo82379k(boolean z) {
        this.f239784b = z;
        C89205j jVar = this.f239791i;
        if (jVar != null) {
            jVar.mo83170j("IS_GOOGLE_KEYBOARD_USED", z);
        }
    }

    /* renamed from: l */
    public final synchronized void mo44232l(C41640a aVar) {
        if (this.f239790h) {
            if (this.f239784b) {
                aVar.mo44229d(ane.IS_GOOGLE_KEYBOARD_USED, this.f239784b);
            } else {
                aVar.mo44226a(ane.IS_GOOGLE_KEYBOARD_USED);
            }
            int i = this.f239785c;
            if (i > 0) {
                aVar.mo44227b(ane.KEYBOARD_PREDICTION_CLICKED_OR_AUTO_COMMIT_COUNT, i);
            } else {
                aVar.mo44226a(ane.KEYBOARD_PREDICTION_CLICKED_OR_AUTO_COMMIT_COUNT);
            }
            int i2 = this.f239786d;
            if (i2 > 0) {
                aVar.mo44227b(ane.KEYBOARD_TYPING_SUGGESTION_CLICK_COUNT, i2);
            } else {
                aVar.mo44226a(ane.KEYBOARD_TYPING_SUGGESTION_CLICK_COUNT);
            }
            int i3 = this.f239787e;
            if (i3 > 0) {
                aVar.mo44227b(ane.KEYBOARD_GESTURE_SUGGESTION_CLICK_COUNT, i3);
            } else {
                aVar.mo44226a(ane.KEYBOARD_GESTURE_SUGGESTION_CLICK_COUNT);
            }
            int i4 = this.f239788f;
            if (i4 > 0) {
                aVar.mo44227b(ane.KEYBOARD_RECORRECTION_CLICK_COUNT, i4);
            } else {
                aVar.mo44226a(ane.KEYBOARD_RECORRECTION_CLICK_COUNT);
            }
            int i5 = this.f239789g;
            if (i5 > 0) {
                aVar.mo44227b(ane.KEYBOARD_RECAPITALIZATION_CLICK_COUNT, i5);
            } else {
                aVar.mo44226a(ane.KEYBOARD_RECAPITALIZATION_CLICK_COUNT);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return false;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo82380m() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.shared.an.a.j r0 = r2.f239791i     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = "KEYBOARD_DISMISS_SINCE_LAST_UI_LOGGING_SNAPSHOT"
            boolean r0 = r0.mo83178r(r1)     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0010:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88684g.mo82380m():boolean");
    }
}
