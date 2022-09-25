package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.VoiceInputInfo;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81477l;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81479n;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6366b.C81505b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.p7298l.C92456a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92462c;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8082b.C103493b;
import com.google.android.libraries.gsa.p1934s3.lib.Tee;
import com.google.common.base.C58817ah;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.x */
/* compiled from: PG */
public final /* synthetic */ class C103562x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C90021c f288526a;

    /* renamed from: b */
    public final /* synthetic */ Query f288527b;

    public /* synthetic */ C103562x(C90021c cVar, Query query) {
        this.f288526a = cVar;
        this.f288527b = query;
    }

    public final Object apply(Object obj) {
        int a;
        C90021c cVar = this.f288526a;
        Query query = this.f288527b;
        VoiceInputInfo voiceInputInfo = (VoiceInputInfo) obj;
        C81477l lVar = voiceInputInfo.f222922a;
        C92456a l = C92460b.m151978l();
        l.mo87175s(lVar.f222900a);
        l.mo87162f(C67451at.m97473a(lVar.f222902c));
        l.mo87160d(lVar.f222903d);
        l.mo87164h(false);
        l.mo87159c(false);
        if (lVar.f222903d != 16 && (a = (int) cVar.mo79743a(C90082eg.f250037cu)) >= 0) {
            l.mo87169m(a);
        }
        C81479n nVar = lVar.f222901b;
        if (nVar != null) {
            l.mo87168l(C67242t.SEAMLESS_HOTWORD);
            ((C92462c) l).f257910d = nVar.f222906a.mo59174N();
            l.mo87165i(nVar.f222907b);
            l.mo87166j(C67451at.m97473a(nVar.f222909d));
            l.mo87167k(nVar.f222908c);
        }
        C92460b a2 = l.mo87157a();
        if (!cVar.mo79746e(C90126fx.f251297gE) && !query.mo84324bI()) {
            return new C103560v(a2, new C103493b(new C81505b(voiceInputInfo.f222924c)));
        }
        int i = lVar.f222900a;
        Tee tee = new Tee(new C81505b(voiceInputInfo.f222924c), ((i + i) / 1000) * 10 * Integer.bitCount(a2.mo87190a()), 500, 1000, 2, true);
        return new C103560v(a2, new C103493b(tee.f63854e), new C103561w(tee));
    }
}
