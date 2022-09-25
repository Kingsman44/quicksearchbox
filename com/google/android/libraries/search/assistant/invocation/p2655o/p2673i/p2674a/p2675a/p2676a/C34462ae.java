package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import java.util.Arrays;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.ae */
/* compiled from: PG */
public final class C34462ae {

    /* renamed from: a */
    public final boolean f91568a;

    /* renamed from: b */
    public final boolean f91569b;

    /* renamed from: c */
    public final byte[] f91570c;

    /* renamed from: d */
    public final SpeakerIdModel f91571d;

    public C34462ae(boolean z, boolean z2, byte[] bArr, SpeakerIdModel speakerIdModel) {
        this.f91568a = z;
        this.f91569b = z2;
        this.f91570c = bArr;
        this.f91571d = speakerIdModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34462ae)) {
            return false;
        }
        C34462ae aeVar = (C34462ae) obj;
        return this.f91568a == aeVar.f91568a && this.f91569b == aeVar.f91569b && C69664n.m101066l(this.f91570c, aeVar.f91570c) && C69664n.m101066l(this.f91571d, aeVar.f91571d);
    }

    public final int hashCode() {
        int i = (((this.f91568a ? 1 : 0) * true) + (this.f91569b ? 1 : 0)) * 31;
        byte[] bArr = this.f91570c;
        int i2 = 0;
        int hashCode = (i + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        SpeakerIdModel speakerIdModel = this.f91571d;
        if (speakerIdModel != null) {
            i2 = speakerIdModel.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        byte[] bArr = this.f91570c;
        String str = "null";
        String valueOf = bArr != null ? String.valueOf(bArr.length) : str;
        SpeakerIdModel speakerIdModel = this.f91571d;
        if (speakerIdModel != null && speakerIdModel.f253284b.mo56113h()) {
            str = String.valueOf(((byte[]) this.f91571d.f253284b.mo56107c()).length);
        }
        boolean z = this.f91568a;
        boolean z2 = this.f91569b;
        return "speakerIdSupported=" + z + ", speakerIdModelPresent=" + z2 + ", hotwordModelLength=" + valueOf + ", speakerIdModelLength=" + str;
    }
}
