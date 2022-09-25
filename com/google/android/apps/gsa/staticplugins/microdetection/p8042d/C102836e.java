package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import com.google.android.apps.gsa.c.f.bh;
import com.google.android.apps.gsa.hotword.a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.speech.p7298l.C92456a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.speech.micro.GoogleHotwordData;
import java.io.File;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.e */
/* compiled from: PG */
public final /* synthetic */ class C102836e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102839h f287181a;

    public /* synthetic */ C102836e(C102839h hVar) {
        this.f287181a = hVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C58833ax axVar;
        C102839h hVar = this.f287181a;
        GoogleHotwordData googleHotwordData = (GoogleHotwordData) obj;
        try {
            a aVar = hVar.f287191h;
            int i = hVar.f287193j;
            C92456a l = C92460b.m151978l();
            l.mo87171o(0);
            C92460b a = l.mo87157a();
            if (!aVar.a.mo56113h() || ((List) aVar.a.mo56107c()).get(i) == null) {
                axVar = (!aVar.b.mo56113h() || ((List) aVar.b.mo56107c()).get(i) == null) ? C58836b.f156633a : C58833ax.m90834k(new bh((File) ((List) aVar.b.mo56107c()).get(i), a));
            } else {
                axVar = C58833ax.m90834k(new bh((byte[]) ((List) aVar.a.mo56107c()).get(i), a));
            }
            C58833ax axVar2 = axVar;
            if (!axVar2.mo56113h()) {
                hVar.mo93503c(C89849ae.RUN_ENROLLMENT_NO_AUDIO_SOURCES, googleHotwordData);
                ((C59052c) ((C59052c) C102839h.f287184a.mo56226d()).mo56372aa(21268)).mo56386p("EnrollmentListeningSessionAdapter is absent - this should NEVER happen.");
                hVar.mo93501a();
                return;
            }
            C102843l c = C102845n.m170604c(hVar.f287185b, hVar.f287187d, hVar.f287188e, googleHotwordData, hVar.f287190g.f253249c, hVar.f287189f, C90536a.HOTWORD);
            ((C102832a) c).f287152h = hVar.f287186c;
            boolean z = false;
            c.mo93480e(false);
            c.mo93477b(hVar.f287204u);
            c.mo93481f(hVar.f287205v);
            if (hVar.mo93505e() && hVar.f287194k == 0) {
                z = true;
            }
            c.mo93479d(z);
            ((C102832a) c).f287155k = axVar2;
            hVar.f287196m = hVar.f287202s.mo93511a(c.mo93476a());
            hVar.f287196m.mo93509e();
        } catch (IllegalArgumentException e) {
            hVar.mo93503c(C89849ae.RUN_ENROLLMENT_INCOMPATIBLE_HOTWORD_MODEL, googleHotwordData);
            ((C59052c) ((C59052c) ((C59052c) C102839h.f287184a.mo56226d()).mo56382g(e)).mo56372aa(21267)).mo56386p("Error creating HotwordRecognitionRunner");
            hVar.mo93501a();
        }
    }
}
