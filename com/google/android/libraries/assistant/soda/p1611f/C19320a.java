package com.google.android.libraries.assistant.soda.p1611f;

import android.content.Context;
import com.google.android.libraries.assistant.soda.C19258c;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.base.C58833ax;
import com.google.speech.p5218j.C66999hh;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.soda.f.a */
/* compiled from: PG */
public final /* synthetic */ class C19320a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19329i f54069a;

    /* renamed from: b */
    public final /* synthetic */ Context f54070b;

    /* renamed from: c */
    public final /* synthetic */ C19347o f54071c;

    /* renamed from: d */
    public final /* synthetic */ C66999hh f54072d;

    /* renamed from: e */
    public final /* synthetic */ Optional f54073e;

    public /* synthetic */ C19320a(C19329i iVar, Context context, C19347o oVar, C66999hh hhVar, Optional optional) {
        this.f54069a = iVar;
        this.f54070b = context;
        this.f54071c = oVar;
        this.f54072d = hhVar;
        this.f54073e = optional;
    }

    public final Object call() {
        C19329i iVar = this.f54069a;
        Context context = this.f54070b;
        C19347o oVar = this.f54071c;
        C66999hh hhVar = this.f54072d;
        Optional optional = this.f54073e;
        if (iVar.f54090e == null) {
            iVar.f54090e = new Soda(context, oVar);
        }
        C19258c cVar = new C19258c();
        cVar.mo24390b(hhVar);
        cVar.f53967b = C58833ax.m90834k(iVar.f54089d);
        Objects.requireNonNull(cVar);
        optional.ifPresent(new C19323c(cVar));
        return iVar.f54090e.mo24331g(cVar.mo24391c());
    }
}
