package com.google.p3728as.p3737c.p3738a;

import android.hardware.soundtrigger.SoundTrigger;
import androidx.core.p094f.C1888a;
import com.google.common.base.C58869cf;
import java.util.EnumSet;
import java.util.UUID;

/* renamed from: com.google.as.c.a.d */
/* compiled from: PG */
public final class C48037d {

    /* renamed from: a */
    public final int f124333a;

    /* renamed from: b */
    public final String f124334b;

    /* renamed from: c */
    public final String f124335c;

    /* renamed from: d */
    public final UUID f124336d;

    /* renamed from: e */
    public final int f124337e;

    /* renamed from: f */
    public final String f124338f;

    /* renamed from: g */
    public final int f124339g;

    /* renamed from: h */
    public final int f124340h;

    /* renamed from: i */
    public final int f124341i;

    /* renamed from: j */
    public final EnumSet f124342j;

    /* renamed from: k */
    public final boolean f124343k;

    /* renamed from: l */
    public final int f124344l;

    /* renamed from: m */
    public final boolean f124345m;

    /* renamed from: n */
    public final int f124346n;

    /* renamed from: o */
    public final boolean f124347o;

    /* renamed from: p */
    public final EnumSet f124348p;

    public C48037d(SoundTrigger.ModuleProperties moduleProperties) {
        this.f124333a = moduleProperties.getId();
        this.f124334b = moduleProperties.getImplementor();
        this.f124335c = moduleProperties.getDescription();
        this.f124336d = moduleProperties.getUuid();
        this.f124337e = moduleProperties.getVersion();
        this.f124338f = moduleProperties.getSupportedModelArch();
        this.f124339g = moduleProperties.getMaxSoundModels();
        this.f124340h = moduleProperties.getMaxKeyphrases();
        this.f124341i = moduleProperties.getMaxUsers();
        long recognitionModes = (long) moduleProperties.getRecognitionModes();
        EnumSet<E> noneOf = EnumSet.noneOf(C48036c.class);
        for (C48036c cVar : C48036c.values()) {
            long j = cVar.f124332e;
            if ((j & recognitionModes) == j) {
                noneOf.add(cVar);
            }
        }
        this.f124342j = noneOf;
        this.f124343k = moduleProperties.isCaptureTransitionSupported();
        this.f124344l = moduleProperties.getMaxBufferMillis();
        this.f124345m = moduleProperties.isConcurrentCaptureSupported();
        this.f124346n = moduleProperties.getPowerConsumptionMw();
        this.f124347o = moduleProperties.isTriggerReturnedInEvent();
        long audioCapabilities = (long) moduleProperties.getAudioCapabilities();
        EnumSet<E> noneOf2 = EnumSet.noneOf(C48035b.class);
        for (C48035b bVar : C48035b.values()) {
            long j2 = bVar.f124326c;
            if ((j2 & audioCapabilities) == j2) {
                noneOf2.add(bVar);
            }
        }
        this.f124348p = noneOf2;
    }

    /* renamed from: a */
    public final int mo53134a() {
        return (!C1888a.m5148b() || !this.f124338f.contains(",")) ? this.f124337e : Integer.parseInt((String) C58869cf.m90938d(",").mo56155i(this.f124338f).get(0));
    }

    /* renamed from: b */
    public final String mo53135b() {
        return (!C1888a.m5148b() || !this.f124338f.contains(",")) ? this.f124338f : (String) C58869cf.m90938d(",").mo56155i(this.f124338f).get(1);
    }

    public final String toString() {
        int i = this.f124333a;
        String str = this.f124334b;
        String str2 = this.f124335c;
        String valueOf = String.valueOf(this.f124336d);
        int i2 = this.f124337e;
        String str3 = this.f124338f;
        int i3 = this.f124339g;
        int i4 = this.f124340h;
        int i5 = this.f124341i;
        String valueOf2 = String.valueOf(this.f124342j);
        boolean z = this.f124343k;
        int i6 = this.f124344l;
        boolean z2 = this.f124345m;
        int i7 = this.f124346n;
        boolean z3 = this.f124347o;
        return "ModuleProperties [id=" + i + ", implementor=" + str + ", description=" + str2 + ", uuid=" + valueOf + ", version=" + i2 + " , supportedModelArch=" + str3 + ", maxSoundModels=" + i3 + ", maxKeyphrases=" + i4 + ", maxUsers=" + i5 + ", recognitionModes=" + valueOf2 + ", supportsCaptureTransition=" + z + ", maxBufferMs=" + i6 + ", supportsConcurrentCapture=" + z2 + ", powerConsumptionMw=" + i7 + ", returnsTriggerInEvent=" + z3 + ", audioCapabilities=" + String.valueOf(this.f124348p) + "]";
    }
}
