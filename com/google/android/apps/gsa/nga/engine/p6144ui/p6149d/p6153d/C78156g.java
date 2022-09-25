package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78114f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6151b.C78118c;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128103d;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128104e;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128105f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.d.g */
/* compiled from: PG */
public final class C78156g implements C78118c, C78114f {

    /* renamed from: a */
    public static final C59071e f215199a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.d.d.g");

    /* renamed from: b */
    public final C22871g f215200b;

    /* renamed from: c */
    public final C58247c f215201c;

    /* renamed from: d */
    public Optional f215202d = Optional.empty();

    /* renamed from: e */
    public final HashMap f215203e = new HashMap();

    public C78156g(C22871g gVar) {
        C58254i iVar = new C58254i();
        iVar.mo54823g(3);
        this.f215201c = iVar.mo54817a();
        this.f215200b = gVar;
    }

    /* renamed from: d */
    public static void m125469d(List list, C51986gl glVar) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m125470e((C70862aj) it.next(), glVar);
            }
        }
    }

    /* renamed from: e */
    public static void m125470e(C70862aj ajVar, C51986gl glVar) {
        if (glVar.equals(C51986gl.f136421f)) {
            ajVar.mo20123c(C128105f.f352477c);
        } else {
            C128104e eVar = (C128104e) C128105f.f352477c.createBuilder();
            eVar.copyOnWrite();
            C128105f fVar = (C128105f) eVar.instance;
            glVar.getClass();
            fVar.f352480b = glVar;
            fVar.f352479a |= 1;
            ajVar.mo20123c((C128105f) eVar.build());
        }
        ajVar.mo20121a();
    }

    /* renamed from: a */
    public final void mo73081a(C128103d dVar, C70862aj ajVar) {
        this.f215200b.mo28212l("[NGA] getEscapeHatch", new C78153d(this, dVar, ajVar));
    }

    /* renamed from: b */
    public final void mo73092b(C51986gl glVar) {
        this.f215200b.mo28212l("[NGA] addAfterExecutionSuggestions", new C78154e(this, glVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = (com.google.common.p4522b.C58485gu) r2.f215203e.remove(r3);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo73106c(com.google.android.apps.gsa.nga.shared.p6407v.C83320io r3) {
        /*
            r2 = this;
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            java.util.HashMap r1 = r2.f215203e
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L_0x0017
            java.util.HashMap r1 = r2.f215203e
            java.lang.Object r3 = r1.remove(r3)
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3
            if (r3 == 0) goto L_0x0017
            return r3
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d.C78156g.mo73106c(com.google.android.apps.gsa.nga.shared.v.io):com.google.common.b.gu");
    }
}
