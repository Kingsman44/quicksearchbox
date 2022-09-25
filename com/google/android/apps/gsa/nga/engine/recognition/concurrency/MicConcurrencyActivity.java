package com.google.android.apps.gsa.nga.engine.recognition.concurrency;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.nga.p5887c.C74745a;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public class MicConcurrencyActivity extends Activity {

    /* renamed from: c */
    private static final C58974d f213809c = C58974d.m91136j();

    /* renamed from: a */
    public C77609e f213810a;

    /* renamed from: b */
    public C22871g f213811b;

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 17432577);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.y);
        ((C58970a) ((C58970a) f213809c.mo56224b()).mo56372aa(4301)).mo56386p("Creating MicConcurrency activity");
        C77607c cVar = (C77607c) C74745a.m120861a(this);
        if (cVar != null) {
            cVar.mo72741pQ(this);
            super.onCreate(bundle);
            getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(0, 0, 0, 0)));
            C77609e eVar = this.f213810a;
            Runnable runnable = (Runnable) eVar.f213819d.getAndSet(new C77605a(this));
            if (runnable != null) {
                runnable.run();
            }
            if (eVar.f213816a.mo71417a().mo71473s()) {
                eVar.mo72742c();
                return;
            }
            return;
        }
        throw new IllegalStateException("Could not create injector for MicConcurrencyActivity.");
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.f213810a.mo72742c();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f213810a.f213818c.set(false);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f213810a.f213818c.set(true);
    }
}
