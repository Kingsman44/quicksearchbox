package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.logging.Level;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ah */
/* compiled from: PG */
final class C11759ah implements C60931s {

    /* renamed from: a */
    final /* synthetic */ boolean f37854a;

    /* renamed from: b */
    final /* synthetic */ boolean f37855b;

    /* renamed from: c */
    final /* synthetic */ C11760ai f37856c;

    public C11759ah(boolean z, boolean z2, C11760ai aiVar) {
        this.f37854a = z;
        this.f37855b = z2;
        this.f37856c = aiVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        Level level;
        List list = (List) obj;
        C69664n.m101061g(list, "messages");
        if (list.isEmpty()) {
            C58974d dVar = C11760ai.f37857a;
            if (this.f37854a || this.f37855b) {
                level = Level.SEVERE;
            } else {
                level = Level.FINE;
            }
            dVar.mo56223a(level).mo56386p("getNotifications(): RecentMessages is empty.");
            return C60856cj.m92900i(C58485gu.m89845m());
        } else if ((!this.f37854a && !this.f37855b) || list.size() == 1) {
            return this.f37856c.f37859c.mo20102a(list, true, C11760ai.f37858b);
        } else {
            ((C58970a) C11760ai.f37857a.mo56225c()).mo56395y("getNotifications(): # messages (%d) != 1 for %s message.", list.size(), true != this.f37854a ? "reply" : "read");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
    }
}
