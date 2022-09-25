package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bc */
/* compiled from: PG */
final class C95093bc extends C95091ba {

    /* renamed from: a */
    final /* synthetic */ C95097bg f266010a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95093bc(C95097bg bgVar) {
        super(bgVar, "QUERY_FAILED");
        this.f266010a = bgVar;
    }

    /* renamed from: a */
    public final void mo89003a() {
        int i;
        super.mo89003a();
        this.f266010a.f266044p.mo89277r(7);
        Integer g = this.f266010a.f266036h.mo89215g(25);
        SearchError searchError = this.f266010a.f266023G;
        if (searchError != null) {
            int intValue = ((Integer) searchError.f236026j.mo56109e(Integer.valueOf(searchError.mo81135N()))).intValue();
            C59104x b = C95097bg.f266015a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) b).mo56372aa(18022)).mo56387q("Getting search error code %d", intValue);
            C89885b a = C89885b.m146362a(intValue);
            if (a != null) {
                C59104x b2 = C95097bg.f266015a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) b2).mo56372aa(18024)).mo56387q("Getting offline error code %s", a.f246280a);
                C88244um umVar = C88244um.ATTACH_WEBVIEW;
                int ordinal = a.ordinal();
                if (ordinal != 129) {
                    if (!(ordinal == 195 || ordinal == 337)) {
                        if (ordinal != 180 && ordinal != 181) {
                            switch (ordinal) {
                                case 188:
                                case 189:
                                    break;
                                case 190:
                                case 191:
                                    i = R.string.no_mobile_data_indicator;
                                    break;
                                default:
                                    C59104x c = C95097bg.f266015a.mo56225c();
                                    c.mo56378ag(C58975e.f156826a, "QueryHandler");
                                    ((C59052c) ((C59052c) c).mo56372aa(18025)).mo56389s("Unknown offline error code: %s", a);
                                    break;
                            }
                        } else {
                            i = R.string.offline_airplane_mode_indicator;
                        }
                    }
                    i = R.string.no_signal_indicator;
                } else {
                    i = R.string.poor_connectivity_indicator;
                }
                g = Integer.valueOf(i);
            } else {
                C59104x c2 = C95097bg.f266015a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) c2).mo56372aa(18023)).mo56386p("Received empty offline error code");
            }
        }
        if (g != null) {
            mo89012h(this.f266010a.f266031c.getString(g.intValue()));
            return;
        }
        C89655j.m145957a("no education prompt");
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public final void mo89008f() {
        C59071e eVar = C95097bg.f266015a;
        C58976aa aaVar = C58975e.f156826a;
        C95097bg bgVar = this.f266010a;
        if (bgVar.f266019C) {
            bgVar.f266019C = false;
            bgVar.f266020D = null;
        }
        bgVar.mo89018e("AUDIO_DELAY_COMPENSATION");
        mo89006d();
    }
}
