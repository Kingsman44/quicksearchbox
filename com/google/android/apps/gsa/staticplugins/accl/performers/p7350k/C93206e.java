package com.google.android.apps.gsa.staticplugins.accl.performers.p7350k;

import com.google.android.apps.search.assistant.libraries.dictation.starter.C119336d;
import com.google.android.apps.search.assistant.verticals.p9880a.p9881a.p9882a.C130324a;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64728g;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k.e */
/* compiled from: PG */
public class C93206e {

    /* renamed from: a */
    public boolean f259930a = false;

    /* renamed from: b */
    private final C64735n f259931b;

    /* renamed from: c */
    private final C93205d f259932c;

    /* renamed from: d */
    private final C130324a f259933d;

    /* renamed from: e */
    private boolean f259934e = false;

    /* renamed from: f */
    private boolean f259935f = false;

    public C93206e(C64735n nVar, C93205d dVar, C130324a aVar) {
        this.f259931b = nVar;
        this.f259932c = dVar;
        this.f259933d = aVar;
        if (m153277d()) {
            aVar.mo107393a(nVar);
        }
    }

    /* renamed from: d */
    private final boolean m153277d() {
        int a = C64728g.m96445a(this.f259931b.f175479k);
        return a == 0 || a != 2;
    }

    /* renamed from: e */
    private final boolean m153278e(int i) {
        int a = C64728g.m96445a(this.f259931b.f175479k);
        if (a == 0) {
            a = 1;
        }
        return a == i;
    }

    /* renamed from: a */
    public void mo87566a() {
        this.f259930a = true;
    }

    /* renamed from: b */
    public void mo87567b() {
        if (this.f259931b.f175477i && this.f259930a) {
            this.f259932c.mo87565a();
        }
        if (m153277d() && !this.f259935f) {
            this.f259933d.mo107394b(this.f259931b, C62722b.INTERNAL);
        }
    }

    /* renamed from: c */
    public final void mo87568c(C119336d dVar) {
        if (m153277d()) {
            this.f259933d.mo107395c(this.f259931b, dVar);
        }
        C119336d dVar2 = C119336d.ABOUT_TO_START;
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            mo87566a();
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    this.f259934e = true;
                    if (m153278e(3)) {
                        this.f259935f = true;
                        this.f259933d.mo107394b(this.f259931b, C62722b.OK);
                    }
                } else if (ordinal == 4) {
                    if (this.f259931b.f175477i && !this.f259934e) {
                        this.f259932c.mo87565a();
                    }
                    if (m153277d() && !this.f259935f) {
                        this.f259933d.mo107394b(this.f259931b, C62722b.INTERNAL);
                    }
                } else if (ordinal == 5) {
                    mo87567b();
                }
            } else if (m153278e(5)) {
                this.f259935f = true;
                this.f259933d.mo107394b(this.f259931b, C62722b.OK);
            }
        } else if (m153278e(4)) {
            this.f259935f = true;
            this.f259933d.mo107394b(this.f259931b, C62722b.OK);
        }
    }
}
