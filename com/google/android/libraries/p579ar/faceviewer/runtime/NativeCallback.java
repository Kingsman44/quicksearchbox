package com.google.android.libraries.p579ar.faceviewer.runtime;

import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10616q;
import com.google.common.p4526f.C59071e;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.libraries.ar.faceviewer.runtime.NativeCallback */
/* compiled from: PG */
public final class NativeCallback {

    /* renamed from: a */
    public static final C59071e f35576a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.runtime.NativeCallback");

    /* renamed from: b */
    private final C10665c f35577b;

    /* renamed from: c */
    private final C10616q f35578c;

    static {
        Class<ExperienceJni> cls = ExperienceJni.class;
    }

    public NativeCallback(C10616q qVar, C10665c cVar) {
        this.f35578c = qVar;
        this.f35577b = cVar;
    }

    /* renamed from: a */
    public static NativeCallback m25659a(C10616q qVar) {
        return new NativeCallback(qVar, C10664b.f35584a);
    }

    public void setNativeHandle(long j) {
        this.f35578c.mo18660b(this.f35577b.mo18709a(j));
    }

    public void setStatus(int i, String str) {
        Throwable th;
        if (i != 0) {
            th = i != 3 ? i != 5 ? i != 11 ? i != 12 ? new IllegalStateException(str) : new UnsupportedOperationException(str) : new IndexOutOfBoundsException(str) : new FileNotFoundException(str) : new IllegalArgumentException(str);
        } else {
            th = null;
        }
        if (th == null) {
            this.f35578c.mo18660b((Object) null);
        } else {
            this.f35578c.f35477a.mo5439d(th);
        }
    }
}
