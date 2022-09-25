package com.google.android.gearhead.sdk.assistant;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: PG */
public class VoiceSessionConfig extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(VoiceSessionConfig.class);

    /* renamed from: a */
    public int f387130a;

    /* renamed from: b */
    public MessagingInfo f387131b;

    /* renamed from: c */
    public String f387132c;

    /* renamed from: d */
    public Uri f387133d;

    /* renamed from: e */
    public int f387134e;

    /* renamed from: f */
    public int f387135f;

    /* renamed from: g */
    public long f387136g;

    /* renamed from: h */
    public Bundle f387137h;

    /* renamed from: i */
    public boolean f387138i;

    /* renamed from: j */
    public boolean f387139j;

    /* renamed from: k */
    public String f387140k;

    /* renamed from: l */
    public String f387141l;

    /* renamed from: m */
    public C142663i f387142m;

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117436a(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r0 = "VOICE_SESSION_TYPE"
            int r0 = r4.getInt(r0)
            r3.f387130a = r0
            java.lang.String r0 = "MESSAGING_INFO"
            android.os.Bundle r0 = r4.getBundle(r0)
            if (r0 == 0) goto L_0x001a
            com.google.android.gearhead.sdk.assistant.MessagingInfo r1 = new com.google.android.gearhead.sdk.assistant.MessagingInfo
            r1.<init>()
            r3.f387131b = r1
            r1.mo117436a(r0)
        L_0x001a:
            java.lang.String r0 = "QUERY_STRING"
            java.lang.String r0 = r4.getString(r0)
            r3.f387132c = r0
            java.lang.String r0 = "AUDIO_INPUT_URI"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r3.f387133d = r0
            java.lang.String r0 = "AUDIO_INPUT_SAMPLING_RATE"
            int r0 = r4.getInt(r0)
            r3.f387134e = r0
            java.lang.String r0 = "VOICE_SESSION_TRIGGER"
            int r0 = r4.getInt(r0)
            r3.f387135f = r0
            java.lang.String r0 = "STARTED_MILLIS"
            long r0 = r4.getLong(r0)
            r3.f387136g = r0
            java.lang.String r0 = "CUSTOM_PAYLOAD"
            android.os.Bundle r0 = r4.getBundle(r0)
            r3.f387137h = r0
            java.lang.String r0 = "FUSION_REQUESTED"
            boolean r0 = r4.getBoolean(r0)
            r3.f387138i = r0
            java.lang.String r0 = "IS_SENDING_ORIGINAL_SBN"
            boolean r0 = r4.getBoolean(r0)
            r3.f387139j = r0
            java.lang.String r0 = "GEARHEAD_VERSION_NAME"
            java.lang.String r0 = r4.getString(r0)
            r3.f387140k = r0
            java.lang.String r0 = "TRANSCRIPTION_CALLBACK"
            android.os.IBinder r0 = r4.getBinder(r0)
            if (r0 != 0) goto L_0x006e
            r0 = 0
            goto L_0x0082
        L_0x006e:
            java.lang.String r1 = "com.google.android.gearhead.sdk.assistant.ITranscriptionCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gearhead.sdk.assistant.C142663i
            if (r2 == 0) goto L_0x007c
            r0 = r1
            com.google.android.gearhead.sdk.assistant.i r0 = (com.google.android.gearhead.sdk.assistant.C142663i) r0
            goto L_0x0082
        L_0x007c:
            com.google.android.gearhead.sdk.assistant.i r1 = new com.google.android.gearhead.sdk.assistant.i
            r1.<init>(r0)
            r0 = r1
        L_0x0082:
            r3.f387142m = r0
            java.lang.String r0 = "SUGGESTION_ACTION_ID"
            java.lang.String r4 = r4.getString(r0)
            r3.f387141l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gearhead.sdk.assistant.VoiceSessionConfig.mo117436a(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putInt("VOICE_SESSION_TYPE", this.f387130a);
        if (this.f387131b != null) {
            Bundle bundle2 = new Bundle();
            this.f387131b.mo117437b(bundle2);
            bundle.putBundle("MESSAGING_INFO", bundle2);
        }
        bundle.putString("QUERY_STRING", this.f387132c);
        bundle.putParcelable("AUDIO_INPUT_URI", this.f387133d);
        bundle.putInt("AUDIO_INPUT_SAMPLING_RATE", this.f387134e);
        bundle.putInt("VOICE_SESSION_TRIGGER", this.f387135f);
        bundle.putLong("STARTED_MILLIS", this.f387136g);
        bundle.putBundle("CUSTOM_PAYLOAD", this.f387137h);
        bundle.putBoolean("FUSION_REQUESTED", this.f387138i);
        bundle.putBoolean("IS_SENDING_ORIGINAL_SBN", this.f387139j);
        bundle.putString("GEARHEAD_VERSION_NAME", this.f387140k);
        C142663i iVar = this.f387142m;
        if (iVar != null) {
            bundle.putBinder("TRANSCRIPTION_CALLBACK", iVar.f30761a);
        }
        bundle.putString("SUGGESTION_ACTION_ID", this.f387141l);
    }
}
