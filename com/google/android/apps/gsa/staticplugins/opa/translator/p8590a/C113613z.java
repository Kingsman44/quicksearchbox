package com.google.android.apps.gsa.staticplugins.opa.translator.p8590a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.support.p031v4.app.C0167am;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.p119j.p120a.p121a.C2301c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.searchplate.C88911am;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C109738nl;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107473al;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107474am;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107475an;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107955f;
import com.google.android.apps.gsa.staticplugins.opa.translator.offline.C113631j;
import com.google.android.apps.gsa.staticplugins.opa.translator.offline.C113636o;
import com.google.android.apps.gsa.staticplugins.opa.translator.offline.C113640s;
import com.google.android.apps.gsa.staticplugins.opa.translator.offline.OfflineSubController;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113648a;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113653ae;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113654af;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113655ag;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113656ah;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113657ai;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113658aj;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113659ak;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113662an;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113663ao;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113672ax;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113674az;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113675b;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113676ba;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113677bb;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113685bj;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113687d;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113688e;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113689f;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113690g;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113691h;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113696m;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113697n;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113698o;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113699p;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterAlternativeTranslationsView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterIntroView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterKeyboardButtonView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterKeyboardInputView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterListeningBoxesView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterMainTextView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterMicButtonView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.OobeView;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.android.apps.gsa.staticplugins.opa.util.C113892w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.material.featurehighlight.C28521c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.material.p3505b.C44534d;
import com.google.assistant.p3897e.p3921j.p3925d.C51776b;
import com.google.assistant.p3897e.p3921j.p3925d.C51778d;
import com.google.assistant.p3897e.p3921j.p3925d.C51780f;
import com.google.assistant.p3897e.p3921j.p3925d.C51782h;
import com.google.assistant.p3897e.p3921j.p3925d.C51784j;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.a.z */
/* compiled from: PG */
public final class C113613z implements C11300h {

    /* renamed from: a */
    public static final C59071e f314555a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.a.z");

    /* renamed from: y */
    private static final C58485gu f314556y = C58485gu.m89849q("ui.SHOW_INTERPRETER", "ui.CURRENT_ACTION_INDICATOR", "ui.SHOW_SUGGESTIONS", "ui.HIGHLIGHT_USER_QUERY");

    /* renamed from: z */
    private static final C58485gu f314557z = C58485gu.m89849q("ui.SHOW_INTERPRETER", "ui.CURRENT_ACTION_INDICATOR", "ui.SHOW_SUGGESTIONS", "ui.HIGHLIGHT_USER_QUERY");

    /* renamed from: A */
    private final Query f314558A;

    /* renamed from: B */
    private final C113892w f314559B;

    /* renamed from: C */
    private final C86124t f314560C;

    /* renamed from: D */
    private final C113587a f314561D;

    /* renamed from: E */
    private final OfflineSubController f314562E;

    /* renamed from: F */
    private final C84469a f314563F;

    /* renamed from: G */
    private final long f314564G;

    /* renamed from: H */
    private C11301i f314565H;

    /* renamed from: I */
    private boolean f314566I;

    /* renamed from: J */
    private C51910dq f314567J;

    /* renamed from: K */
    private C0167am f314568K;

    /* renamed from: L */
    private int f314569L;

    /* renamed from: M */
    private boolean f314570M = false;

    /* renamed from: N */
    private int f314571N = 1;

    /* renamed from: O */
    private final C113812ca f314572O;

    /* renamed from: P */
    private final C104149a f314573P;

    /* renamed from: b */
    public final long f314574b;

    /* renamed from: c */
    public final long f314575c;

    /* renamed from: d */
    public final C107698i f314576d;

    /* renamed from: e */
    public final C107619d f314577e;

    /* renamed from: f */
    public final C109738nl f314578f;

    /* renamed from: g */
    public final C107955f f314579g;

    /* renamed from: h */
    public final SharedPreferences f314580h;

    /* renamed from: i */
    public final int f314581i;

    /* renamed from: j */
    public final C21370a f314582j;

    /* renamed from: k */
    public Context f314583k;

    /* renamed from: l */
    public RelativeLayout f314584l;

    /* renamed from: m */
    C113610w f314585m = C113610w.UNDEFINED;

    /* renamed from: n */
    C113680be f314586n = C113680be.UNKNOWN;

    /* renamed from: o */
    public boolean f314587o;

    /* renamed from: p */
    public String f314588p;

    /* renamed from: q */
    public String f314589q;

    /* renamed from: r */
    public final C113612y f314590r = new C113612y(this);

    /* renamed from: s */
    public String f314591s;

    /* renamed from: t */
    public boolean f314592t = false;

    /* renamed from: u */
    public boolean f314593u = false;

    /* renamed from: v */
    public String f314594v;

    /* renamed from: w */
    public Long f314595w;

    /* renamed from: x */
    public final long f314596x;

    public C113613z(C113892w wVar, C107698i iVar, Query query, C113812ca caVar, C107619d dVar, C109738nl nlVar, C107955f fVar, C86124t tVar, C104149a aVar, SharedPreferences sharedPreferences, C21370a aVar2, C113587a aVar3, OfflineSubController offlineSubController, C84469a aVar4) {
        this.f314559B = wVar;
        this.f314576d = iVar;
        this.f314558A = query;
        this.f314572O = caVar;
        this.f314577e = dVar;
        this.f314578f = nlVar;
        this.f314579g = fVar;
        this.f314560C = tVar;
        this.f314573P = aVar;
        this.f314580h = sharedPreferences;
        this.f314582j = aVar2;
        this.f314561D = aVar3;
        this.f314562E = offlineSubController;
        this.f314563F = aVar4;
        this.f314564G = Long.valueOf(tVar.mo79743a(C90042cu.f248702c)).longValue();
        this.f314581i = Long.valueOf(tVar.mo79743a(C90042cu.f248707h)).intValue();
        this.f314574b = (long) Long.valueOf(tVar.mo79743a(C90042cu.f248703d)).intValue();
        this.f314575c = (long) Long.valueOf(tVar.mo79743a(C90042cu.f248700a)).intValue();
        this.f314570M = Boolean.valueOf(tVar.mo79746e(C90042cu.f248704e)).booleanValue();
        this.f314596x = tVar.mo79743a(C90042cu.f248701b);
    }

    /* renamed from: L */
    private static InterpreterKeyboardInputView m188049L(RelativeLayout relativeLayout) {
        return (InterpreterKeyboardInputView) relativeLayout.findViewById(R.id.interpreter_source_keyboard_input);
    }

    /* renamed from: M */
    private static InterpreterKeyboardInputView m188050M(RelativeLayout relativeLayout) {
        return (InterpreterKeyboardInputView) relativeLayout.findViewById(R.id.interpreter_target_keyboard_input);
    }

    /* renamed from: N */
    private static InterpreterMainTextView m188051N(RelativeLayout relativeLayout) {
        return (InterpreterMainTextView) relativeLayout.findViewById(R.id.interpreter_main_text);
    }

    /* renamed from: O */
    private final void m188052O() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314584l == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28047)).mo56386p("InterpreterUi is null. Please call InterpreterController.initialize");
            return;
        }
        this.f314571N = 3;
        C11301i iVar = this.f314565H;
        if (iVar != null) {
            iVar.mo19723f(this.f314589q);
        }
        mo100336a(C113610w.SOURCE_KEYBOARD_VIEW, false);
        m188051N(this.f314584l).mo100412B(5, false);
        m188049L(this.f314584l).mo100405h();
    }

    /* renamed from: P */
    private final void m188053P(C51910dq dqVar) {
        RelativeLayout relativeLayout = this.f314584l;
        if (relativeLayout == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28048)).mo56386p("InterpreterUi is null.");
            return;
        }
        InterpreterIntroView f = m188061f(relativeLayout);
        C58976aa aaVar = C58975e.f156826a;
        if ((dqVar.f136161a & 32) != 0) {
            C51776b bVar = dqVar.f136165e;
            if (bVar == null) {
                bVar = C51776b.f135842e;
            }
            C51780f fVar = bVar.f135845b;
            if (fVar == null) {
                fVar = C51780f.f135862d;
            }
            C51776b bVar2 = dqVar.f136165e;
            if (bVar2 == null) {
                bVar2 = C51776b.f135842e;
            }
            C51780f fVar2 = bVar2.f135846c;
            if (fVar2 == null) {
                fVar2 = C51780f.f135862d;
            }
            C51778d dVar = fVar.f135866c;
            if (dVar == null) {
                dVar = C51778d.f135848m;
            }
            C51778d dVar2 = fVar2.f135866c;
            if (dVar2 == null) {
                dVar2 = C51778d.f135848m;
            }
            C51782h hVar = dVar.f135854e;
            if (hVar == null) {
                hVar = C51782h.f135867c;
            }
            f.f314730e = hVar.f135870b;
            C51782h hVar2 = dVar2.f135854e;
            if (hVar2 == null) {
                hVar2 = C51782h.f135867c;
            }
            f.f314731f = hVar2.f135870b;
            C51782h hVar3 = dVar.f135859j;
            if (hVar3 == null) {
                hVar3 = C51782h.f135867c;
            }
            f.f314732g = hVar3.f135870b;
            C51782h hVar4 = dVar2.f135859j;
            if (hVar4 == null) {
                hVar4 = C51782h.f135867c;
            }
            f.f314733h = hVar4.f135870b;
            C51782h hVar5 = dVar.f135858i;
            if (hVar5 == null) {
                hVar5 = C51782h.f135867c;
            }
            f.f314734i = hVar5.f135870b;
            C51782h hVar6 = dVar2.f135858i;
            if (hVar6 == null) {
                hVar6 = C51782h.f135867c;
            }
            f.f314735j = hVar6.f135870b;
        }
        String str = f.f314730e;
        String str2 = f.f314731f;
        String str3 = f.f314732g;
        String str4 = f.f314733h;
        String str5 = f.f314734i;
        String str6 = f.f314735j;
        InterpreterMainTextView N = m188051N(this.f314584l);
        InterpreterAlternativeTranslationsView o = N.mo100427o();
        if ((dqVar.f136161a & 32) != 0) {
            TextView a = o.mo100368a();
            C51776b bVar3 = dqVar.f136165e;
            if (bVar3 == null) {
                bVar3 = C51776b.f135842e;
            }
            C51784j jVar = bVar3.f135847d;
            if (jVar == null) {
                jVar = C51784j.f135871b;
            }
            C51782h hVar7 = jVar.f135873a;
            if (hVar7 == null) {
                hVar7 = C51782h.f135867c;
            }
            a.setText(hVar7.f135870b);
        }
        N.f314761f = dqVar.f136163c;
        N.f314762g = dqVar.f136164d;
        N.f314763h = dqVar.f136162b;
        if ((dqVar.f136161a & 32) != 0) {
            C51776b bVar4 = dqVar.f136165e;
            if (bVar4 == null) {
                bVar4 = C51776b.f135842e;
            }
            C51780f fVar3 = bVar4.f135845b;
            if (fVar3 == null) {
                fVar3 = C51780f.f135862d;
            }
            C51776b bVar5 = dqVar.f136165e;
            if (bVar5 == null) {
                bVar5 = C51776b.f135842e;
            }
            C51780f fVar4 = bVar5.f135846c;
            if (fVar4 == null) {
                fVar4 = C51780f.f135862d;
            }
            C51778d dVar3 = fVar3.f135866c;
            if (dVar3 == null) {
                dVar3 = C51778d.f135848m;
            }
            C51778d dVar4 = fVar4.f135866c;
            if (dVar4 == null) {
                dVar4 = C51778d.f135848m;
            }
            C51782h hVar8 = fVar3.f135865b;
            if (hVar8 == null) {
                hVar8 = C51782h.f135867c;
            }
            N.f314759d = hVar8.f135870b;
            C51782h hVar9 = fVar4.f135865b;
            if (hVar9 == null) {
                hVar9 = C51782h.f135867c;
            }
            N.f314760e = hVar9.f135870b;
            C51782h hVar10 = dVar3.f135851b;
            if (hVar10 == null) {
                hVar10 = C51782h.f135867c;
            }
            N.f314764i = hVar10.f135870b;
            C51782h hVar11 = dVar4.f135851b;
            if (hVar11 == null) {
                hVar11 = C51782h.f135867c;
            }
            N.f314765j = hVar11.f135870b;
        }
        String str7 = N.f314759d;
        String str8 = N.f314760e;
        String str9 = N.f314761f;
        String str10 = N.f314762g;
        String str11 = N.f314763h;
        String str12 = N.f314764i;
        String str13 = N.f314765j;
        InterpreterInputButtonPlateView e = m188060e(this.f314584l);
        C51776b bVar6 = dqVar.f136165e;
        if (bVar6 == null) {
            bVar6 = C51776b.f135842e;
        }
        C51780f fVar5 = bVar6.f135845b;
        if (fVar5 == null) {
            fVar5 = C51780f.f135862d;
        }
        C51782h hVar12 = fVar5.f135865b;
        if (hVar12 == null) {
            hVar12 = C51782h.f135867c;
        }
        String str14 = hVar12.f135870b;
        C51776b bVar7 = dqVar.f136165e;
        if (bVar7 == null) {
            bVar7 = C51776b.f135842e;
        }
        C51780f fVar6 = bVar7.f135846c;
        if (fVar6 == null) {
            fVar6 = C51780f.f135862d;
        }
        C51782h hVar13 = fVar6.f135865b;
        if (hVar13 == null) {
            hVar13 = C51782h.f135867c;
        }
        String str15 = hVar13.f135870b;
        e.mo100376e().mo100442e(str14);
        e.mo100373b().mo100397e(str14);
        e.mo100377f().mo100442e(str15);
        e.mo100374c().mo100397e(str15);
        m188049L(this.f314584l).mo100406i(dqVar);
        m188050M(this.f314584l).mo100406i(dqVar);
    }

    /* renamed from: Q */
    private final void m188054Q() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314584l == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28052)).mo56386p("InterpreterUi is null. Please call InterpreterController.initialize");
            return;
        }
        this.f314571N = 4;
        C11301i iVar = this.f314565H;
        if (iVar != null) {
            iVar.mo19723f(this.f314591s);
        }
        mo100336a(C113610w.TARGET_KEYBOARD_VIEW, false);
        m188051N(this.f314584l).mo100412B(6, false);
        m188050M(this.f314584l).mo100405h();
    }

    /* renamed from: R */
    private final boolean m188055R(C51910dq dqVar) {
        return dqVar.f136176p && this.f314560C.mo79746e(C90042cu.f248705f);
    }

    /* renamed from: S */
    private static boolean m188056S(C51910dq dqVar) {
        return !dqVar.f136166f.isEmpty();
    }

    /* renamed from: T */
    private static boolean m188057T(C51910dq dqVar) {
        return !dqVar.f136167g.isEmpty();
    }

    /* renamed from: c */
    public static LinearLayout m188058c(RelativeLayout relativeLayout) {
        return (LinearLayout) relativeLayout.findViewById(R.id.assistant_speaking_toast);
    }

    /* renamed from: d */
    public static ClientEventData m188059d(C107475an anVar) {
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_TEXT_TO_SPEECH;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107473al.f299053a, anVar);
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        return jVar.mo82013a();
    }

    /* renamed from: e */
    public static InterpreterInputButtonPlateView m188060e(RelativeLayout relativeLayout) {
        return (InterpreterInputButtonPlateView) relativeLayout.findViewById(R.id.input_button_plate);
    }

    /* renamed from: f */
    public static InterpreterIntroView m188061f(RelativeLayout relativeLayout) {
        return (InterpreterIntroView) relativeLayout.findViewById(R.id.interpreter_intro);
    }

    /* renamed from: g */
    public static ModeTogglePlateView m188062g(RelativeLayout relativeLayout) {
        return (ModeTogglePlateView) relativeLayout.findViewById(R.id.mode_toggle_plate);
    }

    /* renamed from: h */
    public static OobeView m188063h(RelativeLayout relativeLayout) {
        return (OobeView) relativeLayout.findViewById(R.id.action_buttons_and_toggle_plate);
    }

    /* renamed from: A */
    public final void mo100335A() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314584l == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28050)).mo56386p("InterpreterUi is null. Please call InterpreterController.initialize");
            return;
        }
        this.f314571N = 4;
        C11301i iVar = this.f314565H;
        if (iVar != null) {
            iVar.mo19723f(this.f314591s);
        }
        mo100336a(C113610w.MAIN_TEXT_VIEW, false);
        m188051N(this.f314584l).mo100412B(4, false);
        m188051N(this.f314584l).mo100435x();
        m188060e(this.f314584l).mo100383l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19698B(int r7) {
        /*
            r6 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.util.C90737au.m148206a(r7)
            android.widget.RelativeLayout r0 = r6.f314584l
            java.lang.String r1 = "InterpreterCtrl"
            if (r0 != 0) goto L_0x001e
            com.google.common.f.e r7 = f314555a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r1)
            java.lang.String r0 = "InterpreterUi is null."
            r1 = 28057(0x6d99, float:3.9316E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x001e:
            r0 = 3
            r2 = 2
            if (r7 != r2) goto L_0x00ac
            com.google.android.apps.gsa.staticplugins.opa.translator.a.w r7 = com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113610w.UNDEFINED
            int r7 = r6.f314571N
            int r3 = r7 + -1
            if (r7 == 0) goto L_0x00aa
            if (r3 == 0) goto L_0x004d
            if (r3 == r2) goto L_0x003f
            if (r3 == r0) goto L_0x0031
            goto L_0x0093
        L_0x0031:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r7 = r6.f314586n
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r3 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.KEYBOARD
            if (r7 != r3) goto L_0x003b
            r6.m188054Q()
            goto L_0x0093
        L_0x003b:
            r6.mo100335A()
            goto L_0x0093
        L_0x003f:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r7 = r6.f314586n
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r3 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.KEYBOARD
            if (r7 != r3) goto L_0x0049
            r6.m188052O()
            goto L_0x0093
        L_0x0049:
            r6.mo100351z()
            goto L_0x0093
        L_0x004d:
            com.google.common.f.e r7 = f314555a
            com.google.common.f.x r3 = r7.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r1)
            java.lang.String r4 = "Undefined micTapTarget"
            r5 = 28021(0x6d75, float:3.9266E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r3 = r6.f314586n
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r4 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.MANUAL
            if (r3 != r4) goto L_0x0079
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r3, r1)
            java.lang.String r3 = "Choosing Source language as speaker language as no language was chosen by user"
            r4 = 28024(0x6d78, float:3.927E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r4)).mo56386p(r3)
            r6.mo100351z()
            goto L_0x0093
        L_0x0079:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r3 = r6.f314586n
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r4 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.AUTO
            if (r3 != r4) goto L_0x0083
            r6.mo100350y()
            goto L_0x0093
        L_0x0083:
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r3, r1)
            java.lang.String r3 = "Unknown tap target. Ignoring"
            r4 = 28022(0x6d76, float:3.9267E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r4)).mo56386p(r3)
        L_0x0093:
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r7 = m188060e(r7)
            boolean r7 = r7.mo100389r()
            if (r7 != 0) goto L_0x00a8
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r7 = m188060e(r7)
            r7.mo100383l()
        L_0x00a8:
            r7 = 2
            goto L_0x00ac
        L_0x00aa:
            r7 = 0
            throw r7
        L_0x00ac:
            if (r7 != r0) goto L_0x00f3
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r7 = r6.f314586n
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r3 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.AUTO
            if (r7 != r3) goto L_0x00be
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterMainTextView r7 = m188051N(r7)
            r7.mo100436y()
            goto L_0x00c7
        L_0x00be:
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterMainTextView r7 = m188051N(r7)
            r7.mo100435x()
        L_0x00c7:
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r7 = m188060e(r7)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r3 = r7.f314718h
            int r4 = r7.f314724n
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r4 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.UNKNOWN
            if (r3 != r4) goto L_0x00ea
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView.f314711a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "InterpreterInputPlate"
            r7.mo56378ag(r0, r2)
            java.lang.String r0 = "Unknown mode type"
            r2 = 28170(0x6e0a, float:3.9475E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r2)).mo56386p(r0)
            goto L_0x0130
        L_0x00ea:
            r7.f314724n = r0
            r7.mo100385n(r2)
            r7.mo100386o()
            goto L_0x0130
        L_0x00f3:
            r0 = 5
            if (r7 == r0) goto L_0x00fc
            r0 = 9
            if (r7 != r0) goto L_0x010b
            r7 = 9
        L_0x00fc:
            android.widget.RelativeLayout r0 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r0 = m188060e(r0)
            boolean r0 = r0.mo100389r()
            if (r0 == 0) goto L_0x010b
            r6.mo100341n()
        L_0x010b:
            if (r7 == 0) goto L_0x014f
            switch(r7) {
                case 2: goto L_0x0130;
                case 3: goto L_0x0130;
                case 4: goto L_0x0111;
                case 5: goto L_0x014f;
                case 6: goto L_0x014f;
                case 7: goto L_0x014f;
                case 8: goto L_0x014f;
                case 9: goto L_0x014f;
                case 10: goto L_0x0130;
                default: goto L_0x0110;
            }
        L_0x0110:
            goto L_0x0176
        L_0x0111:
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r7 = m188060e(r7)
            boolean r7 = r7.mo100389r()
            if (r7 == 0) goto L_0x0176
            com.google.common.f.e r7 = f314555a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r1)
            java.lang.String r0 = "Expected Mic to be thinking"
            r1 = 28056(0x6d98, float:3.9315E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0130:
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r7 = m188060e(r7)
            boolean r7 = r7.mo100389r()
            if (r7 != 0) goto L_0x0176
            com.google.common.f.e r7 = f314555a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r1)
            java.lang.String r0 = "Expected Mic to be listening"
            r1 = 28055(0x6d97, float:3.9313E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x014f:
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r7 = m188060e(r7)
            boolean r7 = r7.mo100389r()
            if (r7 == 0) goto L_0x0176
            com.google.common.f.e r7 = f314555a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r1)
            java.lang.String r0 = "Expected mic to be idle"
            r1 = 28054(0x6d96, float:3.9312E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            android.widget.RelativeLayout r7 = r6.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r7 = m188060e(r7)
            r7.mo100381j()
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z.mo19698B(int):void");
    }

    /* renamed from: C */
    public final void mo19699C(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        RelativeLayout relativeLayout = this.f314584l;
        if (relativeLayout == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28061)).mo56386p("InterpreterUi is null.");
            return;
        }
        InterpreterMainTextView N = m188051N(relativeLayout);
        N.f314772q = z;
        ImageView f = N.mo100418f();
        if (z) {
            f.setImageResource(R.drawable.quantum_gm_ic_stop_vd_theme_24);
            f.setTag(Integer.valueOf(R.drawable.quantum_gm_ic_stop_vd_theme_24));
            return;
        }
        f.setImageResource(R.drawable.quantum_gm_ic_volume_up_vd_theme_24);
        f.setTag(Integer.valueOf(R.drawable.quantum_gm_ic_volume_up_vd_theme_24));
        if (this.f314586n == C113680be.AUTO && this.f314592t && !m188063h(this.f314584l).mo100463e()) {
            m188060e(this.f314584l).mo100375d().mo100440c();
        }
        this.f314592t = false;
        if (!this.f314593u && m188058c(this.f314584l).getVisibility() == 0) {
            m188058c(this.f314584l).setVisibility(8);
            m188051N(this.f314584l).mo100435x();
        }
    }

    /* renamed from: D */
    public final boolean mo19700D() {
        return this.f314566I;
    }

    /* renamed from: E */
    public final boolean mo19701E(String str) {
        return f314556y.contains(str);
    }

    /* renamed from: F */
    public final boolean mo19702F(String str) {
        return f314557z.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19703G(com.google.assistant.p3897e.p3921j.C51809dy r7) {
        /*
            r6 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = r7.f135936b
            com.google.common.b.gu r1 = f314557z
            boolean r0 = r1.contains(r0)
            java.lang.String r1 = "InterpreterCtrl"
            r2 = 0
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r7.f135936b
            int r3 = r0.hashCode()
            r4 = -1106977946(0xffffffffbe04db66, float:-0.12974319)
            r5 = 1
            if (r3 == r4) goto L_0x002b
            r4 = 717469746(0x2ac3b832, float:3.476677E-13)
            if (r3 == r4) goto L_0x0021
            goto L_0x0035
        L_0x0021:
            java.lang.String r3 = "ui.SHOW_INTERPRETER"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x002b:
            java.lang.String r3 = "ui.CURRENT_ACTION_INDICATOR"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x0069
            if (r0 == r5) goto L_0x0057
            com.google.common.f.e r0 = f314555a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 28063(0x6d9f, float:3.9325E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "This clientOp (%s) is in the allowed list but has no handling logic. This should not happen."
            java.lang.String r7 = r7.f135936b
            r0.mo56389s(r1, r7)
            goto L_0x0080
        L_0x0057:
            com.google.assistant.e.j.e.dq r0 = com.google.assistant.p3897e.p3921j.p3926e.C51910dq.f136159t
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r1 = "show_interpreter_args"
            com.google.protobuf.MessageLite r7 = com.google.android.apps.gsa.staticplugins.opa.util.C113864cs.m188495a(r7, r1, r0)
            com.google.assistant.e.j.e.dq r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51910dq) r7
            r6.mo100347v(r7, r2)
            goto L_0x0080
        L_0x0069:
            com.google.assistant.e.j.e.in r0 = com.google.assistant.p3897e.p3921j.p3926e.C52042in.f136592c
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r1 = "ui_current_action_indicator_args"
            com.google.protobuf.MessageLite r7 = com.google.android.apps.gsa.staticplugins.opa.util.C113864cs.m188495a(r7, r1, r0)
            com.google.assistant.e.j.e.in r7 = (com.google.assistant.p3897e.p3921j.p3926e.C52042in) r7
            if (r7 == 0) goto L_0x0080
            com.google.android.apps.gsa.staticplugins.opa.util.w r0 = r6.f314559B
            if (r0 == 0) goto L_0x0080
            r0.mo98072d(r7)
        L_0x0080:
            return r2
        L_0x0081:
            com.google.common.f.e r0 = f314555a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 28064(0x6da0, float:3.9326E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "This clientOp (%s) is not supported by this controller."
            java.lang.String r7 = r7.f135936b
            r0.mo56389s(r1, r7)
            com.google.android.apps.gsa.staticplugins.opa.translator.a.w r7 = com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113610w.UNDEFINED
            r6.mo100336a(r7, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z.mo19703G(com.google.assistant.e.j.dy):boolean");
    }

    /* renamed from: H */
    public final boolean mo19704H(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        RelativeLayout relativeLayout = this.f314584l;
        if (relativeLayout == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28067)).mo56386p("InterpreterUi is null.");
            return true;
        }
        m188051N(relativeLayout).mo100434w(str, str2);
        if (this.f314585m == C113610w.SOURCE_KEYBOARD_VIEW || this.f314585m == C113610w.TARGET_KEYBOARD_VIEW) {
            mo100336a(C113610w.MAIN_TEXT_VIEW, false);
        }
        if (!m188060e(this.f314584l).mo100390s()) {
            C59104x c2 = f314555a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c2).mo56372aa(28066)).mo56354G("Couldn't set final Recognized text to %s since current ui state is %s", str, this.f314585m);
            mo100336a(C113610w.UNDEFINED, false);
        }
        return true;
    }

    /* renamed from: I */
    public final boolean mo19705I() {
        Context context;
        RelativeLayout relativeLayout;
        C58976aa aaVar = C58975e.f156826a;
        mo100339l();
        C51910dq dqVar = this.f314567J;
        if (dqVar == null || !this.f314562E.mo100353b(dqVar) || (context = this.f314583k) == null || (relativeLayout = this.f314584l) == null) {
            return false;
        }
        OfflineSubController offlineSubController = this.f314562E;
        C51910dq dqVar2 = this.f314567J;
        offlineSubController.f314602f.mo28211k(offlineSubController.mo100352a(dqVar2.f136163c, dqVar2.f136164d), "maybeSwitchToOfflineMode", new C113636o(offlineSubController, dqVar2, new C113611x(this, this.f314588p), context, relativeLayout));
        return true;
    }

    /* renamed from: J */
    public final boolean mo19706J(String str, String str2, String str3) {
        C58976aa aaVar = C58975e.f156826a;
        RelativeLayout relativeLayout = this.f314584l;
        if (relativeLayout == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28072)).mo56386p("InterpreterUi is null.");
            return true;
        }
        m188051N(relativeLayout).mo100437z(str, str2, str3);
        return true;
    }

    /* renamed from: K */
    public final int mo19707K() {
        return 1;
    }

    /* renamed from: a */
    public final int mo100336a(C113610w wVar, boolean z) {
        Animation animation;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314584l == null || this.f314583k == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28003)).mo56386p("InterpreterUi or context is null.");
            return 0;
        }
        this.f314585m = wVar;
        if (this.f314586n != C113680be.AUTO) {
            this.f314578f.mo98059d();
        }
        C113610w wVar2 = C113610w.UNDEFINED;
        int ordinal = wVar.ordinal();
        if (ordinal != 0) {
            int i = 3;
            if (ordinal == 1) {
                int integer = (!z || !(m188051N(this.f314584l).getVisibility() == 0 || m188049L(this.f314584l).getVisibility() == 0 || m188050M(this.f314584l).getVisibility() == 0)) ? 0 : this.f314583k.getResources().getInteger(R.integer.mode_change_fade_out_duration_millis);
                m188062g(this.f314584l).setVisibility(0);
                InterpreterMainTextView N = m188051N(this.f314584l);
                N.getVisibility();
                if (N.getVisibility() == 8) {
                    N.mo100433v();
                } else {
                    N.f314758c.cancel();
                    N.f314758c.reset();
                    N.f314758c.setAnimationListener(new C113663ao(N));
                    N.startAnimation(N.f314758c);
                }
                m188049L(this.f314584l).mo100408k(z ? 3 : 1);
                InterpreterKeyboardInputView M = m188050M(this.f314584l);
                if (!z) {
                    i = 1;
                }
                M.mo100408k(i);
                InterpreterIntroView f = m188061f(this.f314584l);
                if (!f.f314737l) {
                    f.f314737l = true;
                    f.f314727b.cancel();
                    f.f314727b.reset();
                    f.f314726a.cancel();
                    f.f314726a.reset();
                    if (z) {
                        f.f314728c.setStartOffset((long) integer);
                        animation = f.f314728c;
                    } else {
                        f.f314726a.setStartOffset(0);
                        animation = f.f314726a;
                    }
                    f.startAnimation(animation);
                    f.setVisibility(0);
                }
                m188060e(this.f314584l).mo100384m(integer);
                return integer + this.f314583k.getResources().getInteger(R.integer.mode_change_fade_in_duration_millis);
            } else if (ordinal == 2) {
                m188061f(this.f314584l).mo100391a(false);
                InterpreterMainTextView N2 = m188051N(this.f314584l);
                N2.setVisibility(0);
                N2.f314773r = true;
                m188062g(this.f314584l).setVisibility(0);
                m188049L(this.f314584l).mo100408k(2);
                m188050M(this.f314584l).mo100408k(2);
                m188060e(this.f314584l).mo100384m(0);
            } else if (ordinal == 3) {
                m188061f(this.f314584l).mo100391a(true);
                m188051N(this.f314584l).mo100433v();
                m188062g(this.f314584l).setVisibility(8);
                m188049L(this.f314584l).mo100407j();
                m188050M(this.f314584l).mo100408k(1);
                m188060e(this.f314584l).setVisibility(8);
            } else if (ordinal == 4) {
                m188061f(this.f314584l).mo100391a(true);
                m188051N(this.f314584l).mo100433v();
                m188062g(this.f314584l).setVisibility(8);
                m188049L(this.f314584l).mo100408k(1);
                m188050M(this.f314584l).mo100407j();
                m188060e(this.f314584l).setVisibility(8);
            }
        } else {
            C59104x c2 = f314555a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c2).mo56372aa(28004)).mo56386p("Undefined Main View State");
            m188061f(this.f314584l).mo100391a(true);
            m188051N(this.f314584l).mo100433v();
            m188062g(this.f314584l).setVisibility(0);
            m188049L(this.f314584l).mo100408k(1);
            m188050M(this.f314584l).mo100408k(1);
            m188060e(this.f314584l).setVisibility(8);
        }
        return 0;
    }

    /* renamed from: b */
    public final View mo19708b(C0167am amVar, C11301i iVar, C11054a aVar) {
        this.f314565H = iVar;
        amVar.getWindow().getDecorView().findViewById(16908290).getViewTreeObserver().addOnGlobalLayoutListener(new C113609v(this));
        this.f314583k = amVar.getApplicationContext();
        this.f314568K = amVar;
        if (this.f314573P.mo93971b()) {
            amVar.setTheme(R.style.Interpreter_MaterialNext);
            if (C44534d.m78715b()) {
                amVar.getTheme().applyStyle(2132150627, true);
            }
        } else {
            amVar.setTheme(R.style.Interpreter_MaterialPre);
        }
        this.f314569L = amVar.getRequestedOrientation();
        C90779c.m148334a(amVar, 1);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(amVar).inflate(R.layout.interpreter, (ViewGroup) null);
        this.f314584l = relativeLayout;
        this.f314566I = true;
        C28292j jVar = new C28292j(77073);
        jVar.mo33795i(5);
        jVar.mo33795i(22);
        C28295m.m52919e(relativeLayout, jVar);
        ModeTogglePlateView g = m188062g(relativeLayout);
        C28292j jVar2 = new C28292j(77074);
        jVar2.mo33795i(5);
        jVar2.mo33795i(22);
        C28295m.m52919e(g, jVar2);
        InterpreterMicButtonView d = m188060e(relativeLayout).mo100375d();
        C28292j jVar3 = new C28292j(77075);
        jVar3.mo33795i(5);
        C28295m.m52919e(d, jVar3);
        InterpreterMicButtonView e = m188060e(relativeLayout).mo100376e();
        C28292j jVar4 = new C28292j(77076);
        jVar4.mo33795i(5);
        C28295m.m52919e(e, jVar4);
        InterpreterMicButtonView f = m188060e(relativeLayout).mo100377f();
        C28292j jVar5 = new C28292j(77077);
        jVar5.mo33795i(5);
        C28295m.m52919e(f, jVar5);
        InterpreterKeyboardButtonView b = m188060e(relativeLayout).mo100373b();
        C28292j jVar6 = new C28292j(77078);
        jVar6.mo33795i(5);
        C28295m.m52919e(b, jVar6);
        InterpreterKeyboardButtonView c = m188060e(relativeLayout).mo100374c();
        C28292j jVar7 = new C28292j(77079);
        jVar7.mo33795i(5);
        C28295m.m52919e(c, jVar7);
        C86124t tVar = this.f314560C;
        RelativeLayout relativeLayout2 = this.f314584l;
        if (relativeLayout2 == null) {
            C59104x c2 = f314555a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c2).mo56372aa(28009)).mo56386p("InterpreterUi is null.");
        } else {
            InterpreterIntroView f2 = m188061f(relativeLayout2);
            f2.f314737l = f2.getVisibility() == 0;
            f2.f314727b.setAnimationListener(new C113696m(f2));
            f2.f314726a.setAnimationListener(new C113697n(f2));
            f2.f314729d.setAnimationListener(new C113698o(f2));
            f2.f314728c.setAnimationListener(new C113699p(f2));
            C113591d dVar = new C113591d(this);
            OobeView h = m188063h(this.f314584l);
            C21370a aVar2 = this.f314582j;
            SharedPreferences sharedPreferences = this.f314580h;
            h.f314807g = aVar2;
            h.f314805e = amVar;
            h.f314806f = sharedPreferences;
            h.f314803c = dVar;
            h.f314802b.setIsLongpressEnabled(false);
            h.f314810j = Long.valueOf(tVar.mo79743a(C90042cu.f248713n)).longValue();
            h.f314811k = Long.valueOf(tVar.mo79743a(C90042cu.f248714o)).longValue();
            h.f314812l = Boolean.valueOf(tVar.mo79746e(C90042cu.f248718s)).booleanValue();
            ModeTogglePlateView g2 = m188062g(this.f314584l);
            C21370a aVar3 = this.f314582j;
            OobeView h2 = m188063h(this.f314584l);
            C113599l lVar = new C113599l(this);
            g2.f314794i = lVar;
            g2.f314788c = h2;
            g2.f314792g = Double.valueOf(tVar.mo79747m(C90042cu.f248717r)).floatValue();
            g2.mo100447b().setOnClickListener(new C113685bj(aVar3, new C113674az(g2, lVar)));
            g2.mo100449d().setOnClickListener(new C113685bj(aVar3, new C113676ba(g2, lVar)));
            g2.mo100448c().setOnClickListener(new C113685bj(aVar3, new C113677bb(g2)));
            TextView b2 = g2.mo100447b();
            C28292j jVar8 = new C28292j(96219);
            jVar8.mo33795i(5);
            C28295m.m52919e(b2, jVar8);
            TextView d2 = g2.mo100449d();
            C28292j jVar9 = new C28292j(96220);
            jVar9.mo33795i(5);
            C28295m.m52919e(d2, jVar9);
            TextView c3 = g2.mo100448c();
            C28292j jVar10 = new C28292j(96221);
            jVar10.mo33795i(5);
            C28295m.m52919e(c3, jVar10);
            InterpreterInputButtonPlateView e2 = m188060e(this.f314584l);
            C21370a aVar4 = this.f314582j;
            C107619d dVar2 = this.f314577e;
            C113592e eVar = new C113592e(this);
            C88911am amVar2 = new C88911am();
            amVar2.f240858a = dVar2;
            e2.mo100378g().f63000g.mo28247c(amVar2, 2);
            e2.mo100378g().setOnClickListener(new C113685bj(aVar4, new C113675b(eVar)));
            e2.mo100378g().mo28223c(30.0f, 30.0f);
            InterpreterMicButtonView d3 = e2.mo100375d();
            C58976aa aaVar = C58975e.f156826a;
            d3.mo100439b().setVisibility(8);
            d3.mo100443f(C19391a.m36980a(d3.getContext(), R.attr.colorPrimary), C19391a.m36980a(d3.getContext(), R.attr.colorOnPrimary));
            InterpreterMicButtonView e3 = e2.mo100376e();
            e3.mo100439b().setTextColor(C19391a.m36980a(e3.getContext(), R.attr.colorPrimary));
            e3.mo100443f(C19391a.m36980a(e3.getContext(), R.attr.colorPrimary), C19391a.m36980a(e3.getContext(), R.attr.colorOnPrimary));
            InterpreterMicButtonView f3 = e2.mo100377f();
            f3.mo100439b().setTextColor(C19391a.m36980a(f3.getContext(), R.attr.colorSecondary));
            f3.mo100443f(C19391a.m36980a(f3.getContext(), R.attr.colorSecondary), C19391a.m36980a(f3.getContext(), R.attr.colorOnSecondary));
            InterpreterKeyboardButtonView b3 = e2.mo100373b();
            b3.mo100394b().setTextColor(C19391a.m36980a(b3.getContext(), R.attr.colorPrimary));
            b3.mo100396d(C19391a.m36980a(b3.getContext(), R.attr.colorPrimary), C19391a.m36980a(b3.getContext(), R.attr.colorOnPrimary));
            InterpreterKeyboardButtonView c4 = e2.mo100374c();
            c4.mo100394b().setTextColor(C19391a.m36980a(c4.getContext(), R.attr.colorSecondary));
            c4.mo100396d(C19391a.m36980a(c4.getContext(), R.attr.colorSecondary), C19391a.m36980a(c4.getContext(), R.attr.colorOnSecondary));
            e2.f314712b.mo100525c(new C113687d(e2));
            e2.f314713c.mo100525c(new C113688e(e2));
            e2.f314714d.mo100525c(new C113689f(e2));
            e2.f314715e.mo100525c(new C113690g(e2));
            e2.f314717g.mo100525c(new C113691h(e2));
            m188060e(this.f314584l).mo100375d().mo100441d(this.f314582j, new C113593f(this));
            m188060e(this.f314584l).mo100376e().mo100441d(this.f314582j, new C113594g(this));
            m188060e(this.f314584l).mo100377f().mo100441d(this.f314582j, new C113595h(this));
            m188060e(this.f314584l).mo100373b().mo100395c(this.f314582j, new C113596i(this));
            m188060e(this.f314584l).mo100374c().mo100395c(this.f314582j, new C113597j(this));
            InterpreterMainTextView N = m188051N(this.f314584l);
            C21370a aVar5 = this.f314582j;
            C84469a aVar6 = this.f314563F;
            C113600m mVar = new C113600m(this);
            N.f314776u = aVar5;
            N.f314779x = tVar;
            N.f314780y = mVar;
            N.f314770o = Long.valueOf(tVar.mo79743a(C90042cu.f248709j)).longValue();
            N.mo100426n().setOnClickListener(new C113653ae(N, mVar));
            N.mo100425m().setOnClickListener(new C113654af(N, mVar));
            N.mo100422j().setOnClickListener(new C113655ag(N, mVar));
            N.mo100418f().setOnClickListener(new C113685bj(aVar5, new C113656ah(N)));
            N.mo100417e().setOnClickListener(new C113685bj(aVar5, new C113657ai(N, aVar6)));
            List a = N.mo100429q().mo100444a();
            for (int i = 0; i < a.size(); i++) {
                TextView textView = (TextView) a.get(i);
                textView.setOnClickListener(new C113685bj(aVar5, new C113658aj(N, textView, mVar)));
            }
            if (tVar.mo79746e(C90042cu.f248706g)) {
                N.mo100429q().findViewById(R.id.interpreter_speaking_practice_suggestion).setOnClickListener(new C113685bj(aVar5, new C113659ak(N)));
            }
            ImageView f4 = N.mo100418f();
            C28292j jVar11 = new C28292j(90794);
            jVar11.mo33795i(5);
            C28295m.m52919e(f4, jVar11);
            ImageView e4 = N.mo100417e();
            C28292j jVar12 = new C28292j(90788);
            jVar12.mo33795i(5);
            C28295m.m52919e(e4, jVar12);
            View findViewById = N.mo100429q().findViewById(R.id.interpreter_speaking_practice_suggestion);
            C28292j jVar13 = new C28292j(127805);
            jVar13.mo33795i(5);
            C28295m.m52919e(findViewById, jVar13);
            List a2 = N.mo100429q().mo100444a();
            if (!a2.isEmpty()) {
                C28292j jVar14 = new C28292j(77084);
                jVar14.mo33795i(5);
                C28295m.m52919e((View) a2.get(0), jVar14);
            }
            if (a2.size() > 1) {
                C28292j jVar15 = new C28292j(77085);
                jVar15.mo33795i(5);
                C28295m.m52919e((View) a2.get(1), jVar15);
            }
            if (a2.size() > 2) {
                C28292j jVar16 = new C28292j(77086);
                jVar16.mo33795i(5);
                C28295m.m52919e((View) a2.get(2), jVar16);
            }
            InterpreterListeningBoxesView p = N.mo100428p();
            p.f314748b = (ImageView) N.findViewById(R.id.auto_listening_box_language_name);
            p.mo117383z();
            p.f314750d = Long.valueOf(tVar.mo79743a(C90042cu.f248708i)).intValue();
            C113662an anVar = new C113662an(N);
            InterpreterAlternativeTranslationsView o = N.mo100427o();
            for (int i2 = 0; i2 < o.mo100369b().size(); i2++) {
                List c5 = o.mo100370c(i2);
                if (!c5.isEmpty()) {
                    ((View) o.mo100369b().get(i2)).setOnClickListener(new C113685bj(aVar5, new C113648a(o, (TextView) c5.get(0), anVar)));
                }
            }
            m188049L(this.f314584l).mo100402e(this.f314582j, true, new C113604q(this));
            m188050M(this.f314584l).mo100402e(this.f314582j, false, new C113608u(this));
        }
        C89949q.m146521e(C28285c.m52874a(this.f314584l, 77433), false);
        return this.f314584l;
    }

    /* renamed from: i */
    public final C28521c mo19709i(String str) {
        RelativeLayout relativeLayout = this.f314584l;
        if (relativeLayout == null) {
            return null;
        }
        OobeView h = m188063h(relativeLayout);
        if (h.f314809i == C113680be.UNKNOWN || !"interpreter_oobe_callback_id".equals(str)) {
            return null;
        }
        return h.f314801a;
    }

    /* renamed from: j */
    public final String mo100337j() {
        String str = this.f314589q;
        String str2 = this.f314591s;
        if (str.isEmpty() || str2.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        String a = C113672ax.m188246a(str);
        String a2 = C113672ax.m188246a(str2);
        if (a.compareTo(a2) >= 0) {
            return "interpreter_which_mode_key:" + a + ":" + a2;
        }
        return "interpreter_which_mode_key:" + a2 + ":" + a;
    }

    /* renamed from: k */
    public final void mo100338k() {
        Context context;
        if (this.f314584l != null && (context = this.f314583k) != null) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(this.f314584l.getApplicationWindowToken(), 1);
        }
    }

    /* renamed from: l */
    public final void mo100339l() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314562E.mo100354c(this.f314567J)) {
            SpeechRecognizer speechRecognizer = this.f314562E.f314598b.f314662c;
            if (speechRecognizer != null) {
                speechRecognizer.stopListening();
                return;
            }
            return;
        }
        this.f314576d.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
        this.f314576d.mo96218a(this.f314558A.mo84259V().mo84244G(true));
    }

    /* renamed from: m */
    public final void mo100340m(String str, String str2, boolean z) {
        Query query;
        if (this.f314562E.mo100354c(this.f314567J)) {
            OfflineSubController offlineSubController = this.f314562E;
            String str3 = this.f314589q;
            offlineSubController.mo100355d(str, str3, this.f314591s, str2.equals(str3), new C113611x(this, str2));
            return;
        }
        Query ax = this.f314558A.mo84268aE(str, false).mo84312ax(str2);
        if (z) {
            C11301i iVar = this.f314565H;
            if (iVar != null) {
                iVar.mo19731n(1);
            }
            query = ax.mo84245H(0, true, QueryTriggerType.OPA_SUGGESTION_CHIP);
        } else {
            C11301i iVar2 = this.f314565H;
            if (iVar2 != null) {
                iVar2.mo19731n(2);
            }
            query = ax.mo84245H(0, false, (QueryTriggerType) null);
        }
        this.f314594v = C39191a.m68623b(query.f252749G);
        this.f314576d.mo96218a(query);
    }

    /* renamed from: n */
    public final void mo100341n() {
        if (this.f314584l == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C51910dq dqVar = this.f314567J;
        boolean z = dqVar != null && m188056S(dqVar) && m188057T(this.f314567J);
        C59104x b = f314555a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(28007)).mo56359L("goToIdleView: %b %s %b", Boolean.valueOf(z), this.f314586n, Boolean.valueOf(this.f314587o));
        m188060e(this.f314584l).mo100381j();
        if (this.f314586n == C113680be.AUTO && this.f314570M) {
            InterpreterMicButtonView d = m188060e(this.f314584l).mo100375d();
            if (d.f314782a == null) {
                View findViewById = d.findViewById(R.id.pulse_circle);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, View.ALPHA, new float[]{0.5f, 0.0f});
                ofFloat.setRepeatMode(1);
                ofFloat.setRepeatCount(-1);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, View.SCALE_X, new float[]{1.0f, 1.5f});
                ofFloat2.setRepeatMode(1);
                ofFloat2.setRepeatCount(-1);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById, View.SCALE_Y, new float[]{1.0f, 1.5f});
                ofFloat3.setRepeatMode(1);
                ofFloat3.setRepeatCount(-1);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(1200);
                animatorSet.setStartDelay(600);
                animatorSet.setInterpolator(new C2301c());
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                d.f314782a = animatorSet;
            }
            if (!d.f314782a.isStarted()) {
                d.f314782a.start();
            }
        }
        this.f314578f.mo98059d();
        if (!z || !this.f314587o) {
            mo100336a(C113610w.INTRO_VIEW, false);
        } else {
            mo100347v(this.f314567J, true);
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void mo100342o() {
        if (this.f314584l == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28012)).mo56386p("InterpreterUi is null in onAutoOobeComplete");
        } else if (this.f314586n == C113680be.AUTO && !m188060e(this.f314584l).mo100388q()) {
            C58976aa aaVar = C58975e.f156826a;
            m188060e(this.f314584l).mo100375d().mo100440c();
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void mo100343p() {
        if (this.f314584l == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28013)).mo56386p("null UI");
            return;
        }
        mo100339l();
        m188060e(this.f314584l).mo100381j();
        mo100341n();
    }

    /* renamed from: q */
    public final void mo19710q() {
        C58976aa aaVar = C58975e.f156826a;
        this.f314566I = false;
        C0167am amVar = this.f314568K;
        if (amVar != null) {
            C90779c.m148334a(amVar, this.f314569L);
        }
        C11301i iVar = this.f314565H;
        if (iVar != null) {
            iVar.mo19723f(BuildConfig.FLAVOR);
        }
        mo100338k();
    }

    /* renamed from: r */
    public final void mo19711r() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: s */
    public final void mo100344s(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314562E.mo100354c(this.f314567J)) {
            OfflineSubController offlineSubController = this.f314562E;
            String str2 = this.f314589q;
            String str3 = this.f314591s;
            boolean equals = str.equals(str2);
            C113611x xVar = new C113611x(this, str);
            String str4 = (String) offlineSubController.f314599c.get(true != equals ? str3 : str2);
            if (str4 != null) {
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent.putExtra("android.speech.extra.LANGUAGE", str4);
                intent.putExtra("com.google.recognition.extra.MUTE_AUDIO_BEEPS", true);
                C113631j jVar = offlineSubController.f314598b;
                C113640s sVar = new C113640s(offlineSubController, xVar, str2, str3, equals);
                if (jVar.f314662c == null && jVar.mo100358a()) {
                    jVar.f314662c = SpeechRecognizer.createOnDeviceSpeechRecognizer(jVar.f314661b);
                    ((C59052c) ((C59052c) C113631j.f314660a.mo56224b()).mo56372aa(28094)).mo56389s("speechRecognizer %s", jVar.f314662c);
                }
                SpeechRecognizer speechRecognizer = jVar.f314662c;
                if (speechRecognizer != null) {
                    speechRecognizer.setRecognitionListener(sVar);
                    speechRecognizer.startListening(intent);
                    return;
                }
                return;
            }
            return;
        }
        Query aA = this.f314558A.mo84245H(1, true, (QueryTriggerType) null).mo84264aA(this.f314572O.f315214a, Bundle.EMPTY);
        if (!C58837ba.m90859h(str)) {
            aA = aA.mo84312ax(str);
        }
        C11301i iVar = this.f314565H;
        if (iVar != null) {
            iVar.mo19731n(1);
        }
        this.f314594v = C39191a.m68623b(aA.f252749G);
        this.f314576d.mo96218a(aA);
    }

    /* renamed from: t */
    public final void mo100345t(String str) {
        if (this.f314584l != null) {
            m188052O();
            m188049L(this.f314584l).mo100404g(str);
        }
    }

    /* renamed from: u */
    public final void mo100346u(String str) {
        if (this.f314584l != null) {
            m188054Q();
            m188050M(this.f314584l).mo100404g(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x06b6  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x027e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0243  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100347v(com.google.assistant.p3897e.p3921j.p3926e.C51910dq r27, boolean r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            android.widget.RelativeLayout r3 = r0.f314584l
            java.lang.String r4 = "InterpreterCtrl"
            if (r3 != 0) goto L_0x001f
            com.google.common.f.e r1 = f314555a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "InterpreterUi is null. Please call InterpreterController.initialize"
            r3 = 28040(0x6d88, float:3.9292E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x001f:
            if (r1 != 0) goto L_0x0034
            com.google.common.f.e r1 = f314555a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "Could not find ShowInterpreterArgs"
            r3 = 28039(0x6d87, float:3.9291E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0034:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.bn r3 = r27.toBuilder()
            com.google.assistant.e.j.e.dl r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51905dl) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.j.e.dq r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51910dq) r5
            r6 = 0
            r5.f136165e = r6
            int r7 = r5.f136161a
            r7 = r7 & -33
            r5.f136161a = r7
            r3.build()
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.OfflineSubController r3 = r0.f314562E
            boolean r3 = r3.mo100353b(r1)
            r5 = 1
            r7 = 0
            if (r3 == 0) goto L_0x007c
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.OfflineSubController r3 = r0.f314562E
            int r8 = r1.f136161a
            r9 = r8 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0067
            r8 = r8 & 64
            if (r8 == 0) goto L_0x0067
            r8 = 1
            goto L_0x0068
        L_0x0067:
            r8 = 0
        L_0x0068:
            com.google.android.libraries.gsa.k.g r9 = r3.f314603g
            java.lang.String r10 = r1.f136163c
            java.lang.String r11 = r1.f136164d
            com.google.common.util.concurrent.cx r10 = r3.mo100352a(r10, r11)
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.p r11 = new com.google.android.apps.gsa.staticplugins.opa.translator.offline.p
            r11.<init>(r3, r8, r1)
            java.lang.String r3 = "logUsageForOfflineInterpreter"
            r9.mo28211k(r10, r3, r11)
        L_0x007c:
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f314560C
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90042cu.f248716q
            boolean r3 = r3.mo79746e(r8)
            if (r3 == 0) goto L_0x0132
            int r3 = r1.f136161a
            r8 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r8
            if (r3 == 0) goto L_0x0132
            com.google.assistant.e.j.e.dg r2 = r1.f136177q
            if (r2 != 0) goto L_0x0093
            com.google.assistant.e.j.e.dg r2 = com.google.assistant.p3897e.p3921j.p3926e.C51900dg.f136138e
        L_0x0093:
            com.google.android.apps.gsa.staticplugins.opa.translator.a.a r2 = r0.f314561D
            com.google.assistant.e.j.e.dg r1 = r1.f136177q
            if (r1 != 0) goto L_0x009b
            com.google.assistant.e.j.e.dg r1 = com.google.assistant.p3897e.p3921j.p3926e.C51900dg.f136138e
        L_0x009b:
            com.google.assistant.e.j.e.df r3 = com.google.assistant.p3897e.p3921j.p3926e.C51899df.HOMESCREEN_SHORTCUT
            int r4 = r1.f136141b
            com.google.assistant.e.j.e.df r4 = com.google.assistant.p3897e.p3921j.p3926e.C51899df.m86409a(r4)
            if (r4 != 0) goto L_0x00a7
            com.google.assistant.e.j.e.df r4 = com.google.assistant.p3897e.p3921j.p3926e.C51899df.UNKNOWN_DIALOG_WINDOW_MODE
        L_0x00a7:
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = "DialogWindowSubCtrl"
            if (r3 == 0) goto L_0x010b
            java.lang.String r3 = r1.f136143d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00f8
            java.lang.String r3 = r1.f136142c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00c0
            goto L_0x00f8
        L_0x00c0:
            android.app.Activity r3 = r2.f314507b
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r4.<init>(r5)
            r5 = 268468224(0x10008000, float:2.5342157E-29)
            r4.addFlags(r5)
            java.lang.String r5 = r1.f136143d
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r4.setData(r5)
            java.lang.String r5 = r3.getPackageName()
            r4.setPackage(r5)
            java.lang.String r5 = r1.f136143d
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131233855(0x7f080c3f, float:1.808386E38)
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r3, r5)
            com.google.android.apps.gsa.shared.e.f r2 = r2.f314508c
            java.lang.String r1 = r1.f136142c
            r2.mo83611a(r1, r3, r4)
            return
        L_0x00f8:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113587a.f314506a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "DialogWindowArgs didn't have intent or label."
            r3 = 27993(0x6d59, float:3.9227E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x010b:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113587a.f314506a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r4)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 27992(0x6d58, float:3.9225E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            int r1 = r1.f136141b
            com.google.assistant.e.j.e.df r1 = com.google.assistant.p3897e.p3921j.p3926e.C51899df.m86409a(r1)
            if (r1 != 0) goto L_0x012a
            com.google.assistant.e.j.e.df r1 = com.google.assistant.p3897e.p3921j.p3926e.C51899df.UNKNOWN_DIALOG_WINDOW_MODE
        L_0x012a:
            java.lang.String r3 = "Dialog window type not supported: %d"
            int r1 = r1.f136137d
            r2.mo56387q(r3, r1)
            return
        L_0x0132:
            int r3 = r1.f136175o
            int r3 = com.google.assistant.p3897e.p3921j.p3926e.C51907dn.m86411a(r3)
            r8 = 2
            if (r3 != 0) goto L_0x013c
            goto L_0x016a
        L_0x013c:
            if (r3 != r8) goto L_0x016a
            com.google.assistant.e.j.e.dq r3 = r0.f314567J
            if (r3 == 0) goto L_0x0158
            com.google.common.f.e r1 = f314555a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "Entering paused state"
            r3 = 28037(0x6d85, float:3.9288E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            r26.mo100341n()
            return
        L_0x0158:
            com.google.common.f.e r3 = f314555a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r9, r4)
            java.lang.String r9 = "First arg received has PAUSED client state."
            r10 = 28036(0x6d84, float:3.9287E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r9)
        L_0x016a:
            com.google.assistant.e.j.e.dc r3 = r1.f136178r
            if (r3 != 0) goto L_0x0170
            com.google.assistant.e.j.e.dc r3 = com.google.assistant.p3897e.p3921j.p3926e.C51896dc.f136128b
        L_0x0170:
            boolean r3 = r3.f136130a
            r0.f314593u = r3
            com.google.assistant.e.j.e.dq r3 = r0.f314567J
            if (r3 != 0) goto L_0x017a
            r9 = 1
            goto L_0x017b
        L_0x017a:
            r9 = 0
        L_0x017b:
            if (r3 == 0) goto L_0x018f
            boolean r3 = r3.f136176p
            if (r3 != 0) goto L_0x018f
            boolean r3 = r1.f136176p
            if (r3 == 0) goto L_0x018f
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.OfflineSubController r3 = r0.f314562E
            boolean r3 = r3.mo100353b(r1)
            if (r3 == 0) goto L_0x018f
            r3 = 1
            goto L_0x0190
        L_0x018f:
            r3 = 0
        L_0x0190:
            r0.f314567J = r1
            if (r9 != 0) goto L_0x019b
            if (r3 == 0) goto L_0x0197
            goto L_0x019b
        L_0x0197:
            r0.f314592t = r7
            goto L_0x02df
        L_0x019b:
            java.lang.String r3 = r1.f136162b
            r0.f314588p = r3
            java.lang.String r3 = r1.f136163c
            r0.f314589q = r3
            java.lang.String r3 = r1.f136164d
            r0.f314591s = r3
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.OobeView r3 = m188063h(r3)
            java.lang.String r10 = r0.f314588p
            r3.f314804d = r10
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r3 = m188062g(r3)
            java.lang.String r10 = r0.f314588p
            android.widget.TextView r11 = r3.mo100447b()
            android.content.Context r12 = r3.getContext()
            r13 = 2132085275(0x7f150a1b, float:1.9810744E38)
            java.lang.String r12 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113672ax.m188247b(r12, r13, r10)
            r11.setText(r12)
            android.widget.TextView r11 = r3.mo100449d()
            android.content.Context r12 = r3.getContext()
            r13 = 2132089245(0x7f15199d, float:1.9818796E38)
            java.lang.String r12 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113672ax.m188247b(r12, r13, r10)
            r11.setText(r12)
            android.widget.TextView r11 = r3.mo100448c()
            android.content.Context r12 = r3.getContext()
            r13 = 2132088611(0x7f151723, float:1.981751E38)
            java.lang.String r10 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113672ax.m188247b(r12, r13, r10)
            r11.setText(r10)
            r3.mo100454i()
            com.google.assistant.e.j.e.dk r3 = r1.f136172l
            if (r3 != 0) goto L_0x01f8
            com.google.assistant.e.j.e.dk r3 = com.google.assistant.p3897e.p3921j.p3926e.C51904dk.f136149d
        L_0x01f8:
            int r3 = r3.f136151a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x020f
            com.google.assistant.e.j.e.dk r3 = r1.f136172l
            if (r3 != 0) goto L_0x0203
            com.google.assistant.e.j.e.dk r3 = com.google.assistant.p3897e.p3921j.p3926e.C51904dk.f136149d
        L_0x0203:
            boolean r3 = r3.f136152b
            if (r3 == 0) goto L_0x020f
            boolean r3 = r26.m188055R(r27)
            if (r3 != 0) goto L_0x020f
            r3 = 1
            goto L_0x0210
        L_0x020f:
            r3 = 0
        L_0x0210:
            if (r3 == 0) goto L_0x0221
            android.widget.RelativeLayout r10 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r10 = m188062g(r10)
            r10.f314789d = r5
            r10.f314790e = r7
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r11 = r10.f314787b
            r10.mo100456k(r11)
        L_0x0221:
            boolean r10 = r26.m188055R(r27)
            if (r10 == 0) goto L_0x0236
            android.widget.RelativeLayout r10 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r10 = m188062g(r10)
            r10.f314789d = r7
            r10.f314790e = r5
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r11 = r10.f314787b
            r10.mo100456k(r11)
        L_0x0236:
            com.google.assistant.e.j.e.dk r10 = r1.f136172l
            if (r10 != 0) goto L_0x023d
            com.google.assistant.e.j.e.dk r11 = com.google.assistant.p3897e.p3921j.p3926e.C51904dk.f136149d
            goto L_0x023e
        L_0x023d:
            r11 = r10
        L_0x023e:
            int r11 = r11.f136151a
            r11 = r11 & r8
            if (r11 == 0) goto L_0x024e
            if (r10 != 0) goto L_0x0247
            com.google.assistant.e.j.e.dk r10 = com.google.assistant.p3897e.p3921j.p3926e.C51904dk.f136149d
        L_0x0247:
            boolean r10 = r10.f136153c
            if (r10 == 0) goto L_0x024c
            goto L_0x024e
        L_0x024c:
            r10 = 0
            goto L_0x024f
        L_0x024e:
            r10 = 1
        L_0x024f:
            if (r10 == 0) goto L_0x025e
            android.widget.RelativeLayout r11 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r11 = m188062g(r11)
            r11.f314791f = r5
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r12 = r11.f314787b
            r11.mo100456k(r12)
        L_0x025e:
            r26.m188053P(r27)
            android.content.SharedPreferences r11 = r0.f314580h
            java.lang.String r12 = r26.mo100337j()
            int r11 = r11.getInt(r12, r7)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be[] r12 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.values()
            int r13 = r12.length
            r14 = 0
        L_0x0271:
            if (r14 >= r13) goto L_0x027e
            r15 = r12[r14]
            int r8 = r15.f314876e
            if (r8 != r11) goto L_0x027a
            goto L_0x0280
        L_0x027a:
            int r14 = r14 + 1
            r8 = 2
            goto L_0x0271
        L_0x027e:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r15 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.UNKNOWN
        L_0x0280:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r8 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.AUTO
            if (r15 != r8) goto L_0x0294
            if (r3 == 0) goto L_0x0294
            r0.f314586n = r8
            r0.f314592t = r5
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r3 = m188062g(r3)
            r3.mo100451f(r7)
            goto L_0x02df
        L_0x0294:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r11 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.MANUAL
            if (r15 != r11) goto L_0x02a6
            if (r10 == 0) goto L_0x02a6
            r0.f314586n = r11
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r3 = m188062g(r3)
            r3.mo100453h(r7)
            goto L_0x02df
        L_0x02a6:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.be r12 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be.KEYBOARD
            if (r15 != r12) goto L_0x02b6
            r0.f314586n = r12
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r3 = m188062g(r3)
            r3.mo100452g(r7)
            goto L_0x02df
        L_0x02b6:
            if (r3 == 0) goto L_0x02c6
            r0.f314586n = r8
            r0.f314592t = r5
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r3 = m188062g(r3)
            r3.mo100451f(r7)
            goto L_0x02df
        L_0x02c6:
            if (r10 == 0) goto L_0x02d4
            r0.f314586n = r11
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r3 = m188062g(r3)
            r3.mo100453h(r7)
            goto L_0x02df
        L_0x02d4:
            r0.f314586n = r12
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView r3 = m188062g(r3)
            r3.mo100452g(r7)
        L_0x02df:
            com.google.android.libraries.assistant.assistantactions.rendering.c.i r3 = r0.f314565H
            if (r3 == 0) goto L_0x02f6
            int r3 = r0.f314571N
            if (r3 != r5) goto L_0x02f6
            java.lang.String r3 = r0.f314589q
            boolean r3 = com.google.common.base.C58837ba.m90859h(r3)
            if (r3 != 0) goto L_0x02f6
            com.google.android.libraries.assistant.assistantactions.rendering.c.i r3 = r0.f314565H
            java.lang.String r8 = r0.f314589q
            r3.mo19723f(r8)
        L_0x02f6:
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView r3 = m188060e(r3)
            r3.mo100381j()
            android.widget.RelativeLayout r3 = r0.f314584l
            android.widget.LinearLayout r3 = m188058c(r3)
            int r3 = r3.getVisibility()
            r8 = 8
            if (r3 != 0) goto L_0x0328
            com.google.common.f.e r3 = f314555a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r10, r4)
            java.lang.String r10 = "Assistant toast toast showing till next translation result"
            r11 = 28035(0x6d83, float:3.9285E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r11)).mo56386p(r10)
            android.widget.RelativeLayout r3 = r0.f314584l
            android.widget.LinearLayout r3 = m188058c(r3)
            r3.setVisibility(r8)
        L_0x0328:
            boolean r3 = m188056S(r27)
            r10 = 0
            if (r3 != 0) goto L_0x039a
            boolean r3 = m188057T(r27)
            if (r3 != 0) goto L_0x039a
            java.lang.String r2 = r1.f136169i
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0394
            com.google.common.f.e r2 = f314555a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Showing Assistant Speaking Toast"
            r4 = 28034(0x6d82, float:3.9284E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.staticplugins.opa.translator.a.w r2 = com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113610w.MAIN_TEXT_VIEW
            r0.mo100336a(r2, r7)
            android.widget.RelativeLayout r2 = r0.f314584l
            r3 = 2131429034(0x7f0b06aa, float:1.847973E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r1 = r1.f136169i
            r2.setText(r1)
            android.widget.RelativeLayout r1 = r0.f314584l
            android.widget.LinearLayout r1 = m188058c(r1)
            r1.setVisibility(r7)
            android.widget.RelativeLayout r1 = r0.f314584l
            android.widget.LinearLayout r1 = m188058c(r1)
            r1.bringToFront()
            com.google.android.libraries.f.a r1 = r0.f314582j
            long r1 = r1.mo26871c()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f314595w = r1
            long r1 = r0.f314596x
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0393
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.a.c r4 = new com.google.android.apps.gsa.staticplugins.opa.translator.a.c
            r4.<init>(r0)
            r3.postDelayed(r4, r1)
        L_0x0393:
            return
        L_0x0394:
            com.google.android.apps.gsa.staticplugins.opa.translator.a.w r1 = com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113610w.INTRO_VIEW
            r0.mo100336a(r1, r7)
            return
        L_0x039a:
            boolean r3 = m188056S(r27)
            boolean r12 = m188057T(r27)
            r3 = r3 ^ r12
            if (r3 == 0) goto L_0x03b7
            com.google.common.f.e r3 = f314555a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r12, r4)
            java.lang.String r4 = "Only one of Source or Target Text is present!"
            r12 = 28033(0x6d81, float:3.9283E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r12)).mo56386p(r4)
        L_0x03b7:
            com.google.android.apps.gsa.staticplugins.opa.translator.a.w r3 = com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113610w.MAIN_TEXT_VIEW
            r0.mo100336a(r3, r7)
            android.widget.RelativeLayout r3 = r0.f314584l
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterMainTextView r3 = m188051N(r3)
            java.lang.String r4 = r1.f136166f
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x03d2
            java.lang.String r4 = r1.f136167g
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x09ba
        L_0x03d2:
            boolean r4 = r3.f314773r
            if (r4 == 0) goto L_0x03eb
            com.google.android.apps.gsa.staticplugins.opa.translator.util.at r4 = r3.f314771p
            com.google.android.apps.gsa.staticplugins.opa.translator.util.at r12 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113668at.TRANSLATION
            if (r4 != r12) goto L_0x03eb
            java.lang.String r4 = com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterMainTextView.m188187r(r27)
            java.lang.String r12 = r3.f314778w
            boolean r4 = r4.equals(r12)
            if (r4 != 0) goto L_0x03e9
            goto L_0x03eb
        L_0x03e9:
            r4 = 0
            goto L_0x03ec
        L_0x03eb:
            r4 = 1
        L_0x03ec:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.at r12 = com.google.android.apps.gsa.staticplugins.opa.translator.util.C113668at.TRANSLATION
            r3.f314771p = r12
            java.lang.String r12 = com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterMainTextView.m188187r(r27)
            r3.f314778w = r12
            java.lang.String r12 = r1.f136166f
            java.lang.String r13 = r1.f136167g
            boolean r14 = r1.f136168h
            if (r4 == 0) goto L_0x0401
            r3.mo100430s()
        L_0x0401:
            r3.f314775t = r6
            com.google.android.libraries.f.a r15 = r3.f314776u
            if (r15 == 0) goto L_0x0424
            int r15 = r3.f314781z
            r8 = 2
            if (r15 != r8) goto L_0x0424
            long r7 = r3.f314770o
            int r16 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x0424
            com.google.android.libraries.f.a r7 = r3.f314776u
            long r7 = r7.mo26871c()
            r3.f314774s = r7
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ad r7 = new com.google.android.apps.gsa.staticplugins.opa.translator.util.ad
            r7.<init>(r3)
            long r10 = r3.f314770o
            r3.postDelayed(r7, r10)
        L_0x0424:
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r7 = r3.mo100426n()
            android.content.Context r8 = r3.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2131169205(0x7f070fb5, float:1.7952733E38)
            int r8 = r8.getDimensionPixelSize(r10)
            r7.setHeight(r8)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r7 = r3.mo100426n()
            android.content.Context r8 = r3.getContext()
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getDimensionPixelSize(r10)
            r7.setMaxHeight(r8)
            if (r5 == r14) goto L_0x0451
            r7 = r13
            goto L_0x0452
        L_0x0451:
            r7 = r12
        L_0x0452:
            r3.f314769n = r7
            if (r5 == r14) goto L_0x0457
            goto L_0x0458
        L_0x0457:
            r12 = r13
        L_0x0458:
            r3.f314766k = r12
            if (r14 == 0) goto L_0x0465
            com.google.assistant.e.j.e.dp r7 = r1.f136174n
            if (r7 != 0) goto L_0x0462
            com.google.assistant.e.j.e.dp r7 = com.google.assistant.p3897e.p3921j.p3926e.C51909dp.f136155c
        L_0x0462:
            java.lang.String r7 = r7.f136158b
            goto L_0x046d
        L_0x0465:
            com.google.assistant.e.j.e.dp r7 = r1.f136173m
            if (r7 != 0) goto L_0x046b
            com.google.assistant.e.j.e.dp r7 = com.google.assistant.p3897e.p3921j.p3926e.C51909dp.f136155c
        L_0x046b:
            java.lang.String r7 = r7.f136158b
        L_0x046d:
            r3.f314767l = r7
            if (r14 == 0) goto L_0x0474
            java.lang.String r7 = r3.f314762g
            goto L_0x0476
        L_0x0474:
            java.lang.String r7 = r3.f314761f
        L_0x0476:
            r3.f314768m = r7
            if (r14 == 0) goto L_0x047d
            java.lang.String r7 = r3.f314761f
            goto L_0x047f
        L_0x047d:
            java.lang.String r7 = r3.f314762g
        L_0x047f:
            r3.mo100411A(r7)
            if (r9 == 0) goto L_0x0490
            com.google.assistant.e.j.e.dc r7 = r1.f136178r
            if (r7 != 0) goto L_0x048a
            com.google.assistant.e.j.e.dc r7 = com.google.assistant.p3897e.p3921j.p3926e.C51896dc.f136128b
        L_0x048a:
            boolean r7 = r7.f136130a
            if (r7 == 0) goto L_0x0490
            r7 = 1
            goto L_0x0491
        L_0x0490:
            r7 = 0
        L_0x0491:
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r8 = r3.mo100426n()
            r9 = 2130969128(0x7f040228, float:1.754693E38)
            if (r7 == 0) goto L_0x04a4
            android.widget.TextView r6 = r3.mo100422j()
            java.lang.String r8 = r3.f314769n
            r6.setText(r8)
            goto L_0x04bb
        L_0x04a4:
            android.text.TextPaint r10 = r8.getPaint()
            r10.setShader(r6)
            android.content.Context r6 = r3.getContext()
            int r6 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r6, r9)
            r8.setTextColor(r6)
            java.lang.String r6 = r3.f314769n
            r8.mo82924c(r6)
        L_0x04bb:
            android.widget.TextView r6 = r3.mo100425m()
            java.lang.String r8 = r3.f314766k
            r6.setText(r8)
            if (r4 == 0) goto L_0x0666
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterAlternativeTranslationsView r10 = r3.mo100427o()
            r10.mo100371d()
            com.google.assistant.e.j.e.da r10 = r1.f136171k
            if (r10 != 0) goto L_0x04d3
            com.google.assistant.e.j.e.da r10 = com.google.assistant.p3897e.p3921j.p3926e.C51894da.f136125b
        L_0x04d3:
            com.google.protobuf.cq r10 = r10.f136127a
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x05ac
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterAlternativeTranslationsView r10 = r3.mo100427o()
            com.google.assistant.e.j.e.da r11 = r1.f136171k
            if (r11 != 0) goto L_0x04e5
            com.google.assistant.e.j.e.da r11 = com.google.assistant.p3897e.p3921j.p3926e.C51894da.f136125b
        L_0x04e5:
            com.google.protobuf.cq r11 = r11.f136127a
            java.lang.String r12 = r3.f314768m
            r10.mo100371d()
            r10.f314710b = r12
            java.util.List r12 = r10.mo100369b()
            int r13 = r11.size()
            int r14 = r12.size()
            if (r13 <= r14) goto L_0x0520
            com.google.common.f.e r13 = com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterAlternativeTranslationsView.f314709a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r15 = "InterpreterAltTrans"
            r13.mo56378ag(r14, r15)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r14 = 28121(0x6dd9, float:3.9406E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r14)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            int r14 = r11.size()
            int r15 = r12.size()
            java.lang.String r9 = "More translations than views: %d vs %d"
            r13.mo56393w(r9, r14, r15)
        L_0x0520:
            r9 = 0
            r13 = 0
        L_0x0522:
            int r14 = r12.size()
            int r15 = r11.size()
            int r14 = java.lang.Math.min(r14, r15)
            if (r9 >= r14) goto L_0x057c
            java.util.List r14 = r10.mo100370c(r9)
            r15 = 0
            java.lang.Object r16 = r14.get(r15)
            r6 = r16
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r16 = r11.get(r9)
            r8 = r16
            com.google.assistant.e.j.e.cy r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51891cy) r8
            java.lang.String r8 = r8.f136116a
            r6.setText(r8)
            java.lang.Object r6 = r14.get(r15)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setVisibility(r15)
            java.lang.Object r6 = r11.get(r9)
            com.google.assistant.e.j.e.cy r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51891cy) r6
            com.google.protobuf.cq r6 = r6.f136117b
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0579
            java.lang.Object r6 = r14.get(r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r8 = r11.get(r9)
            com.google.assistant.e.j.e.cy r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51891cy) r8
            com.google.protobuf.cq r8 = r8.f136117b
            java.lang.String r13 = " "
            java.lang.String r8 = android.text.TextUtils.join(r13, r8)
            r6.setText(r8)
            r13 = 1
        L_0x0579:
            int r9 = r9 + 1
            goto L_0x0522
        L_0x057c:
            r6 = 0
        L_0x057d:
            int r8 = r12.size()
            int r9 = r11.size()
            int r8 = java.lang.Math.min(r8, r9)
            if (r6 >= r8) goto L_0x05a1
            java.util.List r8 = r10.mo100370c(r6)
            java.lang.Object r8 = r8.get(r5)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r5 == r13) goto L_0x059a
            r9 = 8
            goto L_0x059b
        L_0x059a:
            r9 = 0
        L_0x059b:
            r8.setVisibility(r9)
            int r6 = r6 + 1
            goto L_0x057d
        L_0x05a1:
            r6 = 2131427715(0x7f0b0183, float:1.8477054E38)
            android.view.View r8 = r10.findViewById(r6)
            r6 = 0
            r8.scrollTo(r6, r6)
        L_0x05ac:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterSmartRepliesView r6 = r3.mo100429q()
            r6.mo100445b()
            com.google.assistant.e.j.e.ds r6 = r1.f136170j
            if (r6 != 0) goto L_0x05b9
            com.google.assistant.e.j.e.ds r6 = com.google.assistant.p3897e.p3921j.p3926e.C51912ds.f136180b
        L_0x05b9:
            com.google.protobuf.cq r6 = r6.f136182a
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0638
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterSmartRepliesView r6 = r3.mo100429q()
            com.google.assistant.e.j.e.ds r1 = r1.f136170j
            if (r1 != 0) goto L_0x05cb
            com.google.assistant.e.j.e.ds r1 = com.google.assistant.p3897e.p3921j.p3926e.C51912ds.f136180b
        L_0x05cb:
            com.google.protobuf.cq r1 = r1.f136182a
            r6.mo100445b()
            java.util.List r8 = r6.mo100444a()
            int r9 = r1.size()
            int r10 = r8.size()
            if (r9 <= r10) goto L_0x0602
            com.google.common.f.e r9 = com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterSmartRepliesView.f314784a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r11 = "InterpreterSmartRep"
            r9.mo56378ag(r10, r11)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r10 = 28292(0x6e84, float:3.9646E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r10)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            int r10 = r1.size()
            int r11 = r8.size()
            java.lang.String r12 = "More smart replies than views: %d vs %d"
            r9.mo56393w(r12, r10, r11)
        L_0x0602:
            r9 = 0
        L_0x0603:
            int r10 = r8.size()
            int r11 = r1.size()
            int r10 = java.lang.Math.min(r10, r11)
            if (r9 >= r10) goto L_0x062d
            java.lang.Object r10 = r8.get(r9)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.Object r11 = r1.get(r9)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r10.setText(r11)
            java.lang.Object r10 = r8.get(r9)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 0
            r10.setVisibility(r11)
            int r9 = r9 + 1
            goto L_0x0603
        L_0x062d:
            r11 = 0
            r1 = 2131435979(0x7f0b21cb, float:1.8493815E38)
            android.view.View r1 = r6.findViewById(r1)
            r1.scrollTo(r11, r11)
        L_0x0638:
            com.google.android.apps.gsa.search.core.i.t r1 = r3.f314779x
            if (r1 == 0) goto L_0x0666
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90042cu.f248706g
            boolean r1 = r1.mo79746e(r6)
            if (r1 != 0) goto L_0x0645
            goto L_0x0666
        L_0x0645:
            java.lang.String r1 = r3.f314768m
            if (r1 == 0) goto L_0x0666
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r6)
            java.lang.String r6 = "en"
            boolean r1 = r1.startsWith(r6)
            if (r1 == 0) goto L_0x0666
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterSmartRepliesView r1 = r3.mo100429q()
            r6 = 2131432568(0x7f0b1478, float:1.8486897E38)
            android.view.View r1 = r1.findViewById(r6)
            r6 = 0
            r1.setVisibility(r6)
        L_0x0666:
            android.text.BidiFormatter r1 = android.text.BidiFormatter.getInstance()
            java.lang.String r6 = r3.f314766k
            boolean r1 = r1.isRtl(r6)
            android.widget.ImageView r6 = r3.mo100417e()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            r8 = 9
            r6.removeRule(r8)
            r9 = 11
            r6.removeRule(r9)
            if (r5 == r1) goto L_0x0688
            r8 = 11
        L_0x0688:
            r6.addRule(r8)
            android.widget.ImageView r8 = r3.mo100417e()
            r8.setLayoutParams(r6)
            android.widget.ImageView r6 = r3.mo100418f()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            r8 = 0
            r6.removeRule(r8)
            r6.removeRule(r5)
            r8 = 2131434221(0x7f0b1aed, float:1.849025E38)
            r6.addRule(r1, r8)
            android.content.res.Resources r8 = r3.getResources()
            r9 = 2131169255(0x7f070fe7, float:1.7952835E38)
            int r8 = r8.getDimensionPixelSize(r9)
            if (r5 == r1) goto L_0x06b8
            r9 = 0
            goto L_0x06b9
        L_0x06b8:
            r9 = r8
        L_0x06b9:
            int r10 = r6.topMargin
            if (r5 != r1) goto L_0x06be
            r8 = 0
        L_0x06be:
            int r11 = r6.bottomMargin
            r6.setMargins(r9, r10, r8, r11)
            android.widget.ImageView r8 = r3.mo100418f()
            r8.setLayoutParams(r6)
            android.widget.TextView r6 = r3.mo100424l()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            r8 = 0
            r6.removeRule(r8)
            r6.removeRule(r5)
            r8 = 2131434222(0x7f0b1aee, float:1.8490252E38)
            r6.addRule(r1, r8)
            android.widget.TextView r1 = r3.mo100424l()
            r1.setLayoutParams(r6)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterListeningBoxesView r1 = r3.mo100428p()
            r1.mo100409a()
            if (r4 == 0) goto L_0x09ba
            android.content.Context r1 = r3.getContext()
            r4 = 2130772099(0x7f010083, float:1.7147307E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r4)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131493253(0x7f0c0185, float:1.860998E38)
            int r4 = r4.getInteger(r6)
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131493071(0x7f0c00cf, float:1.8609612E38)
            int r6 = r6.getInteger(r8)
            int r4 = r4 + r6
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131493213(0x7f0c015d, float:1.86099E38)
            int r6 = r6.getInteger(r9)
            int r4 = r4 + r6
            long r10 = (long) r4
            r1.setStartOffset(r10)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ap r4 = new com.google.android.apps.gsa.staticplugins.opa.translator.util.ap
            r4.<init>(r3)
            r1.setAnimationListener(r4)
            android.view.animation.Animation r4 = r3.mo100414b(r2)
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getInteger(r8)
            android.content.Context r10 = r3.getContext()
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r10.getInteger(r9)
            int r6 = r6 + r9
            long r9 = (long) r6
            r4.setStartOffset(r9)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.as r6 = new com.google.android.apps.gsa.staticplugins.opa.translator.util.as
            r6.<init>()
            r4.setAnimationListener(r6)
            android.view.animation.Animation r6 = r3.mo100414b(r2)
            android.content.Context r9 = r3.getContext()
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getInteger(r8)
            long r9 = (long) r9
            r6.setStartOffset(r9)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.as r9 = new com.google.android.apps.gsa.staticplugins.opa.translator.util.as
            r9.<init>()
            r6.setAnimationListener(r9)
            android.content.Context r9 = r3.getContext()
            r10 = 2130969124(0x7f040224, float:1.7546921E38)
            int r9 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r9, r10)
            android.content.Context r10 = r3.getContext()
            r11 = 2130969128(0x7f040228, float:1.754693E38)
            int r10 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r10, r11)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r11 = r3.mo100426n()
            r12 = 2
            int[] r12 = new int[r12]
            r13 = 0
            r12[r13] = r9
            r12[r5] = r10
            java.lang.String r9 = "textColor"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofInt(r11, r9, r12)
            r3.f314777v = r9
            android.animation.ValueAnimator r9 = r3.f314777v
            android.animation.ArgbEvaluator r10 = new android.animation.ArgbEvaluator
            r10.<init>()
            r9.setEvaluator(r10)
            android.animation.ValueAnimator r9 = r3.f314777v
            com.google.android.apps.gsa.staticplugins.opa.translator.util.aq r10 = new com.google.android.apps.gsa.staticplugins.opa.translator.util.aq
            r10.<init>(r3)
            r9.addUpdateListener(r10)
            android.widget.TextView r9 = r3.mo100422j()
            android.content.Context r10 = r3.getContext()
            r11 = 2130969128(0x7f040228, float:1.754693E38)
            int r10 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r10, r11)
            r3.mo100431t(r9, r10)
            android.widget.TextView r9 = r3.mo100425m()
            android.content.Context r10 = r3.getContext()
            r11 = 2130969092(0x7f040204, float:1.7546856E38)
            int r10 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r10, r11)
            r3.mo100431t(r9, r10)
            android.view.animation.Animation r9 = r3.mo100415c(r2)
            android.content.Context r10 = r3.getContext()
            android.content.res.Resources r10 = r10.getResources()
            int r8 = r10.getInteger(r8)
            long r10 = (long) r8
            r9.setStartOffset(r10)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.as r8 = new com.google.android.apps.gsa.staticplugins.opa.translator.util.as
            r8.<init>()
            r9.setAnimationListener(r8)
            android.view.animation.TranslateAnimation r8 = new android.view.animation.TranslateAnimation
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            float r2 = r3.mo100413a(r2)
            float r2 = -r2
            r17 = r8
            r25 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            r8.setRepeatCount(r2)
            android.content.res.Resources r2 = r3.getResources()
            r10 = 2131492971(0x7f0c006b, float:1.8609409E38)
            int r2 = r2.getInteger(r10)
            long r10 = (long) r2
            r8.setDuration(r10)
            android.view.animation.Interpolator r2 = r3.mo100416d()
            r8.setInterpolator(r2)
            android.content.Context r2 = r3.getContext()
            r10 = 2130772100(0x7f010084, float:1.7147309E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r10)
            android.content.res.Resources r10 = r3.getResources()
            r11 = 2131492970(0x7f0c006a, float:1.8609407E38)
            int r10 = r10.getInteger(r11)
            long r10 = (long) r10
            r2.setDuration(r10)
            android.content.res.Resources r10 = r3.getResources()
            r11 = 2131492968(0x7f0c0068, float:1.8609403E38)
            int r10 = r10.getInteger(r11)
            long r10 = (long) r10
            r2.setStartOffset(r10)
            android.view.animation.AnimationSet r10 = new android.view.animation.AnimationSet
            r15 = 0
            r10.<init>(r15)
            r10.addAnimation(r8)
            r10.addAnimation(r2)
            r10.setRepeatCount(r15)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.ar r2 = new com.google.android.apps.gsa.staticplugins.opa.translator.util.ar
            r2.<init>(r3)
            r10.setAnimationListener(r2)
            android.widget.TextView r2 = r3.mo100423k()
            r2.startAnimation(r10)
            android.widget.TextView r2 = r3.mo100423k()
            r2.setVisibility(r15)
            android.widget.RelativeLayout r2 = r3.mo100420h()
            r2.startAnimation(r9)
            if (r7 != 0) goto L_0x088c
            android.animation.ValueAnimator r2 = r3.f314777v
            r2.start()
        L_0x088c:
            android.widget.RelativeLayout r2 = r3.mo100420h()
            r2.setVisibility(r15)
            android.widget.TextView r2 = r3.mo100422j()
            int r2 = r2.getVisibility()
            r8 = 8
            if (r2 != r8) goto L_0x08b0
            if (r7 == 0) goto L_0x08b0
            android.widget.TextView r2 = r3.mo100422j()
            r2.setVisibility(r15)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r3.mo100426n()
            r2.setVisibility(r8)
            goto L_0x08be
        L_0x08b0:
            android.widget.TextView r2 = r3.mo100422j()
            r2.setVisibility(r8)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r3.mo100426n()
            r2.setVisibility(r15)
        L_0x08be:
            r2 = 2131436505(0x7f0b23d9, float:1.8494882E38)
            android.view.View r7 = r3.findViewById(r2)
            r7.startAnimation(r6)
            android.view.View r2 = r3.findViewById(r2)
            r2.setVisibility(r15)
            android.widget.ImageView r2 = r3.mo100418f()
            r6 = 0
            r2.setAlpha(r6)
            android.widget.ImageView r2 = r3.mo100417e()
            r2.setAlpha(r6)
            android.widget.RelativeLayout r2 = r3.mo100421i()
            r2.startAnimation(r4)
            android.widget.RelativeLayout r2 = r3.mo100421i()
            r2.setVisibility(r15)
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterAlternativeTranslationsView r2 = r3.mo100427o()
            java.util.List r4 = r2.mo100369b()
            r6 = 0
            r7 = 0
        L_0x08f6:
            int r9 = r4.size()
            if (r6 >= r9) goto L_0x0931
            java.util.List r9 = r2.mo100370c(r6)
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x091c
            java.util.List r9 = r2.mo100370c(r6)
            java.lang.Object r9 = r9.get(r15)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.CharSequence r9 = r9.getText()
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x091c
            r9 = 1
            goto L_0x091d
        L_0x091c:
            r9 = 0
        L_0x091d:
            r7 = r7 | r9
            java.lang.Object r10 = r4.get(r6)
            android.view.View r10 = (android.view.View) r10
            if (r5 == r9) goto L_0x0929
            r9 = 8
            goto L_0x092a
        L_0x0929:
            r9 = 0
        L_0x092a:
            r10.setVisibility(r9)
            int r6 = r6 + 1
            r15 = 0
            goto L_0x08f6
        L_0x0931:
            if (r7 == 0) goto L_0x095a
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterAlternativeTranslationsView r2 = r3.mo100427o()
            r4 = 0
            r2.setVisibility(r4)
            android.widget.TextView r6 = r2.mo100368a()
            r6.startAnimation(r1)
            android.widget.TextView r6 = r2.mo100368a()
            r6.setVisibility(r4)
            r6 = 2131427715(0x7f0b0183, float:1.8477054E38)
            android.view.View r7 = r2.findViewById(r6)
            r7.startAnimation(r1)
            android.view.View r2 = r2.findViewById(r6)
            r2.setVisibility(r4)
        L_0x095a:
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterSmartRepliesView r2 = r3.mo100429q()
            r4 = 2131432568(0x7f0b1478, float:1.8486897E38)
            android.view.View r4 = r2.findViewById(r4)
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x096e
            r16 = 1
            goto L_0x0970
        L_0x096e:
            r16 = 0
        L_0x0970:
            java.util.List r2 = r2.mo100444a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0978:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x099d
            java.lang.Object r4 = r2.next()
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r6 = r4.getText()
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0990
            r7 = 1
            goto L_0x0991
        L_0x0990:
            r7 = 0
        L_0x0991:
            r16 = r16 | r7
            if (r6 <= 0) goto L_0x0997
            r6 = 0
            goto L_0x0999
        L_0x0997:
            r6 = 8
        L_0x0999:
            r4.setVisibility(r6)
            goto L_0x0978
        L_0x099d:
            if (r16 == 0) goto L_0x09aa
            com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterSmartRepliesView r2 = r3.mo100429q()
            r2.startAnimation(r1)
            r4 = 0
            r2.setVisibility(r4)
        L_0x09aa:
            android.widget.ImageView r2 = r3.mo100418f()
            r2.startAnimation(r1)
            android.widget.ImageView r2 = r3.mo100417e()
            r2.startAnimation(r1)
            r3.f314773r = r5
        L_0x09ba:
            r0.f314587o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z.mo100347v(com.google.assistant.e.j.e.dq, boolean):void");
    }

    /* renamed from: w */
    public final void mo100348w(String str, String str2) {
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        str2.getClass();
        ahVar.f182622a |= 8192;
        ahVar.f182632k = str2;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar2.f182622a |= 1;
        ahVar2.f182625d = str;
        aeVar.copyOnWrite();
        C67190ah ahVar3 = (C67190ah) aeVar.instance;
        ahVar3.f182622a |= 512;
        ahVar3.f182629h = true;
        aeVar.copyOnWrite();
        C67190ah ahVar4 = (C67190ah) aeVar.instance;
        ahVar4.f182622a |= 1024;
        ahVar4.f182630i = true;
        C67190ah ahVar5 = (C67190ah) aeVar.build();
        C107474am amVar = (C107474am) C107475an.f299054e.createBuilder();
        amVar.copyOnWrite();
        C107475an anVar = (C107475an) amVar.instance;
        ahVar5.getClass();
        anVar.f299058c = ahVar5;
        anVar.f299057b = 2;
        this.f314576d.mo96219b(m188059d((C107475an) amVar.build()));
    }

    /* renamed from: x */
    public final void mo100349x() {
        RelativeLayout relativeLayout = this.f314584l;
        if (relativeLayout == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28041)).mo56386p("InterpreterUi is null.");
            return;
        }
        InterpreterMainTextView N = m188051N(relativeLayout);
        C58976aa aaVar = C58975e.f156826a;
        if (N.f314757A != 1) {
            N.f314781z = N.f314757A;
        }
    }

    /* renamed from: y */
    public final void mo100350y() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314584l == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28043)).mo56386p("InterpreterUi is null. Please call InterpreterController.initialize");
            return;
        }
        long j = this.f314564G;
        if (j > 0) {
            this.f314578f.mo98058b(j, j);
        }
        this.f314571N = 2;
        C11301i iVar = this.f314565H;
        if (iVar != null) {
            iVar.mo19723f(BuildConfig.FLAVOR);
        }
        mo100336a(C113610w.MAIN_TEXT_VIEW, false);
        m188051N(this.f314584l).mo100412B(2, this.f314593u);
        if (!this.f314593u) {
            m188051N(this.f314584l).mo100435x();
        }
        m188060e(this.f314584l).mo100383l();
    }

    /* renamed from: z */
    public final void mo100351z() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314584l == null) {
            C59104x c = f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28045)).mo56386p("InterpreterUi is null. Please call InterpreterController.initialize");
            return;
        }
        this.f314571N = 3;
        C11301i iVar = this.f314565H;
        if (iVar != null) {
            iVar.mo19723f(this.f314589q);
        }
        mo100336a(C113610w.MAIN_TEXT_VIEW, false);
        m188051N(this.f314584l).mo100412B(3, false);
        m188051N(this.f314584l).mo100435x();
        m188060e(this.f314584l).mo100383l();
    }
}
