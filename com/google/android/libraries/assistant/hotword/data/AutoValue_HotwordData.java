package com.google.android.libraries.assistant.hotword.data;

import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import java.util.Arrays;

/* compiled from: PG */
public final class AutoValue_HotwordData extends HotwordData {

    /* renamed from: a */
    public final String f52055a;

    /* renamed from: b */
    public final SpeakerIdModel f52056b;

    /* renamed from: c */
    public final byte[] f52057c;

    /* renamed from: d */
    public final boolean f52058d;

    /* renamed from: e */
    public final boolean f52059e;

    /* renamed from: f */
    public final boolean f52060f;

    /* renamed from: g */
    public final int f52061g;

    /* renamed from: h */
    public final String f52062h;

    /* renamed from: i */
    private final boolean f52063i;

    /* renamed from: j */
    private final int f52064j;

    public AutoValue_HotwordData(String str, SpeakerIdModel speakerIdModel, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, String str2) {
        this.f52055a = str;
        this.f52056b = speakerIdModel;
        if (bArr != null) {
            this.f52057c = bArr;
            this.f52063i = z;
            this.f52058d = z2;
            this.f52059e = z3;
            this.f52060f = z4;
            this.f52061g = i;
            this.f52064j = i2;
            this.f52062h = str2;
            return;
        }
        throw new NullPointerException("Null hotwordModel");
    }

    /* renamed from: a */
    public final int mo23816a() {
        return this.f52064j;
    }

    /* renamed from: b */
    public final int mo23817b() {
        return this.f52061g;
    }

    /* renamed from: c */
    public final SpeakerIdModel mo23818c() {
        return this.f52056b;
    }

    /* renamed from: d */
    public final String mo23819d() {
        return this.f52062h;
    }

    /* renamed from: e */
    public final String mo23820e() {
        return this.f52055a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof HotwordData) {
            HotwordData hotwordData = (HotwordData) obj;
            String str2 = this.f52055a;
            if (str2 != null ? str2.equals(hotwordData.mo23820e()) : hotwordData.mo23820e() == null) {
                SpeakerIdModel speakerIdModel = this.f52056b;
                if (speakerIdModel != null ? speakerIdModel.equals(hotwordData.mo23818c()) : hotwordData.mo23818c() == null) {
                    return Arrays.equals(this.f52057c, hotwordData instanceof AutoValue_HotwordData ? ((AutoValue_HotwordData) hotwordData).f52057c : hotwordData.mo23827j()) && this.f52063i == hotwordData.mo23822f() && this.f52058d == hotwordData.mo23826i() && this.f52059e == hotwordData.mo23824h() && this.f52060f == hotwordData.mo23823g() && this.f52061g == hotwordData.mo23817b() && this.f52064j == hotwordData.mo23816a() && ((str = this.f52062h) != null ? str.equals(hotwordData.mo23819d()) : hotwordData.mo23819d() == null);
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo23822f() {
        return this.f52063i;
    }

    /* renamed from: g */
    public final boolean mo23823g() {
        return this.f52060f;
    }

    /* renamed from: h */
    public final boolean mo23824h() {
        return this.f52059e;
    }

    /* renamed from: i */
    public final boolean mo23826i() {
        return this.f52058d;
    }

    /* renamed from: j */
    public final byte[] mo23827j() {
        return this.f52057c;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f52055a;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        SpeakerIdModel speakerIdModel = this.f52056b;
        if (speakerIdModel == null) {
            i2 = 0;
        } else {
            i2 = speakerIdModel.hashCode();
        }
        int i5 = 1237;
        int hashCode = (((((((((i4 ^ i2) * 1000003) ^ Arrays.hashCode(this.f52057c)) * 1000003) ^ (true != this.f52063i ? 1237 : 1231)) * 1000003) ^ (true != this.f52058d ? 1237 : 1231)) * 1000003) ^ (true != this.f52059e ? 1237 : 1231)) * 1000003;
        if (true == this.f52060f) {
            i5 = 1231;
        }
        int i6 = (((((hashCode ^ i5) * 1000003) ^ this.f52061g) * 1000003) ^ this.f52064j) * 1000003;
        String str2 = this.f52062h;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i6 ^ i3;
    }
}
