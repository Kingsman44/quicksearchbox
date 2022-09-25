package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.libraries.phenotype.client.C31655ak;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.libraries.phenotype.client.stable.aq */
/* compiled from: PG */
public final /* synthetic */ class C31698aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C31760t f85232a;

    /* renamed from: b */
    public final /* synthetic */ String f85233b;

    public /* synthetic */ C31698aq(C31760t tVar, String str) {
        this.f85232a = tVar;
        this.f85233b = str;
    }

    public final C60870cx apply(Object obj) {
        C31760t tVar = this.f85232a;
        String str = this.f85233b;
        Void voidR = (Void) obj;
        C31655ak akVar = C31700as.f85236a;
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(tVar.f85364a);
        int i = C20674d.f57955a;
        e.mo55395g(C20674d.m38852a(tVar.f85364a));
        C58485gu f = e.mo55394f();
        int i2 = ((C58724pq) f).f156474d;
        boolean z = true;
        for (int i3 = 0; i3 < i2; i3++) {
            String valueOf = String.valueOf(((Context) f.get(i3)).getFilesDir());
            File file = new File(valueOf + "/phenotype/shared/" + str);
            Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
            if (file.exists()) {
                z = C31700as.m59036b(file);
            }
        }
        if (z) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92899h(new IOException("Unable to remove snapshots for removed user"));
    }
}
