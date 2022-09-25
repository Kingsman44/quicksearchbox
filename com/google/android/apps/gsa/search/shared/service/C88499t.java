package com.google.android.apps.gsa.search.shared.service;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SoundSearchResult;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88070oa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88072oc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88073od;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88075of;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88256uy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88259va;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88266vh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88268vj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88275vq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88277vs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88290we;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88292wg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88308ww;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88310wy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4500cm.p4514b.C58170d;
import com.google.speech.p5208h.C66667eg;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.apps.gsa.search.shared.service.t */
/* compiled from: PG */
public class C88499t implements C87682aj, C90757ba {

    /* renamed from: a */
    private static final C59071e f239208a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.service.t");

    /* renamed from: e */
    public void mo17566e(int i, int i2, boolean z) {
    }

    /* renamed from: f */
    public void mo17567f(ParcelableVoiceAction parcelableVoiceAction) {
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        try {
            C58976aa aaVar = C58975e.f156826a;
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a == null) {
                a = C88244um.ATTACH_WEBVIEW;
            }
            int ordinal = a.ordinal();
            if (ordinal == 33) {
                mo81841k();
            } else if (ordinal == 34) {
                mo81843n();
            } else if (ordinal == 36) {
                mo49090r();
            } else if (ordinal == 54) {
                ShowVoiceActionsEventParcelable showVoiceActionsEventParcelable = (ShowVoiceActionsEventParcelable) serviceEventData.mo81912b(ShowVoiceActionsEventParcelable.class);
                mo17569h(showVoiceActionsEventParcelable.f236960a, showVoiceActionsEventParcelable.f236961b, showVoiceActionsEventParcelable.f236962c, ((C88310wy) serviceEventData.mo81918e(C88308ww.f238829a)).f238833b);
            } else if (ordinal != 147) {
                String str = null;
                switch (ordinal) {
                    case 38:
                        mo82018o();
                        break;
                    case 39:
                        mo82020q((HotwordResult) serviceEventData.mo81912b(HotwordResult.class));
                        break;
                    case 40:
                        mo81842l((Response) serviceEventData.mo81912b(Response.class));
                        break;
                    case 41:
                        C88292wg wgVar = (C88292wg) serviceEventData.mo81918e(C88290we.f238790a);
                        if ((wgVar.f238793a & 1) == 0) {
                            mo49089m((byte[]) null);
                            break;
                        } else {
                            C58170d dVar = wgVar.f238794b;
                            if (dVar == null) {
                                dVar = C58170d.f155514c;
                            }
                            mo49089m(dVar.toByteArray());
                            break;
                        }
                    case 42:
                        if (serviceEventData.mo81913d(SoundSearchResult.class)) {
                            SoundSearchResult soundSearchResult = (SoundSearchResult) serviceEventData.mo81912b(SoundSearchResult.class);
                            break;
                        }
                        break;
                    default:
                        switch (ordinal) {
                            case 44:
                                C88262vd vdVar = (C88262vd) serviceEventData.mo81918e(C88260vb.f238727a);
                                String str2 = vdVar.f238731b;
                                if ((vdVar.f238730a & 2) != 0) {
                                    str = vdVar.f238732c;
                                }
                                mo17573iL(str2, str);
                                break;
                            case 45:
                                C88382zp zpVar = (C88382zp) serviceEventData.mo81918e(C88380zn.f238990a);
                                String str3 = zpVar.f238994b;
                                String str4 = zpVar.f238995c;
                                if ((zpVar.f238993a & 4) != 0) {
                                    str = zpVar.f238996d;
                                }
                                mo17570i(str3, str4, str);
                                break;
                            case 46:
                                mo17568g(((C88304ws) serviceEventData.mo81918e(C88302wq.f238816a)).f238820b);
                                break;
                            case 47:
                                mo17567f((ParcelableVoiceAction) serviceEventData.mo81912b(ParcelableVoiceAction.class));
                                break;
                            case 48:
                                Query query = (Query) serviceEventData.mo81912b(Query.class);
                                Uri.parse(((C88072oc) serviceEventData.mo81918e(C88070oa.f238126a)).f238129a);
                                break;
                            case 49:
                                C88268vj vjVar = (C88268vj) serviceEventData.mo81918e(C88266vh.f238738a);
                                mo17566e(vjVar.f238742b, vjVar.f238743c, vjVar.f238744d);
                                break;
                            case 50:
                                mo49088fO((Intent) serviceEventData.mo81912b(Intent.class));
                                break;
                            case 51:
                                C88259va vaVar = (C88259va) serviceEventData.mo81918e(C88256uy.f238719a);
                                mo17572iK(vaVar.f238724b, vaVar.f238725c, vaVar.f238726d);
                                break;
                            case 52:
                                OnTranscriptionUpdateEventParcelable onTranscriptionUpdateEventParcelable = (OnTranscriptionUpdateEventParcelable) serviceEventData.mo81912b(OnTranscriptionUpdateEventParcelable.class);
                                C88075of ofVar = (C88075of) serviceEventData.mo81918e(C88073od.f238131a);
                                Query query2 = onTranscriptionUpdateEventParcelable.f236957a;
                                List list = onTranscriptionUpdateEventParcelable.f236958b;
                                String str5 = ofVar.f238135b;
                                boolean z = ofVar.f238136c;
                                mo49091s(list, str5, ofVar.f238137d);
                                break;
                        }
                }
            } else {
                C66667eg a2 = C66667eg.m97298a(((C88277vs) serviceEventData.mo81918e(C88275vq.f238759a)).f238763b);
                if (a2 == null) {
                    a2 = C66667eg.UNKNOWN_ENROLLMENT_VALIDATION_RESULT;
                }
                mo82019p(a2);
            }
            mo17571iJ(serviceEventData);
        } catch (RemoteException e) {
            C59104x d = f239208a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ISearchServiceUCAdapter");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(9733)).mo56386p("Unexpected exception in onServiceEvent.");
        }
    }

    /* renamed from: fN */
    public final void mo77682fN(int i) {
        try {
            mo17574j(i);
        } catch (RemoteException e) {
            C59104x d = f239208a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ISearchServiceUCAdapter");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(9734)).mo56386p("Unexpected exception in onSpeechLevel.");
        }
    }

    /* renamed from: fO */
    public void mo49088fO(Intent intent) {
    }

    /* renamed from: g */
    public void mo17568g(int i) {
    }

    /* renamed from: h */
    public void mo17569h(Query query, List list, CardDecision cardDecision, int i) {
    }

    /* renamed from: i */
    public void mo17570i(String str, String str2, String str3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: iJ */
    public void mo17571iJ(ServiceEventData serviceEventData) {
    }

    /* renamed from: iK */
    public void mo17572iK(int i, String str, String str2) {
    }

    /* renamed from: iL */
    public void mo17573iL(String str, String str2) {
    }

    /* renamed from: j */
    public void mo17574j(int i) {
    }

    /* renamed from: k */
    public void mo81841k() {
    }

    /* renamed from: l */
    public void mo81842l(Response response) {
    }

    /* renamed from: m */
    public void mo49089m(byte[] bArr) {
    }

    /* renamed from: n */
    public void mo81843n() {
    }

    /* renamed from: o */
    public void mo82018o() {
    }

    /* renamed from: p */
    public void mo82019p(C66667eg egVar) {
    }

    /* renamed from: q */
    public void mo82020q(HotwordResult hotwordResult) {
    }

    /* renamed from: r */
    public void mo49090r() {
    }

    /* renamed from: s */
    public void mo49091s(List list, String str, String str2) {
    }
}
