package com.google.android.libraries.gsa.monet.p1886a;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;

/* renamed from: com.google.android.libraries.gsa.monet.a.d */
/* compiled from: PG */
public class C22939d {

    /* renamed from: P */
    public View f63125P;

    /* renamed from: Q */
    public final C22945j f63126Q;

    public C22939d(C22945j jVar) {
        this.f63126Q = jVar;
        jVar.mo28312m(new C22938c(this, jVar));
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: aa */
    public View mo28291aa() {
        throw new UnsupportedOperationException("Please set the View in onInitialize using setContentView.");
    }

    /* renamed from: ad */
    public final C23129y mo28292ad() {
        return this.f63126Q.mo28338g();
    }

    /* renamed from: ae */
    public final void mo28293ae(View view) {
        view.setTag(R.id.monet_type, this.f63126Q.mo28338g());
    }

    /* renamed from: af */
    public final boolean mo28294af() {
        return this.f63125P != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: iC */
    public void mo28295iC(View view) {
        C23067b.m43233f(this.f63125P == null, "The view was already set.");
        this.f63125P = view;
        mo28293ae(view);
    }

    /* renamed from: iH */
    public String mo28296iH() {
        return this.f63126Q.mo28342l();
    }

    /* renamed from: il */
    public final View mo28297il() {
        if (this.f63125P == null) {
            View aa = mo28291aa();
            this.f63125P = aa;
            mo28293ae(aa);
            this.f63126Q.mo28314u();
        }
        return this.f63125P;
    }

    /* renamed from: im */
    public void mo28298im() {
    }

    /* renamed from: iw */
    public void mo28299iw() {
    }

    /* renamed from: ix */
    public void mo28300ix() {
    }

    /* renamed from: js */
    public void mo28301js() {
    }

    /* renamed from: n */
    public C23108e mo28302n() {
        return null;
    }
}
