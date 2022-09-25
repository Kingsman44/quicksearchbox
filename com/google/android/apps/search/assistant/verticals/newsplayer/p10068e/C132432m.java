package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import android.content.Context;
import com.google.android.gms.cast.framework.C143429e;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.m */
/* compiled from: PG */
public final /* synthetic */ class C132432m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C132441v f361451a;

    /* renamed from: b */
    public final /* synthetic */ Context f361452b;

    /* renamed from: c */
    public final /* synthetic */ Executor f361453c;

    public /* synthetic */ C132432m(C132441v vVar, Context context, Executor executor) {
        this.f361451a = vVar;
        this.f361452b = context;
        this.f361453c = executor;
    }

    public final void run() {
        C132441v vVar = this.f361451a;
        C146006ab e = C143429e.m232797e(this.f361452b, this.f361453c);
        C146014aj ajVar = (C146014aj) e;
        ajVar.mo122495n(C146013ai.f394700a, new C132429j(vVar));
        ajVar.mo122494m(C146013ai.f394700a, C132430k.f361447a);
    }
}
