package com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b;

import android.content.Context;
import androidx.core.content.C1878d;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138811a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138812b;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138813c;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.b.b */
/* compiled from: PG */
public final class C138824b implements Iterable {

    /* renamed from: a */
    public final List f377645a = new ArrayList(6);

    /* renamed from: b */
    public final C138823a f377646b;

    /* renamed from: c */
    public final C138823a f377647c;

    /* renamed from: d */
    public final C138823a f377648d;

    /* renamed from: e */
    public final C138823a f377649e;

    /* renamed from: f */
    public final C138823a f377650f;

    /* renamed from: g */
    public final C138823a f377651g;

    /* renamed from: h */
    public final C138825c f377652h;

    /* renamed from: i */
    public final C138812b f377653i;

    /* renamed from: j */
    public boolean f377654j;

    /* renamed from: k */
    public float f377655k = 75.0f;

    /* renamed from: l */
    public float f377656l = 25.0f;

    public C138824b(Context context, C138823a aVar, C138823a aVar2, C138823a aVar3, C138823a aVar4, C138823a aVar5, C138823a aVar6, C138825c cVar, C138812b bVar) {
        int a = C1878d.m5128a(context, R.color.google_blue700);
        int a2 = C1878d.m5128a(context, R.color.google_red700);
        int a3 = C1878d.m5128a(context, R.color.google_yellow700);
        int a4 = C1878d.m5128a(context, R.color.google_green700);
        this.f377646b = aVar;
        aVar.mo114576a(12.0f, 3.1415927f, 1.0f, a);
        this.f377647c = aVar2;
        aVar2.mo114576a(4.0f, 3.1415927f, 1.0f, a2);
        this.f377648d = aVar3;
        aVar3.mo114576a(4.0f, 0.0f, 1.0f, a3);
        this.f377649e = aVar4;
        aVar4.mo114576a(12.0f, 0.0f, 1.0f, a4);
        this.f377650f = aVar5;
        aVar5.mo114576a(8.0f, 0.0f, 0.0f, a);
        this.f377651g = aVar6;
        aVar6.mo114576a(16.0f, 0.0f, 0.0f, a2);
        this.f377652h = cVar;
        this.f377653i = bVar;
        bVar.mo114562e(1.0f);
        mo114588e(false);
    }

    /* renamed from: a */
    public final float mo114584a(C138823a aVar) {
        if (aVar == this.f377646b) {
            return -16.0f;
        }
        if (aVar == this.f377647c) {
            return -7.85f;
        }
        if (aVar == this.f377648d) {
            return -2.55f;
        }
        if (aVar == this.f377649e) {
            return 11.5f;
        }
        if (aVar == this.f377650f) {
            return 6.7f;
        }
        if (aVar == this.f377651g) {
            return 16.1f;
        }
        throw new IllegalArgumentException("Unknown dot");
    }

    /* renamed from: b */
    public final int mo114585b(C138823a aVar) {
        if (aVar == this.f377646b) {
            return 0;
        }
        if (aVar == this.f377647c) {
            return 1;
        }
        if (aVar == this.f377648d) {
            return 2;
        }
        if (aVar == this.f377649e) {
            return this.f377654j ? 4 : 3;
        }
        if (aVar == this.f377650f && this.f377654j) {
            return 3;
        }
        if (aVar == this.f377651g && this.f377654j) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown or unexpected dot");
    }

    /* renamed from: c */
    public final void mo114586c(float f, C138823a aVar) {
        C138811a aVar2 = aVar.f377635b;
        float f2 = f - aVar2.f377588b;
        aVar2.mo114559b(f2);
        Iterator it = iterator();
        while (it.hasNext()) {
            C138823a aVar3 = (C138823a) it.next();
            if (aVar3 != aVar) {
                aVar3.f377635b.mo114559b(f2);
            }
        }
        this.f377652h.f377657a.mo114559b(-f2);
    }

    /* renamed from: d */
    public final void mo114587d() {
        Iterator it = iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            C138813c cVar = aVar.f377634a;
            cVar.mo114562e(cVar.f377588b);
            C138811a aVar2 = aVar.f377635b;
            aVar2.mo114562e(aVar2.f377588b);
            C138813c cVar2 = aVar.f377636c;
            cVar2.mo114562e(cVar2.f377588b);
            C138813c cVar3 = aVar.f377637d;
            cVar3.mo114562e(cVar3.f377588b);
            C138813c cVar4 = aVar.f377638e;
            cVar4.mo114562e(cVar4.f377588b);
            C138812b bVar = aVar.f377639f;
            bVar.mo114562e(bVar.f377588b);
            C138812b bVar2 = aVar.f377641h;
            bVar2.mo114562e(bVar2.f377588b);
            C138812b bVar3 = aVar.f377642i;
            bVar3.mo114562e(bVar3.f377588b);
            C138812b bVar4 = aVar.f377640g;
            bVar4.mo114562e(bVar4.f377588b);
        }
        C138825c cVar5 = this.f377652h;
        C138812b bVar5 = cVar5.f377658b;
        bVar5.mo114562e(bVar5.f377588b);
        C138811a aVar3 = cVar5.f377657a;
        aVar3.mo114562e(aVar3.f377588b);
        C138812b bVar6 = this.f377653i;
        bVar6.mo114562e(bVar6.f377588b);
    }

    /* renamed from: e */
    public final void mo114588e(boolean z) {
        if (this.f377645a.isEmpty()) {
            this.f377645a.add(this.f377649e);
            this.f377645a.add(this.f377648d);
            this.f377645a.add(this.f377647c);
            this.f377645a.add(this.f377646b);
        }
        if (z != this.f377654j) {
            if (z) {
                this.f377645a.add(1, this.f377650f);
                this.f377645a.add(0, this.f377651g);
            } else {
                this.f377645a.remove(this.f377650f);
                this.f377645a.remove(this.f377651g);
            }
        }
        this.f377654j = z;
    }

    /* renamed from: f */
    public final void mo114589f() {
        C138811a aVar = this.f377652h.f377657a;
        float f = -0.3926991f - aVar.f377589c;
        aVar.mo114559b(f);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((C138823a) it.next()).f377635b.mo114559b(-f);
        }
    }

    public final Iterator iterator() {
        return this.f377645a.iterator();
    }
}
