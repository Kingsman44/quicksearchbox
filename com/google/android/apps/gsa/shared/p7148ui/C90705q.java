package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.app.C0401v;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.p7174l.C91053a;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60547ty;

/* renamed from: com.google.android.apps.gsa.shared.ui.q */
/* compiled from: PG */
public class C90705q extends C19473a {

    /* renamed from: j */
    private final String f253735j;

    /* renamed from: k */
    private final C60547ty f253736k;

    /* renamed from: y */
    public C90704p f253737y;

    public C90705q(String str, C60547ty tyVar) {
        this.f253735j = str;
        this.f253736k = tyVar;
    }

    public void finish() {
        super.finish();
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gy */
    public void mo82632gy() {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i3 = pVar.f253731c;
        pVar.f253734f = false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
    }

    public void onBackPressed() {
        C90704p pVar = this.f253737y;
        if (pVar.f253734f) {
            ((C59052c) ((C59052c) C90704p.f253728a.mo56225c()).mo56372aa(11240)).mo56386p("Back press is handled after instance state is saved.");
            C89911f.m146435c(30315026);
            return;
        }
        String str = pVar.f253730b;
        int i = pVar.f253731c;
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C90704p pVar = new C90704p(this, this.f253735j, this.f253736k);
        this.f253737y = pVar;
        Intent intent = pVar.f253733e.getIntent();
        long j = 0;
        if (intent != null) {
            j = intent.getLongExtra("latency-id", 0);
        }
        C89838ab.m146260d(pVar.f253733e, pVar.f253732d, j);
        if (intent != null) {
            C89838ab.m146261e(pVar.f253733e, intent, pVar.f253732d);
            if (!intent.getBooleanExtra("suppress_uel_logging", false)) {
                C89838ab.m146264h();
                C89838ab.m146263g();
            }
        } else {
            C89838ab.m146263g();
        }
        C0401v.m1321C();
        super.onCreate(bundle);
        C90704p pVar2 = this.f253737y;
        String str = pVar2.f253730b;
        int i = pVar2.f253731c;
        pVar2.f253734f = false;
        Intent intent2 = pVar2.f253733e.getIntent();
        if (intent2 != null) {
            C91053a.m148744d(intent2, pVar2.f253732d);
            pVar2.f253733e.setIntent(intent2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
        super.onDestroy();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C90704p pVar = this.f253737y;
        C89838ab.m146261e(pVar.f253733e, intent, pVar.f253732d);
        if (!intent.getBooleanExtra("suppress_uel_logging", false)) {
            C89838ab.m146264h();
        }
        mo82632gy();
        super.onNewIntent(intent);
        C90704p pVar2 = this.f253737y;
        String str = pVar2.f253730b;
        int i = pVar2.f253731c;
        pVar2.f253734f = false;
        if (intent != null) {
            C91053a.m148744d(intent, pVar2.f253732d);
            pVar2.f253733e.setIntent(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
        pVar.f253734f = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
        pVar.f253734f = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
        pVar.f253734f = true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        mo82632gy();
        super.onStart();
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
        pVar.f253734f = false;
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
        super.onStop();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C90704p pVar = this.f253737y;
        String str = pVar.f253730b;
        int i = pVar.f253731c;
    }
}
