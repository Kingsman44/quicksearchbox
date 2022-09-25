package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15390r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ai */
/* compiled from: PG */
public final class C14794ai {

    /* renamed from: a */
    public static final C59071e f44573a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ai");

    /* renamed from: b */
    public final C60888db f44574b;

    /* renamed from: c */
    public final C14986h f44575c;

    /* renamed from: d */
    public final C15390r f44576d;

    /* renamed from: e */
    public final Duration f44577e;

    /* renamed from: f */
    public boolean f44578f = true;

    public C14794ai(C60888db dbVar, C14986h hVar, C86124t tVar, C21370a aVar) {
        this.f44574b = dbVar;
        this.f44575c = hVar;
        this.f44577e = Duration.ofMillis(tVar.mo79743a(C90051dc.f248846bA));
        this.f44576d = new C15390r(aVar);
    }
}
