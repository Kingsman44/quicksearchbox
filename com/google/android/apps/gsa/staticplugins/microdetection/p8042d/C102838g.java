package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.C90574e;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.g */
/* compiled from: PG */
final class C102838g implements C92216a {

    /* renamed from: a */
    final /* synthetic */ C102839h f287183a;

    public C102838g(C102839h hVar) {
        this.f287183a = hVar;
    }

    /* renamed from: d */
    private final void m170572d() {
        C102839h hVar = this.f287183a;
        hVar.f287193j++;
        if (!hVar.f287191h.b()) {
            C102839h hVar2 = this.f287183a;
            if (hVar2.f287193j == hVar2.f287191h.a() || this.f287183a.f287194k >= 20) {
                C102839h hVar3 = this.f287183a;
                ((C59052c) ((C59052c) C102839h.f287184a.mo56224b()).mo56372aa(21259)).mo56359L("No more samples to process; %d successful, %d processed, %d in audio store", Integer.valueOf(hVar3.f287194k), Integer.valueOf(hVar3.f287193j), Integer.valueOf(hVar3.f287191h.a()));
                this.f287183a.mo93502b();
                C102839h hVar4 = this.f287183a;
                if (hVar4.f287194k <= 0) {
                    ((C59052c) ((C59052c) C102839h.f287184a.mo56225c()).mo56372aa(21260)).mo56386p("Enrollment runner failed for all utterances.");
                    if (this.f287183a.f287200q.mo79746e(C90082eg.f250001cK)) {
                        if (((C89994f) this.f287183a.f287201r.mo27525b()).mo83855R() == 1) {
                            C89994f fVar = (C89994f) this.f287183a.f287201r.mo27525b();
                            C90584f a = C90584f.m147800a(this.f287183a.f287190g.f253248b);
                            if (a == null) {
                                a = C90584f.OK_GOOGLE;
                            }
                            fVar.mo83903aw(4, EventForDump.m147676e(6, "Enrollment runner failed for type: " + a.f253255d + " locale: " + this.f287183a.f287190g.f253249c));
                            ((C89859i) this.f287183a.f287203t.mo27525b()).mo83702b(C89849ae.RUN_ENROLLMENT_SET_INCOMPLETE_STATE);
                        } else {
                            ((C89859i) this.f287183a.f287203t.mo27525b()).mo83702b(C89849ae.RUN_ENROLLMENT_FAILED_WITHOUT_STATE_CHANGE);
                        }
                    }
                    this.f287183a.f287197n.b();
                    return;
                }
                hVar4.f287198o.sendBroadcast(new Intent("com.google.android.googlequicksearchbox.action.RESUME_HOTWORD").putExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE", this.f287183a.f287198o.getPackageName()));
                C102839h hVar5 = this.f287183a;
                hVar5.f287197n.a(hVar5.f287192i);
                return;
            }
        }
        this.f287183a.mo93504d();
    }

    /* renamed from: e */
    private final void m170573e() {
        C102839h hVar = this.f287183a;
        if (hVar.f287193j == hVar.f287194k) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            int i = this.f287183a.f287193j;
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160115b |= 536870912;
            cbVar.f160093ae = i;
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.RUN_ENROLLMENT_FIRST_FAILING_UTTERANCE;
            fVar.f246203c = (C59687cb) ajVar.build();
            ((C89859i) this.f287183a.f287203t.mo27525b()).mo74236a(fVar.mo83699a());
        }
    }

    /* renamed from: a */
    public final void mo70939a(C90528t tVar) {
        ((C59052c) ((C59052c) C102839h.f287184a.mo56225c()).mo56372aa(21261)).mo56389s("#onFatalError: %s", tVar.getMessage());
        m170573e();
        C102839h hVar = this.f287183a;
        if (hVar.f287206w) {
            hVar.f287197n.b();
        } else {
            m170572d();
        }
    }

    /* renamed from: b */
    public final void mo70940b(C90528t tVar) {
        ((C59052c) ((C59052c) C102839h.f287184a.mo56225c()).mo56372aa(21262)).mo56389s("#onNonFatalError: %s", tVar.getMessage());
        m170573e();
        C102839h hVar = this.f287183a;
        if (hVar.f287206w) {
            hVar.f287197n.b();
        } else {
            m170572d();
        }
    }

    /* renamed from: c */
    public final void mo70941c(C90603k kVar) {
        HotwordResult hotwordResult = ((C90574e) kVar).f253174a;
        if (!(kVar instanceof C90574e) || (hotwordResult == null && this.f287183a.f287206w)) {
            m170573e();
            this.f287183a.f287197n.b();
            return;
        }
        if (hotwordResult != null) {
            C102839h hVar = this.f287183a;
            hVar.f287194k++;
            ((C89859i) hVar.f287203t.mo27525b()).mo83702b(C89849ae.RUN_ENROLLMENT_UTTERANCE_PROCESSED);
        } else {
            m170573e();
        }
        this.f287183a.f287192i.add(hotwordResult);
        if (this.f287183a.f287200q.mo79746e(C90082eg.f249888aD)) {
            ((C59052c) ((C59052c) C102839h.f287184a.mo56224b()).mo56372aa(21264)).mo56387q("Sample %d processed", this.f287183a.f287193j + 1);
        }
        m170572d();
    }
}
