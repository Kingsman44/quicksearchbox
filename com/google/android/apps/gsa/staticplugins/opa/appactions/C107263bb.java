package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.assistant.shared.appactions.c.j;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107290n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3825an.p3830c.p3831a.C49263ai;
import com.google.assistant.p3861at.C49866bx;
import com.google.assistant.p3861at.C49867by;
import com.google.assistant.p3861at.C49870ca;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.bb */
/* compiled from: PG */
public final class C107263bb extends j {

    /* renamed from: e */
    public final InputMethodManager f298548e;

    /* renamed from: f */
    private final C107290n f298549f;

    /* renamed from: g */
    private final String f298550g;

    /* renamed from: h */
    private final Consumer f298551h;

    public C107263bb(C22871g gVar, C90021c cVar, C107290n nVar, InputMethodManager inputMethodManager, C0167am amVar, Context context, String str, Consumer consumer) {
        super(amVar, context, gVar, cVar);
        this.f298549f = nVar;
        this.f298548e = inputMethodManager;
        this.f298550g = str;
        this.f298551h = consumer;
    }

    /* renamed from: i */
    private final void m178073i() {
        this.c.map(C107256ay.f298539a).ifPresent(new C107257az(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C60870cx mo95883a(String str) {
        C107290n nVar = this.f298549f;
        C49866bx bxVar = (C49866bx) C49867by.f129584c.createBuilder();
        bxVar.copyOnWrite();
        C49867by byVar = (C49867by) bxVar.instance;
        str.getClass();
        byVar.f129586a |= 1;
        byVar.f129587b = str;
        return nVar.mo95895c((C49867by) bxVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo95884b() {
        return this.f298550g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo95885c() {
        m178073i();
        C107263bb.super.c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo95886d(Object obj, String str) {
        C49870ca caVar = (C49870ca) obj;
        if (!caVar.f129590a) {
            int b = C49263ai.m85396b(caVar.f129591b);
            if (b == 0) {
                b = 2;
            }
            h(b);
            return;
        }
        this.f298551h.accept(str);
        m178073i();
        this.d.ifPresent(C107262ba.f298547a);
    }

    /* renamed from: e */
    public final void mo95887e() {
        this.c.map(C107254aw.f298537a).ifPresent(new C107255ax(this));
        C107263bb.super.e();
    }
}
