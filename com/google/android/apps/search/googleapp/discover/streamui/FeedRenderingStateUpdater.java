package com.google.android.apps.search.googleapp.discover.streamui;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3512i.C44693c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57119ac;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57120ad;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57121ae;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57122af;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FeedRenderingStateUpdater implements C2376g {

    /* renamed from: a */
    private static final C59071e f366792a = C59071e.m91331h();

    /* renamed from: b */
    private final boolean f366793b;

    /* renamed from: c */
    private final C21232ab f366794c;

    /* renamed from: d */
    private final boolean f366795d;

    /* renamed from: e */
    private final Fragment f366796e;

    public FeedRenderingStateUpdater(boolean z, C21232ab abVar, boolean z2, Fragment fragment) {
        C69664n.m101061g(abVar, "dataStore");
        C69664n.m101061g(fragment, "fragment");
        this.f366793b = z;
        this.f366794c = abVar;
        this.f366795d = z2;
        this.f366796e = fragment;
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        Integer num;
        if (this.f366795d) {
            try {
                Context context = this.f366796e.getContext();
                num = Integer.valueOf(C44535e.m78722e(context, C44693c.m79227c(context, 16842801, "colorBackground is missing")));
            } catch (IllegalArgumentException e) {
                C59052c cVar = (C59052c) ((C59052c) f366792a.mo56225c()).mo56382g(e);
                cVar.mo56379ah(new C59094n(40460));
                cVar.mo56386p("Failed to get colorBackground value. Will return empty");
                num = null;
            }
            C21232ab abVar = this.f366794c;
            C57119ac acVar = (C57119ac) C57122af.f152479d.createBuilder();
            C69664n.m101060f(acVar, "newBuilder()");
            C69664n.m101061g(acVar, "builder");
            boolean z = this.f366793b;
            acVar.copyOnWrite();
            C57122af afVar = (C57122af) acVar.instance;
            afVar.f152481a |= 1;
            afVar.f152482b = z;
            if (num != null) {
                C57120ad adVar = (C57120ad) C57121ae.f152475c.createBuilder();
                C69664n.m101060f(adVar, "newBuilder()");
                C69664n.m101061g(adVar, "builder");
                int intValue = num.intValue();
                adVar.copyOnWrite();
                C57121ae aeVar = (C57121ae) adVar.instance;
                aeVar.f152477a |= 1;
                aeVar.f152478b = intValue;
                C62942bv build = adVar.build();
                C69664n.m101060f(build, "_builder.build()");
                C57121ae aeVar2 = (C57121ae) build;
                C69664n.m101061g(aeVar2, "value");
                acVar.copyOnWrite();
                C57122af afVar2 = (C57122af) acVar.instance;
                aeVar2.getClass();
                afVar2.f152483c = aeVar2;
                afVar2.f152481a |= 4;
            }
            C62942bv build2 = acVar.build();
            C69664n.m101060f(build2, "_builder.build()");
            abVar.mo26140c("/discoverfeed/renderingstate", ((C57122af) build2).toByteArray());
        }
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
