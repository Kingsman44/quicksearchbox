package com.google.android.libraries.places.widget.internal.p2440a;

import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.p127a.C2322c;
import com.google.android.libraries.places.widget.internal.logging.AutocompleteWidgetSession;
import com.google.android.libraries.places.widget.internal.logging.C31924b;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.places.widget.internal.a.m */
/* compiled from: PG */
public final class C31911m implements C2363bk {

    /* renamed from: a */
    private final C31901c f85802a;

    /* renamed from: b */
    private final AutocompleteWidgetSession f85803b;

    /* renamed from: c */
    private final C31924b f85804c;

    public C31911m(C31901c cVar, AutocompleteWidgetSession autocompleteWidgetSession, C31924b bVar) {
        this.f85802a = cVar;
        this.f85803b = autocompleteWidgetSession;
        this.f85804c = bVar;
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        C58838bb.m90869d(cls == C31912n.class, "This factory can only be used to instantiate its enclosing class.");
        return new C31912n(this.f85802a, this.f85803b, this.f85804c);
    }

    /* renamed from: b */
    public final C2358bf mo635b(Class cls, C2322c cVar) {
        return mo634a(cls);
    }
}
