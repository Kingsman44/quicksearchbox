package com.google.apps.tiktok.experiments.phenotype;

import android.app.Activity;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.experiments.C46904p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dq */
/* compiled from: PG */
public final class C47004dq implements C46897i {

    /* renamed from: a */
    final /* synthetic */ Activity f122546a;

    /* renamed from: b */
    final /* synthetic */ C47013dz f122547b;

    /* renamed from: c */
    final /* synthetic */ C46917ak f122548c;

    public C47004dq(Activity activity, C47013dz dzVar, C46917ak akVar) {
        this.f122546a = activity;
        this.f122547b = dzVar;
        this.f122548c = akVar;
    }

    /* renamed from: a */
    public final C46904p mo50901a(String str) {
        C19559g.m37304c();
        Activity activity = this.f122546a;
        C69664n.m101061g(activity, "activity");
        if (!activity.isDestroyed()) {
            C47013dz dzVar = this.f122547b;
            if (dzVar.f122560d == null) {
                dzVar.f122560d = this.f122548c;
            }
            return this.f122548c.mo50915b(str);
        }
        new StringBuilder("Attempting to get experiment value for destroyed activity: ").append(activity);
        throw new IllegalStateException("Attempting to get experiment value for destroyed activity: ".concat(String.valueOf(activity)));
    }
}
