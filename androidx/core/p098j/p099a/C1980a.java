package androidx.core.p098j.p099a;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.j.a.a */
/* compiled from: PG */
public final class C1980a extends ClickableSpan {

    /* renamed from: a */
    private final int f5898a;

    /* renamed from: b */
    private final C1991k f5899b;

    /* renamed from: c */
    private final int f5900c;

    public C1980a(int i, C1991k kVar, int i2) {
        this.f5898a = i;
        this.f5899b = kVar;
        this.f5900c = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5898a);
        C1991k kVar = this.f5899b;
        kVar.f5921a.performAction(this.f5900c, bundle);
    }
}
