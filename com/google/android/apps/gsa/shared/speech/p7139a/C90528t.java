package com.google.android.apps.gsa.shared.speech.p7139a;

import com.google.android.apps.gsa.shared.p7127q.C90456c;

/* renamed from: com.google.android.apps.gsa.shared.speech.a.t */
/* compiled from: PG */
public class C90528t extends Exception implements C90456c {

    /* renamed from: b */
    public final int f253081b;

    /* renamed from: c */
    public final int f253082c;

    protected C90528t(int i, int i2) {
        this("errorCode: " + i2 + ", engine: " + i, i, i2);
    }

    /* renamed from: a */
    public final int mo79843a() {
        return this.f253082c;
    }

    /* renamed from: b */
    public int mo79844b() {
        return 211;
    }

    /* renamed from: c */
    public final Exception mo79845c() {
        return this;
    }

    /* renamed from: d */
    public boolean mo79846d() {
        return false;
    }

    protected C90528t(String str, int i, int i2) {
        super(str);
        this.f253081b = i;
        this.f253082c = i2;
    }

    protected C90528t(String str, Throwable th, int i, int i2) {
        super(str, th);
        this.f253081b = i;
        this.f253082c = i2;
    }

    protected C90528t(Throwable th, int i, int i2) {
        this("errorCode: " + i2 + ", engine: " + i, th, i, i2);
    }
}
