package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.common.p4526f.C59071e;
import com.google.speech.micro.C67363a;
import com.google.speech.micro.GoogleEndpointer;
import com.google.speech.micro.GoogleEndpointerData;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.p */
/* compiled from: PG */
public final class C102847p {

    /* renamed from: a */
    public static final C59071e f287257a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.d.p");

    /* renamed from: b */
    public final GoogleEndpointer f287258b;

    /* renamed from: c */
    public final GoogleEndpointerData f287259c;

    /* renamed from: d */
    public C67363a f287260d = C67363a.NO_SPEECH;

    /* renamed from: e */
    private final int f287261e;

    public C102847p(int i, String str, C92504i iVar, C89994f fVar) {
        GoogleEndpointerData googleEndpointerData;
        this.f287261e = i;
        byte[] m = iVar.mo87272m(str, fVar.mo83827p());
        GoogleEndpointer googleEndpointer = null;
        if (m == null) {
            googleEndpointerData = null;
        } else {
            googleEndpointerData = new GoogleEndpointerData(m, i);
        }
        this.f287259c = googleEndpointerData;
        this.f287258b = googleEndpointerData != null ? new GoogleEndpointer(googleEndpointerData) : googleEndpointer;
    }

    /* renamed from: a */
    public final void mo93512a() {
        GoogleEndpointer googleEndpointer = this.f287258b;
        if (googleEndpointer != null) {
            googleEndpointer.close();
        }
    }
}
