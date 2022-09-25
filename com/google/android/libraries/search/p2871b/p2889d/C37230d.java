package com.google.android.libraries.search.p2871b.p2889d;

import com.google.android.libraries.search.p2871b.C37226d;
import com.google.android.libraries.search.p2871b.p2896j.C37268b;
import com.google.android.libraries.search.p2871b.p2896j.C37271e;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.search.b.d.d */
/* compiled from: PG */
public final class C37230d implements C37227a {

    /* renamed from: a */
    public static final C59071e f98900a = C59071e.m91332i("com.google.android.libraries.search.b.d.d");

    /* renamed from: b */
    public final List f98901b = new ArrayList();

    /* renamed from: c */
    public final C37268b f98902c;

    /* renamed from: d */
    public final C37271e f98903d;

    public C37230d(C37268b bVar, C37271e eVar) {
        this.f98902c = bVar;
        this.f98903d = eVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo20647a(C46677o oVar) {
        if (!oVar.mo50698b().contains(C46667e.TEXT)) {
            return C60856cj.m92900i(C46675m.f121943k);
        }
        return C60856cj.m92904m(new C37228b(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final synchronized void mo40720b(String str, C37226d dVar) {
        this.f98901b.add(new C37229c(str, dVar));
    }
}
