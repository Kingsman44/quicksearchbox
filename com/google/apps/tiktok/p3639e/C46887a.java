package com.google.apps.tiktok.p3639e;

import android.app.Activity;
import android.support.p031v4.app.C0167am;
import androidx.lifecycle.C2390u;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58801sm;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.e.a */
/* compiled from: PG */
public final class C46887a {

    /* renamed from: a */
    private final C0167am f122333a;

    /* renamed from: b */
    private final Set f122334b;

    /* renamed from: c */
    private boolean f122335c = false;

    public C46887a(Activity activity, Set set) {
        this.f122333a = (C0167am) activity;
        this.f122334b = set;
    }

    /* renamed from: a */
    public final void mo50899a() {
        if (!this.f122335c) {
            C58801sm G = ((C58471gg) this.f122334b).mo55229u().listIterator(0);
            while (G.hasNext()) {
                this.f122333a.getLifecycle().mo5790b((C2390u) G.next());
            }
            this.f122335c = true;
        }
    }
}
