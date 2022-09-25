package com.google.android.libraries.elements.p1714d;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.common.base.C58890d;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.elements.d.ec */
/* compiled from: PG */
public final /* synthetic */ class C21067ec implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C21296cl f59053a;

    /* renamed from: b */
    public final /* synthetic */ Context f59054b;

    /* renamed from: c */
    public final /* synthetic */ String f59055c;

    public /* synthetic */ C21067ec(C21296cl clVar, Context context, String str) {
        this.f59053a = clVar;
        this.f59054b = context;
        this.f59055c = str;
    }

    public final Object call() {
        C21296cl clVar = this.f59053a;
        Context context = this.f59054b;
        String str = this.f59055c;
        int i = C21071eg.f59060a;
        Typeface a = clVar.mo25819a(context, str);
        if (a == null) {
            String c = C58890d.m90988c(str);
            int i2 = 0;
            if (c.endsWith("-bold")) {
                c = c.substring(0, c.length() - 5);
                i2 = 1;
            } else if (c.endsWith("-bold-italic")) {
                c = c.substring(0, c.length() - 12);
                i2 = 3;
            } else if (c.endsWith("-italic")) {
                c = c.substring(0, c.length() - 7);
                i2 = 2;
            }
            a = Typeface.create(c, i2);
        }
        return C21071eg.m39585b(context, a);
    }
}
