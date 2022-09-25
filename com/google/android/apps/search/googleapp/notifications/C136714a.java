package com.google.android.apps.search.googleapp.notifications;

import android.app.Notification;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2293h.C30014g;
import com.google.p375ai.p378b.C7573c;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55568d;
import com.google.protobuf.C62942bv;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a */
/* compiled from: PG */
public final class C136714a implements C30014g {
    /* renamed from: h */
    private static final void m222291h(C7681g gVar) {
        C7573c cVar = (C7573c) C7708h.f26894n.createBuilder();
        cVar.copyOnWrite();
        C7708h hVar = (C7708h) cVar.instance;
        hVar.f26897b = gVar.f26835cv;
        hVar.f26896a |= 1;
        C62942bv build = cVar.build();
        C69664n.m101060f(build, "newBuilder().setType(actionType).build()");
        C7708h hVar2 = (C7708h) build;
    }

    /* renamed from: i */
    private static final void m222292i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29827r rVar = (C29827r) it.next();
        }
    }

    /* renamed from: a */
    public final void mo35334a(C29820k kVar, C29827r rVar, C55568d dVar) {
        C69664n.m101061g(rVar, "chimeThread");
        C69664n.m101061g(dVar, "action");
    }

    /* renamed from: b */
    public final void mo35335b(C29820k kVar, C29827r rVar, C55568d dVar) {
        C69664n.m101061g(rVar, "chimeThread");
        C69664n.m101061g(dVar, "action");
    }

    /* renamed from: c */
    public final void mo35336c(C29820k kVar, List list) {
        C69664n.m101061g(list, "chimeThreads");
    }

    /* renamed from: d */
    public final void mo35337d(C29820k kVar, List list) {
        C69664n.m101061g(list, "chimeThreads");
    }

    /* renamed from: e */
    public final void mo35338e(List list) {
        C69664n.m101061g(list, "chimeThreads");
        m222292i(list);
    }

    /* renamed from: f */
    public final void mo35339f(List list, Notification notification) {
        C69664n.m101061g(list, "chimeThreads");
        C69664n.m101061g(notification, "notification");
        m222292i(list);
        m222291h(C7681g.DISPLAYED_NOTIFICATION);
    }

    /* renamed from: g */
    public final void mo35340g(List list) {
        C69664n.m101061g(list, "chimeThreads");
        m222292i(list);
        m222291h(C7681g.DISMISS_NOTIFICATION);
    }
}
