package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import java.util.WeakHashMap;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.cd */
/* compiled from: PG */
public final class C61921cd {

    /* renamed from: a */
    public static final Object f167398a = new Object();

    /* renamed from: b */
    public static final WeakHashMap f167399b = new WeakHashMap();

    /* renamed from: c */
    public final C61923cf f167400c;

    public C61921cd(Context context) {
        this.f167400c = new C61911bu(context, ((TextClassificationManager) context.getSystemService("textclassification")).getTextClassifier());
    }
}
