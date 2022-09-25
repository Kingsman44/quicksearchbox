package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import android.net.Uri;
import android.os.Bundle;
import android.text.Annotation;
import android.text.Spanned;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62947c;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5230n.p5231a.C67364a;
import com.google.speech.p5230n.p5231a.C67365b;
import com.google.speech.p5230n.p5231a.C67366c;
import com.google.speech.p5230n.p5231a.C67368e;
import com.google.speech.p5230n.p5231a.C67369f;
import com.google.speech.p5230n.p5231a.C67370g;
import com.google.speech.p5230n.p5231a.C67371h;
import com.google.speech.p5230n.p5231a.C67372i;
import com.google.speech.p5230n.p5231a.C67373j;
import com.google.speech.p5230n.p5231a.C67374k;
import com.google.speech.p5230n.p5231a.C67375l;
import com.google.speech.p5230n.p5231a.C67376m;
import com.google.speech.p5230n.p5232b.C67401aq;
import com.google.speech.p5230n.p5232b.C67402ar;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.r */
/* compiled from: PG */
public final class C94797r implements C86686h {

    /* renamed from: a */
    public static final /* synthetic */ int f265080a = 0;

    /* renamed from: c */
    private static final C59071e f265081c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.r");

    /* renamed from: d */
    private final C86610af f265082d;

    /* renamed from: e */
    private final C85392b f265083e;

    /* renamed from: f */
    private C86697a f265084f;

    public C94797r(C86610af afVar, C85392b bVar) {
        this.f265082d = afVar;
        this.f265083e = bVar;
    }

    /* renamed from: a */
    private static int m156357a(Spanned spanned, int i, int i2, int i3, C67369f fVar) {
        if (i3 < i) {
            C59104x d = f265081c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoTtsSessionCntlr");
            ((C59052c) ((C59052c) d).mo56372aa(16802)).mo56386p("Ignoring overlapping span");
            return i;
        }
        if (i3 > i && i3 <= i2) {
            String obj = spanned.subSequence(i, i3).toString();
            C67370g gVar = (C67370g) C67371h.f183124c.createBuilder();
            C67375l lVar = (C67375l) C67376m.f183139e.createBuilder();
            C67373j jVar = (C67373j) C67374k.f183133d.createBuilder();
            jVar.copyOnWrite();
            C67374k kVar = (C67374k) jVar.instance;
            obj.getClass();
            kVar.f183135a |= 4;
            kVar.f183136b = obj;
            lVar.mo59845a(jVar);
            lVar.copyOnWrite();
            C67376m mVar = (C67376m) lVar.instance;
            mVar.f183141a |= 2;
            mVar.f183144d = true;
            gVar.copyOnWrite();
            C67371h hVar = (C67371h) gVar.instance;
            C67376m mVar2 = (C67376m) lVar.build();
            mVar2.getClass();
            hVar.f183127b = mVar2;
            hVar.f183126a = 2;
            fVar.mo59843a(gVar);
        }
        return i3;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        TtsRequest ttsRequest;
        String str;
        int i;
        Annotation[] annotationArr;
        ClientEventData clientEventData2 = clientEventData;
        C87739bu a = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C59071e eVar = f265081c;
        C59104x b = eVar.mo56224b();
        String str2 = "BistoTtsSessionCntlr";
        b.mo56378ag(C58975e.f156826a, str2);
        ((C59052c) ((C59052c) b).mo56372aa(16803)).mo56389s("handleGenericClientEvent ID = %s", a);
        int ordinal = a.ordinal();
        if (ordinal == 165) {
            C87739bu a2 = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            if (a2.ordinal() != 165) {
                C59104x c = eVar.mo56225c();
                c.mo56378ag(C58975e.f156826a, str2);
                C59052c cVar2 = (C59052c) ((C59052c) c).mo56372aa(16805);
                C87739bu a3 = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
                if (a3 == null) {
                    a3 = C87739bu.UNKNOWN;
                }
                cVar2.mo56387q("Received event: %d, cannot handle", a3.f237476dL);
            } else {
                C86697a aVar = this.f265084f;
                if (aVar == null) {
                    C59104x c2 = eVar.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, str2);
                    ((C59052c) ((C59052c) c2).mo56372aa(16810)).mo56386p("activeClient is null");
                } else {
                    ClientConfig clientConfig = ((C86775r) aVar).f234384f;
                    if (!clientEventData2.mo81913d(Bundle.class)) {
                        C59104x c3 = eVar.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, str2);
                        ((C59052c) ((C59052c) c3).mo56372aa(16809)).mo56386p("No Parcelable in PLAY_TTS");
                    } else {
                        Bundle bundle = (Bundle) clientEventData2.mo81912b(Bundle.class);
                        if (bundle == null) {
                            C59104x c4 = eVar.mo56225c();
                            c4.mo56378ag(C58975e.f156826a, str2);
                            ((C59052c) ((C59052c) c4).mo56372aa(16808)).mo56386p("No Bundle in PLAY_TTS");
                        } else {
                            CharSequence charSequence = bundle.getCharSequence("TTS_STRING");
                            if (charSequence == null) {
                                C59104x c5 = eVar.mo56225c();
                                c5.mo56378ag(C58975e.f156826a, str2);
                                ((C59052c) ((C59052c) c5).mo56372aa(16807)).mo56386p("TTS_STRING in PLAY_TTS is null");
                            } else {
                                String string = bundle.getString("LOCALE");
                                if (true == C58837ba.m90859h(string)) {
                                    string = "en-US";
                                }
                                String str3 = string;
                                Query G = Query.f252741b.mo84244G(true);
                                int i2 = 0;
                                if (charSequence instanceof Spanned) {
                                    Spanned spanned = (Spanned) charSequence;
                                    C67369f fVar = (C67369f) C67372i.f183129b.createBuilder();
                                    int length = spanned.length();
                                    Annotation[] annotationArr2 = (Annotation[]) spanned.getSpans(0, length, Annotation.class);
                                    Arrays.sort(annotationArr2, new C94795p(spanned));
                                    int length2 = annotationArr2.length;
                                    int i3 = 0;
                                    while (i2 < length2) {
                                        Annotation annotation = annotationArr2[i2];
                                        int spanStart = spanned.getSpanStart(annotation);
                                        i3 = m156357a(spanned, i3, length, spanStart, fVar);
                                        if (i3 == spanStart) {
                                            int spanEnd = spanned.getSpanEnd(annotation);
                                            if (spanEnd <= i3) {
                                                C59104x c6 = f265081c.mo56225c();
                                                c6.mo56378ag(C58975e.f156826a, str2);
                                                ((C59052c) ((C59052c) c6).mo56372aa(16801)).mo56386p("Span end before start");
                                            } else {
                                                if (spanEnd > length) {
                                                    C59104x c7 = f265081c.mo56225c();
                                                    c7.mo56378ag(C58975e.f156826a, str2);
                                                    ((C59052c) ((C59052c) c7).mo56372aa(16800)).mo56386p("Span end beyond Spanned length");
                                                    spanEnd = length;
                                                }
                                                if (!annotation.getKey().equals("BISTO_UGC")) {
                                                    C59104x b2 = f265081c.mo56224b();
                                                    b2.mo56378ag(C58975e.f156826a, str2);
                                                    ((C59052c) ((C59052c) b2).mo56372aa(16799)).mo56389s("Ignoring non-UGC annotation key: %s", annotation.getKey());
                                                } else {
                                                    C67375l lVar = (C67375l) C67376m.f183139e.createBuilder();
                                                    C67373j jVar = (C67373j) C67374k.f183133d.createBuilder();
                                                    String obj = spanned.subSequence(i3, spanEnd).toString();
                                                    jVar.copyOnWrite();
                                                    str = str2;
                                                    C67374k kVar = (C67374k) jVar.instance;
                                                    obj.getClass();
                                                    annotationArr = annotationArr2;
                                                    i = length2;
                                                    kVar.f183135a |= 4;
                                                    kVar.f183136b = obj;
                                                    lVar.mo59845a(jVar);
                                                    lVar.copyOnWrite();
                                                    C67376m mVar = (C67376m) lVar.instance;
                                                    mVar.f183141a |= 2;
                                                    mVar.f183144d = true;
                                                    List i4 = C58869cf.m90936b(new C58903m(',')).mo56155i(annotation.getValue());
                                                    if (i4.size() > 1) {
                                                        C67366c cVar3 = (C67366c) C67368e.f183119d.createBuilder();
                                                        cVar3.copyOnWrite();
                                                        C67368e eVar2 = (C67368e) cVar3.instance;
                                                        eVar2.f183123c = 4;
                                                        eVar2.f183121a |= 1;
                                                        cVar3.copyOnWrite();
                                                        C67368e eVar3 = (C67368e) cVar3.instance;
                                                        eVar3.mo59842a();
                                                        eVar3.f183122b.add("x-detect");
                                                        cVar3.copyOnWrite();
                                                        C67368e eVar4 = (C67368e) cVar3.instance;
                                                        eVar4.mo59842a();
                                                        C62947c.addAll((Iterable) i4, (List) eVar4.f183122b);
                                                        C67364a aVar2 = (C67364a) C67365b.f183113c.createBuilder();
                                                        aVar2.copyOnWrite();
                                                        C67365b bVar = (C67365b) aVar2.instance;
                                                        C67368e eVar5 = (C67368e) cVar3.build();
                                                        eVar5.getClass();
                                                        bVar.f183116b = eVar5;
                                                        bVar.f183115a |= 16;
                                                        lVar.copyOnWrite();
                                                        C67376m mVar2 = (C67376m) lVar.instance;
                                                        C67365b bVar2 = (C67365b) aVar2.build();
                                                        bVar2.getClass();
                                                        mVar2.f183143c = bVar2;
                                                        mVar2.f183141a |= 1;
                                                    }
                                                    C67370g gVar = (C67370g) C67371h.f183124c.createBuilder();
                                                    gVar.copyOnWrite();
                                                    C67371h hVar = (C67371h) gVar.instance;
                                                    C67376m mVar3 = (C67376m) lVar.build();
                                                    mVar3.getClass();
                                                    hVar.f183127b = mVar3;
                                                    hVar.f183126a = 2;
                                                    fVar.mo59843a(gVar);
                                                    i3 = spanEnd;
                                                    i2++;
                                                    str2 = str;
                                                    annotationArr2 = annotationArr;
                                                    length2 = i;
                                                }
                                            }
                                        }
                                        str = str2;
                                        annotationArr = annotationArr2;
                                        i = length2;
                                        i2++;
                                        str2 = str;
                                        annotationArr2 = annotationArr;
                                        length2 = i;
                                    }
                                    m156357a(spanned, i3, length, length, fVar);
                                    C67401aq aqVar = (C67401aq) C67402ar.f183192d.createBuilder();
                                    aqVar.copyOnWrite();
                                    C67402ar arVar = (C67402ar) aqVar.instance;
                                    C67372i iVar = (C67372i) fVar.build();
                                    iVar.getClass();
                                    arVar.f183196c = iVar;
                                    arVar.f183194a |= 1;
                                    ttsRequest = new TtsRequest((C67190ah) null, (List) null, (C67402ar) aqVar.build(), (Uri) null, false);
                                } else {
                                    ttsRequest = new TtsRequest(charSequence.toString(), false);
                                }
                                C85392b bVar3 = this.f265083e;
                                str3.getClass();
                                bVar3.mo78915d(4, str3, G, (C90606n) null, ttsRequest, clientConfig.mo81879I(), clientConfig.mo81897o(), (String) null, new C94796q());
                            }
                        }
                    }
                }
            }
        } else if (ordinal != 166) {
            C59104x c8 = eVar.mo56225c();
            c8.mo56378ag(C58975e.f156826a, str2);
            ((C59052c) ((C59052c) c8).mo56372aa(16804)).mo56389s("Unhandled client event: %s", a.name());
        } else {
            this.f265083e.mo78914c();
        }
        this.f265082d.mo80225f(C118826c.f331423b, j, 0);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f265084f = aVar;
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
