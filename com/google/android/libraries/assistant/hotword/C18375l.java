package com.google.android.libraries.assistant.hotword;

import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.nga.shared.p6339f.C81066e;
import com.google.android.libraries.assistant.hotword.data.HotwordData;
import com.google.android.libraries.assistant.hotword.p1515a.C18327b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.assistant.hotword.l */
/* compiled from: PG */
public abstract class C18375l {

    /* renamed from: p */
    public C18371h f52149p;

    /* renamed from: q */
    public C60888db f52150q;

    /* renamed from: m */
    protected static int m35779m(int i) {
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return 12;
        }
        throw new IllegalStateException("Invalid channel count");
    }

    /* renamed from: a */
    public abstract int mo23789a(C18327b bVar);

    /* renamed from: b */
    public abstract ParcelFileDescriptor mo23790b();

    /* renamed from: c */
    public abstract C60870cx mo23791c(int i, boolean z);

    /* renamed from: d */
    public abstract void mo23792d();

    /* renamed from: e */
    public abstract void mo23793e(boolean z);

    /* renamed from: f */
    public abstract void mo23794f(HotwordData hotwordData);

    /* renamed from: g */
    public abstract void mo23795g(C81066e eVar);

    /* renamed from: h */
    public abstract void mo23796h();

    /* renamed from: i */
    public boolean mo23879i() {
        C18371h hVar = this.f52149p;
        return hVar != null && hVar.mo23810d();
    }

    /* renamed from: k */
    public abstract int mo23797k();

    /* renamed from: l */
    public abstract StringBuilder mo23798l();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C18371h mo23880n(int i) {
        if (this.f52149p == null) {
            this.f52149p = new C18341b(this.f52150q, m35779m(i));
        }
        return this.f52149p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C18371h mo23881o(int i) {
        if (this.f52149p == null) {
            this.f52149p = new C18371h(this.f52150q, 1999, m35779m(i));
        }
        return this.f52149p;
    }
}
