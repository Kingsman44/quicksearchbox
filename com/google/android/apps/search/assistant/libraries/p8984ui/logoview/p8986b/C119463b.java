package com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b;

import android.content.Context;
import androidx.core.content.C1878d;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119442a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119443b;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119444c;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.b.b */
/* compiled from: PG */
public final class C119463b implements Iterable {

    /* renamed from: a */
    public final List f333044a = new ArrayList(6);

    /* renamed from: b */
    public final C119462a f333045b;

    /* renamed from: c */
    public final C119462a f333046c;

    /* renamed from: d */
    public final C119462a f333047d;

    /* renamed from: e */
    public final C119462a f333048e;

    /* renamed from: f */
    public final C119462a f333049f;

    /* renamed from: g */
    public final C119462a f333050g;

    /* renamed from: h */
    public final C119464c f333051h;

    /* renamed from: i */
    public final C119443b f333052i;

    /* renamed from: j */
    public boolean f333053j;

    /* renamed from: k */
    public float f333054k = 75.0f;

    /* renamed from: l */
    public float f333055l = 25.0f;

    public C119463b(Context context, C119462a aVar, C119462a aVar2, C119462a aVar3, C119462a aVar4, C119462a aVar5, C119462a aVar6, C119464c cVar, C119443b bVar) {
        int a = C1878d.m5128a(context, R.color.google_blue700);
        int a2 = C1878d.m5128a(context, R.color.google_red700);
        int a3 = C1878d.m5128a(context, R.color.google_yellow700);
        int a4 = C1878d.m5128a(context, R.color.google_green700);
        this.f333045b = aVar;
        aVar.mo104381h(12.0f, 3.1415927f, 1.0f, a);
        this.f333046c = aVar2;
        aVar2.mo104381h(4.0f, 3.1415927f, 1.0f, a2);
        this.f333047d = aVar3;
        aVar3.mo104381h(4.0f, 0.0f, 1.0f, a3);
        this.f333048e = aVar4;
        aVar4.mo104381h(12.0f, 0.0f, 1.0f, a4);
        this.f333049f = aVar5;
        aVar5.mo104381h(8.0f, 0.0f, 0.0f, a);
        this.f333050g = aVar6;
        aVar6.mo104381h(16.0f, 0.0f, 0.0f, a2);
        this.f333051h = cVar;
        this.f333052i = bVar;
        bVar.mo104359e(1.0f);
        mo104387f(false);
    }

    /* renamed from: a */
    public final float mo104382a(C119462a aVar) {
        if (aVar == this.f333045b) {
            return -16.0f;
        }
        if (aVar == this.f333046c) {
            return -7.85f;
        }
        if (aVar == this.f333047d) {
            return -2.55f;
        }
        if (aVar == this.f333048e) {
            return 11.5f;
        }
        if (aVar == this.f333049f) {
            return 6.7f;
        }
        if (aVar == this.f333050g) {
            return 16.1f;
        }
        throw new IllegalArgumentException("Unknown dot");
    }

    /* renamed from: b */
    public final int mo104383b(C119462a aVar) {
        if (aVar == this.f333045b) {
            return 0;
        }
        if (aVar == this.f333046c) {
            return 1;
        }
        if (aVar == this.f333047d) {
            return 2;
        }
        if (aVar == this.f333048e) {
            return this.f333053j ? 4 : 3;
        }
        if (aVar == this.f333049f && this.f333053j) {
            return 3;
        }
        if (aVar == this.f333050g && this.f333053j) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown or unexpected dot");
    }

    /* renamed from: c */
    public final void mo104384c(float f) {
        for (C119462a aVar : this.f333044a) {
            aVar.f333040j.mo104357c(f);
        }
    }

    /* renamed from: d */
    public final void mo104385d(float f, C119462a aVar) {
        C119442a aVar2 = aVar.f333032b;
        float f2 = f - aVar2.f332974b;
        aVar2.mo104356b(f2);
        Iterator it = iterator();
        while (it.hasNext()) {
            C119462a aVar3 = (C119462a) it.next();
            if (aVar3 != aVar) {
                aVar3.f333032b.mo104356b(f2);
            }
        }
        this.f333051h.f333056a.mo104356b(-f2);
    }

    /* renamed from: e */
    public final void mo104386e() {
        Iterator it = iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            C119444c cVar = aVar.f333031a;
            cVar.mo104359e(cVar.f332974b);
            C119442a aVar2 = aVar.f333032b;
            aVar2.mo104359e(aVar2.f332974b);
            C119444c cVar2 = aVar.f333033c;
            cVar2.mo104359e(cVar2.f332974b);
            C119444c cVar3 = aVar.f333034d;
            cVar3.mo104359e(cVar3.f332974b);
            C119444c cVar4 = aVar.f333035e;
            cVar4.mo104359e(cVar4.f332974b);
            C119443b bVar = aVar.f333036f;
            bVar.mo104359e(bVar.f332974b);
            C119443b bVar2 = aVar.f333038h;
            bVar2.mo104359e(bVar2.f332974b);
            C119443b bVar3 = aVar.f333039i;
            bVar3.mo104359e(bVar3.f332974b);
            C119443b bVar4 = aVar.f333037g;
            bVar4.mo104359e(bVar4.f332974b);
            C119443b bVar5 = aVar.f333040j;
            bVar5.mo104359e(bVar5.f332974b);
        }
        C119464c cVar5 = this.f333051h;
        C119443b bVar6 = cVar5.f333057b;
        bVar6.mo104359e(bVar6.f332974b);
        C119442a aVar3 = cVar5.f333056a;
        aVar3.mo104359e(aVar3.f332974b);
        C119443b bVar7 = this.f333052i;
        bVar7.mo104359e(bVar7.f332974b);
    }

    /* renamed from: f */
    public final void mo104387f(boolean z) {
        if (this.f333044a.isEmpty()) {
            this.f333044a.add(this.f333048e);
            this.f333044a.add(this.f333047d);
            this.f333044a.add(this.f333046c);
            this.f333044a.add(this.f333045b);
        }
        if (z != this.f333053j) {
            if (z) {
                this.f333044a.add(1, this.f333049f);
                this.f333044a.add(0, this.f333050g);
            } else {
                this.f333044a.remove(this.f333049f);
                this.f333044a.remove(this.f333050g);
            }
        }
        this.f333053j = z;
    }

    /* renamed from: g */
    public final void mo104388g() {
        C119442a aVar = this.f333051h.f333056a;
        float f = -0.3926991f - aVar.f332975c;
        aVar.mo104356b(f);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((C119462a) it.next()).f333032b.mo104356b(-f);
        }
    }

    public final Iterator iterator() {
        return this.f333044a.iterator();
    }
}
