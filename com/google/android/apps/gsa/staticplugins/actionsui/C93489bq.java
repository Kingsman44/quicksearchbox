package com.google.android.apps.gsa.staticplugins.actionsui;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.core.CommunicationAction;
import com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction;
import com.google.android.apps.gsa.search.shared.contact.C87518f;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bq */
/* compiled from: PG */
public final class C93489bq extends C93693r implements C87518f {

    /* renamed from: d */
    private final C91123v f260912d;

    public C93489bq(C88512f fVar, C91123v vVar, C58833ax axVar) {
        super(fVar, axVar);
        this.f260912d = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo87798H() {
        boolean z;
        ShowContactInformationAction showContactInformationAction = (ShowContactInformationAction) this.f239226b;
        Parcelable parcelable = showContactInformationAction.f236042f.f236364c;
        parcelable.getClass();
        Person person = (Person) parcelable;
        int i = showContactInformationAction.f236057i;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                showContactInformationAction.f236059k = C58485gu.m89842j(person.f236374e);
                z = showContactInformationAction.f236059k.isEmpty();
            } else if (i == 2) {
                showContactInformationAction.f236060l = C58485gu.m89842j(person.f236375f);
                z = showContactInformationAction.f236060l.isEmpty();
            } else if (i == 3) {
                showContactInformationAction.f236061m = C58485gu.m89842j(person.f236376g);
                z = showContactInformationAction.f236061m.isEmpty();
            } else {
                throw new IllegalStateException("Unknown contact method: " + i);
            }
            z2 = true ^ z;
        } else {
            showContactInformationAction.f236059k = C58485gu.m89842j(person.f236374e);
            showContactInformationAction.f236060l = C58485gu.m89842j(person.f236375f);
            showContactInformationAction.f236061m = C58485gu.m89842j(person.f236376g);
            if (showContactInformationAction.f236059k.isEmpty() && showContactInformationAction.f236060l.isEmpty() && showContactInformationAction.f236061m.isEmpty()) {
                z2 = false;
            }
        }
        showContactInformationAction.f236058j = z2;
        mo82055r();
    }

    /* renamed from: k */
    public final void mo82048k() {
        PersonDisambiguation personDisambiguation = ((ShowContactInformationAction) this.f239226b).f236042f;
        if (!mo88148G(personDisambiguation)) {
            boolean z = false;
            if (personDisambiguation == null || personDisambiguation.mo81541i() || personDisambiguation.mo81543l()) {
                ShowContactInformationAction showContactInformationAction = (ShowContactInformationAction) this.f239226b;
                int i = showContactInformationAction.f236057i;
                C88509c cVar = this.f239227c;
                cVar.getClass();
                C93488bp bpVar = (C93488bp) cVar;
                bpVar.mo87795x();
                if (personDisambiguation == null || personDisambiguation.mo81541i()) {
                    if (personDisambiguation == null || !personDisambiguation.f236395k.mo81601c()) {
                        bpVar.mo87791ie();
                    } else {
                        bpVar.mo87785C();
                        mo87824F();
                        C88509c cVar2 = this.f239227c;
                        cVar2.getClass();
                        ((C93488bp) cVar2).mo87797z(true, z);
                        return;
                    }
                } else if (showContactInformationAction.f236058j) {
                    Parcelable parcelable = personDisambiguation.f236364c;
                    parcelable.getClass();
                    bpVar.mo87796y((Person) parcelable);
                    bpVar.mo87787E(showContactInformationAction.f236059k, this.f260912d.mo85391c());
                    bpVar.mo87784B(showContactInformationAction.f236060l);
                    bpVar.mo87789G(showContactInformationAction.f236061m);
                } else {
                    Parcelable parcelable2 = personDisambiguation.f236364c;
                    parcelable2.getClass();
                    bpVar.mo87796y((Person) parcelable2);
                    if (i == 0) {
                        bpVar.mo87792if();
                    } else if (i == 1) {
                        bpVar.mo87786D();
                    } else if (i == 2) {
                        bpVar.mo87783A();
                    } else if (i == 3) {
                        bpVar.mo87788F();
                    }
                }
                z = true;
                mo87824F();
                C88509c cVar22 = this.f239227c;
                cVar22.getClass();
                ((C93488bp) cVar22).mo87797z(true, z);
                return;
            }
            C88509c cVar3 = this.f239227c;
            cVar3.getClass();
            C93691p pVar = (C93691p) cVar3;
            ((CommunicationAction) this.f239226b).mo81150P(this);
            PersonDisambiguation personDisambiguation2 = ((CommunicationAction) this.f239226b).f236042f;
            if (!mo88148G(personDisambiguation2)) {
                if (personDisambiguation2 == null || (personDisambiguation2.mo81541i() && !personDisambiguation2.mo81607C())) {
                    pVar.mo87791ie();
                } else {
                    pVar.mo87790a(personDisambiguation2);
                }
            }
            C88509c cVar4 = this.f239227c;
            cVar4.getClass();
            ((C93488bp) cVar4).mo87797z(false, false);
            mo87824F();
        }
    }
}
