package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21293ci;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1727f.C21166o;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.protos.youtube.elements.p5166b.C66105j;
import com.youtube.p5283a.p5284a.C68039ab;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.ae */
/* compiled from: PG */
public final /* synthetic */ class C20792ae implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C20794ag f58164a;

    /* renamed from: b */
    public final /* synthetic */ C21292ch f58165b;

    /* renamed from: c */
    public final /* synthetic */ C21293ci f58166c;

    /* renamed from: d */
    public final /* synthetic */ C21319z f58167d;

    /* renamed from: e */
    public final /* synthetic */ String f58168e;

    /* renamed from: f */
    public final /* synthetic */ C21166o f58169f;

    public /* synthetic */ C20792ae(C20794ag agVar, C21292ch chVar, C21293ci ciVar, C21319z zVar, String str, C21166o oVar) {
        this.f58164a = agVar;
        this.f58165b = chVar;
        this.f58166c = ciVar;
        this.f58167d = zVar;
        this.f58168e = str;
        this.f58169f = oVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C20794ag agVar = this.f58164a;
        C21292ch chVar = this.f58165b;
        C21293ci ciVar = this.f58166c;
        C21319z zVar = this.f58167d;
        String str = this.f58168e;
        C21166o oVar = this.f58169f;
        C21279bv bvVar = (C21279bv) obj;
        chVar.mo26282j();
        C68039ab a = ciVar.mo26157a(bvVar, chVar, zVar);
        if (agVar.f58191m.mo26164a()) {
            C66105j e = C21168q.m39751e(a, bvVar, (byte[]) null, str);
            if (!(oVar == null || e == null)) {
                oVar.mo26195a(e);
            }
        }
        chVar.mo26276d();
        return new C20814b(a, oVar);
    }
}
