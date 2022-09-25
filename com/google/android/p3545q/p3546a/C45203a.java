package com.google.android.p3545q.p3546a;

import android.graphics.Color;
import com.google.apps.p3589d.p3590a.C45687d;
import com.google.apps.p3589d.p3590a.C45706w;
import com.google.apps.p3589d.p3590a.C45707x;
import com.google.apps.p3589d.p3600k.C45941f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.q.a.a */
/* compiled from: PG */
public final class C45203a {

    /* renamed from: a */
    public final float f117959a;

    /* renamed from: b */
    private final boolean f117960b;

    /* renamed from: c */
    private final int f117961c;

    public /* synthetic */ C45203a(float f, boolean z, int i, int i2) {
        boolean z2 = z & ((i2 & 2) == 0);
        i = (i2 & 8) != 0 ? -16777216 : i;
        this.f117959a = f;
        this.f117960b = z2;
        this.f117961c = i;
    }

    /* renamed from: a */
    public final C45707x mo49031a() {
        C45706w f = C45707x.m81446f();
        f.mo49755b(this.f117960b);
        ((C45687d) f).f120175b = C45941f.m82028e(Color.red(this.f117961c), Color.green(this.f117961c), Color.blue(this.f117961c), Color.alpha(this.f117961c));
        C45707x a = f.mo49754a();
        C69664n.m101060f(a, "builder()\n        .setSh…       )\n        .build()");
        return a;
    }
}
