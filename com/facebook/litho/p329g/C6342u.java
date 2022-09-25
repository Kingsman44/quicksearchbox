package com.facebook.litho.p329g;

import com.evernote.android.state.BuildConfig;
import com.facebook.litho.C6193dm;
import com.facebook.litho.C6348ga;
import com.facebook.litho.p325d.C6180a;

/* renamed from: com.facebook.litho.g.u */
/* compiled from: PG */
public final class C6342u extends C6348ga {

    /* renamed from: a */
    final /* synthetic */ C6346y f18755a;

    /* renamed from: c */
    private final C6193dm f18756c;

    /* renamed from: d */
    private boolean f18757d;

    /* renamed from: e */
    private int f18758e = -1;

    /* renamed from: f */
    private String f18759f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6342u(C6346y yVar, C6193dm dmVar) {
        super(false);
        this.f18755a = yVar;
        boolean z = C6180a.f18234a;
        this.f18756c = dmVar;
    }

    /* renamed from: a */
    public final void mo12842a(C6348ga gaVar) {
        synchronized (this) {
            if (this.f18757d) {
                int i = this.f18758e;
                String str = this.f18759f;
                this.f18758e = -1;
                this.f18759f = null;
                this.f18757d = false;
                try {
                    this.f18755a.mo13370k(i, str, gaVar);
                } catch (IndexOutOfBoundsException e) {
                    String c = C6346y.m17026c(this.f18755a);
                    String message = e.getMessage();
                    throw new RuntimeException("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: " + c + message, e);
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo13360b() {
        if (this.f18757d) {
            this.f18757d = false;
            this.f18758e = -1;
            this.f18759f = null;
            this.f18756c.mo13164b(this);
        }
    }

    /* renamed from: c */
    public final synchronized void mo13361c(int i, String str) {
        String str2;
        if (!this.f18757d) {
            this.f18757d = true;
            Throwable th = this.f18788b;
            if (th != null) {
                th.fillInStackTrace();
            }
            if (this.f18756c.mo13165c()) {
                str2 = "SectionTree.CalculateChangeSetRunnable.ensurePosted - " + this.f18755a.f18771d + " - " + i + " - " + str;
            } else {
                str2 = BuildConfig.FLAVOR;
            }
            this.f18756c.mo13163a(this, str2);
            this.f18758e = i;
            this.f18759f = str;
        }
    }
}
