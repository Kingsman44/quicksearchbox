package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.view.ViewStub;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119898q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9420a.C125011a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bm */
/* compiled from: PG */
final class C126802bm implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126804bo f349194a;

    public C126802bm(C126804bo boVar) {
        this.f349194a = boVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C126804bo.f349196a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37174)).mo56386p("Assistant state loading failed");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C119903v vVar;
        C119903v vVar2;
        C119899r rVar;
        C119904w wVar = (C119904w) obj;
        C59104x b = C126804bo.f349196a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
        ((C59052c) ((C59052c) b).mo56372aa(37175)).mo56389s("onAssistantStateUpdate: %s", C125011a.m204943a(wVar));
        C126804bo boVar = this.f349194a;
        LogoView logoView = (LogoView) boVar.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_logo_view);
        int i = wVar.f333911a;
        int b2 = C119900s.m198775b(i);
        int i2 = b2 - 1;
        if (b2 == 0) {
            throw null;
        } else if (i2 == 0) {
            boVar.mo107806l();
            logoView.mo104345e(7, false);
            boVar.mo107800f(false);
        } else if (i2 == 1) {
            if (i == 2) {
                vVar = (C119903v) wVar.f333912b;
            } else {
                vVar = C119903v.f333904d;
            }
            int a = C119902u.m198776a(vVar.f333906a);
            int i3 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i3 == 0) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) boVar.f349216d.requireView().findViewById(R.id.assistant_roti_speaking_gif_animation);
                if (boVar.f349216d.requireView().findViewById(R.id.assistant_roti_speaking_gif_animation) == null) {
                    ((ViewStub) boVar.f349216d.requireView().findViewById(R.id.assistant_roti_speaking_gif_stub)).inflate();
                    lottieAnimationView = (LottieAnimationView) boVar.f349216d.requireView().findViewById(R.id.assistant_roti_speaking_gif_animation);
                    lottieAnimationView.setVisibility(0);
                }
                lottieAnimationView.f15138d.mo9773j(0.0f);
                lottieAnimationView.mo9695f();
                if (wVar.f333911a == 2) {
                    vVar2 = (C119903v) wVar.f333912b;
                } else {
                    vVar2 = C119903v.f333904d;
                }
                if (vVar2.f333906a == 1) {
                    rVar = (C119899r) vVar2.f333907b;
                } else {
                    rVar = C119899r.f333900c;
                }
                int a2 = C119898q.m198773a(rVar.f333902a);
                int i4 = a2 - 1;
                if (a2 != 0) {
                    if (i4 != 0) {
                        if (i4 == 1 || i4 == 2) {
                            if (logoView.f332963e != 2) {
                                boVar.mo107800f(true);
                                logoView.mo104345e(2, false);
                                boVar.mo107805k(new C126798bi(boVar));
                                return;
                            }
                            return;
                        } else if (i4 != 3) {
                            throw new AssertionError();
                        }
                    }
                    logoView.mo104345e(1, false);
                    return;
                }
                throw null;
            } else if (i3 == 1) {
                boVar.mo107806l();
                logoView.mo104345e(4, false);
            } else if (i3 == 2) {
                boVar.mo107806l();
                if (((TextView) boVar.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_transcription)).getVisibility() == 0) {
                    boVar.f349220h.mo19974a(C37176a.f96810H);
                }
                logoView.mo104345e(5, false);
            } else if (i3 != 3) {
                throw new AssertionError();
            }
        } else if (i2 == 2) {
            logoView.mo104345e(0, false);
        } else {
            throw new AssertionError();
        }
    }
}
