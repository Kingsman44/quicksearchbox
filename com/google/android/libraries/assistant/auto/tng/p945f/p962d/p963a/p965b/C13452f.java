package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.f */
/* compiled from: PG */
public final /* synthetic */ class C13452f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f41286a;

    public /* synthetic */ C13452f(C58485gu guVar) {
        this.f41286a = guVar;
    }

    public final Object call() {
        C58485gu guVar = this.f41286a;
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!((Boolean) C60856cj.m92909r((C60870cx) guVar.get(i))).booleanValue()) {
                return false;
            }
            i = i2;
        }
        return true;
    }
}
