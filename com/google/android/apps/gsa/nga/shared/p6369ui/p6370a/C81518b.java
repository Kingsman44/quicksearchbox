package com.google.android.apps.gsa.nga.shared.p6369ui.p6370a;

import android.os.Build;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4537i.C59294s;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.a.b */
/* compiled from: PG */
public abstract class C81518b implements C81517a {

    /* renamed from: a */
    private static final C58528ij f222934a = C58528ij.m90011K(8255211105823599523L, -1555602392246614985L);

    /* renamed from: b */
    private final boolean f222935b;

    protected C81518b() {
        boolean equals = Build.MANUFACTURER.toLowerCase(Locale.ROOT).equals("google");
        long c = C59294s.m92135e().mo56760b("aOupWzd67OVi4UwHm5tHcOc18igY0jVk|".concat(String.valueOf(Build.DEVICE.toLowerCase(Locale.ROOT)))).mo56773c();
        boolean z = false;
        if (equals && f222934a.contains(Long.valueOf(c))) {
            z = true;
        }
        this.f222935b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo73062a();

    /* renamed from: b */
    public final int mo75125b() {
        return (!this.f222935b && !mo73062a()) ? 1 : 2;
    }
}
