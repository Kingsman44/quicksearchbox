package com.google.android.apps.gsa.speech.p7272e;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92239a;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92255q;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92271h;
import com.google.android.libraries.assistant.auto.ondevice.p710d.C11873a;
import com.google.common.base.C58881cr;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.speech.e.b */
/* compiled from: PG */
public final class C92238b {

    /* renamed from: a */
    public final C92248j f257171a;

    /* renamed from: b */
    public final C92271h f257172b;

    /* renamed from: c */
    public final C92255q f257173c;

    /* renamed from: d */
    public final C58881cr f257174d;

    public C92238b(Context context, SharedPreferences sharedPreferences, C90929bz bzVar, C90821bm bmVar, C89911f fVar, C69464a aVar, C11873a aVar2) {
        this.f257174d = new C92239a(context);
        C92255q qVar = new C92255q(sharedPreferences);
        this.f257173c = qVar;
        C92255q qVar2 = qVar;
        C92248j jVar = new C92248j(context, qVar2, C92262c.m151494a(), aVar, aVar2, bzVar);
        this.f257171a = jVar;
        C92271h hVar = new C92271h(jVar, qVar2, new C92234a(context.getResources()), bmVar, fVar);
        this.f257172b = hVar;
        jVar.f257193g = hVar;
    }
}
