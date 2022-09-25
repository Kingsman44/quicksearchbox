package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.h */
/* compiled from: PG */
final class C94571h {

    /* renamed from: a */
    public final String f264525a;

    /* renamed from: b */
    public final String f264526b;

    /* renamed from: c */
    public final C58833ax f264527c;

    /* renamed from: d */
    public final C28292j f264528d;

    /* renamed from: e */
    public boolean f264529e;

    /* renamed from: f */
    public boolean f264530f;

    public C94571h(String str, String str2, C58833ax axVar, boolean z) {
        C58833ax axVar2;
        C28292j jVar = new C28292j(44468);
        jVar.mo33795i(5);
        this.f264528d = jVar;
        this.f264525a = str;
        this.f264526b = str2;
        if (axVar.mo56113h()) {
            C28292j jVar2 = new C28292j(((Integer) axVar.mo56107c()).intValue());
            jVar2.mo33795i(5);
            axVar2 = C58833ax.m90834k(jVar2);
        } else {
            axVar2 = C58836b.f156633a;
        }
        this.f264527c = axVar2;
        this.f264529e = z;
    }

    public final String toString() {
        return String.format("VoiceItem{id = %s, name = %s, selected = %b", new Object[]{this.f264525a, this.f264526b, Boolean.valueOf(this.f264529e)});
    }
}
