package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: com.google.android.libraries.phenotype.client.stable.d */
/* compiled from: PG */
public final /* synthetic */ class C31737d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f85321a;

    /* renamed from: b */
    public final /* synthetic */ String f85322b;

    public /* synthetic */ C31737d(Context context, String str) {
        this.f85321a = context;
        this.f85322b = str;
    }

    public final void run() {
        Context context = this.f85321a;
        String str = this.f85322b;
        SharedPreferences a = C31706ay.m59039a(context);
        SharedPreferences.Editor editor = null;
        for (Map.Entry next : a.getAll().entrySet()) {
            if ((next.getValue() instanceof String) && next.getValue().equals(str)) {
                if (editor == null) {
                    editor = a.edit();
                }
                editor.remove((String) next.getKey());
            }
        }
        if (editor != null) {
            editor.commit();
        }
    }
}
