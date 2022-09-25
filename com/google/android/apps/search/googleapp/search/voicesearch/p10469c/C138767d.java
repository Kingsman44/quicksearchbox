package com.google.android.apps.search.googleapp.search.voicesearch.p10469c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.p1533o.C18470bf;
import com.google.android.libraries.assistant.p1533o.C18471bg;
import com.google.android.libraries.assistant.p1533o.C18474bj;
import com.google.android.libraries.assistant.p1533o.C18481bq;
import com.google.android.libraries.assistant.p1533o.C18482br;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70869h;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.d */
/* compiled from: PG */
public final class C138767d {

    /* renamed from: a */
    public final C138772i f377448a;

    /* renamed from: b */
    public final C138785v f377449b;

    /* renamed from: c */
    public volatile C138766c f377450c;

    /* renamed from: d */
    public boolean f377451d;

    /* renamed from: e */
    private final C138774k f377452e;

    public C138767d(C138772i iVar, C138774k kVar, C138785v vVar) {
        C69664n.m101061g(iVar, "voiceSearchDataService");
        this.f377448a = iVar;
        this.f377452e = kVar;
        this.f377449b = vVar;
    }

    /* renamed from: a */
    public final void mo114518a() {
        C138766c cVar = this.f377450c;
        if (cVar != null && !cVar.f377447b.f377503d) {
            C70868g gVar = cVar.f377446a;
            C18474bj bjVar = (C18474bj) C18482br.f52415c.createBuilder();
            C18481bq bqVar = C18481bq.f52413a;
            bjVar.copyOnWrite();
            C18482br brVar = (C18482br) bjVar.instance;
            bqVar.getClass();
            brVar.f52418b = bqVar;
            brVar.f52417a = 2;
            gVar.mo20123c(bjVar.build());
            cVar.f377447b.f377505f = true;
        }
    }

    /* renamed from: b */
    public final void mo114519b(boolean z) {
        C138784u a = this.f377449b.mo114528a(z);
        C138774k kVar = this.f377452e;
        kVar.f377475j = this.f377451d;
        if (!a.f377500a) {
            kVar.f377468c.mo83702b(C89849ae.TNG_VOICE_SEARCH_INVOKED);
        }
        kVar.f377470e.f377459c = a;
        C18470bf bfVar = kVar.f377471f;
        C70862aj b = C70876o.m103761b(bfVar.f189039a.mo39510a(C18471bg.m35940b(), bfVar.f189040b), C47686k.m84827a(a), true);
        if (kVar.f377472g) {
            C60870cx d = kVar.f377467b.mo104001d();
            C138773j jVar = new C138773j(kVar, b);
            C60856cj.m92911t(d, C47810es.m84974n(jVar), kVar.f377466a);
        } else {
            C138774k.m225430a(b, kVar.f377469d);
        }
        a.f377504e = b;
        this.f377450c = new C138766c((C70868g) b, a);
    }

    /* renamed from: c */
    public final boolean mo114520c() {
        return this.f377450c != null;
    }

    /* renamed from: d */
    public final void mo114521d(int i) {
        String str;
        if (i != 0) {
            switch (i - 1) {
                case 0:
                    str = "APVS request has been canceled by tapping voice plate.";
                    break;
                case 1:
                    str = "APVS request has been canceled by tapping back button.";
                    break;
                case 2:
                    str = "APVS request has been canceled by navigating out from the app.";
                    break;
                case 3:
                    str = "APVS request has been canceled by navigating away from the current screen.";
                    break;
                case 4:
                    str = "APVS request has been canceled by closing the screen.";
                    break;
                case 5:
                    str = "APVS request has been canceled by tapping on language switcher.";
                    break;
                case 6:
                    str = "APVS request has been canceled by tapping on the mic in SBT.";
                    break;
                default:
                    str = "APVS request has been canceled by tapping on the searchbox in SBT.";
                    break;
            }
        } else {
            str = "APVS request has been canceled.";
        }
        C138766c cVar = this.f377450c;
        if (cVar != null) {
            ((C70869h) cVar.f377446a).f189042b.mo27480d(str, (Throwable) null);
        }
        this.f377450c = null;
    }
}
