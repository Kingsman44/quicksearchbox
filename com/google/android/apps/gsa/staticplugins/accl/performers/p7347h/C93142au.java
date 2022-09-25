package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.assistant.p3897e.p3921j.aez;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.au */
/* compiled from: PG */
public final /* synthetic */ class C93142au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259788a;

    /* renamed from: b */
    public final /* synthetic */ aez f259789b;

    public /* synthetic */ C93142au(C93150bb bbVar, aez aez) {
        this.f259788a = bbVar;
        this.f259789b = aez;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C93150bb bbVar = this.f259788a;
        aez aez = this.f259789b;
        C58833ax axVar = (C58833ax) obj;
        int i = 0;
        if (!aez.f134981d || (!bbVar.f259806g.mo79746e(C90025cd.f248161s) && !bbVar.f259806g.mo79746e(C90051dc.f248894bw))) {
            boolean z = aez.f134980c;
            boolean z2 = aez.f134982e;
            C59104x b = C93150bb.f259800a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(13409)).mo56386p("#playTtsForMessageNotification");
            if (!axVar.mo56113h()) {
                C59104x d = C93150bb.f259800a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
                ((C59052c) ((C59052c) d).mo56372aa(13411)).mo56386p("#playTtsForMessageNotification, no notification");
                cxVar = C60856cj.m92900i(bbVar.mo87551b("#playTtsForMessageNotification, notification not found"));
            } else if (TextUtils.isEmpty(((BundledMessageNotification) axVar.mo56107c()).mo84118h())) {
                C59104x d2 = C93150bb.f259800a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
                ((C59052c) ((C59052c) d2).mo56372aa(13410)).mo56386p("#playTtsForMessageNotification, empty message");
                cxVar = C60856cj.m92900i(bbVar.mo87551b("#playTtsForMessageNotification, empty message"));
            } else if (z) {
                cxVar = bbVar.mo87554e((BundledMessageNotification) axVar.mo56107c(), false);
            } else {
                ArrayList arrayList = new ArrayList();
                C58485gu d3 = ((BundledMessageNotification) axVar.mo56107c()).mo84113d();
                int size = d3.size();
                while (i < size) {
                    arrayList.add(bbVar.mo87552c(((MessageNotification) d3.get(i)).f252533C));
                    i++;
                }
                cxVar = C60846c.m92879h(C60922j.m93045h(C60838bs.m92859i(C60922j.m93045h(C60856cj.m92896e(arrayList), new C93135an(bbVar, axVar), C60826bg.f164896a)), new C93136ao(z2), C60826bg.f164896a), Exception.class, new C93137ap(bbVar, axVar, z2), C60826bg.f164896a);
            }
        } else {
            boolean z3 = aez.f134980c;
            boolean z4 = aez.f134982e;
            C59104x b2 = C93150bb.f259800a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
            ((C59052c) ((C59052c) b2).mo56372aa(13407)).mo56386p("#playMultiMediaMessageNotification");
            if (!axVar.mo56113h()) {
                C59104x d4 = C93150bb.f259800a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
                ((C59052c) ((C59052c) d4).mo56372aa(13408)).mo56386p("#playMultiMediaMessageNotification, no notification");
                cxVar = C60856cj.m92900i(bbVar.mo87551b("#playMultiMediaMessageNotification, no notification"));
            } else {
                AtomicLong atomicLong = new AtomicLong(Duration.ofSeconds((long) ((int) bbVar.f259806g.mo79743a(C90025cd.f248144b))).toMillis());
                ArrayList arrayList2 = new ArrayList();
                if (bbVar.f259806g.mo79746e(C90025cd.f248159q)) {
                    bbVar.mo87559j(C88244um.MULTI_MEDIA_MESSAGE_NOTIFICATION_PLAYBACK_STARTED);
                }
                C58485gu d5 = ((BundledMessageNotification) axVar.mo56107c()).mo84113d();
                int size2 = d5.size();
                while (i < size2) {
                    MessageNotification messageNotification = (MessageNotification) d5.get(i);
                    if (C93150bb.m153214k(messageNotification)) {
                        arrayList2.add(bbVar.f259801b.mo57305b(new C93129ah(bbVar, messageNotification, atomicLong, z3), bbVar.f259810k));
                    } else if (z3) {
                        arrayList2.add(bbVar.f259801b.mo57305b(new C93130ai(bbVar, bbVar.mo87557h(messageNotification).toString()), bbVar.f259810k));
                    } else {
                        arrayList2.add(bbVar.f259801b.mo57305b(new C93132ak(bbVar, messageNotification), bbVar.f259810k));
                    }
                    i++;
                }
                cxVar = C60922j.m93044g(C60856cj.m92896e(arrayList2), new C93133al(bbVar, z4), C60826bg.f164896a);
            }
        }
        C60856cj.m92911t(cxVar, new C93144aw(bbVar, axVar), C60826bg.f164896a);
        return cxVar;
    }
}
