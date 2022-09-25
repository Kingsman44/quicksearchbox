package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21287cc;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21294cj;
import com.google.android.libraries.elements.p1714d.p1724f.C21114v;
import com.google.android.libraries.elements.p1714d.p1724f.C21115w;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import com.youtube.p5283a.p5284a.C68045ah;
import java.util.List;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.x */
/* compiled from: PG */
public final /* synthetic */ class C21134x implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C20794ag f59277a;

    /* renamed from: b */
    public final /* synthetic */ List f59278b;

    /* renamed from: c */
    public final /* synthetic */ C21292ch f59279c;

    /* renamed from: d */
    public final /* synthetic */ C21294cj f59280d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f59281e;

    /* renamed from: f */
    public final /* synthetic */ C68045ah f59282f;

    /* renamed from: g */
    public final /* synthetic */ String f59283g;

    public /* synthetic */ C21134x(C20794ag agVar, List list, C21292ch chVar, C21294cj cjVar, byte[] bArr, C68045ah ahVar, String str) {
        this.f59277a = agVar;
        this.f59278b = list;
        this.f59279c = chVar;
        this.f59280d = cjVar;
        this.f59281e = bArr;
        this.f59282f = ahVar;
        this.f59283g = str;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C20794ag agVar = this.f59277a;
        List<String> list = this.f59278b;
        C21292ch chVar = this.f59279c;
        C21294cj cjVar = this.f59280d;
        byte[] bArr = this.f59281e;
        C68045ah ahVar = this.f59282f;
        String str = this.f59283g;
        if (agVar.f58187i) {
            C21287cc ccVar = agVar.f58182d;
            UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) agVar.f58183e.mo27525b();
            for (String str2 : list) {
                byte[] a = ccVar.mo26197a();
                if (a != null) {
                    unifiedTemplateResolver.jni_setTemplateConfig(str2, a);
                } else {
                    throw new C21260bc("Failed to load \"" + str2 + "\" from Dev Server");
                }
            }
        }
        chVar.mo26280h();
        C21114v vVar = new C21114v((C21115w) cjVar, bArr, ahVar, str);
        chVar.mo26274b();
        return vVar;
    }
}
