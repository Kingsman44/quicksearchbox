package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129963n;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.assistant.p3897e.p3921j.p3926e.C51912ds;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.j */
/* compiled from: PG */
final /* synthetic */ class C130038j implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C130040l f356593a;

    public C130038j(C130040l lVar) {
        this.f356593a = lVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C129963n nVar;
        C129963n nVar2;
        C129963n nVar3;
        C129963n nVar4;
        C129963n nVar5;
        C129963n nVar6;
        C129963n nVar7;
        C129966q qVar = (C129966q) obj;
        C130040l lVar = this.f356593a;
        lVar.mo109446b().setText(BuildConfig.FLAVOR);
        lVar.mo109447c().setText(BuildConfig.FLAVOR);
        lVar.mo109448d().setText(BuildConfig.FLAVOR);
        if (qVar != null && qVar.f356469b == 6) {
            C51912ds dsVar = ((C129963n) qVar.f356470c).f356449f;
            if (dsVar == null) {
                dsVar = C51912ds.f136180b;
            }
            if (dsVar.f136182a.size() != 0) {
                if (qVar.f356469b == 6) {
                    nVar = (C129963n) qVar.f356470c;
                } else {
                    nVar = C129963n.f356442m;
                }
                C51912ds dsVar2 = nVar.f356449f;
                if (dsVar2 == null) {
                    dsVar2 = C51912ds.f136180b;
                }
                dsVar2.f136182a.size();
                if (qVar.f356469b == 6) {
                    nVar2 = (C129963n) qVar.f356470c;
                } else {
                    nVar2 = C129963n.f356442m;
                }
                C51912ds dsVar3 = nVar2.f356449f;
                if (dsVar3 == null) {
                    dsVar3 = C51912ds.f136180b;
                }
                if (dsVar3.f136182a.size() > 0) {
                    TextView b = lVar.mo109446b();
                    View findViewById = lVar.f356597a.requireView().findViewById(R.id.assistant_interpreter_smart_reply_0);
                    C69664n.m101060f(findViewById, "fragment.requireView().f…nterpreter_smart_reply_0)");
                    LinearLayout linearLayout = (LinearLayout) findViewById;
                    if (qVar.f356469b == 6) {
                        nVar7 = (C129963n) qVar.f356470c;
                    } else {
                        nVar7 = C129963n.f356442m;
                    }
                    C51912ds dsVar4 = nVar7.f356449f;
                    if (dsVar4 == null) {
                        dsVar4 = C51912ds.f136180b;
                    }
                    String str = (String) dsVar4.f136182a.get(0);
                    C69664n.m101060f(str, "state.translationState.smartReplies.getReplies(0)");
                    lVar.mo109449e(b, linearLayout, str, C130040l.m212312f(qVar), "InterpreterSmartRepliesFragmentPeer.smartReplyLayout0");
                }
                if (qVar.f356469b == 6) {
                    nVar3 = (C129963n) qVar.f356470c;
                } else {
                    nVar3 = C129963n.f356442m;
                }
                C51912ds dsVar5 = nVar3.f356449f;
                if (dsVar5 == null) {
                    dsVar5 = C51912ds.f136180b;
                }
                if (dsVar5.f136182a.size() > 1) {
                    TextView c = lVar.mo109447c();
                    View findViewById2 = lVar.f356597a.requireView().findViewById(R.id.assistant_interpreter_smart_reply_1);
                    C69664n.m101060f(findViewById2, "fragment.requireView().f…nterpreter_smart_reply_1)");
                    LinearLayout linearLayout2 = (LinearLayout) findViewById2;
                    if (qVar.f356469b == 6) {
                        nVar6 = (C129963n) qVar.f356470c;
                    } else {
                        nVar6 = C129963n.f356442m;
                    }
                    C51912ds dsVar6 = nVar6.f356449f;
                    if (dsVar6 == null) {
                        dsVar6 = C51912ds.f136180b;
                    }
                    String str2 = (String) dsVar6.f136182a.get(1);
                    C69664n.m101060f(str2, "state.translationState.smartReplies.getReplies(1)");
                    lVar.mo109449e(c, linearLayout2, str2, C130040l.m212312f(qVar), "InterpreterSmartRepliesFragmentPeer.smartReplyLayout1");
                }
                if (qVar.f356469b == 6) {
                    nVar4 = (C129963n) qVar.f356470c;
                } else {
                    nVar4 = C129963n.f356442m;
                }
                C51912ds dsVar7 = nVar4.f356449f;
                if (dsVar7 == null) {
                    dsVar7 = C51912ds.f136180b;
                }
                if (dsVar7.f136182a.size() > 2) {
                    TextView d = lVar.mo109448d();
                    View findViewById3 = lVar.f356597a.requireView().findViewById(R.id.assistant_interpreter_smart_reply_2);
                    C69664n.m101060f(findViewById3, "fragment.requireView().f…nterpreter_smart_reply_2)");
                    LinearLayout linearLayout3 = (LinearLayout) findViewById3;
                    if (qVar.f356469b == 6) {
                        nVar5 = (C129963n) qVar.f356470c;
                    } else {
                        nVar5 = C129963n.f356442m;
                    }
                    C51912ds dsVar8 = nVar5.f356449f;
                    if (dsVar8 == null) {
                        dsVar8 = C51912ds.f136180b;
                    }
                    String str3 = (String) dsVar8.f136182a.get(2);
                    C69664n.m101060f(str3, "state.translationState.smartReplies.getReplies(2)");
                    lVar.mo109449e(d, linearLayout3, str3, C130040l.m212312f(qVar), "InterpreterSmartRepliesFragmentPeer.smartReplyLayout2");
                }
                lVar.mo109445a().setVisibility(0);
                return;
            }
        }
        lVar.mo109445a().setVisibility(8);
    }
}
