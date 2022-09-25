package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import android.animation.TimeAnimator;
import android.util.SparseArray;
import android.view.View;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import com.google.android.apps.search.assistant.surfaces.roti.home.C126804bo;
import com.google.android.apps.search.assistant.surfaces.roti.home.C126808bq;
import com.google.android.apps.search.assistant.surfaces.roti.home.C126809br;
import com.google.android.apps.search.assistant.surfaces.roti.home.C126810bs;
import com.google.android.apps.search.assistant.surfaces.roti.home.C126811bt;
import com.google.android.apps.search.assistant.surfaces.roti.home.C126838cr;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47591co;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.ao */
/* compiled from: PG */
public final class C119459ao implements TimeAnimator.TimeListener {

    /* renamed from: a */
    public final TimeAnimator f333018a;

    /* renamed from: b */
    public final C119463b f333019b;

    /* renamed from: c */
    public final C119460ap f333020c;

    /* renamed from: d */
    public final ArrayDeque f333021d = new ArrayDeque();

    /* renamed from: e */
    public C119458an f333022e;

    /* renamed from: f */
    public long f333023f;

    /* renamed from: g */
    public long f333024g;

    /* renamed from: h */
    public C119456al f333025h = C119456al.f332989b;

    /* renamed from: i */
    public final SparseArray f333026i = new SparseArray();

    /* renamed from: j */
    public int f333027j;

    /* renamed from: k */
    public int f333028k;

    /* renamed from: l */
    public boolean f333029l;

    /* renamed from: m */
    private final float[] f333030m = new float[4];

    public C119459ao(C119463b bVar, TimeAnimator timeAnimator, C119458an anVar, C119460ap apVar) {
        this.f333019b = bVar;
        this.f333018a = timeAnimator;
        this.f333022e = anVar;
        this.f333020c = apVar;
        this.f333027j = 0;
        this.f333025h = C119456al.f332989b;
        timeAnimator.setTimeListener(this);
    }

    /* renamed from: a */
    public final Deque mo104367a(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (i != 8) {
            arrayDeque.addFirst(Integer.valueOf(i));
            i = i != 6 ? 8 : 5;
        }
        return arrayDeque;
    }

    /* renamed from: b */
    public final void mo104368b() {
        if (this.f333018a.isStarted()) {
            this.f333018a.resume();
        } else {
            this.f333018a.start();
        }
    }

    /* renamed from: c */
    public final void mo104369c(C119456al alVar) {
        C126811bt btVar;
        this.f333025h.mo104364b(this.f333019b);
        if (alVar == null) {
            this.f333018a.end();
        } else {
            this.f333025h = alVar;
            int i = this.f333028k;
            if (!(i == 0 || i == this.f333027j)) {
                C119456al a = C119460ap.m198251a(C119460ap.m198254d(i));
                C119456al c = C119460ap.m198253c(this.f333028k);
                C119456al alVar2 = this.f333025h;
                if (alVar2 == a || alVar2 == c) {
                    this.f333018a.isStarted();
                    int i2 = this.f333028k;
                    this.f333027j = i2;
                    this.f333028k = 0;
                    C119458an anVar = this.f333022e;
                    if (!(anVar == null || (btVar = ((LogoView) anVar).f332964f) == null)) {
                        if (i2 == 1) {
                            btVar.f349245a.mo107803i();
                        } else if (i2 != 2) {
                            if (i2 == 7) {
                                btVar.f349245a.f349220h.mo19974a(C37176a.f97329w);
                                btVar.f349245a.mo107806l();
                                View view = btVar.f349245a.f349216d.getView();
                                view.getClass();
                                LogoView logoView = (LogoView) view.findViewById(R.id.assistant_roti_inputplate_logo_view);
                                btVar.f349245a.mo107802h(logoView, i2);
                                logoView.setOnClickListener(new C47591co(btVar.f349245a.f349228p, "click the mic logo", new C126810bs(btVar)));
                            }
                        }
                        C126804bo boVar = btVar.f349245a;
                        C126838cr.m207503b(boVar.f349220h, boVar.f349222j.f349181c);
                        View view2 = btVar.f349245a.f349216d.getView();
                        view2.getClass();
                        LogoView logoView2 = (LogoView) view2.findViewById(R.id.assistant_roti_inputplate_logo_view);
                        btVar.f349245a.mo107802h(logoView2, i2);
                        btVar.f349245a.mo107805k(new C126808bq(btVar));
                        logoView2.setOnClickListener(new C47591co(btVar.f349245a.f349228p, "click the three dots", new C126809br(btVar)));
                    }
                    C119473g gVar = (C119473g) this.f333026i.get(this.f333027j);
                    if (gVar != null) {
                        gVar.mo104399a();
                    }
                }
            }
            this.f333025h.mo104363a(this.f333019b);
            this.f333024g = this.f333023f;
        }
        C119458an anVar2 = this.f333022e;
        if (anVar2 != null) {
            anVar2.mo104342b();
        }
    }

    /* renamed from: d */
    public final void mo104370d() {
        this.f333029l = true;
        if (!this.f333018a.isStarted()) {
            this.f333023f = 0;
            this.f333018a.start();
        }
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        int i = 0;
        if (this.f333029l) {
            this.f333029l = false;
            mo104369c((C119456al) this.f333021d.pollFirst());
        }
        if (this.f333018a.isStarted()) {
            this.f333023f = j;
            C119473g gVar = (C119473g) this.f333026i.get(this.f333027j);
            if (gVar != null) {
                float[] fArr = this.f333030m;
                C119474h hVar = gVar.f333081e;
                if (hVar != null) {
                    gVar.f333077a[gVar.f333080d] = ((float) hVar.mo104400a()) / 100.0f;
                    float[] fArr2 = gVar.f333077a;
                    int i2 = gVar.f333080d;
                    float a = C119472f.m198280a(gVar.f333079c, ((fArr2[i2] + fArr2[(i2 + 3) & 3]) + fArr2[(i2 + 2) & 3]) / 3.0f);
                    gVar.f333079c = a;
                    fArr[0] = a;
                    float[] fArr3 = gVar.f333078b;
                    int i3 = gVar.f333080d;
                    fArr[1] = fArr3[(i3 + 3) & 3];
                    fArr[2] = fArr3[(i3 + 2) & 3];
                    fArr[3] = fArr3[(i3 + 1) & 3];
                }
                float[] fArr4 = gVar.f333078b;
                int i4 = gVar.f333080d;
                fArr4[i4] = gVar.f333079c;
                gVar.f333080d = (i4 + 1) & 3;
                C119463b bVar = this.f333019b;
                float[] fArr5 = this.f333030m;
                while (i < 4 && i < bVar.f333044a.size()) {
                    (i != 0 ? i != 1 ? i != 2 ? bVar.f333053j ? bVar.f333049f : bVar.f333048e : bVar.f333047d : bVar.f333046c : bVar.f333045b).f333043m = fArr5[i];
                    i++;
                }
            }
            boolean c = this.f333025h.mo104365c(this.f333024g, this.f333023f, this.f333019b);
            C119458an anVar = this.f333022e;
            if (anVar != null) {
                anVar.mo104342b();
            }
            if (!c) {
                mo104370d();
            }
        }
    }
}
