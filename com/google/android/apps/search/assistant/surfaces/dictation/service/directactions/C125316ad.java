package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125666as;
import com.google.assistant.p3931f.p3936b.p3937a.C52807b;
import java.util.List;
import p5462h.C69677g;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.ad */
/* compiled from: PG */
public final class C125316ad {
    /* renamed from: a */
    public static final List m205264a(C125666as asVar) {
        C69664n.m101061g(asVar, "<this>");
        C125666as asVar2 = C125666as.RECIPIENT;
        int ordinal = asVar.ordinal();
        if (ordinal == 0) {
            String str = C52807b.RECIPIENT.f138551f;
            C69664n.m101060f(str, "RECIPIENT.toString()");
            return C69540x.m100947e("to_id", str);
        } else if (ordinal == 1) {
            String str2 = C52807b.CC.f138551f;
            C69664n.m101060f(str2, "CC.toString()");
            return C69540x.m100947e("cc_id", str2);
        } else if (ordinal == 2) {
            String str3 = C52807b.BCC.f138551f;
            C69664n.m101060f(str3, "BCC.toString()");
            return C69540x.m100947e("bcc_id", str3);
        } else if (ordinal == 3) {
            String str4 = C52807b.TITLE.f138551f;
            C69664n.m101060f(str4, "TITLE.toString()");
            return C69540x.m100947e("subject_id", "title", str4);
        } else if (ordinal == 4) {
            String str5 = C52807b.BODY.f138551f;
            C69664n.m101060f(str5, "BODY.toString()");
            return C69540x.m100947e("body_id", str5);
        } else {
            throw new C69677g();
        }
    }
}
