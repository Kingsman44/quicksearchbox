package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e.C15735b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.c */
/* compiled from: PG */
public final /* synthetic */ class C15688c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15755h f46822a;

    /* renamed from: b */
    public final /* synthetic */ String f46823b;

    /* renamed from: c */
    public final /* synthetic */ int f46824c;

    public /* synthetic */ C15688c(C15755h hVar, String str, int i) {
        this.f46822a = hVar;
        this.f46823b = str;
        this.f46824c = i;
    }

    public final Object apply(Object obj) {
        C15755h hVar = this.f46822a;
        String str = this.f46823b;
        int i = this.f46824c;
        boolean anyMatch = Collection.EL.stream(((C15735b) obj).f46918a).anyMatch(new C15754g(hVar, str, i));
        if (anyMatch) {
            ((C58970a) ((C58970a) C15755h.f46951a.mo56224b()).mo56372aa(46263)).mo56360M("Reusing SODA cache for [locale: %s, LanguagePack version: %d, APK version: %s, Build fingerprint: %s]", str, Integer.valueOf(i), hVar.f46953c, hVar.f46954d);
        } else {
            ((C58970a) ((C58970a) C15755h.f46951a.mo56224b()).mo56372aa(46262)).mo56360M("Invalidated SODA cache for [locale: %s, LanguagePack version: %d, APK version: %s, Build fingerprint: %s]", str, Integer.valueOf(i), hVar.f46953c, hVar.f46954d);
        }
        return Boolean.valueOf(anyMatch);
    }
}
