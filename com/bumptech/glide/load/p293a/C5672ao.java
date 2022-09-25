package com.bumptech.glide.load.p293a;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.bumptech.glide.load.a.ao */
/* compiled from: PG */
final class C5672ao implements Appendable {

    /* renamed from: a */
    private final Appendable f17111a;

    /* renamed from: b */
    private boolean f17112b = true;

    public C5672ao(Appendable appendable) {
        this.f17111a = appendable;
    }

    /* renamed from: a */
    private static final CharSequence m14728a(CharSequence charSequence) {
        return charSequence == null ? BuildConfig.FLAVOR : charSequence;
    }

    public final Appendable append(char c) {
        boolean z = false;
        if (this.f17112b) {
            this.f17112b = false;
            this.f17111a.append("  ");
        }
        if (c == 10) {
            z = true;
        }
        this.f17112b = z;
        this.f17111a.append(c);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        CharSequence a = m14728a(charSequence);
        append(a, 0, a.length());
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence a = m14728a(charSequence);
        boolean z = false;
        if (this.f17112b) {
            this.f17112b = false;
            this.f17111a.append("  ");
        }
        if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
            z = true;
        }
        this.f17112b = z;
        this.f17111a.append(a, i, i2);
        return this;
    }
}
