package com.google.android.gms.droidguard.internal;

import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.droidguard.C144112b;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.p10791b.C144114b;
import com.google.android.gms.droidguard.p10791b.C144116d;
import com.google.android.gms.droidguard.p10791b.C144118f;
import com.google.android.gms.droidguard.p10791b.C144119g;
import p5304e.p5305a.p5306a.p5390n.p5399e.p5400a.C68847a;

/* renamed from: com.google.android.gms.droidguard.internal.m */
/* compiled from: PG */
public class C144133m {

    /* renamed from: d */
    final String f390436d;

    /* renamed from: e */
    public final DroidGuardResultsRequest f390437e;

    /* renamed from: f */
    final C144116d f390438f;

    /* renamed from: g */
    boolean f390439g = false;

    public C144133m(String str) {
        C144118f fVar;
        int i = 0;
        this.f390436d = str;
        this.f390437e = new DroidGuardResultsRequest();
        if (C68847a.m99669c()) {
            String[] split = C68847a.f185051a.mo6453a().mo60646a().split(",");
            int length = split.length;
            while (true) {
                if (i >= length) {
                    fVar = C144118f.COARSE;
                    break;
                } else if (str.equals(split[i])) {
                    fVar = C144118f.FINE;
                    break;
                } else {
                    i++;
                }
            }
            this.f390438f = new C144119g(fVar, C144006f.f390244a);
            return;
        }
        this.f390438f = new C144114b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo119673b(C144112b bVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo119680c(C144112b bVar) {
        synchronized (this) {
            if (this.f390439g) {
                bVar.close();
                return;
            }
            this.f390439g = true;
            try {
                mo119673b(bVar);
            } catch (Exception unused) {
            }
        }
    }
}
