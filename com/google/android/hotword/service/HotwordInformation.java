package com.google.android.hotword.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.DspModelInformation;
import p3186j$.time.Duration;

/* compiled from: PG */
public class HotwordInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C146584b();

    /* renamed from: A */
    public boolean f395869A;

    /* renamed from: B */
    public String f395870B;

    /* renamed from: C */
    public boolean f395871C;

    /* renamed from: D */
    public Duration f395872D;

    /* renamed from: E */
    public boolean f395873E;

    /* renamed from: F */
    public int f395874F;

    /* renamed from: G */
    public byte[] f395875G;

    /* renamed from: H */
    public DspModelInformation f395876H;

    /* renamed from: I */
    public boolean f395877I;

    /* renamed from: J */
    public boolean f395878J;

    /* renamed from: K */
    private boolean f395879K;

    /* renamed from: a */
    public boolean f395880a;

    /* renamed from: b */
    public boolean f395881b;

    /* renamed from: c */
    public boolean f395882c;

    /* renamed from: d */
    public boolean f395883d;

    /* renamed from: e */
    public boolean f395884e;

    /* renamed from: f */
    public boolean f395885f;

    /* renamed from: g */
    public String f395886g;

    /* renamed from: h */
    public SpeakerIdModel f395887h;

    /* renamed from: i */
    public String f395888i;

    /* renamed from: j */
    public boolean f395889j;

    /* renamed from: k */
    public int f395890k;

    /* renamed from: l */
    public String f395891l;

    /* renamed from: m */
    public boolean f395892m;

    /* renamed from: n */
    public boolean f395893n;

    /* renamed from: o */
    public boolean f395894o;

    /* renamed from: p */
    public boolean f395895p;

    /* renamed from: q */
    public boolean f395896q;

    /* renamed from: r */
    public boolean f395897r;

    /* renamed from: s */
    public int f395898s;

    /* renamed from: t */
    public boolean f395899t;

    /* renamed from: u */
    public boolean f395900u;

    /* renamed from: v */
    public boolean f395901v;

    /* renamed from: w */
    public boolean f395902w;

    /* renamed from: x */
    public boolean f395903x;

    /* renamed from: y */
    public boolean f395904y;

    /* renamed from: z */
    public int f395905z;

    public HotwordInformation() {
    }

    protected HotwordInformation(Parcel parcel) {
        boolean z = true;
        this.f395880a = parcel.readByte() > 0;
        this.f395881b = parcel.readByte() > 0;
        this.f395882c = parcel.readByte() > 0;
        this.f395883d = parcel.readByte() > 0;
        this.f395884e = parcel.readByte() > 0;
        this.f395885f = parcel.readByte() > 0;
        this.f395886g = parcel.readString();
        parcel.readFloat();
        this.f395887h = (SpeakerIdModel) parcel.readParcelable(SpeakerIdModel.class.getClassLoader());
        this.f395888i = parcel.readString();
        this.f395875G = parcel.createByteArray();
        this.f395889j = parcel.readByte() > 0;
        this.f395890k = parcel.readInt();
        this.f395891l = parcel.readString();
        this.f395892m = parcel.readByte() > 0;
        this.f395874F = parcel.readInt();
        this.f395893n = parcel.readByte() > 0;
        this.f395879K = parcel.readByte() > 0;
        this.f395894o = parcel.readByte() > 0;
        this.f395895p = parcel.readByte() > 0;
        this.f395896q = parcel.readByte() > 0;
        this.f395897r = parcel.readByte() > 0;
        this.f395898s = parcel.readInt();
        this.f395899t = parcel.readByte() > 0;
        this.f395900u = parcel.readByte() > 0;
        this.f395901v = parcel.readByte() > 0;
        this.f395876H = (DspModelInformation) parcel.readParcelable(DspModelInformation.class.getClassLoader());
        this.f395902w = parcel.readByte() > 0;
        this.f395903x = parcel.readByte() > 0;
        this.f395904y = parcel.readByte() > 0;
        this.f395905z = parcel.readInt();
        this.f395869A = parcel.readByte() > 0;
        this.f395870B = parcel.readString();
        this.f395871C = parcel.readByte() > 0;
        this.f395872D = Duration.ofSeconds(parcel.readLong(), parcel.readLong());
        this.f395873E = parcel.readByte() > 0;
        this.f395877I = parcel.readByte() > 0;
        this.f395878J = parcel.readByte() <= 0 ? false : z;
    }

    public HotwordInformation(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, SpeakerIdModel speakerIdModel, String str2, boolean z7, int i, String str3, boolean z8, int i2, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3, boolean z15, boolean z16, boolean z17, DspModelInformation dspModelInformation, boolean z18, boolean z19, boolean z20, int i4, boolean z21, String str4, boolean z22, Duration duration, boolean z23, boolean z24, boolean z25) {
        this.f395880a = z;
        this.f395881b = z2;
        this.f395882c = z3;
        this.f395883d = z4;
        this.f395884e = z5;
        this.f395885f = z6;
        this.f395886g = str;
        this.f395887h = speakerIdModel;
        this.f395888i = str2;
        this.f395875G = null;
        this.f395889j = z7;
        this.f395890k = i;
        this.f395891l = str3;
        this.f395892m = z8;
        this.f395874F = i2;
        this.f395893n = z9;
        this.f395879K = z10;
        this.f395894o = z11;
        this.f395895p = z12;
        this.f395896q = z13;
        this.f395897r = z14;
        this.f395898s = i3;
        this.f395899t = z15;
        this.f395900u = z16;
        this.f395901v = z17;
        this.f395876H = dspModelInformation;
        this.f395902w = z18;
        this.f395903x = z19;
        this.f395904y = z20;
        this.f395905z = i4;
        this.f395869A = z21;
        this.f395870B = str4;
        this.f395871C = z22;
        this.f395872D = duration;
        this.f395873E = z23;
        this.f395877I = z24;
        this.f395878J = z25;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        boolean z = this.f395880a;
        boolean z2 = this.f395881b;
        boolean z3 = this.f395882c;
        boolean z4 = this.f395883d;
        boolean z5 = this.f395884e;
        boolean z6 = this.f395885f;
        String str = this.f395886g;
        if (str == null) {
            str = "null";
        }
        String str2 = "not available";
        String str3 = this.f395887h == null ? str2 : "available";
        String str4 = this.f395888i;
        if (this.f395875G != null) {
            str2 = "available";
        }
        boolean z7 = this.f395889j;
        int i = this.f395890k;
        String str5 = this.f395891l;
        boolean z8 = this.f395892m;
        int i2 = this.f395874F;
        boolean z9 = this.f395893n;
        boolean z10 = this.f395879K;
        boolean z11 = this.f395894o;
        boolean z12 = this.f395895p;
        boolean z13 = this.f395896q;
        boolean z14 = this.f395897r;
        int i3 = this.f395898s;
        boolean z15 = this.f395899t;
        boolean z16 = this.f395900u;
        boolean z17 = this.f395901v;
        String valueOf = String.valueOf(this.f395876H);
        boolean z18 = this.f395902w;
        boolean z19 = this.f395903x;
        boolean z20 = this.f395904y;
        int i4 = this.f395905z;
        boolean z21 = this.f395869A;
        String str6 = this.f395870B;
        boolean z22 = this.f395871C;
        String valueOf2 = String.valueOf(this.f395872D);
        boolean z23 = this.f395873E;
        boolean z24 = this.f395877I;
        return "HotwordInformation[ hotwordAvailable: " + z + " hotwordEnabled: " + z2 + " alwaysOnAvailable: " + z3 + " alwaysOnEnabled: " + z4 + " fromAnyScreenAvailable: " + z5 + " fromAnyScreenEnabled: " + z6 + " hotwordModelLocation: " + str + " speakerIdModel: " + str3 + " voiceLocale: " + str4 + " hotwordModel: " + str2 + " dumpHotwordAudioToFile: " + z7 + " dspStreamTimeoutMs: " + i + " hotwordKeyphrase: " + str5 + " alwaysRunDsp: " + z8 + " numberOfAudioChannels: " + i2 + " alwaysRunSoftware: " + z9 + " ngaSodaEnabled: " + z10 + " keepMicOpenForSoftware: " + z11 + " useSodaHotword: " + z12 + " enablePostProcessAdaptation: " + z13 + " useMobstoreUri: " + z14 + " hotwordEnrollmentState: " + i3 + " speakerIdSupported: " + z15 + " enableDspModelEnrollmentMetrics: " + z16 + " runDspHotwordInBatterySaver: " + z17 + " dspModelInformation: " + valueOf + " disableDspRecognitionInDspEnrollment: " + z18 + " enableAecForSodaHotword: " + z19 + " enableCleanerForSodaHotword: " + z20 + " sodaHotwordFixedGainMultiplier: " + i4 + " enableTrustedProcess: " + z21 + " hotwordModelId: " + str6 + " enableHotwordProactiveFeedback: " + z22 + " minimumTimeBetweenHotwordProactiveFeedback: " + valueOf2 + " isDeviceAllowListedToRunDspHotword: " + z23 + " delayTrustedProcessCreation " + z24 + " moveUpdateOfHotwordRunning " + this.f395878J + " ]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f395880a ? (byte) 1 : 0);
        parcel.writeByte(this.f395881b ? (byte) 1 : 0);
        parcel.writeByte(this.f395882c ? (byte) 1 : 0);
        parcel.writeByte(this.f395883d ? (byte) 1 : 0);
        parcel.writeByte(this.f395884e ? (byte) 1 : 0);
        parcel.writeByte(this.f395885f ? (byte) 1 : 0);
        parcel.writeString(this.f395886g);
        parcel.writeFloat(0.0f);
        parcel.writeParcelable(this.f395887h, i);
        parcel.writeString(this.f395888i);
        parcel.writeByteArray((byte[]) null);
        parcel.writeByte(this.f395889j ? (byte) 1 : 0);
        parcel.writeInt(this.f395890k);
        parcel.writeString(this.f395891l);
        parcel.writeByte(this.f395892m ? (byte) 1 : 0);
        parcel.writeInt(this.f395874F);
        parcel.writeByte(this.f395893n ? (byte) 1 : 0);
        parcel.writeByte(this.f395879K ? (byte) 1 : 0);
        parcel.writeByte(this.f395894o ? (byte) 1 : 0);
        parcel.writeByte(this.f395895p ? (byte) 1 : 0);
        parcel.writeByte(this.f395896q ? (byte) 1 : 0);
        parcel.writeByte(this.f395897r ? (byte) 1 : 0);
        parcel.writeInt((byte) this.f395898s);
        parcel.writeByte(this.f395899t ? (byte) 1 : 0);
        parcel.writeByte(this.f395900u ? (byte) 1 : 0);
        parcel.writeByte(this.f395901v ? (byte) 1 : 0);
        parcel.writeParcelable(this.f395876H, i);
        parcel.writeByte(this.f395902w ? (byte) 1 : 0);
        parcel.writeByte(this.f395903x ? (byte) 1 : 0);
        parcel.writeByte(this.f395904y ? (byte) 1 : 0);
        parcel.writeInt(this.f395905z);
        parcel.writeByte(this.f395869A ? (byte) 1 : 0);
        parcel.writeString(this.f395870B);
        parcel.writeByte(this.f395871C ? (byte) 1 : 0);
        parcel.writeLong(this.f395872D.getSeconds());
        parcel.writeLong((long) this.f395872D.getNano());
        parcel.writeByte(this.f395873E ? (byte) 1 : 0);
        parcel.writeByte(this.f395877I ? (byte) 1 : 0);
        parcel.writeByte(this.f395878J ? (byte) 1 : 0);
    }
}
