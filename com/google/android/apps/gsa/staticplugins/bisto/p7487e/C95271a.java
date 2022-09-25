package com.google.android.apps.gsa.staticplugins.bisto.p7487e;

import android.net.Uri;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88354yo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95131x;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.e.a */
/* compiled from: PG */
public final /* synthetic */ class C95271a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95283m f266570a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f266571b;

    public /* synthetic */ C95271a(C95283m mVar, ServiceEventData serviceEventData) {
        this.f266570a = mVar;
        this.f266571b = serviceEventData;
    }

    public final void run() {
        int i;
        boolean z;
        C95283m mVar = this.f266570a;
        ServiceEventData serviceEventData = this.f266571b;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a.ordinal() != 18) {
            C59104x d = C95283m.f266591a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AudioPlayer");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(14828);
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            cVar.mo56387q("onServiceEvent: Unexpected event %s", a2.f238695cJ);
            mVar.mo89199i();
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        mVar.mo89197g();
        synchronized (mVar.f266592b) {
            C95282l lVar = mVar.f266600j;
            i = 0;
            if (lVar == null) {
                C59104x c = C95283m.f266591a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AudioPlayer");
                ((C59052c) ((C59052c) c).mo56372aa(14816)).mo56386p("handleTtsResult: Skip TTS result playback. playerResultCallback is null");
            } else {
                synchronized (lVar.f266589e.f266592b) {
                    z = lVar.f266586b;
                }
                if (z) {
                    i = 3;
                } else {
                    C62940bt btVar = C88354yo.f238943a;
                    C88246uo uoVar = serviceEventData.f236959a;
                    C62940bt r3 = C62942bv.checkIsLite(btVar);
                    uoVar.mo58887l(r3);
                    boolean o = uoVar.f169962ag.mo58857o(r3.f169971d);
                    String str = null;
                    if (!o) {
                        C59104x d2 = C95286p.f266607a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "S3TtsHelper");
                        ((C59052c) ((C59052c) d2).mo56372aa(14843)).mo56386p("getAudioUriPath - Missing audio result data.");
                    } else {
                        C88356yq yqVar = (C88356yq) serviceEventData.mo81918e(C88354yo.f238943a);
                        if (yqVar == null) {
                            C59104x d3 = C95286p.f266607a.mo56226d();
                            d3.mo56378ag(C58975e.f156826a, "S3TtsHelper");
                            ((C59052c) ((C59052c) d3).mo56372aa(14842)).mo56386p("getAudioUriPath: ttsResultEventData is null");
                        } else if ((yqVar.f238946a & 1) != 0) {
                            String path = new Uri.Builder().path(yqVar.f238947b).build().getPath();
                            if (C58837ba.m90859h(path)) {
                                C59104x d4 = C95286p.f266607a.mo56226d();
                                d4.mo56378ag(C58975e.f156826a, "S3TtsHelper");
                                ((C59052c) ((C59052c) d4).mo56372aa(14840)).mo56386p("getAudioUriPath: Uri path is null or empty");
                            } else {
                                Pattern pattern = C90752i.f253827b;
                                str = path;
                            }
                        } else {
                            C59104x d5 = C95286p.f266607a.mo56226d();
                            d5.mo56378ag(C58975e.f156826a, "S3TtsHelper");
                            ((C59052c) ((C59052c) d5).mo56372aa(14841)).mo56386p("getAudioUriPath: TTS result does not contain Uri path");
                        }
                    }
                    if (str != null) {
                        C95186al alVar = mVar.f266595e;
                        Uri parse = Uri.parse(str);
                        C95282l lVar2 = mVar.f266600j;
                        lVar2.getClass();
                        i = alVar.mo89090a(parse, lVar2);
                    }
                }
            }
        }
        C95131x xVar = mVar.f266597g;
        if (xVar != null) {
            xVar.mo89057b();
        }
        if (i == 0) {
            C59104x d6 = C95283m.f266591a.mo56226d();
            d6.mo56378ag(C58975e.f156826a, "AudioPlayer");
            ((C59052c) ((C59052c) d6).mo56372aa(14830)).mo56386p("onServiceEvent: Could not play TTS result");
            mVar.mo89199i();
        }
    }
}
