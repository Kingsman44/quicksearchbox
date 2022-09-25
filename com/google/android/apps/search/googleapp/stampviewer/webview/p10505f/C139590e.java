package com.google.android.apps.search.googleapp.stampviewer.webview.p10505f;

import android.net.Uri;
import android.support.p031v4.app.C0167am;
import com.google.android.apps.search.googleapp.amp.p10138a.C133459h;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10497i.C139424c;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.p10506a.C139573a;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.p10506a.C139574b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.p10506a.C139575c;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.p10507b.C139579b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.p10508c.C139584d;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.p10509d.C139588a;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4242bp.p4253e.p4254a.C56192l;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.f.e */
/* compiled from: PG */
final class C139590e implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139587d f379477a;

    public C139590e(C139587d dVar) {
        this.f379477a = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139324f fVar;
        C139587d dVar = this.f379477a;
        int a = ((C139605t) bVar).mo115071a();
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                C139588a aVar = dVar.f379470g;
                C56610b bVar2 = dVar.f379474k.f379032b;
                if (bVar2 == null) {
                    bVar2 = C56610b.f151140k;
                }
                aVar.f379476b.startActivity(C139424c.m226558a(bVar2.f151143b, aVar.f379475a.mo46468a().f113334g));
            } else if (i == 1) {
                C139579b bVar3 = dVar.f379471h;
                C133459h hVar = new C133459h(Uri.parse(bVar3.f379446b));
                hVar.mo111166d("hl", bVar3.f379447c.mo114963a().toLanguageTag());
                C139795f fVar2 = bVar3.f379445a;
                Uri a2 = hVar.mo111163a();
                C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
                C139851q qVar = C139851q.UNKNOWN;
                iVar.copyOnWrite();
                C139823j jVar = (C139823j) iVar.instance;
                jVar.f380069b = qVar.f380143m;
                jVar.f380068a = 1 | jVar.f380068a;
                fVar2.mo115250a(a2, (C139823j) iVar.build());
            } else if (i == 2) {
                C139575c cVar = dVar.f379472i;
                C56610b bVar4 = dVar.f379474k.f379032b;
                if (bVar4 == null) {
                    bVar4 = C56610b.f151140k;
                }
                String str = bVar4.f151143b;
                C43376u a3 = cVar.f379442b.mo46468a();
                String str2 = a3.f113329b;
                C0167am activity = cVar.f379443c.getActivity();
                if (activity == null) {
                    fVar = C139324f.f378925k;
                } else {
                    try {
                        fVar = cVar.f379444d.mo114908b(activity.getIntent());
                    } catch (C62974ct unused) {
                        fVar = C139324f.f378925k;
                    }
                }
                C58480gp gpVar = new C58480gp(4);
                Stream map = Collection.EL.stream(fVar.f378928b).map(C139573a.f379439a);
                Objects.requireNonNull(gpVar);
                map.forEach(new C139574b(gpVar));
                C58485gu f = gpVar.mo55394f();
                C47474k g = C47475l.m84477g();
                C47465c cVar2 = (C47465c) g;
                cVar2.f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
                g.mo51334g("StampViewer");
                C46663a aVar2 = new C46663a();
                aVar2.mo50686d(C46667e.KEY_VALUE);
                aVar2.mo50684b(false);
                aVar2.f121916a = C63088z.m96143E(str);
                g.mo51333f("Publisher URL", aVar2.mo50683a());
                C46663a aVar3 = new C46663a();
                aVar3.mo50686d(C46667e.KEY_VALUE);
                aVar3.mo50684b(true);
                aVar3.f121916a = C63088z.m96143E(str2);
                g.mo51333f("URL", aVar3.mo50683a());
                C46663a aVar4 = new C46663a();
                aVar4.mo50686d(C46667e.KEY_VALUE);
                aVar4.mo50684b(false);
                aVar4.f121916a = C63088z.m96143E(Integer.toString(fVar.f378929c));
                g.mo51333f("Initial Index", aVar4.mo50683a());
                C46663a aVar5 = new C46663a();
                aVar5.mo50686d(C46667e.KEY_VALUE);
                aVar5.mo50684b(false);
                aVar5.f121916a = C63088z.m96143E(Integer.toString(f.indexOf(str)));
                g.mo51333f("Current Index", aVar5.mo50683a());
                C46663a aVar6 = new C46663a();
                aVar6.mo50686d(C46667e.KEY_VALUE);
                aVar6.mo50684b(false);
                C43369n a4 = C43369n.m76519a(a3.f113330c);
                if (a4 == null) {
                    a4 = C43369n.UNSPECIFIED;
                }
                aVar6.f121916a = C63088z.m96143E(Integer.toString(a4.f113312h));
                g.mo51333f("Load State", aVar6.mo50683a());
                C46663a aVar7 = new C46663a();
                aVar7.mo50686d(C46667e.KEY_VALUE);
                aVar7.mo50684b(false);
                C43363h hVar2 = a3.f113331d;
                if (hVar2 == null) {
                    hVar2 = C43363h.f113275f;
                }
                C43362g a5 = C43362g.m76515a(hVar2.f113278b);
                if (a5 == null) {
                    a5 = C43362g.UNSPECIFIED;
                }
                aVar7.f121916a = C63088z.m96143E(Integer.toString(a5.f113274h));
                g.mo51333f("Load Error Type", aVar7.mo50683a());
                C46663a aVar8 = new C46663a();
                aVar8.mo50686d(C46667e.KEY_VALUE);
                aVar8.mo50684b(false);
                C43363h hVar3 = a3.f113331d;
                if (hVar3 == null) {
                    hVar3 = C43363h.f113275f;
                }
                aVar8.f121916a = C63088z.m96143E(hVar3.f113279c);
                g.mo51333f("Load Error Description", aVar8.mo50683a());
                C46663a aVar9 = new C46663a();
                aVar9.mo50686d(C46667e.KEY_VALUE);
                aVar9.mo50684b(false);
                C43366k a6 = C43366k.m76517a(a3.f113332e);
                if (a6 == null) {
                    a6 = C43366k.UNSPECIFIED;
                }
                aVar9.f121916a = C63088z.m96143E(Integer.toString(a6.f113292i));
                g.mo51333f("Initial Request Trigger Type", aVar9.mo50683a());
                C46663a aVar10 = new C46663a();
                aVar10.mo50686d(C46667e.KEY_VALUE);
                aVar10.mo50684b(false);
                C43367l lVar = a3.f113335h;
                if (lVar == null) {
                    lVar = C43367l.f113293h;
                }
                C43366k a7 = C43366k.m76517a(lVar.f113299e);
                if (a7 == null) {
                    a7 = C43366k.UNSPECIFIED;
                }
                aVar10.f121916a = C63088z.m96143E(Integer.toString(a7.f113292i));
                g.mo51333f("Pending Request Trigger Type", aVar10.mo50683a());
                cVar2.f123252d = 3;
                cVar.f379441a.mo51336a(g.mo51332e());
            } else if (i == 3) {
                C139584d dVar2 = dVar.f379473j;
                C56610b bVar5 = dVar.f379474k.f379032b;
                if (bVar5 == null) {
                    bVar5 = C56610b.f151140k;
                }
                C56192l lVar2 = bVar5.f151149h;
                if (lVar2 == null) {
                    lVar2 = C56192l.f149716c;
                }
                dVar2.f379457b.mo50445g(new C46438d(dVar2.f379460e.mo50215b(dVar2.f379459d)), new C46436b(new ProtoParsers.InternalDontUse((byte[]) null, lVar2)), dVar2.f379462g);
            }
            return C47392e.f123115a;
        }
        throw null;
    }
}
