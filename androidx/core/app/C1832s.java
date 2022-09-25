package androidx.core.app;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.core.app.s */
/* compiled from: PG */
public final class C1832s {

    /* renamed from: a */
    final Bundle f5654a;

    /* renamed from: b */
    public final C1811ba[] f5655b;

    /* renamed from: c */
    public boolean f5656c;

    /* renamed from: d */
    boolean f5657d;

    /* renamed from: e */
    public final int f5658e;

    /* renamed from: f */
    public final boolean f5659f;
    @Deprecated

    /* renamed from: g */
    public int f5660g;

    /* renamed from: h */
    public CharSequence f5661h;

    /* renamed from: i */
    public PendingIntent f5662i;

    /* renamed from: j */
    public boolean f5663j;

    /* renamed from: k */
    private IconCompat f5664k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1832s(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.m5207j((Resources) null, BuildConfig.FLAVOR, i) : null, charSequence, pendingIntent, new Bundle(), (C1811ba[]) null, true, 0, true, false, false);
    }

    /* renamed from: a */
    public final IconCompat mo5010a() {
        int i;
        if (this.f5664k == null && (i = this.f5660g) != 0) {
            this.f5664k = IconCompat.m5207j((Resources) null, BuildConfig.FLAVOR, i);
        }
        return this.f5664k;
    }

    public C1832s(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1811ba[] baVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.f5657d = true;
        this.f5664k = iconCompat;
        if (iconCompat != null && iconCompat.mo5074b() == 2) {
            this.f5660g = iconCompat.mo5073a();
        }
        this.f5661h = C1839z.m5037c(charSequence);
        this.f5662i = pendingIntent;
        this.f5654a = bundle == null ? new Bundle() : bundle;
        this.f5655b = baVarArr;
        this.f5656c = z;
        this.f5658e = i;
        this.f5657d = z2;
        this.f5659f = z3;
        this.f5663j = z4;
    }
}
