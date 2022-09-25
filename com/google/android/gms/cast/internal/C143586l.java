package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.C143603l;
import com.google.android.gms.cast.framework.media.C143485ar;
import com.google.android.gms.cast.framework.media.C143486as;

/* renamed from: com.google.android.gms.cast.internal.l */
/* compiled from: PG */
public class C143586l {

    /* renamed from: b */
    public final C143566ae f389318b = new C143566ae("MediaControlChannel");

    /* renamed from: c */
    public final String f389319c;

    /* renamed from: d */
    public C143486as f389320d;

    protected C143586l(String str) {
        C143596v.m233277j(str);
        this.f389319c = str;
    }

    /* renamed from: c */
    public final long mo118916c() {
        C143486as asVar = this.f389320d;
        if (asVar != null) {
            return asVar.f389110b.getAndIncrement();
        }
        this.f389318b.mo118886d("Attempt to generate requestId without a sink", new Object[0]);
        return 0;
    }

    /* renamed from: d */
    public final void mo118917d(String str, long j) {
        C143486as asVar = this.f389320d;
        if (asVar == null) {
            this.f389318b.mo118886d("Attempt to send text message without a sink", new Object[0]);
            return;
        }
        String str2 = this.f389319c;
        C143603l lVar = asVar.f389109a;
        if (lVar != null) {
            lVar.mo118484c(str2, str).mo122498q(new C143485ar(asVar, j));
            return;
        }
        throw new IllegalStateException("Device is not connected");
    }
}
