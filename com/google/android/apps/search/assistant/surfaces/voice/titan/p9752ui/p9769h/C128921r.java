package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128841p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.r */
/* compiled from: PG */
final class C128921r implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128914l f354292a;

    /* renamed from: b */
    private final C147785k f354293b;

    public C128921r(C128914l lVar) {
        this.f354292a = lVar;
        C147779b bVar = new C147779b(lVar.f354279m, new C128919p(lVar));
        bVar.f398751e = true;
        C147785k a = bVar.mo124453a();
        C69664n.m101060f(a, "animationControllerFacto…ue(true)\n        .build()");
        this.f354293b = a;
    }

    /* renamed from: c */
    private final Fragment m210436c() {
        return this.f354292a.f354272f.getChildFragmentManager().f634a.mo671c("FULL_PLATE_TAG");
    }

    /* renamed from: d */
    private final Fragment m210437d() {
        return this.f354292a.f354272f.getChildFragmentManager().f634a.mo671c("INTENT_PLATE_TAG");
    }

    /* renamed from: e */
    private final Fragment m210438e() {
        return this.f354292a.f354272f.getChildFragmentManager().f634a.mo671c("SOFT_PLATE_TAG");
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C128880a aVar;
        C128841p pVar = (C128841p) obj;
        C69664n.m101061g(pVar, "data");
        C59052c cVar = (C59052c) C128914l.f354267a.mo56224b();
        cVar.mo56379ah(new C59094n(38050));
        cVar.mo56389s("Voice plate mode: %s", pVar);
        C128841p pVar2 = C128841p.INITIALIZING;
        int ordinal = pVar.ordinal();
        if (ordinal != 1) {
            int i = R.anim.assistant_fade_out;
            int i2 = R.anim.assistant_fade_in;
            int i3 = R.anim.assistant_slide_in;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4 && m210437d() == null) {
                        if (m210438e() != null) {
                            i2 = R.anim.assistant_slide_in_soft_to_full;
                        } else if (m210436c() == null) {
                            i2 = R.anim.assistant_slide_in;
                        }
                        if (m210438e() != null || m210436c() == null) {
                            i = 0;
                        }
                        C0154a aVar2 = new C0154a(this.f354292a.f354272f.getChildFragmentManager());
                        aVar2.mo691x(i2, i, 0, 0);
                        AccountId accountId = this.f354292a.f354271e;
                        C128882ab abVar = new C128882ab();
                        C68324h.m98669f(abVar);
                        C47247a.m84047b(abVar, accountId);
                        aVar2.mo689v(R.id.assistant_plate_container, abVar, "INTENT_PLATE_TAG");
                        aVar2.mo509f();
                        this.f354293b.mo124460b(1.0f, C128914l.f354268b);
                    }
                } else if (m210438e() == null) {
                    boolean z = (m210436c() == null && m210437d() == null) ? false : true;
                    if (z) {
                        i3 = R.anim.assistant_soft_delay_in;
                    }
                    int i4 = true != z ? 0 : R.anim.assistant_slide_out_full_to_soft;
                    C0154a aVar3 = new C0154a(this.f354292a.f354272f.getChildFragmentManager());
                    aVar3.mo691x(i3, i4, 0, 0);
                    AccountId accountId2 = this.f354292a.f354271e;
                    C128900as asVar = new C128900as();
                    C68324h.m98669f(asVar);
                    C47247a.m84047b(asVar, accountId2);
                    aVar3.mo689v(R.id.assistant_plate_container, asVar, "SOFT_PLATE_TAG");
                    aVar3.mo509f();
                    this.f354293b.mo124460b(1.0f, C128914l.f354268b);
                }
            } else if (m210436c() == null) {
                if (m210438e() != null) {
                    i2 = R.anim.assistant_slide_in_soft_to_full;
                } else if (m210437d() == null) {
                    i2 = R.anim.assistant_slide_in;
                }
                if (m210438e() != null || m210437d() == null) {
                    i = 0;
                }
                C0154a aVar4 = new C0154a(this.f354292a.f354272f.getChildFragmentManager());
                aVar4.mo691x(i2, i, 0, 0);
                AccountId accountId3 = this.f354292a.f354271e;
                C128887ag agVar = new C128887ag();
                C68324h.m98669f(agVar);
                C47247a.m84047b(agVar, accountId3);
                aVar4.mo689v(R.id.assistant_plate_container, agVar, "FULL_PLATE_TAG");
                aVar4.mo509f();
                this.f354293b.mo124460b(1.0f, C128914l.f354268b);
            }
        } else {
            Fragment b = this.f354292a.f354272f.getChildFragmentManager().f634a.mo670b(R.id.assistant_plate_container);
            if (b == null) {
                C128913k.m210424a(this.f354292a.f354272f);
                return;
            }
            C128920q qVar = new C128920q(b);
            if (b instanceof C128887ag) {
                aVar = ((C128887ag) b).mo17754z();
            } else if (b instanceof C128900as) {
                aVar = ((C128900as) b).mo17754z();
            } else {
                aVar = b instanceof C128882ab ? ((C128882ab) b).mo17754z() : null;
            }
            if (aVar != null) {
                aVar.mo108720a(qVar);
            }
            C0154a aVar5 = new C0154a(this.f354292a.f354272f.getChildFragmentManager());
            aVar5.mo691x(0, R.anim.assistant_slide_out, 0, 0);
            aVar5.mo516m(b);
            aVar5.mo509f();
            this.f354293b.mo124460b(0.0f, C128914l.f354268b);
        }
    }
}
