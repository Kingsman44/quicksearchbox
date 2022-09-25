package com.google.android.apps.search.podcasts.p10550b.p10555e;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97884aj;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.C140992n;
import com.google.common.base.C58833ax;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.e.i */
/* compiled from: PG */
public final /* synthetic */ class C140067i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C140084z f380653a;

    /* renamed from: b */
    public final /* synthetic */ C140641b f380654b;

    /* renamed from: c */
    public final /* synthetic */ long f380655c;

    /* renamed from: d */
    public final /* synthetic */ long f380656d;

    /* renamed from: e */
    public final /* synthetic */ boolean f380657e;

    public /* synthetic */ C140067i(C140084z zVar, C140641b bVar, long j, long j2, boolean z) {
        this.f380653a = zVar;
        this.f380654b = bVar;
        this.f380655c = j;
        this.f380656d = j2;
        this.f380657e = z;
    }

    public final void accept(Object obj) {
        C97884aj ajVar;
        C140084z zVar = this.f380653a;
        C140641b bVar = this.f380654b;
        long j = this.f380655c;
        long j2 = this.f380656d;
        boolean z = this.f380657e;
        C140083y yVar = (C140083y) obj;
        C140646b bVar2 = bVar.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        String str = bVar2.f382001g;
        C140646b bVar3 = bVar.f381974a;
        if (bVar3 == null) {
            bVar3 = C140646b.f381993r;
        }
        C140074p a = yVar.mo115430a(str, C58833ax.m90834k(C140992n.m228954a(bVar3)));
        if (a.f380666a.containsKey(bVar.f381975b)) {
            C97885ak akVar = (C97885ak) a.f380666a.get(bVar.f381975b);
            akVar.getClass();
            ajVar = (C97884aj) akVar.toBuilder();
        } else {
            ajVar = (C97884aj) C97885ak.f273305g.createBuilder();
            String str2 = bVar.f381975b;
            ajVar.copyOnWrite();
            C97885ak akVar2 = (C97885ak) ajVar.instance;
            str2.getClass();
            akVar2.f273307a |= 1;
            akVar2.f273308b = str2;
        }
        long b = yVar.f380683b.mo26870b();
        ajVar.copyOnWrite();
        C97885ak akVar3 = (C97885ak) ajVar.instance;
        akVar3.f273307a |= 16;
        akVar3.f273311e = b;
        if (z) {
            ajVar.copyOnWrite();
            C97885ak akVar4 = (C97885ak) ajVar.instance;
            akVar4.f273307a |= 4;
            akVar4.f273310d = true;
            ajVar.copyOnWrite();
            C97885ak akVar5 = (C97885ak) ajVar.instance;
            akVar5.f273307a |= 2;
            akVar5.f273309c = j2;
            ajVar.copyOnWrite();
            C97885ak akVar6 = (C97885ak) ajVar.instance;
            akVar6.f273307a |= 32;
            akVar6.f273312f = 1.0f;
        } else {
            if (j2 < 5000) {
                j2 = 0;
            }
            ajVar.copyOnWrite();
            C97885ak akVar7 = (C97885ak) ajVar.instance;
            akVar7.f273307a |= 4;
            akVar7.f273310d = false;
            ajVar.copyOnWrite();
            C97885ak akVar8 = (C97885ak) ajVar.instance;
            akVar8.f273307a |= 2;
            akVar8.f273309c = j2;
            if (j <= 0) {
                j = bVar.f381981h * 1000;
            }
            if (j > 0) {
                float max = Math.max(Math.min(((float) j2) / ((float) j), 1.0f), 0.0f);
                ajVar.copyOnWrite();
                C97885ak akVar9 = (C97885ak) ajVar.instance;
                akVar9.f273307a |= 32;
                akVar9.f273312f = max;
                if (Float.compare(max, 1.0f) >= 0) {
                    ajVar.copyOnWrite();
                    C97885ak akVar10 = (C97885ak) ajVar.instance;
                    akVar10.f273307a |= 4;
                    akVar10.f273310d = true;
                }
            }
        }
        a.f380666a.put(bVar.f381975b, (C97885ak) ajVar.build());
        C140083y.m227732b(yVar.f380685d, str, new HashSet());
        ((Set) yVar.f380685d.get(str)).add(bVar.f381975b);
        yVar.f380682a.mo115427c();
        zVar.f380693d.mo115429a(yVar);
        zVar.mo115437f();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
