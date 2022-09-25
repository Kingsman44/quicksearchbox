package com.google.android.libraries.search.silk.p3162a.p3179q;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.mdi.download.p2243e.C29361k;
import com.google.android.libraries.search.silk.p3185d.C40658a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56841f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56842g;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.silk.a.q.h */
/* compiled from: PG */
public final class C40633h {

    /* renamed from: a */
    public static final C56842g f106636a;

    /* renamed from: b */
    public final Context f106637b;

    /* renamed from: c */
    public final Executor f106638c;

    /* renamed from: d */
    public final C40658a f106639d;

    /* renamed from: e */
    public final C29361k f106640e;

    /* renamed from: f */
    public final C40628c f106641f;

    static {
        C56841f fVar = (C56841f) C56842g.f151655c.createBuilder();
        fVar.copyOnWrite();
        C56842g gVar = (C56842g) fVar.instance;
        gVar.f151658b = 0;
        gVar.f151657a |= 1;
        f106636a = (C56842g) fVar.build();
    }

    public C40633h(Context context, Executor executor, C40658a aVar, C29361k kVar, C40628c cVar) {
        this.f106637b = context;
        this.f106638c = executor;
        this.f106639d = aVar;
        this.f106640e = kVar;
        this.f106641f = cVar;
    }

    /* renamed from: a */
    public static Intent m70396a(Intent intent, String str) {
        Intent createChooser = Intent.createChooser(intent, str);
        createChooser.setFlags(268435456);
        return createChooser;
    }

    /* renamed from: b */
    public static C60870cx m70397b(String str, String str2) {
        return C60856cj.m92899h(new C41742a(C41749b.m73222a(str, str2)));
    }
}
