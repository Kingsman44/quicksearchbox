package com.google.android.apps.gsa.sidekick.shared.p7230a;

import android.content.Context;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91752h;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.a.b */
/* compiled from: PG */
public final class C91644b implements C91643a {

    /* renamed from: a */
    private final Context f255598a;

    /* renamed from: b */
    private final C91097g f255599b;

    public C91644b(Context context, C91097g gVar) {
        this.f255598a = context;
        this.f255599b = gVar;
    }

    /* renamed from: a */
    public final void mo85916a(String str, C90491g gVar) {
        Context context = this.f255598a;
        context.startActivity(C91752h.m150310a(context, str, gVar, false));
    }

    /* renamed from: b */
    public final C91097g mo86021b() {
        return this.f255599b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C91644b) {
            C91644b bVar = (C91644b) obj;
            C91097g gVar = this.f255599b;
            if (gVar == null ? bVar.f255599b == null : gVar.equals(bVar.f255599b)) {
                if (this.f255598a.equals(bVar.f255598a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f255598a, this.f255599b});
    }
}
