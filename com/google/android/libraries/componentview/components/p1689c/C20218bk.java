package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4271bq.C56429h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.components.c.bk */
/* compiled from: PG */
public abstract class C20218bk implements C20220bm {

    /* renamed from: a */
    public final C20601ca f56775a;

    /* renamed from: b */
    public final C56429h f56776b;

    /* renamed from: c */
    public final C20610cj f56777c;

    /* renamed from: d */
    public boolean f56778d;

    /* renamed from: e */
    public boolean f56779e = false;

    /* renamed from: f */
    public int f56780f;

    /* renamed from: g */
    public final String f56781g;

    public C20218bk(C20601ca caVar, C56429h hVar, boolean z, C20610cj cjVar, String str) {
        this.f56775a = caVar;
        this.f56776b = hVar;
        this.f56778d = z;
        this.f56777c = cjVar;
        this.f56781g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List mo25293a();

    /* renamed from: b */
    public final int mo25296b() {
        int i = 0;
        for (C20220bm b : mo25293a()) {
            i += b.mo25296b();
        }
        return i;
    }

    /* renamed from: c */
    public C20219bl mo25297c(boolean z) {
        if (this.f56779e) {
            return new C20219bl(false, C58485gu.m89845m());
        }
        for (C20220bm c : mo25293a()) {
            c.mo25297c(z);
        }
        this.f56778d = z;
        return new C20219bl(true, C58485gu.m89845m());
    }

    /* renamed from: d */
    public final C20228bu mo25298d(boolean z) {
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        for (C20220bm d : mo25293a()) {
            C20228bu d2 = d.mo25298d(z);
            if (d2 != null) {
                if (d2 instanceof C20303eo) {
                    C20303eo eoVar = (C20303eo) d2;
                    if (eoVar.mo25318f()) {
                        arrayList2.add(eoVar);
                    } else {
                        arrayList3.add(eoVar);
                    }
                } else {
                    arrayList.add(d2);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (!z) {
                arrayList2 = C58597ky.m90216g(arrayList2);
            }
            arrayList.add(new C20302en(arrayList2));
        }
        if (!arrayList3.isEmpty()) {
            if (!z) {
                arrayList3 = C58597ky.m90216g(arrayList3);
            }
            arrayList.add(new C20302en(arrayList3));
        }
        return new C20319u(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Map mo25299e(boolean z) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo25300f(View view, long j) {
        if (!this.f56779e) {
            this.f56779e = true;
            this.f56780f = mo25296b();
            C20227bt btVar = new C20227bt(mo25298d(true ^ this.f56778d));
            btVar.f56806a.mo25307d();
            view.getViewTreeObserver().addOnPreDrawListener(new C20216bi(this, view, btVar, j));
            view.invalidate();
        }
    }
}
