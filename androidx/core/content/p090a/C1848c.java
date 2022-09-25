package androidx.core.content.p090a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.text.TextUtils;
import androidx.core.graphics.drawable.C1932e;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.content.a.c */
/* compiled from: PG */
public final class C1848c {

    /* renamed from: a */
    public Context f5711a;

    /* renamed from: b */
    public String f5712b;

    /* renamed from: c */
    Intent[] f5713c;

    /* renamed from: d */
    public CharSequence f5714d;

    /* renamed from: e */
    public CharSequence f5715e;

    /* renamed from: f */
    public IconCompat f5716f;

    /* renamed from: a */
    public final ShortcutInfo mo5032a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f5711a, this.f5712b).setShortLabel(this.f5714d).setIntents(this.f5713c);
        IconCompat iconCompat = this.f5716f;
        if (iconCompat != null) {
            intents.setIcon(C1932e.m5233b(iconCompat, this.f5711a));
        }
        if (!TextUtils.isEmpty(this.f5715e)) {
            intents.setLongLabel(this.f5715e);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            intents.setDisabledMessage((CharSequence) null);
        }
        intents.setRank(0);
        intents.setLongLived(false);
        return intents.build();
    }
}
