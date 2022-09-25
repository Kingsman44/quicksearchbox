package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c;

import android.os.Build;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p728a.C11986a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p728a.C11988c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12113b;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C12069c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C12074h f38631a;

    /* renamed from: b */
    public final /* synthetic */ C12113b f38632b;

    /* renamed from: c */
    public final /* synthetic */ C37410bo f38633c;

    public /* synthetic */ C12069c(C12074h hVar, C12113b bVar, C37410bo boVar) {
        this.f38631a = hVar;
        this.f38632b = bVar;
        this.f38633c = boVar;
    }

    public final Object call() {
        C12074h hVar = this.f38631a;
        C12113b bVar = this.f38632b;
        C37410bo boVar = this.f38633c;
        if (bVar.f38727b != 8) {
            return ((C37404bi) C60856cj.m92909r(hVar.f38641b)).mo40935a(boVar);
        }
        C37402bg a = hVar.f38649j.mo20361a((C11989b) bVar.f38728c);
        C11988c cVar = hVar.f38642c;
        if (Build.VERSION.SDK_INT < 31) {
            return a;
        }
        C60870cx d = a.mo20357d();
        C60845bz n = C47810es.m84974n(new C11986a(cVar, ((C37401bf) a.mo20358e()).mo20353a()));
        C60856cj.m92911t(d, C47810es.m84974n(n), cVar.f38497c);
        return a;
    }
}
