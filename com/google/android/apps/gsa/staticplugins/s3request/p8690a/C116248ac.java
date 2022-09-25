package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5224k.p5225a.C67242t;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C116248ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92460b f322342a;

    /* renamed from: b */
    public final /* synthetic */ C67242t f322343b;

    public /* synthetic */ C116248ac(C92460b bVar, C67242t tVar) {
        this.f322342a = bVar;
        this.f322343b = tVar;
    }

    public final Object apply(Object obj) {
        C92460b bVar = this.f322342a;
        C67242t tVar = this.f322343b;
        C37561eb ebVar = (C37561eb) obj;
        if (ebVar.f99802a == 1) {
            C37563ed a = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
            if (a == null) {
                a = C37563ed.UNKNOWN_OPENING_SUCCESS;
            }
            if (a == C37563ed.OPENED_SEAMLESSLY || bVar.mo87211w()) {
                return tVar;
            }
        }
        ((C59052c) ((C59052c) C116249ad.f322344a.mo56225c()).mo56372aa(31748)).mo56386p("Audio listening session adapter not in seamless mode, Changing premable to HOTWORD");
        return C67242t.HOTWORD;
    }
}
