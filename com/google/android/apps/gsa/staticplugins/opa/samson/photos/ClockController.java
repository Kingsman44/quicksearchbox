package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.libraries.p1730f.C21384g;
import com.google.android.libraries.p1730f.C21385h;
import com.google.android.libraries.p1730f.p1731a.C21378h;

/* compiled from: PG */
public final class ClockController {

    /* renamed from: a */
    public final C109024k f307461a;

    /* renamed from: b */
    public final C21385h f307462b = new C110351bj(this);

    /* renamed from: c */
    public final C21384g f307463c = new C110352bk(this);

    /* renamed from: d */
    public final C21378h f307464d;

    /* compiled from: PG */
    class Observer implements C2376g {
        public Observer() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            ClockController.this.f307461a.mo97394c(System.currentTimeMillis());
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            ClockController clockController = ClockController.this;
            clockController.f307464d.mo26881h(clockController.f307462b);
            ClockController clockController2 = ClockController.this;
            clockController2.f307464d.mo26880g(clockController2.f307463c);
        }

        /* renamed from: ha */
        public final void mo3525ha(C2391v vVar) {
            ClockController clockController = ClockController.this;
            clockController.f307464d.mo26883j(clockController.f307462b);
            ClockController clockController2 = ClockController.this;
            clockController2.f307464d.mo26882i(clockController2.f307463c);
        }
    }

    public ClockController(C109024k kVar, C21378h hVar) {
        this.f307461a = kVar;
        this.f307464d = hVar;
    }

    /* renamed from: a */
    public final void mo98565a() {
        this.f307461a.mo97394c(System.currentTimeMillis());
    }
}
