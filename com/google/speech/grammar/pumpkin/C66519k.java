package com.google.speech.grammar.pumpkin;

import java.util.logging.Logger;

/* renamed from: com.google.speech.grammar.pumpkin.k */
/* compiled from: PG */
public class C66519k {

    /* renamed from: e */
    protected ActionFrameManager f180916e;

    /* renamed from: f */
    public Tagger f180917f;

    /* renamed from: g */
    public UserValidators f180918g;

    static {
        Logger.getLogger(C66519k.class.getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C66516h mo59665b() {
        throw null;
    }

    /* renamed from: e */
    public synchronized void mo59666e() {
        if (this.f180916e == null) {
            this.f180916e = new ActionFrameManager();
        }
        C66516h b = mo59665b();
        if (this.f180917f == null) {
            this.f180917f = new Tagger(b.toByteArray());
        }
        if (this.f180918g == null) {
            this.f180918g = new UserValidators(b);
        }
    }

    /* renamed from: h */
    public final synchronized void mo59667h(String str) {
        if (this.f180916e == null) {
            this.f180916e = new ActionFrameManager(str);
        }
    }
}
