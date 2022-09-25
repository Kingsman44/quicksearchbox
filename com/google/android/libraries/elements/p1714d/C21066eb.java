package com.google.android.libraries.elements.p1714d;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.common.base.C58890d;
import com.youtube.p5283a.p5284a.C68073bi;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.elements.d.eb */
/* compiled from: PG */
public final /* synthetic */ class C21066eb implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C21296cl f59048a;

    /* renamed from: b */
    public final /* synthetic */ Context f59049b;

    /* renamed from: c */
    public final /* synthetic */ String f59050c;

    /* renamed from: d */
    public final /* synthetic */ int f59051d;

    /* renamed from: e */
    public final /* synthetic */ C68073bi f59052e;

    public /* synthetic */ C21066eb(C21296cl clVar, Context context, String str, int i, C68073bi biVar) {
        this.f59048a = clVar;
        this.f59049b = context;
        this.f59050c = str;
        this.f59051d = i;
        this.f59052e = biVar;
    }

    public final Object call() {
        C21296cl clVar = this.f59048a;
        Context context = this.f59049b;
        String str = this.f59050c;
        int i = this.f59051d;
        C68073bi biVar = this.f59052e;
        int i2 = C21071eg.f59060a;
        Typeface b = clVar.mo25820b(context, str, i, biVar.mo60194w());
        if (b != null) {
            return b;
        }
        return Typeface.create(Typeface.create(C58890d.m90988c(str), 0), i, biVar.mo60194w());
    }
}
