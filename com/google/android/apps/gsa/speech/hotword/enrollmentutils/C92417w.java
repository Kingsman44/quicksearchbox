package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.audio.C92185e;
import com.google.android.apps.gsa.speech.audio.C92195f;
import com.google.android.apps.gsa.speech.audio.C92196g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.w */
/* compiled from: PG */
public final class C92417w {

    /* renamed from: a */
    public static final C59071e f257735a = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.enrollmentutils.w");

    /* renamed from: b */
    public final C22871g f257736b;

    /* renamed from: c */
    public final C89994f f257737c;

    /* renamed from: d */
    public final C92195f f257738d;

    public C92417w(C92196g gVar, C22871g gVar2, C89994f fVar) {
        this.f257736b = gVar2;
        this.f257737c = fVar;
        this.f257738d = gVar.mo86868a(C92185e.f257011b);
    }

    /* renamed from: a */
    public final C60870cx mo87056a(String str, int i) {
        if (str != null) {
            return this.f257736b.mo28207g("Delete Enrollment Utterances", new C92414t(this, str, i));
        }
        ((C59052c) ((C59052c) f257735a.mo56225c()).mo56372aa(12529)).mo56386p("Called deleteEnrollmentUtterances for null account");
        return C60866ct.f164955a;
    }
}
